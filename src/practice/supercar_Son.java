package practice;

public class supercar_Son extends supercar_P{

	public static final int BOOSTER = 1;
	public static final int HYPERBOOSTER = 2;
	
	public int boostermode = BOOSTER;
	
	
		@Override
		public void booster() {
			if(boostermode == HYPERBOOSTER) {
				System.out.println("초 가속 모드 On");
			}else {
				super.booster();
			}
		}
	}
	

