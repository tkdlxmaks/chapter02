package kr.ac.sungkyul.paint.point;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {

	}
	public ColorPoint(int x, int y, String color) {
		super(); // 생략해도 자동으로 끼어들어감 - 명시하고싶을때
		setPointX(x);
		setPointX(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override // 어노테이션
	public void show() {
		// TODO Auto-generated method stub

		// 1. 재정의 방법 부모꺼 받고 + @
		// 부모의 show()를 불러옴.
		// super.show(); // this는 자기자신을 가리키고 super의 show()를 불러옴

		// 2. 아예 부모꺼 없애고 재정의
		System.out.println("점[x=" + getPointX() + "," + getPointY() + ", " + color + "]을 그렸습니다.");
		// 부모꺼를 변형하는건 옳지 않다.
	}

}
