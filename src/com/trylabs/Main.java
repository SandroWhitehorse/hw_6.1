package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int payedSum;
       do {
        System.out.println("Введите сумму платежа клиента:");
        payedSum=scanner.nextInt();}
       while ((payedSum>700)||(payedSum<100));
        credit(payedSum);

    }
    private static void credit (int payed_Sum)
    { String isDebt;
    int debt=700-payed_Sum;
    if((debt)==0) isDebt = "долг отсутствует";
    else  isDebt ="у клиента долг "+debt;
    System.out.println("Сумма задолженности = 700 ,"+"cумма предоплаты = "+payed_Sum+", "+isDebt );
}}
