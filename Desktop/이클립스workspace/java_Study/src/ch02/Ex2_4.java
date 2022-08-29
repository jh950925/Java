package ch02;

public class Ex2_4 {
	public static void main(String[] args) {
		
		byte  b  = 1;
		short s  = 2;
		char  c  ='A';
		
		int finger = 10;
		
		System.out.printf("b = %d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c , %n", (int)c );
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		
//		b = 1
//		s=2
//		c=A , 
//		finger=[   10]
//		finger=[10   ]
//		finger=[00010]
	}
}
