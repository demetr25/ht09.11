package com.company.thr;

public class UserBank {
    public static void main(String[] args) {
        try{
            MoneyTransactionUtil.sendTo("1", "1", 100001);
        } catch (MoneyValueException e){
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        } catch (AccountException e){
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают");
        }
    }
}
