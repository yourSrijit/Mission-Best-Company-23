package TCS_NQT24.TCS_Asked2024;

import javax.xml.namespace.QName;
import java.util.*;

public class Q4 {
    public static class Transaction {
        String name;
        float price;
        int quantity;

        Transaction(String name, float price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

    }

    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine().trim();

    }
}

/*
XYZ shop maintains a transaction diary where today it has the following transaction,
A dictionary was given as input
[( “Apple" .1.0, 20), (“Orange”, 0.5, 15), (“Apple”, 2.5, 10), (“Banana”, 1.5,15),(“Orange”, 1.0, 20),(“Apple”, 2.5, 5) ]

We had to find the total sales in the transaction , Average Sales, Most Profitable Fruit Name
 */
