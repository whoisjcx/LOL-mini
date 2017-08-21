import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Kongming extends Hero{
	public Kongming(){
		name="Kongming";
		hp=500;
		maxhp=500;
		atk=40;
		x=0;
		y=0;
		cd=4;
		re=-1;
		step=1;
		Icon=new ImageIcon("Kongming.jpg");
		item=new int[6];
		skillname="Öî¸ðÇÙÄ§";
	}
	public void skill(ArrayList<Hero> h){
		for(int i=0;i<h.size();++i){
			h.get(i).hp=Math.max(h.get(i).maxhp,h.get(i).hp+200);
		}
	}
	@Override
	public void word(){
		System.out.println("µÂÂêÎ÷ÑÇ£¡");
	}
	@Override
	public void attackTower(Map m,int x,int y){
		m.field[x][y]-=atk;
		if(m.field[x][y]<0) m.field[x][y]=0;
	}
}
