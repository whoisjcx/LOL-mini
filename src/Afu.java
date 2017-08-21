import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Afu extends Hero{
	public Afu(){
		name="Afu";
		hp=800;
		maxhp=800;
		atk=60;
		x=0;
		y=0;
		cd=4;
		re=-1;
		step=1;
		Icon=new ImageIcon("Afu.jpg");
		item=new int[6];
		skillname="ÎÚÑ»×ø·É»ú";
	}
	public int skill(Hero h){
		h.hp-=atk;
		h.step=-2;
		return judgedied(h);
	}
	@Override
	public void word(){
		System.out.println("¶ñ»¢ÇîÍ¾À§Ð¡Ñò£¡");
	}
	@Override
	public void attackTower(Map m,int x,int y){
		m.field[x][y]-=atk;
		if(m.field[x][y]<0) m.field[x][y]=0;
	}
}
