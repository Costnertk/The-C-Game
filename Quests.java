import java.util.*;
public class Quests
{
    //list quests here and select quests here
    private String name;
    private int gender = 0;
    private int quest;
    Scanner input = new Scanner(System.in);
    public static int checkpoint = 0;
    
    public Quests(String theName, int theGender, int theQuest)
    {
        name = theName;
        gender = theGender;
        quest = theQuest;
    }
    //restructuring of quests to encapsulate into if() allwoing single quest selecion via main
    //Quest I (Needs name)
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
        
        //Choice 2
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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

        //Choice 3
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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
        //end of quest currentQuest++;
        The_Costner_Trail.currentQuest++;
    }

    //Quest 2
    public void Quest2()
    {
        //Choice 1
        System.out.println("quest 2");
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
        
        //Choice 2
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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

        //Choice 3
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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
        //end of quest currentQuest++;
        //currentQuest++;
    }

    //Quest 3
    public void Quest3()
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
        
        //Choice 2
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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

        //Choice 3
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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
        //end of quest currentQuest++;
        //currentQuest++;
    }

    //Quest 4
    public void Quest4()
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
        
        //Choice 2
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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

        //Choice 3
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        userInput = input.nextInt(); 
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
        //end of quest currentQuest++;
        //currentQuest++;
    }
}