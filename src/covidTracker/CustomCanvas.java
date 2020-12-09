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
    	private BufferedImage background;


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
        		} catch (IOException ex) {
        			System.out.println("Could not find the image file " + ex.toString());
        		}
        }
        
        public void update() { this.repaint(); }
        


        
        public void paint(Graphics g){
        	int coords[];
        	
        	Color tempColor = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
            g.setColor(tempColor);
            g.drawImage(background, 0, 0, width, height, this);
            g.drawOval((int)(Math.random()*width),(int)(Math.random()*height), 20, 20);
            
            int i;
            g.setColor(Color.GRAY);
            // Draw rows
            int rowHt = height / (rows);
            for (i = 0; i < rows; i++)
              g.drawLine(0, i * rowHt, width, i * rowHt);

            // Draw columns
            int rowWid = width / (cols);
            for (i = 0; i < cols; i++)
              g.drawLine(i * rowWid, 0, i * rowWid, height);
        }
}
