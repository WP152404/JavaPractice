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
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1; car2 c2; car c3;
		c1=new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		c2=new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		c3=new Car2("삼성자동차", "SM7", "회색", 200, 38000000);

		
		System.out.println("<<자동차 목록>>");
		c1.print();
		c2.print();
		c3.print();

	}

}
