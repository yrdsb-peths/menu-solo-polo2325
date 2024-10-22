import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends World
{

    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        writeInsturctions();
    }

    public void writeInsturctions()
    {
        Label instructions = new Label("Instructions goes here", 50);
        addObject(instructions, 300, 200);
    }
}
