package classCoding;
//2025.05.19.20�� ������� Ŭ����
//���¸�,���¹�ȣ,�����ܰ� �ʵ带 ����
//������(���¸�name,���¹�ȣno,�����ܰ�balance)�� ����
//�޼��带 ����
public class AccountClass {
	//�ʵ�
	private String name;
	private String no;
	private int balance;
	
	
	//������
	public AccountClass(String name, String no, int balance){
	this.name=name;
	this.no=no;
	this.balance=balance;
}
	//����,����
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
	//���withdraw//deposit
	public void deposit(int deposit) { 
		 balance-=deposit;
}
	//@override
	public String toString() {
		return String.format("{%s,%s,%d}", name,no,balance);
	}
}	
