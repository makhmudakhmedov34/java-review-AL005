package org.cydeo;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        // 1 - Find all transactions in 2011 and sort by value
        System.out.println("*********Task-1**************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2 - What are all the unique cities where the traders work?
        System.out.println("*********Task-2**************");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        // Find All traders from Cambridge and sort them bby name
        System.out.println("*********Task-3**************");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(c -> c.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        // 4 - Return a String of all trader's name sorted alphabetically
        System.out.println("*********Task-4**************");
        String str = TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce("",(name1,name2)->name1+name2+" ");
        System.out.println(str);

        // 5 - Are any traders based in Milan?
        System.out.println("*********Task-5**************");
       boolean milanMatch = TransactionData.getAll().stream()
               .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanMatch);

        // 6 - Print the values of all transactions from the traders living in Cambridge
        System.out.println("*********Task-6**************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        // 7 - What is the highest value of all the transaction
        System.out.println("*********Task-7**************");
        int maxValue = TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::max).get();
        System.out.println(maxValue);

        // Find Transaction with smallest Value
        Optional<Transaction> smalValue = TransactionData.getAll().stream()
                .reduce((t1,t2) -> t1.getValue()<t2.getValue() ? t1:t2);
        System.out.println(smalValue);

        Optional<Transaction> smalValue2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smalValue2);













    }

}
