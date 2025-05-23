package classCoding;

import java.util.Scanner;
//21번. Calculator 클래스를 정의해 봅시다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메서드로 정의한다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메서드를 정의한다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메서드를 정의한다.
//-숫자정수 두개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메서드를 정의한다.
//실수 반지름radius 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메서드를 정의한다.
//(원의 둘레circumference: 2*pi*r, 원의 넓이area: pi*r*r)

//-main()메서드를 정의하고 각각의 메서드를 호출해서 사용자에게 받은 결과를 콘솔에 출력해 봅시다.
//-콘솔에서 사용자에게 데이터를 받아 메서드를 호출할 때 사용자에게 받은 데이터를 메서드의 매개변수의 인자로 전달하는 
//코드를 main()메서드에 추가해봅시다.
public class CalculatorMain01 {

	public static void main(String[] args) {
		Calculator01 cal = new Calculator01(); //객체생성
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수입력:");
		int num1 = in.nextInt();
		System.out.println("두번째 정수입력:");
		int num2 = in.nextInt();
		System.out.println("실수 하나를 입력:");
		double r = in.nextDouble();
		
		System.out.println("두 정수의 더하기값은"+ cal.add(num1,num2));
		System.out.println("두 정수의 빼기값은"+ cal.sub(num1,num2));
		System.out.println("두 정수의 곱하기값은"+ cal.mul(num1,num2));
		System.out.println("두 정수의 나누기값은"+ cal.div(num1,num2));
		System.out.printf("입력하신 실수반지름의 원의 둘레는 %.2f입니다.\n",cal.circle(r));
		System.out.printf("입력하신 실수반지름의 워의 넓이는 %.2f입니다.\n",cal.area(r));
		
		in.close();
	}

}
