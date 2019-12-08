public class ContinueGame
{

    private String name;

    public ContinueGame(String theName)
    {
        name = theName;
    }

    public void continueGame()
    {
        Quests quest = new Quests(name);
        System.out.println("Quest " + Quests.checkpoint);
        quest.runQuest(Quests.checkpoint);
    }

}