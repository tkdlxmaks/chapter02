package kr.ac.sungkyul.paint.point;

import kr.ac.sungkyul.paint.i.Drawable;

public class Point implements Drawable {
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

	public void show() {
		System.out.println("점[x=" + pointX + "," + pointY + "]을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible == true) {
			show();
			return;
		}
		System.out.println("점[x=" + pointX + "," + pointY + "]을 지웠습니다.");
	}

	@Override
	public void draw() {
		show();
	}

}
