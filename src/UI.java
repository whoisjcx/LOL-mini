import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class UI {
	static JButton bt[][]=new JButton[6][6];
	static ImageIcon icon1= new ImageIcon("Map.jpg");
	static JLabel label= new JLabel();
	static JPanel panel= new JPanel();
	static JLabel money2= new JLabel();
	static JLabel money1= new JLabel();
	static JLabel hp2= new JLabel();
	static JLabel hp1= new JLabel();
	static JLabel hj[]= new JLabel[6];
	static JLabel ph[]= new JLabel[6];
	static ImageIcon hi[]=new ImageIcon[6];
	static JLabel now;
	public static  ImageIcon getImageIcon(String path, int width, int height) {
		  ImageIcon icon = new ImageIcon(path);
		  icon.setImage(icon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
		  return icon;
	}
	static Player P1,P2;
	static class myUI extends JFrame{
		myUI(){
			String S1[]=new String[3];
			S1[0]="Hulk";
			S1[1]="DocYang";
			S1[2]="Hulk";
			P1=new Player(S1,0);
			String S2[]=new String[3];
			S2[0]="Hulk";
			S2[1]="Hulk";
			S2[2]="Hulk";
			P2=new Player(S2,1);
			setSize(1200,750);
			setResizable(false);
			setLayout(null);
			panel.setLayout(null);
			icon1=getImageIcon("Map.jpg", 700, 700);
			label.setIcon(icon1);
			//panel.add(label);
			getLayeredPane().add(label,new Integer(Integer.MIN_VALUE)); 
			label.setBounds(250, 0, 700, 700);
			 
			//add(label);
	        hp1.setText("HP:2000");
	        hp2.setText("HP:2000");
	        money1.setText("MONEY:1000");
	        money2.setText("MONEY:1000");
	        hp1.setBounds(0,0, 100, 20);
	        hp2.setBounds(950,0, 100, 20);
	        money1.setBounds(0,20, 200, 20);
	        money2.setBounds(950,20, 200, 20);
	        for(int i=0;i<3;i++)
	        	hi[i]=getImageIcon(P1.heros.get(i).name+".jpg",140/2,140/3);
	        for(int i=0;i<3;i++)
	        	hi[3+i]=getImageIcon(P2.heros.get(i).name+".jpg",140/2,140/3);
	        //now=P1.heros.get(0);
	       // System.out.println(now.name+".jpg");
	        for(int i=0;i<6;i++)
	        	hj[i]=new JLabel();
	        for(int i=0;i<6;i++)
	        	hj[i].setIcon(hi[i]);
	        now=hj[0];
	        for(int i=0;i<6;i++)
	        	panel.add(hj[i]);
	        //getLayeredPane().add(hj1,new Integer(Integer.MIN_VALUE)); 
	        for(int i=0;i<3;i++)
	        	hj[i].setBounds(250,140*4+140/3*i,140/2,140/3);
	        for(int i=0;i<3;i++)
	        	hj[i+3].setBounds(250+140*4+140/2,0+140/3*i,140/2,140/3);
	        
	        panel.add(hp1);
	        panel.add(hp2);
	        panel.add(money1);
	        panel.add(money2);
			panel.setOpaque(false);
			panel.setBounds(0, 0, 1200, 700);
			
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
				bt[i][j]=new JButton();
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
			    panel.add(bt[i][j]);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
				bt[i][j].setBounds((i-1)*140+250, (j-1)*140, 140, 140);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++) 
				bt[i][j].setContentAreaFilled(false);
			for(int i=1;i<=5;i++)for(int j=1;j<=5;j++)
				bt[i][j].setBorder(BorderFactory.createLineBorder(Color.darkGray,3));
			bt[2][3].setBorder(BorderFactory.createLineBorder(Color.orange,5));
			bt[3][2].setBorder(BorderFactory.createLineBorder(Color.orange,5));
			bt[4][3].setBorder(BorderFactory.createLineBorder(Color.orange,5));
			bt[3][4].setBorder(BorderFactory.createLineBorder(Color.orange,5));
			Map M=Map.get();
			for(int i=1;i<=5;i++)for(int j=i;j<=5;j++)
				if(M.field[i][j]>0)bt[i][j].setBorder(BorderFactory.createLineBorder(Color.blue,5));
			for(int i=1;i<=5;i++)for(int j=i;j<=5;j++)
				if(M.field[j][i]>0)bt[j][i].setBorder(BorderFactory.createLineBorder(Color.red,5));
			bt[1][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  1");
					//bt[1][1].setBorder(BorderFactory.createLineBorder(Color.red,5));
					now.setBounds(250, 0,140/2,140/3);
				}
			});
			bt[1][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  2");
					now.setBounds(250, 140*1,140/2,140/3);
				}
			});
			bt[1][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  3");
					now.setBounds(250, 140*2,140/2,140/3);
				}
			});
			bt[1][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  4");
					now.setBounds(250, 140*3,140/2,140/3);
				}
			});
			bt[1][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  5");
					now.setBounds(250, 140*4,140/2,140/3);
				}
			});
			
			
			bt[2][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  1");
					now.setBounds(250+140*1, 140*0,140/2,140/3);
				}
			});
			bt[2][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  2");
					now.setBounds(250+140*1, 140*1,140/2,140/3);
				}
			});
			bt[2][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  3");
					now.setBounds(250+140*1, 140*2,140/2,140/3);
					//bt[1][1].setBorder(BorderFactory.createLineBorder(Color.red,5));
				}
			});
			bt[2][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  4");
					now.setBounds(250+140*1, 140*3,140/2,140/3);
				}
			});
			bt[2][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  5");
					now.setBounds(250+140*1, 140*4,140/2,140/3);
				}
			});
			
			
			bt[3][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  1");
					now.setBounds(250+140*2, 140*0,140/2,140/3);
				}
			});
			bt[3][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  2");
					now.setBounds(250+140*2, 140*1,140/2,140/3);
				}
			});
			bt[3][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  3");
					now.setBounds(250+140*2, 140*2,140/2,140/3);
				}
			});
			bt[3][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  4");
					now.setBounds(250+140*2, 140*3,140/2,140/3);
				}
			});
			bt[3][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  5");
					now.setBounds(250+140*2, 140*4,140/2,140/3);
				}
			});
			
			
			bt[4][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  1");
					now.setBounds(250+140*3, 140*0,140/2,140/3);
				}
			});
			bt[4][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  2");
					now.setBounds(250+140*3, 140*1,140/2,140/3);
				}
			});
			bt[4][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  3");
					now.setBounds(250+140*3, 140*2,140/2,140/3);
				}
			});
			bt[4][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  4");
					now.setBounds(250+140*3, 140*3,140/2,140/3);
				}
			});
			bt[4][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  5");
					now.setBounds(250+140*3, 140*4,140/2,140/3);
				}
			});
			
			
			bt[5][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  1");
					now.setBounds(250+140*4, 140*0,140/2,140/3);
				}
			});
			bt[5][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  2");
					now.setBounds(250+140*4, 140*1,140/2,140/3);
				}
			});
			bt[5][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  3");
					now.setBounds(250+140*4, 140*2,140/2,140/3);
				}
			});
			bt[5][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  4");
					now.setBounds(250+140*4, 140*3,140/2,140/3);
				}
			});
			bt[5][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  5");
					now.setBounds(250+140*4, 140*4,140/2,140/3);
				}
			});
			JPanel jj=(JPanel)getContentPane();  
	        jj.setOpaque(false); 
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
