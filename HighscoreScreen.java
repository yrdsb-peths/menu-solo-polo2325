import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class HighscoreScreen extends World
{
    
    /**
     * Constructor for objects of class HighscoreScreen.
     * 
     */
    public HighscoreScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Label title = new Label("Highscore", 60);
        addObject(title, 300, 100);
                
        Map<String, Integer> highscores = new HashMap<>();
        
        highscores.put("Player 1", 3);
        highscores.put("Player 2", 3);
        highscores.put("Player 3", 3);

        Button menuButton = new Button(this::goMenu);
        addObject(menuButton, 100, 25);
        
        displayHighscores(highscores);
    }
    
    public void goMenu()
    {
        Greenfoot.setWorld(new MenuScreen());
    }
    
    public void displayHighscores(Map<String, Integer> highscores)
    {
        int increment = 0;
        
        for (String key : highscores.keySet()) 
        { 
            int value = highscores.get(key); 
            Label highscoreLabel = new Label(key + ": " + value, 30);
            addObject(highscoreLabel, 300, 180 + increment);
            
            increment += 50;
        }
    }
}
