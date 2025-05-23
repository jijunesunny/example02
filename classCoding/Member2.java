package classCoding;
//2025.05.15.23번. using constructor
//인스턴스생성은 생성자를 이용해서 초기화하는 코드를 작성
public class Member2 {
//필드
	String name;
	String phone;
	String major;
	int grade;
	String email;
	String birthday;
	String address;
	
//생성자(생성자이름은 클래스이름과 동일할것!)
	Member2(){
}
//매개변수 생성자
	Member2(String name, String phone, String major, int grade, String email, String birthday, String address){
		this.name=name;
		this.phone=phone;
		this.major=major;
		this.grade=grade;
		this.email=email;
		this.birthday=birthday;
		this.address=address;
	}
}
	