package classCoding;

import java.util.Scanner;
//21��. Calculator Ŭ������ ������ ���ô�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� ���ϱ⿬�� �� ����ϴ� �޼���� �����Ѵ�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� ���⿬�� �� ����ϴ� �޼��带 �����Ѵ�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� ���ϱ⿬�� �� ����ϴ� �޼��带 �����Ѵ�.
//-�������� �ΰ��� �Ű������� ���ڷ� ���޹޾� �����⿬�� �� ����ϴ� �޼��带 �����Ѵ�.
//�Ǽ� ������radius �ϳ��� �Ű������� ���ڷ� ���޹޾� ���� �ѷ��� ���� ��ȯ�ϴ� �޼��带 �����Ѵ�.
//(���� �ѷ�circumference: 2*pi*r, ���� ����area: pi*r*r)

//-main()�޼��带 �����ϰ� ������ �޼��带 ȣ���ؼ� ����ڿ��� ���� ����� �ֿܼ� ����� ���ô�.
//-�ֿܼ��� ����ڿ��� �����͸� �޾� �޼��带 ȣ���� �� ����ڿ��� ���� �����͸� �޼����� �Ű������� ���ڷ� �����ϴ� 
//�ڵ带 main()�޼��忡 �߰��غ��ô�.
public class CalculatorMain01 {

	public static void main(String[] args) {
		Calculator01 cal = new Calculator01(); //��ü����
		Scanner in = new Scanner(System.in);
		System.out.println("ù��° �����Է�:");
		int num1 = in.nextInt();
		System.out.println("�ι�° �����Է�:");
		int num2 = in.nextInt();
		System.out.println("�Ǽ� �ϳ��� �Է�:");
		double r = in.nextDouble();
		
		System.out.println("�� ������ ���ϱⰪ��"+ cal.add(num1,num2));
		System.out.println("�� ������ ���Ⱚ��"+ cal.sub(num1,num2));
		System.out.println("�� ������ ���ϱⰪ��"+ cal.mul(num1,num2));
		System.out.println("�� ������ �����Ⱚ��"+ cal.div(num1,num2));
		System.out.printf("�Է��Ͻ� �Ǽ��������� ���� �ѷ��� %.2f�Դϴ�.\n",cal.circle(r));
		System.out.printf("�Է��Ͻ� �Ǽ��������� ���� ���̴� %.2f�Դϴ�.\n",cal.area(r));
		
		in.close();
	}

}
