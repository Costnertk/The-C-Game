import java.util.*;
public class Quests
{
    //list quests here and select quests here
    private String name;
    Scanner input = new Scanner(System.in);
    public static int checkpoint = 1;
    
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
        if(questSelection == 2)
        {
            Quest1();
        }   
        if(questSelection == 3)
        {
            Quest1();
        }    
    }
    //this method is fed each "decision to check if it is a 1 or 2 if it is not is continues to ask for a new input"
    public String inputCheck(String choice)
    {
        while(true)
        {
            if(choice.equals("1"))
            {
                return choice;
            }
            else if(choice.equals("2"))
            {
                return choice;
            }
            else
            {
                System.out.println("Not a valid Input. Please try again.");
                choice = input.nextLine();
            }
        }
    }

    //restructuring of quests to encapsulate into if() allwoing single quest selecion via main
    //Quest I ("Just the beginning")
    public void Quest1()
    {
        //START QUEST 1______________________________________________________________________________________________________________________________________________
        
        //Choice 1
        System.out.println("It's a dark and stormy night as " + name + " drives home from work...\n1.Park car on the street\n2.Park car in garage");
        String userInput = input.nextLine(); 
        userInput = inputCheck(userInput);
        if(userInput.equals("1"))
        {
            Images.clearScreen();
            System.out.println("You run out of your car as fast as you can since you forgot your umbrella again.");
        }
        else
        {
            Images.clearScreen();
            System.out.println("You get out of the car and go into the house.");
        }        
        
        //Choice 2
        System.out.println("You enter the house and your friends Matthew, Costner, and John are playing video games in the living room. You... " + "\n1.Make Dinner\n2.Sit down in the living room");
        userInput = input.nextLine(); 
        userInput = inputCheck(userInput);
        if(userInput.equals("1"))
        {
            
            Images.clearScreen();
            System.out.println("You enter the Kitchen. You..." + "\n1.Open the pantry\n2.Go open the fridge");
            userInput = input.nextLine(); 
            userInput = inputCheck(userInput);
            
            //Choice 2A
            if(userInput.equals("1"))
            {
                
                Images.clearScreen();
                System.out.println("You open the pantry all you have left is potato chips and pop tarts. You grab the..." + "\n1.Potato Chips\n2.Pop Tarts");
                userInput = input.nextLine(); 
                userInput = inputCheck(userInput);

                //Choice 2AA
                if(userInput.equals("1"))
                {
                    Images.clearScreen();
                    System.out.println("You chose to have potato chips for dinner.");
                
            
                }
                else
                {
                    Images.clearScreen();
                    System.out.println("You chose to have pop tarts for dinner.");
                }  
            
            }
            else
            {
                
                Images.clearScreen();
                System.out.println("You open the fridge and there is some lunch meat, cheese, and eggs. You decide to make..." + "\n1.A Sandwich\n2.Scrambled Eggs");
                userInput = input.nextLine(); 
                userInput = inputCheck(userInput);

                //Choice 2AB
                if(userInput.equals("1"))
                {
                    Images.clearScreen();
                    System.out.println("You chose to have a sandwich for dinner.");
                
            
                }
                else
                {
                    Images.clearScreen();
                    System.out.println("You chose to have scrambled eggs for dinner.");
                }  

            }      
            System.out.println("You eat your dinner. It's almost 11 o'clock.");
        }
        else
        {
            
            Images.clearScreen();
            System.out.println("You sit down on the couch. Matthew, Costner, and John are playing Halo Reach. You..." + "\n1.Ask to join the game\n2.You sit and talk with them");
            userInput = input.nextLine(); 
            userInput = inputCheck(userInput);

            //Choice 2B
            if(userInput.equals("1"))
            {
                
                Images.clearScreen();
                System.out.println("You ask to join the game. You choose to play..." + "\n1.Custom Games\n2.Infection");
                userInput = input.nextLine(); 
                userInput = inputCheck(userInput);

                //Choice 2AB
                if(userInput.equals("1"))
                {
                    Images.clearScreen();
                    System.out.println("You chose to play custom Games.");
                
            
                }
                else
                {
                    Images.clearScreen();
                    System.out.println("You chose to play Infection.");
                }
            
            }
            else
            {
                
                Images.clearScreen();
                System.out.println("You..." + "\n1.Talk about work\n2.Ask how their day was");
                userInput = input.nextLine(); 
                userInput = inputCheck(userInput);
                
                //Choice 2AB
                if(userInput.equals("1"))
                {
                    Images.clearScreen();
                    System.out.println("You tell them about your boring day at work. You talk for a while until about midnight.");
                
            
                }
                else
                {
                    Images.clearScreen();
                    System.out.println("They tell you they havent done much all day other than play Halo. You talk for a while until about midnight.");
                }
            }      
        }     
        
        //End of Quest 1
        System.out.println("You are tired and decide to go to bed.");
        
        //finish quest 1 checkpoint = 2
        checkpoint = 2;

        //END QUEST 1 ________________________________________________________________________________________________________________________________
    }
}