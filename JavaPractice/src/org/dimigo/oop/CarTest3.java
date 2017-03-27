/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : soon3
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 c1;
		Car3 c2;
		// TODO Auto-generated method stub
		Car3 c3;
		c1=new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		c2=new Car3("기아자동차", "K7", "흰색", 246);
		c3=new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("<<자동차 목록>>");
		c1.print();
		c2.print();
		c3.print();

	}

}
