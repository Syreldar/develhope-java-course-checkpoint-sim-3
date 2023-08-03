package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Product[] products = new Product[3];
        products[0] = new Product("CocaCola Can", 1, 434);
        products[1] = new Product("Biscuits Pack", 2, 236);
        products[2] = new Product("Apple Juice", 3, 736);

        String[] names = new String[products.length];
        for (int i = 0; i < products.length; i++)
            names[i] = products[i].getName();

        printLastLetters(names);

        String lastLetters = concatenateLastLetters(names);
        System.out.printf("%s%n", lastLetters);
    }

    static void printLastLetters(String[] array)
    {
        for (String s : array)
            System.out.printf("%s%n", s.substring(s.length() - 1));
    }

    static String concatenateLastLetters(String[] array)
    {
        StringBuilder sb = new StringBuilder();
        for (String s : array)
            sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }
}
