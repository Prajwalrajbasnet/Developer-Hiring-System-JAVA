
/**
 * Developer class is the superclass of SeniorDeveloper and JuniorDeveloper. 
 * This class has four attributes, a parameterized constructor and getter methods for all attributes.
 * It also has set method of developerName and a display method to display details. 
 * @author (Prajwal Raj Basnet)
 * @date (30 december 2018)
 */
public class Developer
{
    //declaring instance variables with suitable datatype and private access modifier
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;
    /**
     * Constructor takes three parameters and assign their values in respective variables using this keyword.
     * This constructor is used to initialize the instance variables.
     */
    public Developer(String platform, String interviewerName,  int workingHours)
    {
        //initialise instance variables
        this.platform= platform;
        this.interviewerName = interviewerName;
        this.workingHours = workingHours;
        developerName = "";//initializing the variable developerName as an empty string
    }
    //This accessor method named getPlatform() extracts variable platform and returns its String value.
    public String getPlatform()
    {
        return platform;
    }
    //getInterviewerName() extracts and returns value of variable interviewerName
    public String getInterviewerName()
    {
        return interviewerName;
    }
    //This method getWorkingHours() extracts variable workingHours and returns its value
    public int getWorkingHours()
    {
        return workingHours;
    }
    //This accessor method named getDeveloperName() extracts variable developerName and returns its String value.
    public String getDeveloperName()
    {
        return developerName;
    }
    //This method setDeveloperName(String newDeveloperName) takes a new name as parameter and assigns it to the variable developerName
    public void setDeveloperName(String newDeveloperName)
    {
        developerName = newDeveloperName;
    }
    /**
     * The method display() prints the description of the developer with proper annotation.
     * It also prints name of developer if it is not a empty string.
     */
    public void display()
    {
        System.out.println("Platform: "+platform+"\n"+"Interviewer Name: "+interviewerName+"\n"+"Working Hours: "+workingHours);
        if(!(developerName.equals("")))
        {
            System.out.println("Developer Name: "+developerName);
        }
    }
}