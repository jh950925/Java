package ch02;

import java.util.Scanner;

public class Ex2_5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = scanner.nextLine();
		
		System.out.println("사용자의 이름은 : " + name);
		
		scanner.close();
	}
}
