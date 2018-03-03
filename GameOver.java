import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    GreenfootSound over = new GreenfootSound("little_robot_sound.mp3");
    //private boolean begin = true;
    
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1090, 600, 1); 
        addObject(new Continue(),538,405);
        
        over.setVolume(100);
        over.play();
    }
    
    public void act(){
        
    }
}
