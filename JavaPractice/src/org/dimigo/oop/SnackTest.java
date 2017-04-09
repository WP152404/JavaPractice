/**


* 

*/

package org.dimigo.oop;


/**

* <pre>

* org.dimigo.oop

* |_ SnackTest.java

* 1. 개요 :

* 2. 작성일 : 2017. 4. 7.

* </pre>

*

* @author : soon3

* @version : 1.0

*/

public class SnackTest {


	/**

	 * @param args

	 */

	public static void main(String[] args) {

		Snack[] Snackk = new Snack[3];

		Snackk[0]=new Snack("새우깡","농심",1100,2);

		Snackk[1]=new Snack("콘칲","크라운",1200,1);

		Snackk[2]=new Snack("허니버터칩","해태",1500,4);


		for(Snack snack : Snackk)

		{ System.out.println(snack); 	}


		System.out.println("총 구매 금액 : "+String.format("%,d", Snackk[0].getPrice()*Snackk[0].getNumber() + 

Snackk[1].getPrice()*Snackk[1].getNumber() + 

Snackk[2].getPrice()*Snackk[2].getNumber())+"원");


	}


}
