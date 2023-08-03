package org.example;

class Product
{
    private String name;
    private long id;
    private int quantity;

    Product() {}

    Product(String name, long id, int quantity)
    {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
