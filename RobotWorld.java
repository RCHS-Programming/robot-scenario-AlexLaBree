import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject (new Robot(), 20, 40);
        addObject (new Wall(), 50, 150);
        addObject (new Wall(), 155, 150);
        addObject (new Wall(), 260, 150);
        addObject (new Wall(), 750, 150);
        addObject (new Wall(), 645, 150);
        addObject (new Wall(), 540, 150);
        addObject (new Block(), 400, 150);
        addObject (new Home(), 750, 550);
        addObject (new ScorPanel(), 100, 530);
        addObject (new Pizza(), 750, 50);
        addObject (new Pizza(), 425, 50);
        addObject (new Pizza(), 650, 360);
        addObject (new Pizza(), 425, 500);
        addObject (new Pizza(), 250, 300);
    }
}
