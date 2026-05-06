import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,422,87);
        elephant.setLocation(469,115);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,228,231);
        Label label2 = new Label("Use ← → to Move ", 35);
        addObject(label2,219,290);
        label2.setLocation(232,291);
        label2.setLocation(304,388);
        label2.setLocation(322,353);
        label.setLocation(393,304);
        label.setLocation(274,312);
        label.setLocation(268,298);
        label2.setLocation(253,335);
        label2.setLocation(278,337);
        label2.setLocation(282,340);
        elephant.setLocation(459,80);
        elephant.setLocation(332,99);
        label.setLocation(397,269);
        label.setLocation(370,269);
        label.setLocation(347,269);
        label.setLocation(320,265);
        label2.setLocation(372,324);
        label2.setLocation(345,324);
        label2.setLocation(299,328);
        label2.setLocation(279,326);
        label2.setLocation(309,322);
    }
}
