package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int month = 1700000;
        int member = 3;
        int shop = 1500;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n",month);
        System.out.printf("점포 내 직원 수 : %,d명\n",member);
        System.out.printf("점포 수 : %,d개\n\n",shop);
        System.out.printf("연간 인건비 : %,d원\n", (long)month*member*shop*12);
    }
}