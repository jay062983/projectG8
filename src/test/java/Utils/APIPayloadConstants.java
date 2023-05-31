package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    // we will pass the body with multiple formats
    public static String createEmployeePayload() {
        String createEmployeePayload = "{\n" +
                "\"emp_firstname\": \"philip\",\n" +
                "  \"emp_lastname\": \"sting\",\n" +
                "  \"emp_middle_name\": \"jacob\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"2023-05-20\",\n" +
                "  \"emp_status\": \"active\",\n" +
                "  \"emp_job_title\": \"Tester\"\n" +
                "}";
        return createEmployeePayload;
    }

    public static String createEmmployeePayloadJson() {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "philip");
        obj.put("emp_lastname", "sting");
        obj.put("emp_middle_name", "jacob");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "2000-08-30");
        obj.put("emp_status", "active");
        obj.put("emp_job_title", "Tester");
        return obj.toString();
    }

    public static String createEmmployeePayloadJsonDynamic(String emp_firstname, String emp_lastname, String emp_middle_name, String emp_gender, String emp_birthday, String emp_status, String emp_job_title) {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", emp_firstname);
        obj.put("emp_lastname", emp_lastname);
        obj.put("emp_middle_name", emp_middle_name);
        obj.put("emp_gender", emp_gender);
        obj.put("emp_birthday", emp_birthday);
        obj.put("emp_status", emp_status);
        obj.put("emp_job_title", emp_job_title);
        return obj.toString();
    }
    public static String updateEmmployeePayloadJson() {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "philip");
        obj.put("employee_id", "57575A");
        obj.put("emp_lastname", "david");
        obj.put("emp_middle_name", "Richards");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "2000-08-02");
        obj.put("emp_status", "confirmed");
        obj.put("emp_job_title", "Senior Tester");
        return obj.toString();
}}