package classCoding;
//2025.05.19.20번 은행계좌 클래스
//계좌명,계좌번호,예금잔고 필드를 생성
//생성자(계좌명name,계좌번호no,예금잔고balance)를 생성
//메서드를 생성
public class AccountClass {
	//필드
	private String name;
	private String no;
	private int balance;
	
	
	//생성자
	public AccountClass(String name, String no, int balance){
	this.name=name;
	this.no=no;
	this.balance=balance;
}
	//게터,세터
	public String getName() {
		return name;
}
	public String setName(String name) {
		this.name=name;
		return name;
}	
	public String getNo() {
		return no;
}
	public String setNo(String no) {
		this.no=no;
		return no;
}
	public int getBalance() {
		return balance;
}
	public int setBalance(int balance) {
		this.balance=balance;
		return balance;
}	
	//출금withdraw//deposit
	public void deposit(int deposit) { 
		 balance-=deposit;
}
	//@override
	public String toString() {
		return String.format("{%s,%s,%d}", name,no,balance);
	}
}	
