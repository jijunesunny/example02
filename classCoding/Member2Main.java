package classCoding;

import chapter06.ThisCar;

public class Member2Main {

	public static void main(String[] args) {
		//�⺻������
	Member2 mb1 = new Member2("SHKIM","010-9999-7777","��ǻ��",2,"shkim@gmail.com","2000-10-11","����");
		//�Ű�����������
	Member2 mb2 = new Member2("JJKIM","010-1111-3333","��ǻ��",2,"jjkim@gmail.com","��������","��������");
	
	System.out.println("�̸�:"+mb1.name);
	System.out.println("��ȭ��ȣ:"+mb1.phone);
	System.out.println("����:"+mb1.major);
	System.out.println("�г�:"+mb1.grade);
	System.out.println("�̸���:"+mb1.email);
	System.out.println("����:"+mb1.birthday);
	System.out.println("�ּ�:"+mb1.address);
	System.out.println("--------------------------------");
	System.out.println("�̸�:"+mb2.name);
	System.out.println("��ȭ��ȣ:"+mb2.phone);
	System.out.println("����:"+mb2.major);
	System.out.println("�г�:"+mb2.grade);
	System.out.println("�̸���:"+mb2.email);
	System.out.println("����:"+mb2.birthday);
	System.out.println("�ּ�:"+mb2.address);
	}

}
