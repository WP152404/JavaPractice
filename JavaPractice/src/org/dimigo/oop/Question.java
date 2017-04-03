/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : soon3
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
		
	public void question(){
		
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] output = {"박보영","박보영","국어"};
		String[] input = {"1.가장 좋아하는 가수는?","2.가장 좋아하는 배우는?","3.가장 좋아하는 과목은?"};
		System.out.println(input[0]);
		Scanner scanner = new Scanner(System. in);
		String answer = scanner.nextLine();
		if (answer.equals(output[0])){
			System.out.println("정답입니다! ");
		}else{
			System.out.println("틀렸습니다! ");
		}
		System.out.println(input[1]);
		String answer0 = scanner.nextLine();
		if (answer0.equals(output[1])){
			System.out.println("정답입니다! ");
			
		}else{
			System.out.println("틀렸습니다! ");
		}
		System.out.println(input[2]);
		String answer1 = scanner.nextLine();
		if (answer1.equals(output[2])){
			System.out.println("정답입니다! ");
			
		}else{
			System.out.println("틀렸습니다! ");
		}
		
		System.out.println("<< 결과 출력 >>");
		
			StringBuilder ha= new StringBuilder(input[0]);
			ha.append(" "+output[0]+"입니다.");
			StringBuilder ha1= new StringBuilder(input[1]);
			ha1.append(" "+output[1]+"입니다.");
			StringBuilder ha2= new StringBuilder(input[2]);
			ha2.append(" "+output[2]+"입니다.");
			
			System.out.println(ha);
			System.out.println(ha1);
			System.out.println(ha2);
			
			
		
	}

}
