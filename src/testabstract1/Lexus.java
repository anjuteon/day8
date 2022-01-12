package testabstract1;

public class Lexus extends Car {
	private String producer="Lexus";

	@Override
	public void drive() {
		System.out.println(producer+"자동차 주행중");

	}

	@Override
	public void stop() {
		System.out.println(producer+"자동차 멈춤");

	}

	@Override
	public void turnLeft() {
		System.out.println(producer+"자동차 좌회전");

	}

	@Override
	public void turnRight() {
		System.out.println(producer+"자동차 우회전");

	}

}
