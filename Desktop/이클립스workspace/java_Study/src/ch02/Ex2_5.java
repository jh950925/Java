package ch02;

import java.util.Scanner;

public class Ex2_5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = scanner.nextLine();
		
		System.out.println("������� �̸��� : " + name);
		
		scanner.close();
	}
}
