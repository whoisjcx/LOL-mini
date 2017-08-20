
public class DocYang implements Hero{
	public String name;
	public int hp;
	public int atk;
	public int x;
	public int y;
	public int cd1;
	public int cd2;
	
	public DocYang(){
		name="Doctor Yang";
		hp=500;
		atk=50;
		x=0;
		y=0;
		cd1=2;
		cd2=2;
	}

	public void skill1(){
		
	}
	
	public void skill2(){
		
	}
	@Override
	public void word(){
		System.out.println("你需要电疗一下");
	}
}
