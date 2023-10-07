package adapter;
interface MediaPlayer{
	public void play(String filename);
}
interface AdvanceMediaPlayer{
	public void playvideo(String filename);
}
class MP3Player implements MediaPlayer{
	public void play(String filename) {
		System.out.println("Playing songs using MP3"+filename);
	}
}
class MP4Player implements AdvanceMediaPlayer{
	public void playvideo(String filename) {
		System.out.println("Playing songs using MP4"+filename);
	}
}
class Adapter implements MediaPlayer{
	private AdvanceMediaPlayer amp;
	public Adapter(AdvanceMediaPlayer amp) {
		this.amp=amp;
	}
	public void play(String filename) {
		System.out.println("Playing songs using Adapter Media player");
		amp.playvideo(filename);
	}
}
public class Main {

	public static void main(String[] args) {
		MediaPlayer p=new MP3Player();
		p.play("test.mp3");
		p=new Adapter(new MP4Player());
		p.play("test.mp4");
		

	}

}
