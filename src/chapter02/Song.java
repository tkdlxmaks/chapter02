package chapter02;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	@Override
	public String toString() {
		return "Song " + artist + " " + title + " ( " + album + ", " + year + ", " + track + "번 track," + composer
				+ " 작곡 )";
	}

	public String show() {
		return "어쩜 이렇게 하늘은 더 파란건지 \n" + "오늘따라 왜 바람은 또 완벽한지 \n" + "그냥 모르는척 하나 못들은척 \n" + "지워버린척 딴 얘길 시작할까 \n"
				+ "아무 말 못하게 입맞출까 \n" + "눈물이 차올라서 고갤 들어 \n" + "흐르지 못하게 또 살짝 웃어 \n" + "내게 왜 이러는지 무슨 말을 하는지 \n"
				+ "오늘 했던 모든 말 저 하늘 위로 \n" + "한번도 못했던 말 \n" + "울면서 할 줄은 나 몰랐던 말 \n" + "나는요 오빠가 좋은걸 어떡해 \n\n"
				+ "새로 바뀐 내 머리가 별로였는지 \n" + "입고 나왔던 옷이 실수였던건지 \n" + "아직 모르는척 기억 안 나는척 \n" + "아무 일없던것처럼 굴어볼까 \n"
				+ "그냥 나가자고 얘기할까 \n" + "눈물이 차올라서 고갤 들어 \n" + "흐르지 못하게 또 살짝 웃어 \n" + "내게 왜 이러는지 무슨 말을 하는지 \n"
				+ "오늘 했던 모든 말 저 하늘 위로 \n" + "한번도 못했던 말 \n" + "울면서 할 줄은 나 몰랐던 말 \n" + "나는요 오빠가 좋은걸 어떡해\n" + "(휴~ 어떡해) \n"
				+ "이런 나를 보고 그런 슬픈 말은 하지 말아요 \n" + "철 없는 건지 조금 둔한건지 믿을 수가 없는걸요 \n\n" + "눈물은 나오는데 활짝 웃어 \n"
				+ "네 앞을 막고서 막 크게 웃어 \n" + "내가 왜 이러는지 부끄럼도 없는지 \n" + "자존심은 곱게 접어 하늘 위로 \n"
				+ "한 번도 못했던 말 어쩌면 다신 못할 바로 그 말 \n" + "나는요 오빠가 좋은걸(아이쿠, 하나 둘) \n" + "I'm in my dream \n\n"
				+ "(Its too beautiful beautiful day) \n" + "(Make it a good day) \n" + "(Just don't make me cry)\n"
				+ "이렇게 좋은 날\n";
	}

}
