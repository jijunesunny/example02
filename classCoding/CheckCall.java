package classCoding;
//22번. 앞에서 만든(CH2-1)Member클래스에는 아래 요구사항에 맞는 메서드를 정의하고,
//main()메서드에 해당메서드를 호출해서 결과를 확인해보세요.
//1. 코로나 백신예방접종이 가능한지 여부를 확인하는 메서드를 정의합니다(checkVaccin())
//-매개변수로 태어난 해(년도)를 전달 받는다.
//-13세미만인 경우와 60세 이상인 경우 "무료 예방접종이 가능합니다." 메시지가 출력되도록합니다.
//-위에서 정의한 조건의 범위가 아닌 나머지의 경우 "무료 접종 대상이 아닙니다."라고 출력합니다.
	
//2. 건강검진대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메서드를 정의합니다.(healthCheck())
//-매개변수로 태어난 해(년도)를 전달받는다.
//-대한민국 성인(20세)의 경우 무료로 2년마다 건강검진을 받을수있습니다. 2025 %2==0
//-짝수해에 태어난 사람은 올해가 짝수년이라면 검사대상이 됩니다.
//-40세 이상의 경우는 암 검사도 무료로 검사를 할 수 있습니다.
public class CheckCall {
	int bornYear;  //필드
	
	public CheckCall(int bornYear) {
		this.bornYear = bornYear; //생성자에서 필드초기화 =매개변수
	}
	public void checkVaccin() {
		int age = 2025- bornYear;
		if (age < 13 || age >= 60) {
			System.out.println("무료 예방접종이 가능합니다.");
		}	else {
				System.out.println("무료 접종 대상이 아닙니다.");
			}
	}
	public void healthCheck() {	
		int age = 2025- bornYear;
		if (age>20) {
			System.out.println("무료 건강검진 대상자입니다.");
		}
			if (bornYear %2 == 2025 %2)  {
			System.out.println("올해는 짝수년도 검사대상입니다.");	
	}   else  {
			System.out.println("올해는 홀수년도 검사대상입니다.");
		}
			
		if (age>=40) {
			System.out.println("암 검사도 무료로 검사할 수 있습니다.");
		}
			else {
			System.out.println("검진대상이 아닙니다.");
		}
	}

	}
