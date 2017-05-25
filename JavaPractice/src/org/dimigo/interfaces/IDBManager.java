/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : soon3
 * @version : 1.0
 */
public interface IDBManager {
	String ORACLE_DATABASE ="ORACLE";
	String SYBASE_DATABASE="SYBASE";
	
	public default void insert(){
		
	}
	public default void search(){
		
	}
	public default void update(){
		
	}
	public default void delete(){
		
	}
	
	static IDBManager getDBObject(String database) {
		if (ORACLE_DATABASE.equals(database))
			return (IDBManager) new OracleDB();
		else if (SYBASE_DATABASE.equals(database))
			return (IDBManager) new SybaseDB();
		return null;
	}
}
