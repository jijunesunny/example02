package classCoding;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		System.out.println("���¸���:");
		String name = in.nextLine();
		System.out.println("���¹�ȣ:");
		String no = in.nextLine();
		System.out.println("�ܰ�:");
		int balance = in.nextInt();
		
		AccountClass acc = new AccountClass(name,no, balance);
		System.out.println("���±⺻����:"+acc);
		System.out.println("��ݾ�:");
		int deposit = in.nextInt();
		acc.deposit(deposit);
		System.out.println("�ܱ���"+ acc.getBalance()+"�Դϴ�.");
		in.close();
}

}
