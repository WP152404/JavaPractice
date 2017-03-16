/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : soon3
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int choice =0;
		int fight =100;
		do{
		System.out.println("-------------------");
		System.out.println("<< 게임 메뉴 >> ");
		System.out.printf("1. 공격력 증가\n 2. 공격력 감소\n 3. 캐릭터 설정\n 9. 종료\n ");
		System.out.println("-------------------");
		System.out.print("메뉴입력=> ");
		choice =scanner.nextInt();
		switch(choice)
		{
		case 1:
			fight+=10;
			System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+fight);
			break;
		case 2:
			fight -=10;
			System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+fight);
		
		case 3:
			int num = new Random().nextInt(5);
			switch(num){
			case 1:
				System.out.println("마법사(으)로 설정되었습니다.");
				break;
			case 2:
				System.out.println("영주(으)로 설정되었습니다.");
				break;
			case 3:
				System.out.println("기사(으)로 설정되었습니다.");
				break;
			case 4:
				System.out.println("농민(으)로 설정되었습니다.");
				break;
				
			}
		break;
			
		case 9:
			System.out.println("이제 공부하세요!");
		}
		
		}while(choice!=9);
	}

}
