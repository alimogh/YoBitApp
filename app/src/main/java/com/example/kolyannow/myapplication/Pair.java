package com.example.kolyannow.myapplication;

public class Pair {

    int id;
    String name, count, price;

    public Pair() {
    }

    public Pair(String name) {
        this.name = name;
    }

    public Pair(String name, String count, String price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public Pair(int id, String name, String count) {

        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}