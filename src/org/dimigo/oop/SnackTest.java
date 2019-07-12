package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] s = {new Snack("새우깡", "농심", 1100,2),
                     new Snack("콘칩", "크라운", 1200,1),
                     new Snack("허니버터칩", "해태", 1500,4)};
        int total = 0;

        for(Snack value : s){
            System.out.println(value.toString());
            System.out.println();
        }
        for (Snack value : s){
            total += value.calcPrice();
        }
        System.out.printf("총 구매 금액 : %,d원", total);
    }
}