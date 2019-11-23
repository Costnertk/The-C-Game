import java.util.*;
public class Quests
{
    //list quests here and select quests here
    private String name;
    private String gender;
    Scanner input = new Scanner(System.in);
    
    public Quests(String theName, String theGender)
    {
        name = theName;
        gender = theGender;
    }

    //Quest I (Needs name)
    public void Quest1()
    {
        //Choice 1
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        int userInput = input.nextLine(); 
        While(true)
        {
            if(userInput == 1)
            {
                System.out.println("entered1");
                break;
            }
            if else(userInput == 2)
            {
                System.out.println("entered2");
                break;
            }
            else
            {
                System.out.println("Not a valid Input. Please try again.");
                userInput = input.nextLine;
            }
        }
        
        //Choice 2
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        int userInput = input.nextLine(); 
        While(true)
        {
            if(userInput == 1)
            {
                System.out.println("entered1");
                break;
            }
            if else(userInput == 2)
            {
                System.out.println("entered2");
                break;
            }
            else
            {
                System.out.println("Not a valid Input. Please try again.");
                userInput = input.nextLine;
            }
        }

        //Choice 3
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        int userInput = input.nextLine(); 
        While(true)
        {
            if(userInput == 1)
            {
                System.out.println("entered1");
                break;
            }
            if else(userInput == 2)
            {
                System.out.println("entered2");
                break;
            }
            else
            {
                System.out.println("Not a valid Input. Please try again.");
                userInput = input.nextLine;
            }
        }
    }
}