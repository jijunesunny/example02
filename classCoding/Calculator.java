package classCoding;
//2025.05.15.18번. Calculator 클래스를 정의해 봅시다.
//-숫자 두개를 매개변수의 인자로 전달받아 더하기 메서드로 추가합니다.
//-숫자 두개를 매개변수의 인자로 전달받아 빼기 메서드를 추가합니다.
//-숫자 두개를 매개변수의 인자로 전달받아 곱하기 메서드를 추가합니다.
//-숫자 두개를 매개변수의 인자로 전달받아 나누기 메서드를 추가합니다.
// add,sub,mul,div는 모두 인스턴스 메서드(힙메모리에 올라간다)
//지금은 인스턴스메서드라 calculator객체를 생성해야 사용가능하다..

public class Calculator {
		int add(int num1, int num2) {
	//인티저값 함수 (매개인자, 매개인자)
		return num1 + num2;
		}
		int sub(int num1, int num2) {
			return num1 - num2;
		}
		int mul(int num1, int num2) {
			return num1 * num2;
		}
		int div(int num1, int num2) {
			return num1 / num2;
		}
}
