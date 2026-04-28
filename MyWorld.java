import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        
        //create elephant
        Elephant E = new Elephant();
        addObject(E, 200, 200);
        
        //create a label
        scoreLabel = new Label(0, 100);
        addObject(scoreLabel, 50, 50);
        //creat apple
        createApple();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple()
    {
       Apple apple = new Apple();
       int x =Greenfoot.getRandomNumber(600);
       int y =0;
       addObject(apple, x, y);
    }
}
