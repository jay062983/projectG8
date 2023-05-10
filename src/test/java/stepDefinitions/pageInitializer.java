package stepDefinitions;

import Pages.AddEmployeePage;
import Pages.EmployeeListPage;
import Pages.LoginPage;
import Pages.EditEmployeePersonalDetails;
import Pages.AddEmployeeWorkExperience;

public class pageInitializer {
    public static LoginPage login;
    public static AddEmployeePage addEmployeepage;
    public static EmployeeListPage empListPage;
    public static EditEmployeePersonalDetails EditEmpContactPage;
    public static AddEmployeeWorkExperience AddEmployeeWorkExperiencePage;



    public static void initializePageObjects() {
        login = new LoginPage();
        addEmployeepage = new AddEmployeePage();
        empListPage = new EmployeeListPage();
        EditEmpContactPage=new EditEmployeePersonalDetails();
        AddEmployeeWorkExperiencePage=new AddEmployeeWorkExperience();
    }
}