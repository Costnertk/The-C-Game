import java.util.*;
public class Quests
{
    //list quests here and select quests here
    private String name;
    Scanner input = new Scanner(System.in);
    public static int checkpoint = 0;
    
    public Quests(String theName)
    {
        name = theName;
    }

    public void runQuest(int questSelection)
    {
        //allows the use of one 'Quests' object in main but run multiple Quests
        if(questSelection == 1)
        {
            Quest1();
        }
        else if(questSelection == 2)
        {
            Quest2();
        }
        else if(questSelection == 3)
        {
            Quest3();
        }
        
        
    }

    //restructuring of quests to encapsulate into if() allwoing single quest selecion via main
    //Quest I ("Just the beginning")
    public void Quest1()
    {
        //Choice 1
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        int userInput = input.nextInt(); 
        while(true)
        {
            if(userInput == 1)
            {
                System.out.println("entered1");
                break;
            }
            else if(userInput == 2)
            {
                System.out.println("entered2");
                break;
            }
            else
            {
                System.out.println("Not a valid Input. Please try again.");
                userInput = input.nextInt();
            }
        }
        
    }