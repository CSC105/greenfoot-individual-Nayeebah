import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
   
    private int x;
    private int y;
    int wait = -1;
    GreenfootImage visible;
    GreenfootImage invisible;
    
   public Ghost(int x, int y){
       wait = Greenfoot.getRandomNumber(400);
       visible = new GreenfootImage("G.png");
       invisible = new GreenfootImage(visible.getWidth(),visible.getHeight());
       setImage(visible);
       this.x = x;
       this.y = y;
       setLocation(x,y);
    }
   
   public void act() 
    {
      /*
      if(wait >= 0){wait --;}
      
      if(wait==0){
          setImage(visible);
          x = getWorld().getWidth();
          y = Greenfoot.getRandomNumber(getWorld().getHeight());
        }
        
      if(wait<0){
          x -= 5;
        }
       */
      x -= 5;
      Dead();
      
      if(x < 0)
        {
            respawn();
        }
      
      setLocation(x,y);
    } 
    
    public void Dead(){
        if(getOneIntersectingObject(Flamingo.class) != null){
            World world;
            world = getWorld();
            ((Background)getWorld()).stopped();
            Greenfoot.setWorld(new GameOver());
        }
    }

    
    public void respawn()
    {   
        //setImage(invisible);
        //wait = Greenfoot.getRandomNumber(200);
        x = getWorld().getWidth();
        y = Greenfoot.getRandomNumber(getWorld().getHeight()-50)+50;
    }
    
} 
