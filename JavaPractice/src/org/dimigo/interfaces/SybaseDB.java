/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ SybaseDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : soon3
 * @version : 1.0
 */
public class SybaseDB implements IDBManager {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 저장");
	}


	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 조회");
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 변경");
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 삭제");
	}

	
}
