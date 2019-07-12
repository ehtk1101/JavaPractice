package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] family = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생"),
        };

        int[] famount = {10000, 5000, 2000, 1000};

        FamilyMember.printMemberCnt();

        for(int i = 0; i < family.length ;i++){
            PiggyBank.putMoney(family[i] , famount[i]);
        }
        PiggyBank.printBalance();

        PiggyBank.putMoney(family[2], 1000);
        PiggyBank.printBalance();
    }
}