import java.util.*;

public class Player {
	public int hp;
	public int p;	//p1»¹ÊÇp2
	public int money;
	public int x,y;
	public ArrayList<Hero> heros=new ArrayList<Hero>();
	public ArrayList<Item> items=new ArrayList<Item>();
	HeroFactory hf;
	public Player(String[] s,int a){
		for(int i=0;i<s.length;++i){
			heros.add(HeroFactory.getHero(s[i]));
		}
		hp=2000;
		money=1000;
		p=a;
	}
	public void gethome(){
		if(p==1){
			x=5;
			y=1;
		}
		else{
			x=1;
			y=5;
		}
	}
	public void move(){
		for(int i=0;i<heros.size();++i){
			
		}
	}
}
