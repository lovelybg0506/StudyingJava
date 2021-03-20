package practice;

public class supercarExample {

public static void main(String[] args) {
	
	supercar_Son bmw = new supercar_Son();
		
	bmw.start();
	bmw.booster();
	bmw.boostermode = supercar_Son.HYPERBOOSTER;
	bmw.booster();
	bmw.boostermode = supercar_Son.BOOSTER;
	bmw.booster();
	bmw.end();
	
	}

}