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
        
        Map<String, Integer> topPlayers = new HashMap<>();
        
        topPlayers.put("Player 1", 3);
        topPlayers.put("Player 2", 2);
        topPlayers.put("Player 3", 1);

        Button menuButton = new Button(this::goMenu);
        addObject(menuButton, 100, 25);
    }
    
    public void goMenu()
    {
        Greenfoot.setWorld(new MenuScreen());
    }
    
    public void displayHighscores()
    {
        
    }
}
