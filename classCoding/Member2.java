package classCoding;
//2025.05.15.23��. using constructor
//�ν��Ͻ������� �����ڸ� �̿��ؼ� �ʱ�ȭ�ϴ� �ڵ带 �ۼ�
public class Member2 {
//�ʵ�
	String name;
	String phone;
	String major;
	int grade;
	String email;
	String birthday;
	String address;
	
//������(�������̸��� Ŭ�����̸��� �����Ұ�!)
	Member2(){
}
//�Ű����� ������
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
	