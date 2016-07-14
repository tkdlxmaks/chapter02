package kr.ac.sungkyul.paint.shape;

public class Shape {
	private String fillColor;
	private String lineColor;

	/***
	 * 추상 메소드
	 */
	//	public abstract void draw();

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
