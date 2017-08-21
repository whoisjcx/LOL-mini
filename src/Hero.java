import javax.swing.*;

public abstract class Hero {
	public String name;
	public int hp;
	public int maxhp;
	public int atk;
	public int x;
	public int y;
	public int cd;
	public int re;
	public int step;
	public String skillname;
	int item[];
	ImageIcon Icon;
	public void word(){};
	public int attackHero(Hero h){
		h.hp-=atk;
		return judgedied(h);
	};
	public void attackTower(Map m,int x,int y){};
	public int judgedied(Hero h){
		if(h.hp<=0){
			h.hp=0;
			h.re=3;
			return 1;
		}
		return 0;
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
