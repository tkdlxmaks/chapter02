package chapter02;

public class IU {

	public static void main(String[] args) {
		
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTrack(3);
		song.setYear("2010");
		
		System.out.println(song);
		System.out.println("노래 가사 \n "+song.show());
	}

}
