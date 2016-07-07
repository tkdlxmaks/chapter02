package paint;

public class Point {
	private int pointX;
	private int pointY;

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public void show(int pointX, int PointY) {
		System.out.println("점[x=" + pointX + "," + pointY + "]을 그렸습니다.");
	}
}
