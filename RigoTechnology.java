    
/**
 *This class provides Graphical User Interface for the developer Appointment System. 
 *It has 21 textfields  from which input is taken and used to call the Senior and Junior Developer classes for adding, appointing and terminating.It also uses buttons for user interaction.
 *It contains a method to create the UI,an overriden  actionperformed method, method to display all information, method to clear textfields and a main method 
 * @author Prajwal Raj Basnet
 * Date 2019 April 10
 */
//importing classes from different packages for creating UI and ArrayList
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class RigoTechnology implements ActionListener
{ 
    //Declaring instance variables with private access modifier
    private JFrame frame;
    private JLabel slbl1,slbl2,slbl3,slbl4,slbl5,slbl6,slbl7,slbl8,slbl9,slbl10,jlbl11,jlbl12,jlbl13,jlbl14,jlbl15,jlbl16,jlbl17,jlbl18,jlbl19,jlbl20,jlbl21;
    private JTextField stf1,stf2,stf3,stf4,stf5,stf6,stf7,stf8,stf9,stf10,jtf11,jtf12,jtf13,jtf14,jtf15,jtf16,jtf17,jtf18,jtf19,jtf20,jtf21;
    private JButton addbtn1,appointbtn1,terminatebtn,addbtn2,appointbtn2,displaybtn,clearbtn;
    private JPanel juniorpanel,seniorpanel;
    private String sPlatform,sInterviewer,sDeveloper,sJoiningDate,sRoomNumber,jPlatform,jInterviewer,jAppointedBy,jTerminationDate,jDeveloper,jAppointedDate,jSpecialization;
    private int sWorkingHours,sSalary,sDeveloperNo,jDeveloperNo, jWorkingHours,jSalary;
    private double sAdvanceSalary,sContractPeriod;
    //creating an generic arraylist dlist which stores objects of Developer class only 
    ArrayList <Developer> dlist = new ArrayList <Developer>();
    
    /**
     * This method is used to create a Graphical User Interface 
     * In the Jframe frame two panels: seniorpanel and juniorpanel are placed as containers.
     * In null layout 21 different textfields, 21 labels and seven buttons are inserted in the panels
     * The panels are covered by titled borders with background colour ghost white
     * Also actionlisteners are added in the buttons
     */
    public void makeUI()
    {
        //creating a JFrame and settting its size
        frame = new JFrame("Developer Appointment System");
        frame.setBounds(500,0,580,830);
        
        
        //creating the first JPanel with null layout and setting colourbackground and a titled border for it
        seniorpanel = new JPanel(null);
        seniorpanel.setPreferredSize(new Dimension(500,830));
        seniorpanel.setBackground(new Color(248,248,255));
        seniorpanel.setBorder(BorderFactory.createTitledBorder("Senior Developer"));
        
        
        //Creating JLabel objects for seniorpanel. These labels are used identify the textfields in this panel thatswhy the name of the fields are passed as parameters in these labels
        slbl1 = new JLabel("Platform:");
        slbl2 = new JLabel("Interviewer's Name:");
        slbl3 = new JLabel("Working Hours:");
        slbl4 = new JLabel("Salary:");
        slbl5 = new JLabel("Contract Period:");
        slbl6 = new JLabel("Devleoper's Name:");
        slbl7 = new JLabel("Joining Date:");
        slbl8 = new JLabel("Advance Salary:");
        slbl9 = new JLabel("Staff Room No:");
        slbl10 = new JLabel("Developer No:");
        
        //setting position of these labels and values are given in such a way that they exactly correspond their respective fields
        slbl1.setBounds(36,22,90,25);
        slbl2.setBounds(36,62,120,25);
        slbl3.setBounds(36,102,110,25);
        slbl4.setBounds(385,102,50,25);
        slbl5.setBounds(36,143,110,25);
        slbl6.setBounds(36,197,120,25);
        slbl7.setBounds(36,227,90,25);
        slbl8.setBounds(345,227,110,25);
        slbl9.setBounds(36,265,120,25);
        slbl10.setBounds(345,265,120,25);
        //declaring a new font style
        Font style1 = new Font("SansSerif",0,12);
        
        //setting the style in the labels of seniorpanel
        slbl1.setFont(style1);
        slbl2.setFont(style1);
        slbl3.setFont(style1);
        slbl4.setFont(style1);
        slbl5.setFont(style1);
        slbl6.setFont(style1);
        slbl7.setFont(style1);
        slbl8.setFont(style1);
        slbl9.setFont(style1);
        slbl10.setFont(style1);
        
        //adding labels in the seniorpanel
        seniorpanel.add(slbl1);
        seniorpanel.add(slbl2);
        seniorpanel.add(slbl3);
        seniorpanel.add(slbl4);
        seniorpanel.add(slbl5);
        seniorpanel.add(slbl6);
        seniorpanel.add(slbl7);
        seniorpanel.add(slbl8);
        seniorpanel.add(slbl9);
        seniorpanel.add(slbl10);
        
        /*creating objects of JTexfield which takes all the values required as parameters from user
        These are textfields of senior developer class which corresponds to value required in creating object and calling method hiredeveloper */
        stf1=  new JTextField();
        stf2 = new JTextField();
        stf3 = new JTextField();
        stf4 = new JTextField();
        stf5 = new JTextField();
        stf6 = new JTextField();
        stf7 = new JTextField();
        stf8 = new JTextField();
        stf9 = new JTextField();
        stf10 = new JTextField();
        
        //setting  locations of senior text fields(stf) using setBounds() method
        stf1.setBounds(152,22,380,25);
        stf2.setBounds(152,62,380,25);
        stf3.setBounds(152,102,90,25);
        stf4.setBounds(441,102,90,25);
        stf5.setBounds(152,143,90,25);
        stf6.setBounds(152,190,380,25);
        stf7.setBounds(152,227,90,25);
        stf8.setBounds(444,227,90,25);
        stf9.setBounds(152,265,90,25);
        stf10.setBounds(444,265,90,25);

        //adding texfields of senior developer in the seniorpanel
        seniorpanel.add(stf1);
        seniorpanel.add(stf2);
        seniorpanel.add(stf3);
        seniorpanel.add(stf4);
        seniorpanel.add(stf5);
        seniorpanel.add(stf6);
        seniorpanel.add(stf7);
        seniorpanel.add(stf8);
        seniorpanel.add(stf9);
        seniorpanel.add(stf10);
        
        /*add button for seniorpanel is created and positioned which shows its name as Add Senior during execution which identifies the button 
        light grey is set as background colour while white as foreground, styled by style 1 and added to the panel
        a actionlistener is added for this button which whenever pressed adds a new platform for senior developer by invoking actionPerformed method*/
        addbtn1 = new JButton("Add Senior");
        addbtn1.setBounds(439,140,94,30);
        addbtn1.setBackground(new Color(153,153,153));
        addbtn1.setForeground(new Color(255,255,255));
        addbtn1.setFont(style1);
        seniorpanel.add(addbtn1);
        addbtn1.addActionListener(this);
        
        //This is appointbutton for seniorpanel light green is set as background colour SansSeerif font is used
        //Whenever this button is pressed senior developer is appointed with details entered in textfields
        appointbtn1 = new JButton("Appoint");
        appointbtn1.setBounds(195,302,90,30);
        appointbtn1.setBackground(new Color(204,255,204));
        appointbtn1.setFont(style1);
        seniorpanel.add(appointbtn1);
        appointbtn1.addActionListener(this);

        //This is terminate button for seniorpanel it terminates the senior developer whenever pressed
        terminatebtn = new JButton("Terminate");
        terminatebtn.setBounds(350,302,90,30);
        terminatebtn.setBackground(new Color(255,102,102));
        terminatebtn.setForeground(new Color(255,255,255));
        terminatebtn.setFont(new Font("SansSeerif",0,12));
        seniorpanel.add(terminatebtn);
        terminatebtn.addActionListener(this);
        
        
        //Creating a new JPanel with null layout for all the fields, labels and buttons of junior developer it is placed over the senior panel from position 340px in Y-axis
        juniorpanel = new JPanel(null);
        juniorpanel.setBounds(0,340,566,451);
        juniorpanel.setBorder(BorderFactory.createTitledBorder("Junior Developer"));
        juniorpanel.setBackground(new Color(248,248,255));
        
        //JLabel objects for corresponding textfields with parameters of name of each field
        jlbl11 = new JLabel("Platform:");
        jlbl12 = new JLabel("Interviewer's Name:");
        jlbl13 = new JLabel("Working Hours:");
        jlbl14 = new JLabel("Salary:");
        jlbl15 = new JLabel("Appointed By:");
        jlbl16 = new JLabel("Termination Date:");
        jlbl17 = new JLabel("Developer's Name:");
        jlbl18 = new JLabel("Appointed Date:");
        jlbl19 = new JLabel("Termination Date:");
        jlbl20 = new JLabel("Specialization:");
        jlbl21 = new JLabel("Developer No:");
        
        //setting position of jlabels
        jlbl11.setBounds(36,22,60,25);
        jlbl12.setBounds(36,62,130,25);
        jlbl13.setBounds(36,102,90,25);
        jlbl14.setBounds(335,102,50,25);
        jlbl15.setBounds(36,142,90,25);
        jlbl16.setBounds(335,142,120,25);
        jlbl17.setBounds(36,225,120,25);
        jlbl18.setBounds(36,262,110,25);
        jlbl19.setBounds(335,262,110,25);
        jlbl20.setBounds(36,300,90,25);
        jlbl21.setBounds(335,300,100,25);
        
        //setting font style to labels
        jlbl11.setFont(style1);
        jlbl12.setFont(style1);
        jlbl13.setFont(style1);
        jlbl14.setFont(style1);
        jlbl15.setFont(style1);
        jlbl16.setFont(style1);
        jlbl17.setFont(style1);
        jlbl18.setFont(style1);
        jlbl19.setFont(style1);
        jlbl20.setFont(style1);
        jlbl21.setFont(style1);
        
        //adding labels in juniorpanel
        juniorpanel.add(jlbl11);
        juniorpanel.add(jlbl12);
        juniorpanel.add(jlbl13);
        juniorpanel.add(jlbl14);
        juniorpanel.add(jlbl15);
        juniorpanel.add(jlbl16);
        juniorpanel.add(jlbl17);
        juniorpanel.add(jlbl18);
        juniorpanel.add(jlbl19);
        juniorpanel.add(jlbl20);
        juniorpanel.add(jlbl21);
        
        //creating objects of JTextField for taking details as input of junior developer from the user these values are used to create object and call method of junior class 
        jtf11 = new JTextField();
        jtf12 = new JTextField();
        jtf13 = new JTextField();
        jtf14 = new JTextField();
        jtf15 = new JTextField();
        jtf16 = new JTextField();
        jtf17 = new JTextField();
        jtf18 = new JTextField();
        jtf19 = new JTextField();
        jtf20 = new JTextField();
        jtf21 = new JTextField();
       
        //setting boundaries for the junior text fields(jtf)
        jtf11.setBounds(152,22,380,25);
        jtf12.setBounds(152,62,380,25);
        jtf13.setBounds(152,102,90,25);
        jtf14.setBounds(444,102,90,25);
        jtf15.setBounds(152,142,90,25);
        jtf16.setBounds(444,142,90,25);
        jtf17.setBounds(152,225,380,25);
        jtf18.setBounds(152,262,90,25);
        jtf19.setBounds(444,262,90,25);
        jtf20.setBounds(152,300,90,25);
        jtf21.setBounds(444,300,90,25);
        
        //adding those textfields in juniorpanel
        juniorpanel.add(jtf11);
        juniorpanel.add(jtf12);
        juniorpanel.add(jtf13);
        juniorpanel.add(jtf14);
        juniorpanel.add(jtf15);
        juniorpanel.add(jtf16);
        juniorpanel.add(jtf17);
        juniorpanel.add(jtf18);
        juniorpanel.add(jtf19);
        juniorpanel.add(jtf20);
        juniorpanel.add(jtf21);
        
        //This is the add button of juniorpanel parameterized by a string "Add Junior" whose background colour is light green with white foreground
        //Whenever this button is presssed a new platform for junior developer is added by creating object of the junior developer class
        addbtn2 = new JButton("Add Junior");
        addbtn2.setBounds(260,175,92,30);
        addbtn2.setBackground(new Color(153,153,153));
        addbtn2.setForeground(new Color(255,255,255));
        addbtn2.setFont(style1);
        juniorpanel.add(addbtn2);
        addbtn2.addActionListener(this);
        
        //This appoint button of juniorpanel hires a new Junior developer in the object selected with the provided details in textfields
        appointbtn2 = new JButton("Appoint");
        appointbtn2.setBounds(260,345,80,30);
        appointbtn2.setBackground(new Color(204,255,204));
        appointbtn2.setFont(style1);
        juniorpanel.add(appointbtn2);
        appointbtn2.addActionListener(this);
        
        //This button calls the displayAll method when pressed to display all the details of developers in console  
        displaybtn = new JButton("Display All");
        displaybtn.setBounds(190,390,95,25);
        juniorpanel.add(displaybtn);
        displaybtn.addActionListener(this);
        
        //This is the button associated with clearAll method for clearing all the inputs in textfields at once
        clearbtn = new JButton("Clear All");
        clearbtn.setBounds(330,390,95,25);
        juniorpanel.add(clearbtn);
        clearbtn.addActionListener(this);
        //adding Scrollbar which is visible whenever needed
        JScrollPane scrollbar = new JScrollPane(seniorpanel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollbar);
        
        //adding juniorpanel in the seniorpanel
        seniorpanel.add(juniorpanel);
        
        //Adding seniorpanel in the frame and setting its properties of visibility resizability and default close operation
        frame.add(seniorpanel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

    }
    /**
     * This method is the overriden method of interface ActionListener whenever an event is listened by the listeners this method is invoked with the object of ActionEvent class
     * The object btnname extracts the name of button pressed and stores in it
     * Everytime the value of oject is checked and suitable action is Performed
     */
    public void actionPerformed(ActionEvent event)
    {
        Object btnname = event.getSource();
        
        if(btnname==addbtn1)
        {
            try
            {
                //extracting values from textfield and storing in The strings below
                sPlatform = stf1.getText();
                sInterviewer = stf2.getText();
                String valuea=stf3.getText();
                String  valueb=stf4.getText();
                String valuec=stf5.getText();
                
                if(sPlatform.equals("")||sInterviewer.equals("")||valuea.equals("")||valueb.equals("")||valuec.equals(""))
                {
                    JOptionPane.showMessageDialog(frame,"Please fill all the fields!","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                
                else
                {
                    sWorkingHours = Integer.parseInt(valuea);//converting string to integer
                    sSalary = Integer.parseInt(valueb);//converting string value to integer
                    sContractPeriod = Double.parseDouble(valuec);//converting stringvalue to double
                    SeniorDeveloper obj1 = new SeniorDeveloper(sPlatform,sInterviewer,sWorkingHours,sSalary,sContractPeriod);//creating object of seniordeveloper
                    dlist.add(obj1);//adding object in the generic arraylist dlist
                    JOptionPane.showMessageDialog(frame,"Platform for Senior Developer added sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        
            catch(NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(frame,"Please enter integer value in the  field required.","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        
        else if(btnname==appointbtn1)
        {
            try
            {
                //extracting values of textfields and storing in respective String variables
                sDeveloper = stf6.getText();
                sJoiningDate = stf7.getText();
                String valued= stf8.getText();
                sRoomNumber = stf9.getText();
                String valuee = stf10.getText();
            
                if(sDeveloper.equals("")||sJoiningDate.equals("")||valued.equals("")||sRoomNumber.equals("")||valuee.equals(""))
                {
                    JOptionPane.showMessageDialog(frame,"Please fill all the fields!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    sAdvanceSalary = Double.parseDouble(valued);//converting string to double
                    sDeveloperNo = Integer.parseInt(valuee);//converting string to integer
                    if(sDeveloperNo>=dlist.size())
                    {
                        JOptionPane.showMessageDialog(frame,"No any platform has been added for this developer number.","Invalid Value",JOptionPane.WARNING_MESSAGE);
                
                    }
                    else if(sDeveloperNo<0)
                    {
                        JOptionPane.showMessageDialog(frame,"            The Developer No is incorrect!\n "+"Please enter valid positive Developer Number.","Invalid Value",JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        SeniorDeveloper object1 = (SeniorDeveloper) dlist.get(sDeveloperNo);//extracting the object in the given index from arraylist and casting it as object of SeniorDeveloper class
                        boolean seniorhire = object1.getAppointed();//calling accessor method of the object to extract value of variable appointed and storing it in a boolean variable seniorhire
                        if(seniorhire==true)
                        {    
                            JOptionPane.showMessageDialog(frame,"The developer is hired already.","Failed",JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            object1.hireDeveloper(sDeveloper, sJoiningDate,sAdvanceSalary,sRoomNumber );//calling method hireDeveloper of  object1  
                            JOptionPane.showMessageDialog(frame,"The developer has been hired successfully.","Sucess",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                
             }
            catch(NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(frame,"Please enter integer value in the fields required.","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            catch(ArrayIndexOutOfBoundsException ex2)
            {
                JOptionPane.showMessageDialog(frame,"The Developer number you've entered is not valid","Invalid info",JOptionPane.WARNING_MESSAGE);
            }
            catch(ClassCastException ex3)
            {
                JOptionPane.showMessageDialog(frame,"Platform for Junior Developer cannot be used to appoint Senior Developer.","Invalid Operation",JOptionPane.WARNING_MESSAGE);
            }
            
        }
                
        else if(btnname==terminatebtn)
        {
            try
            {
                sDeveloperNo = Integer.parseInt(stf10.getText());//converting the string value extracted from textfield stf10 into integer
                
                if(sDeveloperNo>=dlist.size())
                {
                     JOptionPane.showMessageDialog(frame,"There is no any developer with this developer number.","Invalid Value",JOptionPane.WARNING_MESSAGE);
                        
                }
                
                else if(sDeveloperNo<0)
                {
                    JOptionPane.showMessageDialog(frame,"Developer Number shouldnot be negative, Please enter suitable value.","Invalid Value",JOptionPane.WARNING_MESSAGE);
                }
            
                else
                {
                    SeniorDeveloper objm = (SeniorDeveloper) dlist.get(sDeveloperNo);//extracting the object in the given index from arraylist and casting it as object of SeniorDeveloper class
                    boolean terminatestatus = objm.getTerminated();//calling accessor method of the object to extract value of variable terminated and storing it in a boolean variable terminatestatus
                    boolean appointstatus = objm.getAppointed();//calling accessor method of the object to extract value of variable appointed and storing it in a boolean variable appointstatus
                    if(appointstatus==true )
                    {
                        objm.terminateDeveloper();
                        JOptionPane.showMessageDialog(frame,"The developer has been terminated successfully.","Information",JOptionPane.INFORMATION_MESSAGE);
                                         
                    } 
                    else if(terminatestatus==true )
                    {
                        JOptionPane.showMessageDialog(frame,"Sorry, This developer is  already terminated");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"The developer with this developer number is not hired yet to terminate!","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(frame,"A whole number is expected as the developer number!","Invalid value",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        else if(btnname==clearbtn)
        {
            clearAll();
        }
        else if(btnname==displaybtn)
        {
            displayAll();//calling method displayAll()
        }
        
        else if(btnname==addbtn2)
        {
            try
            {
                //extracting values of junior textfields and storing as strings
                jPlatform = jtf11.getText();
                jInterviewer = jtf12.getText();
                String value1 = jtf13.getText();
                String value2 = jtf14.getText();
                jAppointedBy = jtf15.getText();
                jTerminationDate = jtf16.getText();

                if(jPlatform.equals("")||jInterviewer.equals("")||value1.equals("")||value2.equals("")||jAppointedBy.equals("")||jTerminationDate.equals(""))
                {
                    JOptionPane.showMessageDialog(frame,"Please fill all the fields!","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                
                else
                {
                    jWorkingHours = Integer.parseInt(value1);//converting the string into integer
                    jSalary = Integer.parseInt(value2);//converting string value to integer
                    JuniorDeveloper obj2 = new JuniorDeveloper(jPlatform,jInterviewer,jWorkingHours,jSalary,jAppointedBy,jTerminationDate);//creating new object of Junior Developer class
                    dlist.add(obj2);//adding the object created in the arraylist dlist
                    JOptionPane.showMessageDialog(frame,"Platform for Junior Developer added sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(frame,"Please enter integer value in the  field required.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if(btnname==appointbtn2)
        {
            try
            {
                //extracting values of junior textfields and storing as strings
                jDeveloper = jtf17.getText();
                jAppointedDate = jtf18.getText();
                jTerminationDate = jtf19.getText();
                jSpecialization = jtf20.getText();
                String value3 = jtf21.getText();
                if(jDeveloper.equals("")||jAppointedDate.equals("")||jTerminationDate.equals("")||jSpecialization.equals("")||value3.equals(""))
                    {
                        JOptionPane.showMessageDialog(frame,"Please fill all the fields!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        jDeveloperNo = Integer.parseInt(value3);//converting string value to integer
                        if(jDeveloperNo>=dlist.size())
                        {
                            JOptionPane.showMessageDialog(frame,"No any platform has been added for this developer number.","Invalid Value",JOptionPane.WARNING_MESSAGE);
                    
                        }
                        else if(jDeveloperNo<0)
                        {
                            JOptionPane.showMessageDialog(frame,"            The Developer No is incorrect!\n "+"Please enter valid positive Developer Number.","Invalid Value",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                           JuniorDeveloper object2 = (JuniorDeveloper) dlist.get(jDeveloperNo);//extracting the object in the given index from arraylist and casting it as object of JuniorDeveloper class
                           boolean joinstatus = object2.getJoined();//calling accessor method of the object to extract value of variable joined and storing it in a boolean variable joinstatus
                           if(joinstatus==false)
                           {
                               object2.appointDeveloper(jDeveloper,jAppointedDate,jTerminationDate,jSpecialization);//calling the method appointDeveloper of object2 
                               JOptionPane.showMessageDialog(frame,"The Junior Developer has been appointed succesfully");
                           }
                           else
                           {
                               JOptionPane.showMessageDialog(frame,"This Developer has joined already.","Cannot complete task",JOptionPane.ERROR_MESSAGE);
                           }
                        }
                
                    }
            }
            
            catch(NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(frame,"Please enter correct inputs.","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            catch(ArrayIndexOutOfBoundsException ex2)
            {
                JOptionPane.showMessageDialog(frame,"The Developer number you've entered is not valid","Invalid info",JOptionPane.WARNING_MESSAGE);
            }
            catch(ClassCastException ex3)
            {
                JOptionPane.showMessageDialog(frame,"Platform for Senior Developer cannot be used to appoint Junior Developer.","Invalid Operation",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    /**
     * This method is used to clears the textfields whenever called so that all textfields can be emptied by help of a single click
     * It sets Empty string values in the textfields
     */
    public void clearAll()
    {
        stf1.setText("");
        stf2.setText("");
        stf3.setText("");
        stf4.setText("");
        stf5.setText("");
        stf6.setText("");
        stf7.setText("");
        stf8.setText("");
        stf9.setText("");
        stf10.setText("");
        jtf11.setText("");
        jtf12.setText("");
        jtf13.setText("");
        jtf14.setText("");
        jtf15.setText("");
        jtf16.setText("");
        jtf17.setText("");
        jtf18.setText("");
        jtf19.setText("");
        jtf20.setText("");
        jtf21.setText("");
        
        
    }
    
    /**
     * This method uses for each loop to display the properties of developer during iterations
     * In each iterations a value in a index of arraylist is initialized and stored in variable elements after that 
     * display method is called by each iterations which uses overriding 
     **/
    public void displayAll()
    {
        for(Developer elements:dlist)
        {
            elements.display();
        }
    }
    /**
     * This is the main method which createds the object of this class and then calls the makeUI method every  time
     */
    public static void main(String[] args)
    {
        RigoTechnology obj = new RigoTechnology();
        obj.makeUI();   

        
    }
    
}