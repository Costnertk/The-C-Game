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
    }
    //this method is fed each "decision to check if it is a 1 or 2 if it is not is continues to ask for a new input"
    public int inputCheck(int choice)
    {
        while(true)
        {
            if(choice == 1)
            {
                System.out.println("entered1");
                return choice;
            }
            else if(choice == 2)
            {
                System.out.println("entered2");
                return choice;
            }
            else
            {
                System.out.println("Not a valid Input. Please try again.");
                choice = input.nextInt();
            }
        }
    }

    //restructuring of quests to encapsulate into if() allwoing single quest selecion via main
    //Quest I ("Just the beginning")
    public void Quest1()
    {
        //Choice 1
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        int userInput = input.nextInt(); 
        userInput = inputCheck(userInput);
        if(userInput == 1){
            System.out.println("You run out of your car as fast as you can since you forgot your umbrella again");
        }
        else
        {
            System.out.println("You get out of the car and go into the house");
        }
        
        //Choice 2
        System.out.println("You enter the house and your friends Mathew, Costner, and John are playing video games in the living room\nYou ");
    }
}