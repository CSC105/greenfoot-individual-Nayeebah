import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    int wait;
    GreenfootImage visible;
    GreenfootImage invisible;
    GreenfootSound hit = new GreenfootSound("multimedia.mp3");
   public Heart(){
       wait = Greenfoot.getRandomNumber(400);
       visible = new GreenfootImage("h.png");
       invisible = new GreenfootImage(visible.getWidth(),visible.getHeight());
       setImage(invisible);
       turn(Greenfoot.getRandomNumber(359));
       x = Greenfoot.getRandomNumber(1150);
    }
   
   public void act() 
    {
      checkEdge();
      
      if(wait >= 0){wait --;}
      
      if(wait==0){
          setImage(visible);
          x = Greenfoot.getRandomNumber(1150);
          turn(Greenfoot.getRandomNumber(359));
          y = 0;
        }
        
      if(wait<0){
          y++;
          turn(Greenfoot.getRandomNumber(20)-10);
        }
        
      if(getOneObjectAtOffset(0,0,Flamingo.class)!=null)
        {   
            hit.play();
            respawn();
            ((Background)getWorld()).addScore(5);
        }
      
      setLocation(x,y);
    }    

    public void checkEdge()
    {
        if(y > getWorld().getHeight())
        {
            respawn();
        }
    }
    
    public void respawn()
    {   
        setImage(invisible);
        wait = Greenfoot.getRandomNumber(600);
        y = 0;
        setLocation(x,y);
    }
    
} 
