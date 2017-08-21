import java.util.Hashtable;

public class ItemCache {
	public Hashtable<Integer,Item> Itemmap;
	public Item getItem(int i){
		Item it=Itemmap.get(i);
		return (Item) it.clone();
	}
	
	public void load(){
		Sword sword=new Sword();
		Itemmap.put(1, sword);
		Shield shield=new Shield();
		Itemmap.put(2, shield);
		Armor armor=new Armor();
		Itemmap.put(3, armor);
	}
}
