package kr.ac.sungkyul.paint.app;

import kr.ac.sungkyul.paint.i.Drawable;
import kr.ac.sungkyul.paint.point.ColorPoint;
import kr.ac.sungkyul.paint.point.Point;
import kr.ac.sungkyul.paint.shape.Circle;
import kr.ac.sungkyul.paint.shape.Shape;

public class InstanceOfTest {

	public static void main(String[] args) {
		System.out.println(new Circle() instanceof Circle);
		System.out.println(new Circle() instanceof Shape);
		System.out.println(new Circle() instanceof Drawable);

		// 매개변수 확인 ctrl + shift + spaceㅆ

		// 한 문장 전체 변경 alt + shift + R -> 꼭 필요
		// 문장 합치 alt + shift + I -> Inline
		System.out.println(new ColorPoint(50, 100, "yellow") instanceof ColorPoint);
		System.out.println(new ColorPoint(50, 100, "yellow") instanceof Point);
		System.out.println(new ColorPoint(50, 100, "yellow") instanceof Drawable);
		// System.out.println(new Circle() instanceof Rect); false

		// System.out.println(s instanceof ColorPoint); 자기의 동등레벨에게는 물어볼 수 없다
	}

}
