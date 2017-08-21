import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Reporter extends Hero{
	public Reporter(){
		name="Reporter";
		hp=500;
		maxhp=500;
		atk=50;
		x=0;
		y=0;
		cd1=2;
		cd2=2;
		re=-1;
		step=1;
		Icon=new ImageIcon("Reperter.jpg");
		item=new int[6];
	}
	public void skill(){
		step+=2;
	}
	@Override
	public void word(){
		System.out.println("你能跟的上我的思必得吗？");
	}
	@Override
	public void attackHero(Hero h){
		h.hp-=atk;
		judgedied(h);
	}
	@Override
	public void attackTower(Map m,int x,int y){
		m.field[x][y]-=atk;
		if(m.field[x][y]<0) m.field[x][y]=0;
	}
}
