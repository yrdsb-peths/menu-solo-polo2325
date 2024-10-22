import greenfoot.*;

public class MenuScreen extends World 
{
    public MenuScreen()
    {
        super(600, 400, 1);

        Button instructionButton = new Button(this::instructions);
        addObject(instructionButton, 300, 340);   
        
        Button avatarSelectionButton = new Button(this::selectAvatar);
        addObject(avatarSelectionButton, 300, 280);  
    }

    public void instructions()
    {
        Greenfoot.setWorld(new InstructionScreen());
    }

    public void selectAvatar()
    {
        
    }
}
