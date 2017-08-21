import javax.swing.*;

public abstract class Hero {
	public String name;
	public int hp;
	public int maxhp;
	public int atk;
	public int x;
	public int y;
	public int cd1;
	public int cd2;
	public int re;
	public int step;
	int item[];
	ImageIcon Icon;
	public void word(){};
	public void attackHero(Hero h){};
	public void attackTower(Map m,int x,int y){};
	public void judgedied(Hero h){
		if(h.hp<=0){
			h.hp=0;
			h.re=3;
		}
	}
	public void revive(){
		re--;
		if(re==0) hp=maxhp;
	}
	public void move(){
		while(step>0){
			
		}
	};
}
