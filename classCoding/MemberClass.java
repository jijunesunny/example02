package classCoding;

public class MemberClass {
//19��. MemberŬ������ �����Ͽ� main()�޼���ȿ� �Ʒ������� ������ ������ ���ô�.
//StringŸ���� �̸��� ������ �� �ִ� ���� name�� �����Ѵ�.
//intŸ���� ���̸� ������ �� �ִ� ���� age�� �����Ѵ�.
//doubleŸ���� Ű�� ������ �� �ִ� ���� height�� �����Ѵ�.
//booleanŸ���� javaå�� �������θ� ������ �� �ִ� ���� hasBook�� �����Ѵ�.
//�̸�,����,Ű,å�� ���� ���θ� ����غ��ô�.
	public static void main(String[] args) {
		String name = "�ڹ�";
		int age = 22;
		double height = 180.0;
		boolean hasBook = true;

		System.out.println("���� �̸���" + name + "�Դϴ�"); // %b: boolean �� ���,\n�� �ٿ��� �ٹٲ޵� ��Ȯ�� ����
		System.out.printf("���̴� %d�� �Դϴ�. Ű�� %.6fcm �Դϴ�. '�̰��� �ڹٴ�' å�� �������ֽ��ϴ�.%b\n", age, height, hasBook);

	}

}
