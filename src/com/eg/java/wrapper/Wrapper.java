package com.eg.java.wrapper;
public class Wrapper {
    public static void main(String[] args) {
        String i = "20";
        int x = Integer.parseInt(i);
        double d = Double.parseDouble(i);
        boolean b=Boolean.parseBoolean(i);

        System.out.println(d);
        System.out.println(b);
    }
    }