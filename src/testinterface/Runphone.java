package testinterface;

public class Runphone {

	public static void main(String[] args) {
		S21 s=new S21();
		
		s.sendCall("010-1234-1234");
		s.sendSMS("010-5432-4321");
		s.receiveSMS("031-5423-234");
		
		
		String music=s.searchMusic("XOXO");
		s.searchMusic(music);
		s.stopMusic();
		
		s.installApp("GDrive");
		s.runApp("Youtube");

	}

}
