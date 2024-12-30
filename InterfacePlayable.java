
interface playable{
	void play();
	
}
class Football implements playable{
	@Override
	public void play() {
		System.out.println("Ronaldo is legend in Football");
	}
	}

class Volleyball implements playable{
	@Override
	public void play() {
		System.out.println("karch kiraly is legend in Volleyball");
		
	}
}
class Basketball implements playable{
	@Override
	public void play() {
		System.out.println("Michael jordan is legend in Basketball");
		
	}
}


public interface InterfacePlayable {
	public static void main(String args[]) {
		Football f=new Football();
		f.play();
		Volleyball v=new Volleyball();
;		v.play();
		Basketball b=new Basketball();
		b.play();
	}
		
	}