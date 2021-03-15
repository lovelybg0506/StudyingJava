package practice;

public class java34 {

	public static int getnumber() {
		return (int)((Math.random()*45)+1);
	}
		
	public static void main(String[] args) {
			int i,j;
			int lotto[]= {0,0,0,0,0,0};
			
			for(i=0;i<lotto.length;i++) {
				lotto[i]=getnumber();
				for(j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			}
			System.out.print("로또번호 : ");
			for(i=0;i<lotto.length;i++) {
			
				System.out.printf(" %d",lotto[i]);
				
			}
	}
}
