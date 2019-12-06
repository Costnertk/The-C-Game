public class StartGame
{
    private String name;

    public StartGame(String theName)
    {
        name = theName;
    }

    public void startGame()
    {
        Quests quest = new Quests(name);
        quest.Quest1();
    }

}