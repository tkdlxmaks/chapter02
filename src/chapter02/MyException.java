package chapter02;

/**
 * @author WonHo 예외처리를 오버로드(OverLoad)를 통해 프로그래밍
 */
public class MyException extends Exception {

	/**
	 * MyException의 Warming처리
	 */
	private static final long serialVersionUID = 4321408656588536883L;

	/***
	 * 메시지 없이 예외처리
	 */
	public MyException() {
		super("내가 만든 톄스트 예외처리");
	}

	/***
	 * 메시지 있는 예외처리
	 * 
	 * @param message
	 */
	public MyException(String message) {
		super(message);
	}
}
