package classCoding;

//21번. Calculator 클래스를 정의해 봅시다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메서드로 정의한다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메서드를 정의한다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메서드를 정의한다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메서드를 정의한다.
//실수 반지름radius 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메서드를 정의한다.
// (원의 둘레circumference: 2*pi*r, 원의 넓이area: pi*r*r)

//-main()메서드를 정의하고 각각의 메서드를 호출해서 사용자에게 받은 결과를 콘솔에 출력해 봅시다.
//-콘솔에서 사용자에게 데이터를 받아 메서드를 호출할 때 사용자에게 받은 데이터를 메서드의 매개변수의 인자로 전달하는 
//코드를 main()메서드에 추가해봅시다.

////반지름이 5.0인 원의 면적 PI상수	
//double r = 5.0;		
//final double PI = 3.141592;
//double result = Math.pow(r, 2) * PI;
//System.out.println(result);
public class Calculator01 {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	public static double circle(double r) {
		return 2 * Math.PI * r;
	}
	public static double area(double r) {
		return Math.PI* r* r ;
	}
}
