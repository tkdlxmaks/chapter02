package paint;

public class PointApp {

	public static void main(String[] args) {

		// s1의 생성 및 setter
		Point s1 = new Point();
		s1.setPointX(2);
		s1.setPointY(5);

		// s2의 생성 및 setter
		Point s2 = new Point();
		s2.setPointX(10);
		s2.setPointY(23);

		// 각 s1,s2 점 그리기
		s1.show(s1.getPointX(), s1.getPointY());
		s2.show(s2.getPointX(), s2.getPointY());

	}

}
