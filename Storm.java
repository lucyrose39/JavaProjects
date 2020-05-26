/* Storm Class */
/* Applet to draw raindrops that keep changing size and position */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;

public class Storm extends Applet {

   private final int MAX_COUNT   = 5000;
   private final int BUSY_WAIT   = 500;
   private final int APPLET_SIZE = 200;

   private Random position = new Random();

   private Raindrop drop1;   // references for 5 Raindrop objects
   private Raindrop drop2;
   private Raindrop drop3;
   private Raindrop drop4;
   private Raindrop drop5;

   private Graphics page;    // The graphics page

   // The init method is called once when the applet is 
   // first loaded into memory. (initialization code)
   public void init() {
      drop1 = new Raindrop();   // create 5 Raindrop objects
      drop2 = new Raindrop();
      drop3 = new Raindrop();
      drop4 = new Raindrop();
      drop5 = new Raindrop();
      show(true);
      page = getGraphics();
   }

   // The start method is called every time the applet is 
   // viewed by a browser. (code to implement rain effect)
   public void start() {

      int count = 1;
      int wait;

      setBackground(new Color(192,192,192));
      //while (count < MAX_COUNT)
      while (true) {
         check_drop (drop1);
         check_drop (drop2);
         check_drop (drop3);
         check_drop (drop4);
         check_drop (drop5);
         count = count + 1;

         draw (page);

         wait = 0;
         while (wait < BUSY_WAIT) {
            wait = wait + 1;
         }
      }
   }

   public void check_drop (Raindrop drop) {

      if (drop.visible()) {
         drop.ripple();
      } else {
         int x = Math.abs (position.nextInt() % APPLET_SIZE) + 1;
         int y = Math.abs (position.nextInt() % APPLET_SIZE) + 1;
         drop.set_position (x, y);
      }
   }

   public void draw (Graphics page) {

      // Clear the applet
      page.setColor(getBackground());
      page.fillRect (0, 0, APPLET_SIZE, APPLET_SIZE);
      page.setColor(getForeground());

      // Draw all the drops
      drop1.draw (page);
      drop2.draw (page);
      drop3.draw (page);
      drop4.draw (page);
      drop5.draw (page);
   }
} // class Storm