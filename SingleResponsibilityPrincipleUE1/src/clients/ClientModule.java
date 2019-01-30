package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true );
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }


    public static void hireNewEmployee(Employee employee){
    EmployeeDAO employeeDAO = new EmployeeDAO();
    }

    public static void terminateEmployee(Employee employee){
    EmployeeDAO employeeDAO = new EmployeeDAO();
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
