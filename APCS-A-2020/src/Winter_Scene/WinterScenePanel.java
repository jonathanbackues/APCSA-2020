//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Winter_Scene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes = new ArrayList<AbstractShape>();
	private AbstractShape sMan;
	private Tree tree;
	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape

		//populate the list with 50 unique snowflakes
		for(int i=0;i<50;i++) {
			int rando =20+(int)(40*Math.random());
			shapes.add(new FancySnowFlake(20+(int)(780*Math.random()),20+(int)(800*Math.random()),rando,rando,2+(int)(Math.random()*4)));
		}
		sMan = new SnowMan(650,420,50,50);
		tree =  new Tree(350,359,50,400);
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);
		sMan.draw(window);
		for(AbstractShape shap:shapes) {
			shap.moveAndDraw(window);
		}
		tree.draw(window);
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}
