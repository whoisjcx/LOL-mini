import java.util.*;

import javax.swing.*;

public class Hulk extends Hero{
	public Hulk(){
		name="Doctor Yang";
		hp=500;
		maxhp=500;
		atk=50;
		x=0;
		y=0;
		cd1=2;
		cd2=2;
		re=-1;
		step=1;
		Icon=new ImageIcon("");
		item=new int[6];
	}
	public void skill(ArrayList<Hero> a){
		for(int i=0;i<a.size();++i){
			if(Math.abs(x-a.get(i).x)+Math.abs(y-a.get(i).y)<=2){
				a.get(i).hp-=(atk/2);
			}
		}
	}
	@Override
	public void word(){
		System.out.println("你需要电疗一下");
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
