public class questRunner{
    private String name;
    public int num;

    public questRunner( String theName)
    {
        name = theName;
        num = 1;
    }
    Quests selectedQuest = new Quests(name);

    public void runStory()
    {
        //runs all the quests through
        for(int i = 1; i < 3; i++)
        {
            selectedQuest.runQuest(i);
            num = i;

        }
    }

    
}