
public class HeroFactory {
	public Hero getHero(String name){
		if(name.equalsIgnoreCase("DocYang")){
			return new DocYang();
		}
		if(name.equalsIgnoreCase("Garen")){
			return new Garen();
		}
		if(name.equalsIgnoreCase("")){
			return new ;
		}
		if(name.equalsIgnoreCase(""))
	}
}
