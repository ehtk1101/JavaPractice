package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        Korean k = new Korean("홍길동");
        Japanese j = new Japanese("다나카");
        Chinese c = new Chinese("왕밍");

        System.out.println(p);
        System.out.println(k);
        System.out.println(j);
        System.out.println(c);
        System.out.println();

        p.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();
        System.out.println();

        p.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();

        //반복된 코드가 보인다 -> 배열로 만들 수 없을까? -> 상속2를 기다리시라
    }
}