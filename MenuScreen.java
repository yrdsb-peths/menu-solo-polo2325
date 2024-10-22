import greenfoot.*;

public class MenuScreen extends World 
{
    public MenuScreen()
    {
        super(600, 400, 1);

        Button instructionButton = new Button(this::goInstructionsScreen);
        addObject(instructionButton, 300, 340); 
        
        AvatarManager avatarManager = new AvatarManager(this);
        
        Button avatarSelectionButton = new Button(avatarManager::nextAvatar);
        addObject(avatarSelectionButton, 300, 280); 
        
        Button highscoreButton = new Button(this::goHighscoreScreen);
        addObject(highscoreButton, 300, 220); 
    }

    public void goInstructionsScreen()
    {
        Greenfoot.setWorld(new InstructionScreen());
    }
    
    public void goHighscoreScreen()
    {
        Greenfoot.setWorld(new HighscoreScreen());
    }
    
}
