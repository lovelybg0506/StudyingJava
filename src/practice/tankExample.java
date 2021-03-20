package practice;

public class tankExample {

	public static void main(String[] args) {
		tank_Son tank = new tank_Son();
		
		tank.on();
		tank.mode();
		tank.go();
		tank.tankmode = tank_Son.SIZ_MODE;
		tank.mode();
		tank.tankmode = tank_Son.NORMAL_MODE;
		tank.mode();
		tank.back();
		tank.off();

	}

}
