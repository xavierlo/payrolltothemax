
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
        Login,              //  Log into the system
        MainMenu,           //  Main menu state
        AdminMenu,          //  Administrator Menu state
        CreateEmployee,     //  Employee creation state
        SelectEmployee,     //  Employee selection/searching (used for EditEmployee)
        EditEmployee,       //  Edit Employee Details
        EmployeeList,       //  List the employees
        TimeClock,          //  Clock in/out
        EditCommission,     //  Enter commission data
        ViewCommission,     //  View commission data
        CalculatePay,       //  Calculate employee pay and print paychecks
        Quit,               //  Quit the program
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

    //Tax Variables - The default values are typical rates and
    //they are there for the sake of the programming class.
    public static float federalTaxRate      = .25f;     //  Default: .25
    public static float stateTaxRate        = .13f;     //  Default: .13 of Federal
    public static float healthInsuranceRate = .07f;     //  Default: .07
    public static float lifeInsuranceRate   = .003f;    //  Default: .003
    //Calculated after pre-tax stuff, from the remaining amount
    public static float socialSecurityRate  = .062f;    //  Default: .062   (calculated up to $106,800/yr incomes)
    public static float medicareRate        = .0145f;   //  Default: .0145

    /**
     * Returns the date and/or time.
     * @param dateOnly      If true, the method returns the date without the
     *                      time of day
     * @return              The date in a String format
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
