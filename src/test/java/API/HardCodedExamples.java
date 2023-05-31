package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HardCodedExamples {
    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODUwMjk5NDIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NTA3MzE0MiwidXNlcklkIjoiNTQyOCJ9.4eeOJYmAj-FU-GjjBAooKHe-iYhCFv052zpwF1WusOM";
    static String employee_id;

    @Test
    public void bgetCreatedEmployee() {
        RequestSpecification prepareRequest = given().header("Content-Type", "application/json").
                header("Authorization", token).queryParam("employee_id", employee_id);
        //hitting the endpoint
        Response response = prepareRequest.get("/getOneEmployee.php");
        response.prettyPrint();
        //verify the response
        response.then().assertThat().statusCode(200);
        String tempEmID = response.jsonPath().getString("employee.employee_id");
        // we have 2 emp id, one global and second is local
        Assert.assertEquals(employee_id, tempEmID);

    }

    @Test
    public void acreateEmployee() {
        //1. prepare the request
        RequestSpecification prepareRequest = given().header("Content-Type", "application/json").
                header("Authorization", token).body("{\n" +
                        "\"emp_firstname\": \"jade\",\n" +
                        "  \"emp_lastname\": \"sting\",\n" +
                        "  \"emp_middle_name\": \"william\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2023-05-20\",\n" +
                        "  \"emp_status\": \"active\",\n" +
                        "  \"emp_job_title\": \"Tester\"\n" +
                        "}");
        //2.hitting the endpoint
        Response response = prepareRequest.when().post("/createEmployee.php");


        //3. verifying the assertions

        // it will print the output in the console
        response.prettyPrint();
        response.then().assertThat().statusCode(201);
        //we are capturing employee id
        employee_id = response.jsonPath().getString("Employee.employee_id");
        System.out.println(employee_id);
        response.then().assertThat().body("Employee.emp_firstname", equalTo("jade"));
        response.then().assertThat().body("Employee.emp_lastname", equalTo("sting"));
        response.then().assertThat().header("Content-Type", "application/json");
        System.out.println("My test case is passed");
// homework, create a method to get all employee status and job tile

    }

    @Test
    public void cupdateEmployee() {
        RequestSpecification prepareRequest = given().header("Content-Type", "application/json").
                header("Authorization", token).body("{\n" +
                        "  \"employee_id\": \""+employee_id+"\",\n" +
                        "  \"emp_firstname\": \"jake\",\n" +
                        "  \"emp_lastname\": \"sting\",\n" +
                        "  \"emp_middle_name\": \"stevenson\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2023-05-20\",\n" +
                        "  \"emp_status\": \"Active\",\n" +
                        "  \"emp_job_title\": \"CEO\"\n" +
                        "}");

        Response response = prepareRequest.when().put("/updateEmployee.php");
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("Message", equalTo("Employee record Updated"));
    }

    @Test
    public void dgetUpdatedEmployee() {
        RequestSpecification preparedRequest = given().
                header("Content-Type", "application/json").
                header("Authorization", token).
                queryParam("employee_id", employee_id);

        Response response = preparedRequest.when().get("/getOneEmployee.php");
        response.prettyPrint();
        response.then().assertThat().statusCode(200);
        //if you want to verify the body of the response.
        //you can do that using hamcrest matchers
    }
}