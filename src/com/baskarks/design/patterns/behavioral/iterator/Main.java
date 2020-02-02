package com.baskarks.design.patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        var products = new ProductCollection();
        products.add(new Product(1, "Shoes"));
        products.add(new Product(2, "Bags"));
        products.add(new Product(3, "Shirts"));
        products.add(new Product(4, "Pants"));

        var iterator = products.getIterator();
        while (iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }
    }
}
