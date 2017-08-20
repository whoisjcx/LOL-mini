import java.awt.*;
import javax.swing.*;

public class UI {
	static class myUI extends JFrame{
		ImageIcon icon1= new ImageIcon("Map.jpg");
		JLabel label= new JLabel();
		JPanel panel= new JPanel();
		public  ImageIcon getImageIcon(String path, int width, int height) {
			  if (width == 0 || height == 0) {
			   return new ImageIcon(this.getClass().getResource(path));
			  }
			  ImageIcon icon = new ImageIcon(path);
			  icon.setImage(icon.getImage().getScaledInstance(width, height,
			    Image.SCALE_DEFAULT));
			  return icon;
		}
		myUI(){
			setSize(1200,700);
			setDefaultLookAndFeelDecorated(true);
			setResizable(false);
			icon1=getImageIcon("Map.jpg", 700, 700);
			label.setIcon(icon1);
			panel.add(label);
			add(panel);
		}
	}
    public static void main(String[] args) {
    	try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	myUI P=new myUI();
        P.setVisible(true);
        
    }
}
