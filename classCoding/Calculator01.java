package classCoding;

//21��. Calculator Ŭ������ ������ ���ô�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� ���ϱ⿬�� �� ����ϴ� �޼���� �����Ѵ�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� ���⿬�� �� ����ϴ� �޼��带 �����Ѵ�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� ���ϱ⿬�� �� ����ϴ� �޼��带 �����Ѵ�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� �����⿬�� �� ����ϴ� �޼��带 �����Ѵ�.
//�Ǽ� ������radius �ϳ��� �Ű������� ���ڷ� ���޹޾� ���� �ѷ��� ���� ��ȯ�ϴ� �޼��带 �����Ѵ�.
// (���� �ѷ�circumference: 2*pi*r, ���� ����area: pi*r*r)

//-main()�޼��带 �����ϰ� ������ �޼��带 ȣ���ؼ� ����ڿ��� ���� ����� �ֿܼ� ����� ���ô�.
//-�ֿܼ��� ����ڿ��� �����͸� �޾� �޼��带 ȣ���� �� ����ڿ��� ���� �����͸� �޼����� �Ű������� ���ڷ� �����ϴ� 
//�ڵ带 main()�޼��忡 �߰��غ��ô�.

////�������� 5.0�� ���� ���� PI���	
//double r = 5.0;		
//final double PI = 3.141592;
//double result = Math.pow(r, 2) * PI;
//System.out.println(result);
public class Calculator01 {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	public static double circle(double r) {
		return 2 * Math.PI * r;
	}
	public static double area(double r) {
		return Math.PI* r* r ;
	}
}
