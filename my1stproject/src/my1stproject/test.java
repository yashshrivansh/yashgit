package my1stproject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Implicit Type Casting");
char a='A';
System.out.println("Value of a:"+a);
int b=a;
System.out.println("Value of b:"+b);
float c=a;
System.out.println("Value of c:"+c);
long d=a;
System.out.println("Value of d:"+d);
double e=a;
System.out.println("Value of e:"+e);

System.out.println("Explicit Type Casting:");
double x=45.5;
int y=(int)x;
System.out.println("Value of x:"+x);
System.out.println("Value of y:"+y);
	}

}
