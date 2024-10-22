import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        
        
        
        Button menuButton = new Button(this::goMenu);
        addObject(menuButton, 100, 25);
    }
    
    public void goMenu()
    {
        Greenfoot.setWorld(new MenuScreen());
    }
}
