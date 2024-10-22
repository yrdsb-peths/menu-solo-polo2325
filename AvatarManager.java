import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AvatarManager
{
    private Queue<Avatar> avatarsQueue = new Queue<>();
    private Avatar currentAvatar;
    private World world;
    
    public AvatarManager(World world)
    {   
        this.world = world;
        
        avatarsQueue.enqueue(new Avatar("images/face_a.png"));
        avatarsQueue.enqueue(new Avatar("images/face_b.png"));
        avatarsQueue.enqueue(new Avatar("images/face_c.png"));
        
        currentAvatar = avatarsQueue.dequeue();
    }
    
    public void updateAvatar()
    {        
        if (currentAvatar != null)
        {
          this.world.removeObject(currentAvatar);
        }
        
        world.addObject(currentAvatar, 300, 100);
    }
    
    public void nextAvatar()
    {
        avatarsQueue.enqueue(currentAvatar);
        this.world.removeObject(currentAvatar);
        
        currentAvatar = avatarsQueue.dequeue();
        updateAvatar();
    }
}
