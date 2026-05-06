import greenfoot.*;

public class Apple extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 2);
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}