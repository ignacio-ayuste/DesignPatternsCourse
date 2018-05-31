package strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyJavaAPI {

    public static void main(String[] args) {

        Product shirt = new Product("super shirt", "shirt", 100);
        Product hat = new Product("great hat", "hat", 50);
        Product fancyHat = new Product("fancy hat", "hat", 200);

        List<Product> productList = Arrays.asList(shirt, hat, fancyHat);

        System.out.println("The list is not sorted");

        System.out.println(productList);

        Collections.sort(productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if(p1.getPrice() > p2.getPrice()){
                    return 1;
                }
                if(p1.getPrice() < p2.getPrice()){
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("The list is sorted by Price");
        System.out.println(productList);

        Collections.sort(productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("The list is sorted by name");
        System.out.println(productList);

    }


}
