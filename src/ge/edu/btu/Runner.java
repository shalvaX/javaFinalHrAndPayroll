package ge.edu.btu;

import ge.edu.btu.server.dao.EmployeeDAO;
import ge.edu.btu.server.dao.EmployeeDAOImpl;

import java.sql.SQLException;

public class Runner {
    public static void main (String[] args) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.testResult("test");
        employeeDAO.closeConnection();
    }
}