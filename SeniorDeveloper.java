
/**
 * SeniorDeveloper class is subclass of Developer class. It has seven attributes.
 * This class consists of a parameterized constructor,get method for all attributes,and two set methods. 
 * It also has non static methods: hireDeveloper,terminateDeveloper,printer and display. 
 * @author (Prajwal Raj Basnet)
 * @date (2nd january 2019)
 */
public class SeniorDeveloper extends Developer
{
    //declaring instance variables with suitable datatype and private access modifier
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private double contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
    /**
     * Constructor SeniorDeveloper accepts five parameters among them three are used as arguments to call constructor of super class.
     * Attributes salary and contractPeriod are assigned with the respective parameters,
     * joiningDate and staffRoomNumber are initialized as empty string whereas advanceSalary as 0.0,
     * appointed and terminated are initialized false  
     */
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, int salary, double contractPeriod)
    {
        super(platform, interviewerName, workingHours);//It calls the constructor of parent class.
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        joiningDate = "";//intializing joiningDate as empty string
        staffRoomNumber = "";//intializing staffRoomNumber as empty string
        advanceSalary = 0.0;//initializing advanceSalary  0.0
        appointed = false;//initializing appointed false
        terminated = false;//initializing terminated false
        
    }
    //this get method for salary extracts variable salary and returns its integer value
    public int getSalary()
    {
        return salary;
    }
    //set method of salary assigns the new value of parameter in the salary attribute
    public void setSalary(int newSalary)
    {
        salary = newSalary;
    }
    //method getJoiningDate() extracts and returns value of variable joiningDate
    public String getJoiningDate()
    {
        return joiningDate;
    }
    //Accessor method getStaffroomNumber() extracts and returns value of  variable staffRoomNumber 
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    //Accesor method getContractPeriod() extracts and returns double value of variable contractPeriod
    public double getContractPeriod()
    {
        return contractPeriod;
    }
    //this set method accepts new value from the parameter for contractPeriod and assigns it into the atrribute contractPeriod
    public void setContractPeriod(double newContractPeriod)
    {
        contractPeriod = newContractPeriod;
    }
    //This is get method for advanceSalary which extracts and returns double value of advanceSalary
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }
    // This method returns boolean value of appointment status of developer
    public boolean getAppointed()
    {
        return appointed;
    }
    // This get method  returns boolean value of termination status of developer
    public boolean getTerminated()
    {
        return terminated;
    }
    /**
     * This method is called to appoint a new developer.
     * Method hireDeveloper accepts four parameters.
     * If the developer already appointed suitable message is displayed.
     * If developer is not appointed the attributes are updated using the parameters, 
     * and attribute appointed is assigned true whereas terminated as false.
     */
    public void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNumber)
    {
        if(appointed==true)
        {
            System.out.println("Sorry! the developer "+developerName+ " with room number "+ staffRoomNumber+ " is already appointed.");
        }
        else
        { 
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.advanceSalary = advanceSalary;
            this.staffRoomNumber = staffRoomNumber;
            appointed = true;
            terminated = false;
            
        }
    }
    
    /**
     * This method is called while terminating a developer.
     * A suitable message is displayed if developer is already terminated.
     * If variable terminated is false, developer is terminated by reseting the details of developer with empty string and 0.0
     * DeveloperName and joining date is assigned as empty string whereas advancesalary as 0.0
     * At last appointed is assigned false and terminated as true.
     */
    public void terminateDeveloper()
    {
        if(terminated==true)
        {
            System.out.println("Sorry!Contract of the developer is already terminated.");
        }
        else
        {
           super.setDeveloperName("");
           joiningDate = "";
           advanceSalary = 0.0;
           appointed = false;
           terminated = true;
        }
    }
    /**
     * This non-static method prints the platform and interviewer name of developer by calling respective get methods.
     * It also prints the developer salary with proper annotation.
     */
    public void printer()
    {
        System.out.println("Platform: "+super.getPlatform());
        System.out.println("Interviewer Name: "+ super.getInterviewerName() );
        System.out.println("Developer salary: "+salary);
    }
    
    /**
     * This method displays the description of developer by calling the display method of super class.
     * If the developer is already appointed termination status, advance salary and joining date is also displayed out.
     */
    public void display()
    {
        super.display();
        if(appointed == true)
        {
            System.out.println("JoiningDate: "+joiningDate);
            System.out.println("Advance Salary: "+advanceSalary);
            System.out.println("Termination Status: "+terminated);
            
        }
        System.out.println("");
    }
}