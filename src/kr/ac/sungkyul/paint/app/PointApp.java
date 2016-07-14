package kr.ac.sungkyul.paint.app;

import kr.ac.sungkyul.paint.i.Drawable;
import kr.ac.sungkyul.paint.point.ColorPoint;
import kr.ac.sungkyul.paint.point.Point;
import kr.ac.sungkyul.paint.shape.Circle;
import kr.ac.sungkyul.paint.shape.Pentagon;
import kr.ac.sungkyul.paint.shape.Rect;

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
		s1.draw();
		s2.draw();
		
		// s1.draw(true);
		// s2.draw(false);

		ColorPoint s3 = new ColorPoint();
		s3.setPointX(46);
		s3.setPointY(125);
		((ColorPoint) s3).setColor("red");

		// 기존 Point에 있는 draw()를 재정의

		s3.draw();
		// s3.draw(true);

		draw(s1);
		draw(s2);
		draw(s3);

		draw(new Rect());
		draw(new Circle());
		draw(new Pentagon());
	}

	/***
	 * 부모 Point에 상속받은 point라면 ex) ColorPoint는 상속받은 메소드를 사용가능 if)
	 * 
	 * @param point
	 */
	public static void drawPoint(Point point) {
		point.draw();
	}

	public static void draw(Drawable drawable) {
		// 여기에 모든걸 해결하고싶다. - 인터페이스 사용
		drawable.draw();
	}
}
