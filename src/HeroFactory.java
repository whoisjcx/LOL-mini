
public class HeroFactory {
	public static Hero getHero(String name){
		if(name.equalsIgnoreCase("Hulk")){
			return new Hulk();
		}
		else return null;
	}
}
