package method;

public class Earth {

		static final double EARTH_RADIUS = 6400;	// 상수(static final) 한번 정한값은 절대 바뀌지 않음.
		static final double EARTH_SURFACE_AREA;		// 위처럼 직접 값을 줄수 있고,
		
		static {
			EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // 이렇게 static 중괄호(정적블록) 을 선언해서 그 안에 써도됨.
		}
		
		
}
