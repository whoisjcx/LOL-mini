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
	static JLabel hhp[]= new JLabel[6];
	static JLabel latk[]= new JLabel[6];
	static JLabel lsp[]= new JLabel[6];
	static JButton atk[]=new JButton[6];
	static JButton sk[]=new JButton[6];
	static JButton sw[]=new JButton[6];
	static JButton sh[]=new JButton[6];
	static JButton ar[]=new JButton[6];
	static ImageIcon hi[]=new ImageIcon[6];
	static JLabel now;
	static int nid;
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
			S1[2]="Reporter";
			P1=new Player(S1,0);
			String S2[]=new String[3];
			S2[0]="Garen";
			S2[1]="Afu";
			S2[2]="Kongming";
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
	        for(int i=0;i<6;i++)
	        	hhp[i]= new JLabel();
	        for(int i=0;i<6;i++)
	        	latk[i]= new JLabel();
	        for(int i=0;i<6;i++)
	        	lsp[i]= new JLabel();
	        for(int i=0;i<6;i++)
	        	sk[i]= new JButton("技能");
	        for(int i=0;i<6;i++)
	        	sw[i]= new JButton("武器升级");
	        for(int i=0;i<6;i++)
	        	atk[i]= new JButton("攻击");
	        for(int i=0;i<6;i++)
	        	sh[i]= new JButton("护盾升级");
	        for(int i=0;i<6;i++)
	        	ar[i]= new JButton("装甲升级");
	        for(int i=0;i<3;i++)
	        	hi[i]=getImageIcon(P1.heros.get(i).name+".jpg",140/2,140/3);
	        for(int i=0;i<3;i++)
	        	hi[3+i]=getImageIcon(P2.heros.get(i).name+".jpg",140/2,140/3);
	        for(int i=0;i<3;i++)
	        	hhp[i].setText("HP:"+String.valueOf(P1.heros.get(i).hp)+"/"+String.valueOf(P1.heros.get(i).hp));
	        for(int i=0;i<3;i++)
	        	hhp[3+i].setText("HP:"+String.valueOf(P2.heros.get(i).hp)+"/"+String.valueOf(P2.heros.get(i).hp));
	        for(int i=0;i<3;i++)
	        	sk[i].setText(P1.heros.get(i).skillname);
	        for(int i=0;i<3;i++)
	        	sk[3+i].setText(P2.heros.get(i).skillname);
	        for(int i=0;i<3;i++)
	        	latk[i].setText("ATK:"+String.valueOf(P1.heros.get(i).atk));
	        for(int i=0;i<3;i++)
	        	latk[3+i].setText("ATK"+String.valueOf(P2.heros.get(i).atk));
	        for(int i=0;i<3;i++)
	        	lsp[i].setText("SP:"+String.valueOf(P1.heros.get(i).step));
	        for(int i=0;i<3;i++)
	        	lsp[3+i].setText("SP:"+String.valueOf(P2.heros.get(i).step));
	        //now=P1.heros.get(0);
	       // System.out.println(now.name+".jpg");
	        for(int i=0;i<6;i++)
	        	hj[i]=new JLabel();
	        for(int i=0;i<6;i++)
	        	ph[i]=new JLabel();
	        for(int i=0;i<6;i++)
	        	hj[i].setIcon(hi[i]);
	        for(int i=0;i<6;i++)
	        	ph[i].setIcon(hi[i]);
	        now=hj[0];
	        nid=0;
	        for(int i=0;i<6;i++)
	        	panel.add(lsp[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(latk[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(hj[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(ph[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(hhp[i]);
	        //getLayeredPane().add(hj1,new Integer(Integer.MIN_VALUE));
	        for(int i=0;i<6;i++)
	        	panel.add(sk[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(sw[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(sh[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(atk[i]);
	        for(int i=0;i<6;i++)
	        	panel.add(ar[i]);
	        for(int i=0;i<3;i++)
	        	ar[i].setBounds(20,50+i*200+140/3,80,50);
	        for(int i=0;i<3;i++)
	        	ar[i+3].setBounds(200+140*5+140/2,50+i*200+140/3,80,50);
	        for(int i=0;i<3;i++)
	        	sw[i].setBounds(20,50+i*200+140/3+50,80,50);
	        for(int i=0;i<3;i++)
	        	sw[i+3].setBounds(200+140*5+140/2,50+i*200+140/3+50,80,50);
	        for(int i=0;i<3;i++)
	        	sh[i].setBounds(20,50+i*200+140/3+100,80,50);
	        for(int i=0;i<3;i++)
	        	sh[i+3].setBounds(200+140*5+140/2,50+i*200+140/3+100,80,50);
	        
	        for(int i=0;i<3;i++)
	        	atk[i].setBounds(20+80,50+i*200+140/3,100,50);
	        for(int i=0;i<3;i++)
	        	atk[i+3].setBounds(80+200+140*5+140/2,50+i*200+140/3,100,50);
	        for(int i=0;i<3;i++)
	        	sk[i].setBounds(80+20,50+i*200+140/3+100,100,50);
	        for(int i=0;i<3;i++)
	        	sk[i+3].setBounds(80+200+140*5+140/2,50+i*200+140/3+100,100,50);
	        
	        
	        for(int i=0;i<3;i++)
	        	hj[i].setBounds(250,140*4+140/3*i,140/2,140/3);
	        for(int i=0;i<3;i++)
	        	hj[i+3].setBounds(250+140*4+140/2,0+140/3*i,140/2,140/3);
	        for(int i=0;i<3;i++)
	        	ph[i].setBounds(20,50+i*200,140/2,140/3);
	        for(int i=0;i<3;i++)
	        	ph[i+3].setBounds(200+140*5+140/2,50+i*200,140/2,140/3);
	        for(int i=0;i<3;i++)
	        	hhp[i].setBounds(20+140/2,50+i*200,80,15);
	        for(int i=0;i<3;i++)
	        	hhp[i+3].setBounds(200+140*5+140/2+140/2,50+i*200,80,15);
	        
	        for(int i=0;i<3;i++)
	        	lsp[i].setBounds(20+140/2,50+i*200+15,80,15);
	        for(int i=0;i<3;i++)
	        	lsp[i+3].setBounds(200+140*5+140/2+140/2,50+i*200+15,80,15);
	        for(int i=0;i<3;i++)
	        	latk[i].setBounds(20+140/2,50+i*200+30,80,15);
	        for(int i=0;i<3;i++)
	        	latk[i+3].setBounds(200+140*5+140/2+140/2,50+i*200+30,80,15);
	        
	        
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
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+p*140/2, 0+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
			        //nid=0;
				}
			});
			bt[1][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  2");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+p*140/2, 140*1+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[1][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  3");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+p*140/2, 140*2+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[1][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  4");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+p*140/2, 140*3+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[1][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("1  5");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+p*140/2, 140*4+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			
			
			bt[2][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  1");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*1+p*140/2, 140*0+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[2][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  2");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*1+p*140/2, 140*1+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[2][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  3");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*1+p*140/2, 140*2+(nid%3)*140/3,140/2,140/3);
					//bt[1][1].setBorder(BorderFactory.createLineBorder(Color.red,5));
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[2][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  4");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*1+p*140/2, 140*3+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[2][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("2  5");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*1+p*140/2, 140*4+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			
			
			bt[3][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  1");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*2+p*140/2, 140*0+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[3][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  2");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*2+p*140/2, 140*1+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[3][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  3");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*2+p*140/2, 140*2+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[3][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  4");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*2+p*140/2, 140*3+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[3][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("3  5");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*2+p*140/2, 140*4+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			
			
			bt[4][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  1");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*3+p*140/2, 140*0+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[4][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  2");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*3+p*140/2, 140*1+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[4][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  3");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*3+p*140/2, 140*2+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[4][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  4");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*3+p*140/2, 140*3+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[4][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("4  5");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*3+p*140/2, 140*4+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			
			
			bt[5][1].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  1");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*4+p*140/2, 140*0+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[5][2].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  2");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*4+p*140/2, 140*1+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[5][3].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  3");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*4+p*140/2, 140*2+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[5][4].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  4");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*4+p*140/2, 140*3+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
				}
			});
			bt[5][5].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					System.out.println("5  5");
					int p=0;
					if(nid>=3) p=1 ;
					now.setBounds(250+140*4+p*140/2, 140*4+(nid%3)*140/3,140/2,140/3);
					now=hj[(++nid)%6];
					nid%=6;
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
