package testconstructor2;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("ClsB() 기본생성자 실행");
	}
	
	public ClsB(int n) {
		super(n);
		System.out.println("ClsB(int n) 기본생성자 실행"+n);
	}
}
