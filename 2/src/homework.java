
import java.util.Scanner;

public class homework {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   初始化
		Scanner in  = new Scanner(System.in);
		//读入投币金额
		System.out.println("请投币：");
		int amount = in.nextInt();
		//判断是否达到价格
		System.out.println(amount);
		System.out.println(amount>=10);
		//打印车票
		System.out.println("******************");
		System.out.println("*XXXX城际铁路专线*");
		System.out.println("*  无指定座位票  *");
		System.out.println("*  票价：10元    *");
		System.out.println("*****************");
		//计算并找零
	    System.out.println("找您："+(amount-10)+"元");

	}

}