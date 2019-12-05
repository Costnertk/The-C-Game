import java.util.*;
public class The_Costner_Trail
{
  public static int currentQuest = 1;
    
    public static void main(String[] ars)
    {
        
        Scanner input = new Scanner(System.in);
        //These statments will be encorperated into their own method as "character details"
        System.out.println("Menu Page");
        System.out.println("Enter the name you want for your character");
        String name = input.nextLine();
        Images text = new Images(name);
        questRunner execute = new questRunner(name);
        text.printTitle();
        
        System.out.println("1.Start game" + "\n" + "2.View Achievements" + "\n" + "3.Continue Game");
        int choice = input.nextInt();
        
      
        
        

        if(choice == 1)
        {
          //Start new game, selection process needs to be streamlined
          
          
        }

        else if(choice == 2)
        {
          //Achievements menu
        }
        //continue game
        else if(choice == 3)
        {
          
        }
        else
        {
          System.out.println("Not a valid input. Please try again");
        }
        
       
    }
}