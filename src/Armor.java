
public class Armor extends Item{
	@Override
	public void gethp(){
		hp=50;
	}
	@Override
	public void getatk(){
		atk=50;
	}
	@Override
	public Item levelup(){
		atk+=50;
		hp+=50;
		lev++;
		return this;
	}
	@Override
	public void getprice(){
		price=800;
	}
	public Armor(){
		gethp();
		getatk();
		getprice();
		lev=1;
	}
}
