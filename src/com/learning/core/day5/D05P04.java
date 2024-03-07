package com.learning.core.day5;

import java.util.HashSet;

class Product 
{
    private String productId;
    private String productName;

    public Product(String productId, String productName) 
    {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() 
    {
        return productId;
    }

    public String getProductName() 
    {
        return productName;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productId.equals(product.productId);
    }

    
    public int hashCode() 
    {
        return productId.hashCode();
    }
}

public class D05P04 
{
    public static void main(String[] args) 
    {
        HashSet<Product> products = new HashSet<>();
        products.add(new Product("P001", "Toyota Camry"));
        products.add(new Product("P002", "Honda Civic"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Ford Mustang"));

        String searchProductId = "P003";
        String searchProductName = "Maruti Dezire";

        Product searchProduct = new Product(searchProductId, searchProductName);

        if (products.contains(searchProduct)) 
        {
            System.out.println("Product Found");
        } 
        else 
        {
            System.out.println("Product Not Found");
        }
    }
}