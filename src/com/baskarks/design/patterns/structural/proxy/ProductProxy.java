package com.baskarks.design.patterns.structural.proxy;

public class ProductProxy implements ProductInterface {
    private Product product;
    private DbContext context;

    public ProductProxy(int id, DbContext context) {
        this.product = new Product(id);
        this.context = context;
    }
    @Override
    public int getId() {
        return product.getId();
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public void setName(String name) {
        product.setName(name);
        context.markAsChanged(this);
    }
}
