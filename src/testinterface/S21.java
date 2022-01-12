package testinterface;

public class S21 implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber+"에 전화 걸기");

	}

	@Override
	public void receiveCall(String phoneNumber) {
		System.out.println(phoneNumber+"에서 걸려온 전화 받기");

	}

	@Override
	public void sendSMS(String phoneNumber) {
		System.out.println(phoneNumber+"에 문자 보내기");

	}

	@Override
	public void receiveSMS(String phoneNumber) {
		System.out.println(phoneNumber+"에서 온 문자 받기");

	}

	@Override
	public String searchMusic(String word) {
		System.out.println("음악 검색하기");
		return word+"_music.mp3";
	}

	@Override
	public void playMusic(String music) {
		System.out.println(music+"음악 재생되기");

	}

	@Override
	public void stopMusic() {
		System.out.println("재생중인 음악 정지하기");

	}

	@Override
	public void installApp(String appName) {
		System.out.println(appName+"앱 인스톨하기");

	}

	@Override
	public void runApp(String appName) {
		System.out.println(appName+"앱 실행하기");

	}

}
