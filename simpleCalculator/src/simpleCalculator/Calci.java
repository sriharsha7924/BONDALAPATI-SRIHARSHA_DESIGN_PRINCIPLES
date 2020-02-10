package simpleCalculator;
import java.util.*;
public class Calci {
	public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String[] arr=new String[3];
Operations o=new Operations();
System.out.println("enter 1 for add ,2 for sub, 3 for mul,4 for div ,5 for mod");
int n=sc.nextInt();
System.out.println("enter expression");
String s=sc.next()+sc.nextLine();
//input for this program is in format a+b or a-b or a*b...
switch (n) {
case 1:
{
		arr=s.split("\\+");
		int p=o.add(arr[0],arr[1]);
		System.out.println(p);
        break;
}
case 2:
	 {
		arr=s.split("\\-");
		int p=o.sub(arr[0],arr[1]);
		System.out.println(p);
        break;
	}
case 3:
	 {
		arr=s.split("\\*");	
		int p=o.mul(arr[0],arr[1]);
		System.out.println(p);
        break;
	}
case 4:
	 {
		arr=s.split("\\/");	
		int p=o.div(arr[0],arr[1]);
		System.out.println(p);
        break;
	}
case 5:
	{
		arr=s.split("\\%");	
		int p=o.mod(arr[0],arr[1]);
		System.out.println(p);
        break;
	}

}

;sc.close();
}
}
