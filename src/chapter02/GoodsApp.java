package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		System.out.println(Goods.getCountOfGoods());
		// 기본생성자인 생성사를 만들었을 경우 기본생성자는 사용할 수 x
		// 생성자를 만들지 않았을경우 기본 생성자 모습 -> 1개이상 만든 이후는 기본생성자를 만들어줘야함!
		Goods camera1 = new Goods();
		System.out.println(Goods.getCountOfGoods());
		// 객체 생성
		Goods camera = new Goods("nikon", 300000, 0, 100);
		System.out.println(Goods.getCountOfGoods());
		// 필드 정의
		// 이렇게 접근하지마라. 정보은닉에 대한 문제

		// camera.price = 400000;
		// camera.countStock = 30;
		// camera.countSold = 50; // private
		// camera.setCount(30);
		//
		// camera.setName("nikon");
		// camera.setPrice(-10);
		String str = camera.toString(); // 객체에 있는 정보를
		System.out.println(str + "\n" + camera.getName());
		System.out.println(camera.getPrice());
		// camera.showInfo();
		// toString을 안써도 camera를 작성해도 toString을 생략해도 camera만으로 toString 처럼 출력가능
		System.out.println(camera);
		System.out.println(camera.toString());
		
		camera.setPrice(500000);
		int discountPrice = camera.calcDiscountPrice(17);
		System.out.println("할인율 : " + discountPrice);

	}

}
