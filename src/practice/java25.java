package practice;

public class java25 {

	public static void main(String[] args) {

//		��ǻ�ʹ� �ΰ��� �ٸ��� 0���� ī�����Ѵ�.
		
//		String[] classGroup = {"��","��","��","��"};
//		System.out.println(classGroup[0]);
//		System.out.println(classGroup[1]);
//		System.out.println(classGroup[2]);
//		System.out.println(classGroup[3]);

		
		String[] classGroup = new String[4];
		
		classGroup[0] = "��";		// length�� �� �迭�� ���̸� �˷��ִ°��̱� ������ ��� 4�� ��µǴ°��̴�.
		System.out.println(classGroup.length);
		classGroup[1] = "��";
		System.out.println(classGroup.length);
		classGroup[2] = "��";
		System.out.println(classGroup.length);
		classGroup[3] = "��";
		System.out.println(classGroup.length);
		
	}

}
