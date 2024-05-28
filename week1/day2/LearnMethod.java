package week1.day2;

public class LearnMethod {

	public void method1() {
		System.out.println("I am using Chrome");
	}
	public String method2(String browserversion){
	return browserversion;
	}
	public int method3(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		LearnMethod ananth= new LearnMethod();
		ananth.method1();
		System.out.println(ananth.method2("Chrome version is " +ananth.method3(10, 25)));
	}
}
