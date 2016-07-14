package chapter02;

public class ArrayUtilsApp {

	public static void main(String[] args) {

		/***
		 * 1 ArrayUtils.intToDouble(..)
		 */
		// 배열은 객체 생성시 초기화 필요
		int[] arrayInt = { 10, 20, 30, 40, 50 };

		Double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);

		// arrayDouble 출력
		for (double d : arrayDouble) {
			System.out.println(d);
		}
		/***
		 * 2 ArrayUtils.doubleToInt(..)
		 */
		int[] arrayInt1 = ArrayUtils.doubleToInt(arrayDouble);
		// arrayDouble 출력
		for (int i : arrayInt1) {
			System.out.println(i);
		}

		/***
		 * 3 ArrayUtils.concat(..)
		 */
		double[] arrayConcat = ArrayUtils.concat(arrayDouble, arrayInt); // 매개변수 2개
		for(double concatDouble : arrayConcat) {
			System.out.println(concatDouble);
		}
	}

}
