
import java.util.Scanner;

public class ticket {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   ��ʼ��
		Scanner in  = new Scanner(System.in);
		//����Ͷ�ҽ��
		System.out.println("��Ͷ�ң�");
		int amount = in.nextInt();
		//�ж��Ƿ�ﵽ�۸�
		System.out.println("��Ͷ��"+amount+"Ԫ");
		if(amount<20)
			System.out.println("���㣬ȫ������");
		//��ӡ��Ʊ
		else
		{System.out.println("******************");
		System.out.println("*XXXX�Ǽ���·ר��*");
		System.out.println("*  ��ָ����λƱ  *");
		System.out.println("*  Ʊ�ۣ�20Ԫ    *");
		System.out.println("*****************");
		//���㲢����
	    System.out.println("������"+(amount-20)+"Ԫ");}

	}

}