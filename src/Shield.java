
public class Shield extends Item {
	@Override
	public void gethp(){
		hp=100;
	}
	@Override
	public void getatk(){
		atk=0;
	}
	@Override
	public Item levelup(){
		hp+=100;
		lev++;
		return this;
	}
	@Override
	public void getprice(){
		price=700;
	}
	public Shield(){
		gethp();
		getatk();
		getprice();
		lev=1;
	}
}
