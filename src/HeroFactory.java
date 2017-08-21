
public class HeroFactory {
	public Hero getHero(String name){
		if(name.equalsIgnoreCase("Hulk")){
			return new Hulk();
		}
		else return null;
	}
}
