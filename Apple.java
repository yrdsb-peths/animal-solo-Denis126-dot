import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for out elephant
 * @author (Denis) 
 * @version (2026 -04-28)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + 2;
        setLocation(getX(), getY() +1);
        
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
