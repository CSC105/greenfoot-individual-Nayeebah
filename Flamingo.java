import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    GreenfootImage[] flamingoImg = new GreenfootImage[36];
    private int x;
    private int y;
    //private int score;
    //private xspeed;
    private int yspeed;
    private boolean grounded;
    
    public Flamingo(int x, int y){
        for(int i=0 ; i<36 ; i++){
            flamingoImg[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
            //GreenfootImage Flamingo = getImage();
            flamingoImg[i].scale(110,200);
            //Flamingo.scale(55, 100);
            //setImage(Flamingo);
        }
        setImage(flamingoImg[0]);
        this.x = x;
        this.y = y;
        setLocation(x,y);
    }
    int img = 0;
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.isKeyDown("left")){
          //setImage(flamingoImg[5]);
          img -= 1;
          x-=5;
      }
      if(Greenfoot.isKeyDown("right")){
          //setImage(flamingoImg[5]);
          img += 1;
          x+=5;
      }
      if(Greenfoot.getKey() == ("up") && grounded){
      //if(Greenfoot.isKeyDown("up") && grounded){
          //setImage(flamingoImg[5]);
          //img += 1;
          yspeed -= 25;
          grounded = false;
      }
      
      while(img<0){img+=35;}
      while(img>35){img-=36;}
      setImage(flamingoImg[img]);
      
      //Moving
      if(y > 500){yspeed = 0; y = 500;}   //Ground
      //if(Math.abs(y-500) < 50){grounded = true;} else {grounded = false;}
      if(y == 500){grounded = true;} else {grounded = false;}
      y += yspeed;
      //Y Friction
      if(yspeed < 150 && !grounded){
          yspeed += 1;
        }
      ////////////
      setLocation(this.x,this.y);
      /*
      Actor Heart;
      
      Heart =getOneObjectAtOffset(0,0,Heart.class);
      
      if(Heart !=null)
      {World world;
         world = getWorld();
         world.removeObject(Heart);
         
      }*/
      /*if(isTouching(Ghost.class)){
          World gameOver = new World()
          Greenfoot.setWorld(GameOver);
        }*/
    }    
    /*
    public getScore(){
        return score;
    }*/
}
