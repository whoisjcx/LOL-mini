import java.util.*;

import javax.swing.*;

public class DocYang extends Hero{
	public DocYang(){
		name="DocYang";
		hp=500;
		maxhp=500;
		atk=50;
		x=0;
		y=0;
		cd1=2;
		cd2=2;
		re=-1;
		step=1;
		Icon=new ImageIcon("DocYang.jpg");
		item=new int[6];
		skillname="������";
	}

	public int skill(Hero h){
		h.hp-=atk*2;
		return judgedied(h);
	}
	
	@Override
	public void word(){
		System.out.println("����Ҫ����һ��");
	}
	@Override
	public void attackTower(Map m,int x,int y){
		m.field[x][y]-=atk;
		if(m.field[x][y]<0) m.field[x][y]=0;
	}
}
