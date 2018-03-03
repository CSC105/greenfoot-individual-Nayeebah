import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private int score;
   Flamingo flamingo1;
   private boolean IsSpawn;
   Heart heart = new Heart();
   private GreenfootSound music = new GreenfootSound("mr_clown.mp3");
   private boolean begin = true;
   
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1090, 600, 1); 
        /*GreenfootImage[] flamingoImg = new GreenfootImage[36];
        for(int i=0 ; i<36 ; i++){
            flamingoImg[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
        }*/
        flamingo1 = new Flamingo(580,500);
        //GreenfootSound music = new GreenfootSound("mr_clown.mp3");
        addObject(flamingo1,580,500);
        for(int i=0 ; i<10 ; i++)
        {
            addObject(new Heart(),Greenfoot.getRandomNumber(getWidth()),1);
        }
        for(int i=0 ; i<1 ; i++)
        {
            addObject(new Ghost(getWidth(),Greenfoot.getRandomNumber(getHeight()-50)+50),0,0);
        }
    }
    
    public void addScore(int n){
        score += n;
    }
    
    public void print(String str){
        showText(str,50,100);
    }
    
    public void act(){
        showText("score : "+score,50,50);
        if(begin){
            music.setVolume(100);
            music.playLoop();
            begin = false;
        }
    } 
    
    public void started(){
        music.setVolume(100);
        music.playLoop();
    }
    public void stopped(){
        music.stop();
    }
} 
                    