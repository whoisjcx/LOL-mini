import javax.swing.ImageIcon;

public class Garen extends Hero{
	public Garen(){
		name="Garen";
		hp=600;
		maxhp=600;
		atk=60;
		x=0;
		y=0;
		cd=3;
		re=-1;
		step=1;
		Icon=new ImageIcon("Garen.jpg");
		item=new int[6];
		skillname="�󱦽�";
	}
	public int skill(Hero h){
		h.hp-=atk+(h.maxhp-h.hp)*0.4;
		return judgedied(h);
	}
	@Override
	public void word(){
		System.out.println("�������ǣ�");
	}
	@Override
	public void attackTower(Map m,int x,int y){
		m.field[x][y]-=atk;
		if(m.field[x][y]<0) m.field[x][y]=0;
	}
}
