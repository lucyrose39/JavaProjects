 import java.awt.*;
public class Rain extends java.applet.Applet implements Runnable
{
        private RainDrop[] rainDrops = new RainDrop[500];

        Thread thread = null;
        Image image;
        
        public void init()
        {
                this.setForeground(new Color(137, 132, 130));
                createRainDrops();
                image = getImage(getDocumentBase(),getParameter("img"));
        }
        public void createRainDrops()
        {
                for(int i = 0; i < rainDrops.length; ++i)
                        createRainDrop(i);
        }
        public void createRainDrop(int index)
        {
                int ranX = (int) (Math.random() * 200);
                int ranY = (int) (Math.random() * 150);
                int ranVel = (int) (Math.random() * 10);

                rainDrops[index] = new RainDrop(ranX, ranY, ranVel);
        }
        public final synchronized void update(Graphics g)
        {
                g.drawImage(image, 0, 0, this);
                for(int i = 0; i< rainDrops.length; ++i)
                {
                        rainDrops[i].paint(g);
                        if(rainDrops[i].x > 200 || rainDrops[i].y > 150)
                                createRainDrop(i);
                }
        }
        public void paint(Graphics g)
        {
                g.drawImage(image, 0, 0, this);
        }
        public void start()
        {
                if(thread == null)
                {
                        thread = new Thread(this);
                        thread.setPriority(thread.MAX_PRIORITY);
                        thread.start();
                }
        }
        public void run()
        {
                while(thread != null)
                {
                        repaint();
                        try
                        {
                                thread.sleep(100);
                        }catch(InterruptedException e){}
                }
        }
        public void stop()
        {
                thread = null;
        }  
}

// Rain Drop class
class RainDrop
{
        protected int x, y, velocity;
        private static int INC = 3;

        public RainDrop(int x, int y, int v)
        {
                this.x = x;
                this.y = y;
                this.velocity = v;
	}

	public void paint(Graphics g)
        {
                g.drawLine(x, y, x + INC, y + INC);
                x += INC + velocity;
                y += INC + velocity;
	}
}
