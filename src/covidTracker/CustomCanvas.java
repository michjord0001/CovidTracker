package covidTracker;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class CustomCanvas extends Canvas {

        int width, height;
        int rows, cols;
    	private BufferedImage background, robot1;


        public CustomCanvas(int width, int height, int rows, int cols){
                this.setSize(width,height);
                this.width = width;
                this.height = height;
                this.rows = rows;
                this.cols = cols;
                setSize(width, height);
                this.update();

                //Background
                try {
        			background = ImageIO.read(this.getClass().getResource("houseplan2.jpg"));
        			robot1 = ImageIO.read(this.getClass().getResource("robot1.png"));
        		} catch (IOException ex) {
        			System.out.println("Could not find the image file " + ex.toString());
        		}
        }
        
        public void update() { this.repaint(); }
        
        public void paint(Graphics g){
        	
        	Color tempColor = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
            g.setColor(tempColor);
            g.drawImage(background, 0, 0, width, height, this);
            
            //Draw Grid
            int i;
            g.setColor(Color.GRAY);
            
            int rowHt = height / (rows);
            for (i = 0; i < rows; i++)
              g.drawLine(0, i * rowHt, width, i * rowHt);

            int rowWid = width / (cols);
            for (i = 0; i < cols; i++)
              g.drawLine(i * rowWid, 0, i * rowWid, height);
            
            //Draw robot
            g.drawOval((int)(Math.random()*width),(int)(Math.random()*height), 25, 25);
            g.drawImage(robot1, (int)(Math.random()*width),(int)(Math.random()*height), 25, 25, this);
        }
}
