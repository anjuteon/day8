package testabstract1;

public abstract class Car {
	public String name;
	
	public void showInfo() {
		System.out.println("Car는 자식클래스를 규격화하는 추상클래스");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void turnLeft();
	
	public abstract void turnRight();
}
