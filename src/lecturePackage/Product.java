package lecturePackage;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Product {

    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static double FindAveragePrice(Product[] products){
//        DecimalFormat df = new DecimalFormat("0.00");
        double totalPrice = 0;
        for (int i =0; i<products.length; i++){
            totalPrice += products[i].price;
        }
        double totAverage = totalPrice/ products.length;
        return totAverage;
    }


    public static void main(String[] args) {


        /* TODO: create a class called Product with two private properties of name and priceInCents.
            Add a public static method called, find average price that takes in an array of products
            and finds the average price of all products. Add a main method to the class to test some
            values.
         */

        Product[] products = {
                new Product("Cookie", 1.99 ),
                new Product("Candy", 0.99),
                new Product("Snack", 2.99)
        };
        System.out.printf("Average price will be: %.2f", Product.FindAveragePrice(products));




    }



}
