package org.dimigo.test;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("Tom");
		Korean korea = new Korean("홍길동");
		Japanese japan = new Japanese("다나카");
		Chinese china = new Chinese("왕밍");
		
		System.out.println(person);
		System.out.println(korea);
		System.out.println(japan);
		System.out.println(china);
		System.out.println();
		person.sayHello();
		korea.sayHello();
		japan.sayHello();
		china.sayHello();
		System.out.println();
		person.sayBye();
		korea.sayBye();
		japan.sayBye();
		china.sayBye();
		
		
	}

}
