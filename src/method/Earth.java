package method;

public class Earth {

		static final double EARTH_RADIUS = 6400;	// ���(static final) �ѹ� ���Ѱ��� ���� �ٲ��� ����.
		static final double EARTH_SURFACE_AREA;		// ��ó�� ���� ���� �ټ� �ְ�,
		
		static {
			EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // �̷��� static �߰�ȣ(�������) �� �����ؼ� �� �ȿ� �ᵵ��.
		}
		
		
}
