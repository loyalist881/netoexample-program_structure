package ru.netology.service;

public class CustomsService {
    static final int PRICE_PERCENTAGE = 100;
    static final int WEIGHT_RATE = 100;

    public static int calculateCustoms(int productPrice, int productWeight) {
        return (productPrice / PRICE_PERCENTAGE) + (productWeight * WEIGHT_RATE);
    }
}
