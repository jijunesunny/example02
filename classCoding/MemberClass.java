package classCoding;

public class MemberClass {
//19번. Member클래스를 생성하여 main()메서드안에 아래조건의 변수를 정의해 봅시다.
//String타입의 이름을 저장할 수 있는 변수 name을 정의한다.
//int타입의 나이를 저장할 수 있는 변수 age를 정의한다.
//double타입의 키를 저장할 수 있는 변수 height를 정의한다.
//boolean타입의 java책의 보유여부를 저장할 수 있는 변수 hasBook을 정의한다.
//이름,나이,키,책의 보유 여부를 출력해봅시다.
	public static void main(String[] args) {
		String name = "자바";
		int age = 22;
		double height = 180.0;
		boolean hasBook = true;

		System.out.println("나의 이름은" + name + "입니다"); // %b: boolean 값 출력,\n을 붙여서 줄바꿈도 정확히 구현
		System.out.printf("나이는 %d살 입니다. 키는 %.6fcm 입니다. '이것은 자바다' 책을 가지고있습니다.%b\n", age, height, hasBook);

	}

}
