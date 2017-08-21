import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Reporter extends Hero{
	public Reporter(){
		name="Reporter";
		hp=700;
		maxhp=700;
		atk=60;
		x=0;
		y=0;
		cd=2;
		re=-1;
		step=1;
		Icon=new ImageIcon("Reperter.jpg");
		item=new int[6];
		skillname="念诗攻击";
	}
	public void skill(){
		step+=2;
	}
	@Override
	public void word(){
		System.out.println("你能跟的上我的思必得吗？");
	}
	@Override
	public void attackTower(Map m,int x,int y){
		m.field[x][y]-=atk;
		if(m.field[x][y]<0) m.field[x][y]=0;
	}
}
