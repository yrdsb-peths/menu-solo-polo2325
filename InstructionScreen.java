import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends World
{
    private String[] instructionsList = {"Instruction 1", "Instruction 2", "Instruction 3"};
    private Label instructions;
    private int screenIndex = 0;

    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 


        instructions = new Label(instructionsList[screenIndex], 50);
        addObject(instructions, 300, 200);
        
        Button navigateLeftButton = new Button(this::navigateLeft);
        Button navigateRightButton = new Button(this::navigateRight);

        addObject(navigateLeftButton, 100, 340);
        addObject(navigateRightButton, 500, 340);

        Button menuButton = new Button(this::goMenu);
        addObject(menuButton, 100, 25);
    }
    
    public void goMenu()
    {
        Greenfoot.setWorld(new MenuScreen());
    }

    public void writeInstructions()
    {
        instructions.setValue(instructionsList[screenIndex]);
    }

    public void navigateLeft()
    {
        if(screenIndex > 0)
        {
            screenIndex--;
        }
        
        writeInstructions();
    }

    public void navigateRight()
    {        
        if(screenIndex < 2)
        {
            screenIndex++;
        }
        
        writeInstructions();
    }
}
