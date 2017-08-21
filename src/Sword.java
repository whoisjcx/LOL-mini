
public class Sword extends Item{
	
	@Override
	public void gethp(){
		hp=0;
	}
	@Override
	public void getatk(){
		atk=100;
	}
	@Override
	public Item levelup(){
		atk+=100;
		lev++;
		return this;
	}
	@Override
	public void getprice(){
		price=1000;
	}
	public Sword(){
		gethp();
		getatk();
		getprice();
		lev=1;
	}
}
