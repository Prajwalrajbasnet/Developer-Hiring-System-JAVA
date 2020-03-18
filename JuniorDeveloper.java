
/**
 * JuniorDeveloper class is another subclass of Developer class
 * This class has seven attributes and a parameterized constructor.
 * It has seven get methods,a set method,method to appoint a developer and a display method. 
 * @author (Prajwal Raj Basnet)
 * @date (3rd january 2019)
 */
public class JuniorDeveloper extends Developer
{
    //declaring instance variables with suitable datatype and private access modifier
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    /**
     * Constructor JuniorDeveloper takes six parameters among them three are parameters are used as arguments to call the constructor of superclass.
     * Non-static variables salary,appointeBy and terminationDate are initialized with respective parameters.
     * appointedDate,evaluationPeriod and specialized are assigned an empty string whereas joined as false.
     */
    public JuniorDeveloper(String platform, String interviewerName, int workingHours, int Salary, String appointedBy, String terminationDate )
    {
       super(platform, interviewerName, workingHours);
       this.salary = salary;
       this.appointedBy = appointedBy;
       this.terminationDate  = terminationDate;
       appointedDate ="";
       evaluationPeriod ="";
       specialization = "";
       joined = false;
       
    }
    //This method getSalary() extracts integer value of salary and returns it
    public int getSalary()
    {
        return salary;
    }
    /**
     * If the developer is not joined yet this set method takes new value for salary as parameter and assigns it in salary attribute.
     * And if the developer is already joined a message is displayed explaining it is not possible to change the salary.
     */
    public void setSalary(int newSalary)
    {
        if(joined == false)
        {
            salary = newSalary;
        }
        else
        {
            System.out.println("The developer is already appointed with salary: "+salary+"\n Therefore it is not possible to change the salary.");
        }
    }
    //This method returns the appointed date of the developer by extracting the variable appointedDate
    public String getAppointedDate()
    {
        return appointedDate;
    }
    //Accessor method getEvaluationPeriod() extracts the variable evaluationPeriod and returns its string value
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    //This method named getTerminationDate() returns value of terimination date of the developer
    public String getTerminationDate()
    {
        return terminationDate;
    }
    //This is get method of specialization which returns string value of specialization variable
    public String getSpecialization()
    {
        return specialization;
    }
    //This method getAppointedBy() extracts and returns string value of variable appointedBy
    public String getAppointedBy()
    {
        return appointedBy;
    }
    //This method getJoined() returns boolean value of joined status of developer
    public boolean getJoined()
    {
        return joined;
    }
    
    /**
     * This non-static method takes four parameters.
     * If the developer is't joined it calls set method of parent class to set new developer name, 
     * and assigns values from other parameters in respective attributes also changes value for joined to true.
     * If the developer is already joined a message is displayed indicating that developer is already appointed.
     */
    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
    {
        if(joined == false)
        {
            super.setDeveloperName(developerName);
            this.appointedDate = appointedDate;
            this.terminationDate = terminationDate;
            this.specialization = specialization;
            joined = true;
        }
        else
        {
            System.out.println("The developer "+developerName+" is already appointed at "+appointedDate+".");
        }
    }
    /**
     * This display method calls the display method of parent class to display description of developer.
     * If developer is already joined then appointed date,evaluation period,termination date,salary,specialization and appointed by is also displayed. 
     */
    public void display2()
    {
        super.display();
        if(joined == true)
        {
            System.out.println("Appointed Date: "+appointedDate);
            System.out.println("Evaluation Period: "+evaluationPeriod);
            System.out.println("Termination Date: "+terminationDate);
            System.out.println("Developer Salary: "+salary);
            System.out.println("Developer Specialization: "+specialization);
            System.out.println("Developer appointed by:"+appointedBy);
        }
        System.out.println("");
    }
    
}