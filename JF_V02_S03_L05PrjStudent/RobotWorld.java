import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Agustiawan, A Rindhoni, K Satria) 
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

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot, 48, 50);
        robot.setLocation(28, 39);
        Wall wall = new Wall();
        addObject(wall, 59, 157);
        wall.setLocation(52, 147);
        Wall wall2 = new Wall();
        addObject(wall2, 165, 153);
        wall2.setLocation(159, 147);
        Wall wall3 = new Wall();
        addObject(wall3, 272, 154);
        wall3.setLocation(267, 146);
        wall3.setLocation(266, 146);
        wall3.setLocation(266, 147);
        Wall wall4 = new Wall();
        addObject(wall4, 593, 151);
        wall4.setLocation(587, 145);
        Wall wall5 = new Wall();
        addObject(wall5, 701, 151);
        wall5.setLocation(692, 145);
        Wall wall6 = new Wall();
        addObject(wall6, 792, 151);
        wall6.setLocation(791, 145);
        Block block = new Block();
        addObject(block, 432, 153);
        block.setLocation(427, 145);
        Home home = new Home();
        addObject(home, 746, 552);
        home.setLocation(751, 552);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel, 129, 549);
        scorepanel.setLocation(122, 544);
        scorepanel.setLocation(71, 554);
        Pizza pizza = new Pizza();
        addObject(pizza, 720, 46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2, 433, 38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3, 183, 302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4, 682, 312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5, 417, 537);
        pizza2.setLocation(284,33);
    }
}
