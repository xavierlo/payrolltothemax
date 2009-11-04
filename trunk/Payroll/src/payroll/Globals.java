
package payroll;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *  This class contains all the global variables (reusable/important for all
 *  to see) and methods for the application.
 *  @author bross
 */
public class Globals {

    //This enum lists the different types of States the app can be in.
    public static enum State
    { 
        Login,              //Log into the system
        MainMenu,           //Main menu state
        AdminMenu,          //Administrator Menu state
        CreateEmployee,     //Employee creation state
        SelectEmployee,     //Employee selection/searching (used for EditEmployee)
        EditEmployee,       //Edit Employee Details
        EmployeeList,       //List the employees
        TimeClock,          //Clock in/out
        Test,               //For Testing
        Quit,               //Quit the program
    }

    //Create a State object
    public static State currentState = State.Login;
    //The user that is logged in
    public static Employee currentUser;
    //The current selected employee
    public static Employee currentEmployee;
    //Self explanitory.  If true, the program exits.
    public static Boolean ExitProgram = false;
    //Checks to see if an administrator is logged in.
    public static Boolean userIsAdmin = false;
    //List of all employees
    public static List<Employee> Employees = new ArrayList<Employee>();
    
    /**
     * Returns the date and/or time.
     * @param dateOnly      If true, the method returns the date without the
     *                      time of day
     * @return
     */
    public static String getDateTime(boolean dateOnly)
    {
        DateFormat dateFormat;
        if (dateOnly)
            dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        else
            dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Date date = new Date();
        return dateFormat.format(date);
    }
}