
public class HeroFactory {
	public static Hero getHero(String name){
		if(name.equalsIgnoreCase("Hulk")){
			return new Hulk();
		}
		else if(name.equalsIgnoreCase("DocYang")){
			return new DocYang();
		}
		else if(name.equalsIgnoreCase("Reporter")){
			return new Reporter();
		}
		else if(name.equalsIgnoreCase("Garen")){
			return new Garen();
		}
		else if(name.equalsIgnoreCase("Kongming")){
			return new Kongming();
		}
		else if(name.equalsIgnoreCase("Afu")){
			return new Afu();
		}
		else return null;
	}
}
