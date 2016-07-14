package chapter02;

public class ArrayUtils {

	public static Double[] intToDouble(int[] arrayInt) {

		// null이면
		if (arrayInt == null) {
			return null;
		}
		// null이 아니면
		Double[] arrayDouble = new Double[arrayInt.length]; // 내부에서 배열을 만들어서
															// 리턴해줘야한다.
		int length = arrayInt.length; // 속도차이는 없지만 계속 arrayInt.length;라면 빼주는것이
										// 좋다 많으면 속도차이
		for (int i = 0; i < length; i++) {
			arrayDouble[i] = (double) arrayInt[i];
		}
		return arrayDouble;
	}

	public static int[] doubleToInt(Double[] arrayDouble) {

		// null
		if (arrayDouble == null) {
			return null;
		}
		int length = arrayDouble.length;
		int[] arrayInt = new int[length];
		for (int i = 0; i < length; i++) {

			arrayInt[i] = arrayDouble[i].intValue();
		}
		return arrayInt;
	}

	public static double[] concat(Double[] arrayDouble, int[] arrayInt) {

		// null
		if (arrayDouble == null && arrayInt == null) {
			return null;
		}
		int doubleLength = arrayDouble.length;
		int intLength = arrayInt.length;
		int size = doubleLength + intLength;
		double[] arrayConcat = new double[size]; // size 9
		
		// doble -> int로 변환 후 임시저장
		int[] temp = doubleToInt(arrayDouble);
		int index = 0;
		for (int i : temp) {
			arrayConcat[index++] = i;
		}
		for (int i : arrayInt) {
			arrayConcat[index++] = i;
		}
		return arrayConcat;
	}
}
