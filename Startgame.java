import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startgame extends Actor
{
    /**
     * Act - do whatever the Startgame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Background());
        }
    }   
    public Startgame(){
        GreenfootImage image = getImage();
        image.scale(120,60);
        setImage(image);
    }
    
}
