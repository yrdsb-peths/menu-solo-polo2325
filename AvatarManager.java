import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AvatarManager extends Actor
{
    private Queue<Avatar> avatarsQueue = new Queue<>();
    
    private Avatar currentAvatar;
    
    public AvatarManager()
    {
        avatarsQueue.enqueue(new Avatar("images/face_a.png"));
        avatarsQueue.enqueue(new Avatar("images/face_b.png"));
        avatarsQueue.enqueue(new Avatar("images/face_c.png"));

        currentAvatar = avatarsQueue.dequeue();
    }
    
    
    
}
