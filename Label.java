import greenfoot.*;

public class Label extends Actor
{
    private int value;
    private int fontSize;

    public Label(String text, int size)
    {
        fontSize = size;
        updateImage(text);
    }

    public void setValue(int val)
    {
        value = val;
        updateImage("" + value);
    }

    private void updateImage(String text)
    {
        setImage(new GreenfootImage(text, fontSize, Color.WHITE, null));
    }
}