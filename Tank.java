import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends Actor
{
    public Tank()
    {
        GreenfootImage image = getImage();
        int newImageHeight = (int)image.getHeight()*2;
        int newImageWidth = (int)image.getWidth()*2;
        image.scale(newImageWidth,newImageHeight);
    }
    
    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 1, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 1, getY());
        }
        
        if(Greenfoot.isKeyDown("space")){
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), 690);
        }
    }
}
