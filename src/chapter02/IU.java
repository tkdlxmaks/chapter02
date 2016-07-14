package chapter02;

public class IU {

	public static void main(String[] args) {

		// 기본 생성자
		Song song = new Song();

		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTrack(3);
		song.setYear(2010);

		 System.out.println(song);
		// System.out.println("노래 가사 \n " + song.show());

		// 생성자 overloading(오버로딩)
		Song song1 = new Song("아이유", "좋은날", "Real", "이민수", 2010, 3);
		
		System.out.println(song1);
		
		// 기존에 있는 생성자를 사용하려면?
		Song song2 = new Song("Why is Loney","원더걸스");
		Song song3 = new Song("Forever","비와이");
	}

}
