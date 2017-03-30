/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Liam
 */
public class Game extends Canvas implements Runnable{

private static final long serialVersionUID = 1L;

//Getting the Width and Height
public static final int WIDTH = 180;
public static final int HEIGHT = WIDTH/12*9;
public static final int SCALE = 3;
public static final String NAME = "Game";

//Creating the JFrame
private JFrame frame;
public boolean running;
public int tickCount = 0;

//BufferedImage
private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData(); 

public Game(){
    setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
    setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
    setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
    
    frame = new JFrame(NAME);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    
    frame.add(this,BorderLayout.CENTER);
    frame.pack();
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}
    
    public synchronized void start() {
          running = true;
          new Thread(this).start();
    }
      
    public synchronized void stop() {
        running = false;
    }

    public static void main(String[] args){
        new Game().start();
    }
    public void run() {
       long lastTime = System.nanoTime();
       double nsPerTick = 1000000000D/60D;
       
        //setting the ticks and frames to zero
       int ticks = 0;
       int frames= 0;
       
       long lastTimer = System.currentTimeMillis();
       double delta = 0;
       
       /*While the game is running , if the games is rendered and delta 
        is above 0 than increment ticks*/
       while(running){
       long now = System.nanoTime();
       delta += (now - lastTime)/nsPerTick;
       lastTime = now;
       boolean shouldRender = true;
       
       while(delta >= 1){
           ticks++;
           tick();
           delta -= 1;
           shouldRender = true;
       } 
        // The thread sleeps for 2 millisecs so the frames are lower
        try{
            Thread.sleep(2);
        } 
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       
        if(shouldRender){
            frames++;
            render();
        }
            
       if(System.currentTimeMillis() - lastTimer >= 1000){
            lastTimer +=1000;
            System.out.println("frames:" + frames + "," + "ticks:" + ticks );
            frames = 0;
            ticks = 0;
            }
       }    
    }
    
    public void tick(){
      tickCount++;  
      
      for(int i = 0; i < pixels.length; i++){
          pixels[i] = i + tickCount;
      }
    }

    public void render(){
        BufferStrategy bs = getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        
        Graphics g = bs.getDrawGraphics();
       
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.drawImage(image,0, 0, getWidth(),getHeight(), null);
        //disposes the imamge 
        g.dispose();
        bs.show();
        
    } 
}
