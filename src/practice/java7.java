package practice;

public class java7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mathScores = new int[2][3];
		
		mathScores[1][2] = 10;
		
		for(int i=0; i<2;i++) {								//�ٱ�for ���
			for(int k=0; k<3;k++) {							//����for ����
				System.out.println("mathscores[" + i + "]["+k+ "]=" + mathScores[i][k]);
			}
		}
		
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<2;i++) {								//�ٱ�for ���
			for(int k=0; k<englishScores[i].length;k++) {							//����for ����
				System.out.println("englishScroes[" + i + "]["+k+ "]=" + englishScores[i][k]);
			}
		}
	
		System.out.println();
		
		int[][] javaScores = { {95,80} , {92,96,80} };
		for(int i=0; i<2;i++) {								//�ٱ�for ���
			for(int k=0; k<javaScores[i].length;k++) {							//����for ����
				System.out.println("javaScores[" + i + "]["+k+ "]=" + javaScores[i][k]);
			}
		}
	}

}
