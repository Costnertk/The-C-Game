import java.util.*;
public class The_Costner_Trail
{
    public static void main(String[] ars) {
    Scanner input = new Scanner(System.in);
    System.out.println("Menu Page");
    System.out.println("Enter the name you want for your character");
     String name = input.nextLine();
    Quests questSelector = new Quests(name);
      for(int i = 1; i < 3; i++){
        questSelector.runQuest(i);
      }
    }
}