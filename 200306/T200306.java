import java.util.Scanner;

public class T200306 {

	public static void main6(String[] args) {
		//分支结构：if  switch
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch(n) {
        	//表达式只能是 整数（long不可以）、枚举、字符、字符串
        	case 1:
                System.out.println("aaa");
                //语句遇到break才会结束
                break;
            case 2:
                System.out.println("bbb");
                break;
            default:
                System.out.println("xxx");
                break;
        }
	}

	public static void main5(String[] args) {
		//悬垂else:else只与最近的if匹配
		int x = 10;
        int y = 10;
        if (x == 20) { 
            if (y == 10) {
                System.out.println("aaa");
            }else {
                System.out.println("bbb");
            }
        }
	}

	public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	//循环读取：
        	//中断 ctrl + c
        	//正常停止 ctrl + z
            int n = scan.nextInt();
	        if(n % 2 == 0) {
		       System.out.println("偶数");
	        }else {
		       System.out.println("奇数");
	        }
       }
	}

	public static void main3(String[] args) {
		//单分支
		//if(表达式)一定是boolean类型
		int a = 10;
		//C中，0是假，非0是真；
		//java中，只有true是真，false是假；
		//有else为多分支，无为单分支
		if(a == 20) {
		    System.out.println("a == 20");
		}else if(a == 8) {
		    System.out.println("a == 8");
		}else {
		    System.out.println("a != 20 && a != 8");
		}
	}

	public static void main2(String[] args) {
		//顺序结构
		System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
	}

	public static void main1(String[] args) {
		//工具类：Scanner
		//手动输入：
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();//输入一个整形
		int b = scan.nextInt();
		int c = scan.nextInt();

		//int a = 3;
		//int b = 5;
		//int c = 8;

		int max = a > b ? a : b;
		int max1 = max > c ? max : c;

		int min = a > b ? b : a;
		int min1 = min > c ? c : min;

		System.out.println(max1);//8
		System.out.println(min1);//3
	}
}