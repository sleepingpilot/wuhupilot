
import java.util.Scanner;

public class ticket {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   初始化
		Scanner in  = new Scanner(System.in);
		//读入投币金额
		System.out.println("请投币：");
		int amount = in.nextInt();
		//判断是否达到价格
		System.out.println("你投了"+amount+"元");
		if(amount<20)
			System.out.println("金额不足，全部返回");
		//打印车票
		else
		{System.out.println("******************");
		System.out.println("*XXXX城际铁路专线*");
		System.out.println("*  无指定座位票  *");
		System.out.println("*  票价：20元    *");
		System.out.println("*****************");
		//计算并找零
	    System.out.println("找您："+(amount-20)+"元");}

	}

}