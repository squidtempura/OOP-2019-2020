package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	
	public void draw() {
		background(255, 0, 0);
		noStroke();
		fill(255, 255, 0);
		ellipse(250,300,400,400);
		fill(0,255,255);
		triangle(250,50,50,450,460,450);
		fill(190, 190, 190);
		ellipse(253,260,205,100);
		fill(0,0,0);
		ellipse(253,260,70,70);
		
	}	
	

	int x = 0; // 4 bytes
	/*
	public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}
	*/
}
