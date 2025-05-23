package classCoding;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("계좌 정보를 입력하세요.");
		System.out.println("계좌명의:");
		String name = in.nextLine();
		System.out.println("계좌번호:");
		String no = in.nextLine();
		System.out.println("잔고:");
		int balance = in.nextInt();
		
		AccountClass acc = new AccountClass(name,no, balance);
		System.out.println("계좌기본정보:"+acc);
		System.out.println("출금액:");
		int deposit = in.nextInt();
		acc.deposit(deposit);
		System.out.println("잔금은"+ acc.getBalance()+"입니다.");
		in.close();
}

}
