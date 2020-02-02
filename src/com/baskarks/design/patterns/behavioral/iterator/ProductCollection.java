package com.baskarks.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }
  public Iterator getIterator() {
    return new ListIterator(this);
  }

  public class ListIterator implements Iterator {
    private ProductCollection productList;
    private int index;

    public ListIterator(ProductCollection productList) {
      this.productList = productList;
    }

    @Override
    public boolean hasNext() {
      return index < productList.products.size();
    }

    @Override
    public Product current() {
      return productList.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
