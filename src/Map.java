
public class Map {
	
	public Map getmap=new Map();
	
	public int field[][]=new int[6][6];	//0为空地，正为塔血量，负为刷钱点
	
	int wcd=10;
	
	private Map(){
		field[1][2]=field[1][4]=1000;
		field[2][5]=field[4][5]=1000;
		field[2][4]=field[1][5]=1000;
		field[2][1]=field[4][1]=1000;
		field[5][2]=field[5][4]=1000;
		field[4][2]=field[5][1]=1000;
		field[2][3]=-100;
		field[3][2]=-100;
		field[4][3]=-100;
		field[3][4]=-100;
	};
	
	public Map get(){
		return getmap;
	}
	
	public void flush(int n){		//每回合结束调用flush
		if(n%wcd==0){
			field[2][3]-=100;
			field[3][2]-=100;
			field[4][3]-=100;
			field[3][4]-=100;
		}
	}
}
