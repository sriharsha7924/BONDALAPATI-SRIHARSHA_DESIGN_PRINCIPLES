package simpleCalculator;

public class Operations {
    int add(String a,String b) {
    	int c=Integer.parseInt(a);
    	int d=Integer.parseInt(b);
    	int res=c+d;
    	return res;
    }
    int sub(String a,String b) {
    	int c=Integer.parseInt(a);
    	int d=Integer.parseInt(b);
    	int res=c-d;
    	return res;
    }
    int mul(String a,String b) {
    	int c=Integer.parseInt(a);
    	int d=Integer.parseInt(b);
    	int res=c*d;
    	return res;
    }
    int div(String a,String b) {
    	int c=Integer.parseInt(a);
    	int d=Integer.parseInt(b);
    	int res=c/d;
    	return res;
    }
    int mod(String a,String b) {
    	int c=Integer.parseInt(a);
    	int d=Integer.parseInt(b);
    	int res=c%d;
    	return res;
    }
}
