package org.dimigo.inheritance;

public class PersonTest2 {
    public static void main(String[] args) {
        Person[] per = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person p : per) {
            greeting(p);
            System.out.println();
        }
    }
    private static void greeting(Person p){
        System.out.println(p);
        p.sayHello();
        p.sayBye();
    }
}

