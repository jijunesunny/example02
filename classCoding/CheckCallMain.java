package classCoding;
import java.util.Scanner;
public class CheckCallMain {
//22��. �տ��� ����(CH2-1)MemberŬ�������� �Ʒ� �䱸���׿� �´� �޼��带 �����ϰ�,
//main()�޼��忡 �ش�޼��带 ȣ���ؼ� ����� Ȯ���غ�����.
//1. �ڷγ� ��ſ��������� �������� ���θ� Ȯ���ϴ� �޼��带 �����մϴ�(checkVaccin())
//-�Ű������� �¾ ��(�⵵)�� ���� �޴´�.
//-13���̸��� ���� 60�� �̻��� ��� "���� ���������� �����մϴ�." �޽����� ��µǵ����մϴ�.
//-������ ������ ������ ������ �ƴ� �������� ��� "���� ���� ����� �ƴմϴ�."��� ����մϴ�.
	
//2. �ǰ�������� ���θ� �Ǻ��ϰ� � ������ �������� Ȯ���ϴ� �޼��带 �����մϴ�.(healthCheck())
//-�Ű������� �¾ ��(�⵵)�� ���޹޴´�.
//-���ѹα� ����(20��)�� ��� ����� 2�⸶�� �ǰ������� �������ֽ��ϴ�.
//-¦���ؿ� �¾ ����� ���ذ� ¦�����̶�� �˻����� �˴ϴ�.
//-40�� �̻��� ���� �� �˻絵 ����� �˻縦 �� �� �ֽ��ϴ�.
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("�¾�ظ� �Է��ϼ���:");
	int bornYear = in.nextInt();
	CheckCall check = new CheckCall(bornYear);
	System.out.println("=�ڷγ� ��ſ����������ɿ���Ȯ��=");
	check.checkVaccin();
	System.out.println("=�ǰ�������� ����Ȯ��= ");
	check.healthCheck();
	in.close();

	}

}
