package com.company.thr;

public class MoneyTransactionUtil {

    private MoneyTransactionUtil() {
    }

    public static void sendTo(String num1, String num2, double sum) throws AccountException, MoneyValueException {
        if (num1.equals(num2)) {
            throw new AccountException();
        }
        else if (sum<=0){
            throw new MoneyValueException();
        }
        else if(sum>100_000){
            throw new MoneyValueException();
        }
        else{
            System.out.println("C номера "+num1+" на номер "+num2+" было переведено "+sum+" грн");
        }
    }
}
