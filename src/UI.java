import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UI {
	static JButton bt[][]=new JButton[6][6];
	static class myUI extends JFrame{
		ImageIcon icon1= new ImageIcon("Map.jpg");
		JLabel label= new JLabel();
		JPanel panel= new JPanel();
		JLabel money2= new JLabel();
		JLabel money1= new JLabel();
		JLabel hp2= new JLabel();
		JLabel hp1= new JLabel();
		public  ImageIcon getImageIcon(String path, int width, int height) {
			  if (width == 0 || height == 0) {
			   return new ImageIcon(this.getClass().getResource(path));
			  }
			  ImageIcon icon = new ImageIcon(path);
			  icon.setImage(icon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
			  return icon;
		}
		myUI(){
			setSize(1200,750);
			setResizable(false);
			setLayout(null);
			panel.setLayout(null);
			icon1=getImageIcon("Map.jpg", 700, 700);
			label.setIcon(icon1);
			//panel.add(label);
			getLayeredPane().add(label,new Integer(Integer.MIN_VALUE)); 
			JPanel jj=(JPanel)getContentPane();  
	        jj.setOpaque(false);  
			//add(label);
	        hp1.setText("HP:2000");
	        hp2.setText("HP:2000");
	        panel.add(hp1);
	        panel.add(hp2);
			panel.setOpaque(false);
			panel.setBounds(0, 0, 1200, 700);
			label.setBounds(250, 0, 700, 700);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
				bt[i][j]=new JButton();
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
			    panel.add(bt[i][j]);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
				bt[i][j].setBounds((i-1)*140+250, (j-1)*140, 140, 140);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++) 
				bt[i][j].setContentAreaFilled(false);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
				bt[i][j].setBorder(BorderFactory.createLineBorder(Color.green,3));
			bt[1][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  1");
					bt[1][1].setBorder(BorderFactory.createLineBorder(Color.red,5));
				}
			});
			bt[1][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  2");
				}
			});
			bt[1][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  3");
				}
			});
			bt[1][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  4");
				}
			});
			bt[1][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  5");
				}
			});
			
			
			bt[2][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  1");
				}
			});
			bt[2][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  2");
				}
			});
			bt[2][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  3");
				}
			});
			bt[2][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  4");
				}
			});
			bt[2][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  5");
				}
			});
			
			
			bt[3][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  1");
				}
			});
			bt[3][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  2");
				}
			});
			bt[3][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  3");
				}
			});
			bt[3][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  4");
				}
			});
			bt[3][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  5");
				}
			});
			
			
			bt[4][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  1");
				}
			});
			bt[4][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  2");
				}
			});
			bt[4][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  3");
				}
			});
			bt[4][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  4");
				}
			});
			bt[4][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  5");
				}
			});
			
			
			bt[5][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  1");
				}
			});
			bt[5][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  2");
				}
			});
			bt[5][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  3");
				}
			});
			bt[5][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  4");
				}
			});
			bt[5][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  5");
				}
			});
			add(panel);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
    public static void main(String[] args) {
    	try {
    		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//当前系统风格
    		//UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");//windows风格
    		//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());//跨平台的Java风格
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	myUI P=new myUI();
        P.setVisible(true);
        
    }
}
