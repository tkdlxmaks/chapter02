package chapter02;

/***
 * 필드 정의
 * 
 * @author WonHo
 */
public class Goods {

	// 외부에서 접근 못하도록
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	static private int countOfGoods;

	public Goods() {

	}

	/***
	 * 생성자 메모리 잡힌다음에 호출되기에 주로 *** 필드 초기화에 사용 ***
	 */
	public Goods(String name, int price, int countStock, int countSold) {
		System.out.println("생성자 Goods 호출");
		// 생성시 초기화
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	/***
	 * private 메소드를 통해서 접근가능하도록 이유 : 정보은닉을 위해
	 */
	// setter - 값 지정시
	public void setName(String name) {
		this.name = name;
		// name = name ; // 이런 경우 둘 다 가까운 매개변수를 불러옴 (즉 매개변수 = 매개변수)
		// this 라는 키워드는 instance 자체를 가리키는 키워드 즉 private String name을 의미
	}

	public static int getCountOfGoods() {
		return countOfGoods;
	}

	public static void setCountOfGoods(int countOfGoods) {
		Goods.countOfGoods = countOfGoods;
	}

	// getter - 값 불러올시
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	// Source - Generate toString
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

	// toString과 같은 내용.
	public void showInfo() {
		System.out.println("[name = " + name + " , " + "price = " + price + " , " + "countStock = " + countStock + " , "
				+ "countSold = " + countSold + " ] ");
	}

	public int calcDiscountPrice(int percentage) {
		return price * percentage / 100;
	}

}
