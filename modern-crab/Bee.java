// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bee extends Actor
{
    

    /**
     * Act - do whatever the Bee wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        if (foundCrab()) {
            eatCrab();
        }
        else {
            move(2);
        }
        if (Greenfoot.isKeyDown("z")) {
            turn(-4);
            Greenfoot.setSpeed(50);
        }
        if (Greenfoot.isKeyDown("x")) {
            turn(5);
            Greenfoot.setSpeed(30);
        }
    }

    /**
     * The bee is eating the crab
     */
    public void eatCrab()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            /* eat the crab*/
            getWorld().removeObject(Crab);
        }
    }

    /**
     * 
     */
    public boolean foundCrab()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        return Crab != null;
    }
}
