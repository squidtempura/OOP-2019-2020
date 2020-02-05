package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    float playerX;
    float playerY;
    float playerWidth; 
    float bugX;
    float bugY;
    float bugR;
    public void settings()
    {
        size(600,800);
    }
    public void setup()
    {
        playerX = width/2;
        playerY = height - 20;
        playerWidth = 50;
        bugX = width/2;
        bugY = height - 780;
        bugR = 10;
    }
    public void draw()
    {
        background(0);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug(bugX,bugY);
        if ((frameCount % 45) == 0)
        {
            bugMove();
        }
    }
    public void drawPlayer(float x,float y,float w)
    {
        stroke(255);
        fill(0);
        rect(x-w/2, y-10, w,20,10,10,0,0);
        fill(0);
        line(x,y-10,x,y-15);
    }
    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            System.out.println("Left arrow pressed");
            playerX = playerX - 30;
		}
		if (keyCode == RIGHT)
		{
            System.out.println("Right arrow pressed");
            playerX = playerX + 30;
		}
		if (key == ' ')
		{
            System.out.println("SPACE key pressed");
            line(playerX,playerY-10,playerX,0);
		}
    }
    public void drawBug(float x, float y)
    {
        stroke(255);
        fill(0);
        ellipse(x,y,15,15);
        line(x-10,y-10,x+10,y+10);
        line(x+10,y-10,x-10,y+10);
    }
    public void bugMove()
    {
        bugX = bugX + random(-100,100);
        bugY = bugY + 20;
        if(bugX + bugR > width)
        {
            bugX = width - bugR;
        }
        if(bugX < 0)
        {
            bugX = 0;
        }
        if(bugY > height)
        {
            bugY = 15;
        }
    }	
}	