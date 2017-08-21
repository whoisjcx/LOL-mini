
public abstract class Item implements Cloneable {
	int hp;
	int atk;
	int lev;
	int price;
	String name;
	public void gethp(){}
	public void getatk(){}
	public void getprice(){}
	public Item levelup(){ return null;}
	
	public Object clone(){
		Object clone = null;
	      try {
	         clone = super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	}
}
