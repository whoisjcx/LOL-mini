
public class Map {
	
	public Map getmap=new Map();
	
	public int field[][]=new int[6][6];	//0为空地，1为p1塔，2为p2塔，3为野怪
	
	int wcd=10;
	
	private Map(){
		field[1][2]=field[1][4]=2;
		field[2][5]=field[4][5]=2;
		field[2][4]=2;
		field[2][1]=field[4][1]=1;
		field[5][2]=field[5][4]=1;
		field[4][2]=1;
		field[2][3]=3;
		field[3][2]=3;
		field[4][3]=3;
		field[3][4]=3;
	};
	
	public Map get(){
		return getmap;
	}
	
	public void flush(int n){
		if(n%wcd==0){
			if(field[2][3]==0) field[2][3]=3;
			if(field[3][2]==0) field[3][2]=3;
			if(field[4][3]==0) field[4][3]=3;
			if(field[3][4]==0) field[3][4]=3;
		}
	}
}
