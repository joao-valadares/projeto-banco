package application;

import java.util.Locale;
import java.util.Scanner;

import entities.account;

public class App {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
         * Informar numero da conta
         * Informar nome titular
         * Valor deposito inicial(opcional, se nao ocorrer $conta = 0) (mostrar dados)
         * Realizar deposito (mostrar dados)
         * Realizar saque (mostrar dados)
         * 
         * Restricao: Numero conta nunca pode ser alterado
         * obs: nome pode ser alterado
         * 
         * Proteger alteracao saldo(Saldo so aumenta por deposito, e diminui por saque)
         * 
         * Cada saque custa 5$
         * Conta pode ficar negativa caso saque seja maior que saldo
         */

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder:");
        sc.nextLine();
        String accountName = sc.nextLine();

        System.out.print("Is there an inital deposit? (y/n)");
        String inittialDeposit = sc.nextLine();

        double accountAmount;
        if (inittialDeposit.equals("y")){
            System.out.print("Enter inicial deposit value: ");
            accountAmount = sc.nextDouble();
        }
        else {
            accountAmount = 0;
        }

        account act = new account(accountNumber, accountName, accountAmount);

        System.out.println("Account data:");
        System.out.println("Account " + act.getAccountNumber() + ", Holder: " + act.getAccountName() + ", Balance: " + act.getAccountAmount());

        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        act.depositAmount(depositAmount);

        System.out.println("Updated account data");
        System.out.println("Account " + act.getAccountNumber() + ", Holder: " + act.getAccountName() + ", Balance: " + act.getAccountAmount());

        System.out.print("Enter a withdraw value: ");
        double withdrawAmount = sc.nextDouble();
        act.withdrawAmount(withdrawAmount);

        System.out.println("Updated account data");
        System.out.println("Account " + act.getAccountNumber() + ", Holder: " + act.getAccountName() + ", Balance: " + act.getAccountAmount());


        sc.close();
    }
}
