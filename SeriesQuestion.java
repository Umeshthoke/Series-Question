package DSA;

public class SeriesQuestion {
	
	public static void fibonacciSeries(int n) {
		
		int a=0,b=1;
		int result;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=n-1;i++) {
			
			result=a+b;
			a=b;
			b=result;
			System.out.print(result+" ");
		}
	}
	
	public static void SwapingNumber(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The Value Of a is:"+a);
		System.out.println("The Value Of b is:"+b);
	}
	
	public static void Factorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
			
		}
		System.out.println("Factorial Of Number is:"+fact);
	}
	
	public static void Naturalnumber(int n) {
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(i);
		}
		
	}
	public static void Oddnumber(int n) {
		
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
				
				System.out.print(i);
				}
		
		}	
			
		}
	
	public static void Primenumber(int n) {
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			
			if( n%i==0) {
				
				count++;
				
				
				
			}
			if(count==2) {
				
				System.out.println("Prime");
			}
			else {
				
				System.out.println("Not Even");
			}
		}
	}
		
	

		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber(4 );
	}

}
