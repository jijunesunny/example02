package classCoding;

import chapter06.ThisCar;

public class Member2Main {

	public static void main(String[] args) {
		//기본생성자
	Member2 mb1 = new Member2("SHKIM","010-9999-7777","컴퓨터",2,"shkim@gmail.com","2000-10-11","서울");
		//매개변수생성자
	Member2 mb2 = new Member2("JJKIM","010-1111-3333","컴퓨터",2,"jjkim@gmail.com","정보없음","정보없음");
	
	System.out.println("이름:"+mb1.name);
	System.out.println("전화번호:"+mb1.phone);
	System.out.println("전공:"+mb1.major);
	System.out.println("학년:"+mb1.grade);
	System.out.println("이메일:"+mb1.email);
	System.out.println("생일:"+mb1.birthday);
	System.out.println("주소:"+mb1.address);
	System.out.println("--------------------------------");
	System.out.println("이름:"+mb2.name);
	System.out.println("전화번호:"+mb2.phone);
	System.out.println("전공:"+mb2.major);
	System.out.println("학년:"+mb2.grade);
	System.out.println("이메일:"+mb2.email);
	System.out.println("생일:"+mb2.birthday);
	System.out.println("주소:"+mb2.address);
	}

}
