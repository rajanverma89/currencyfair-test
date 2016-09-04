package com.test.currencyfair.models;

import com.test.currencyfair.enums.Country;
import com.test.currencyfair.enums.Currency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Order entity class.
 */
@Document
public class Order {

    @Id
    private String orderId;
    private String userId;
    private Currency currencyFrom;
    private Currency currencyTo;
    private double amountBuy;
    private double amountSell;
    private float rate;
    private String timePlaced;
    private Country originatingCountry;

    public Order(){

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
       return userId;
    }

    public void setUser(String userId) {
        this.userId = userId;
    }

    public Currency getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(Currency currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(Currency currencyTo) {
        this.currencyTo = currencyTo;
    }

    public double getAmountBuy() {
        return amountBuy;
    }

    public void setAmountBuy(double amountBuy) {
        this.amountBuy = amountBuy;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(String timePlaced) {
        this.timePlaced = timePlaced;
    }

    public Country getOriginatingCountry() {
        return originatingCountry;
    }

    public void setOriginatingCountry(Country originatingCountry) {
        this.originatingCountry = originatingCountry;
    }

    public double getAmountSell() {
        return amountSell;
    }

    public void setAmountSell(double amountSell) {
        this.amountSell = amountSell;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + userId + '\'' +
                ", currencyFrom=" + currencyFrom +
                ", currencyTo=" + currencyTo +
                ", amountBuy=" + amountBuy +
                ", amountSell=" + amountSell +
                ", rate=" + rate +
                ", timePlaced=" + timePlaced +
                ", originatingCountry=" + originatingCountry +
                '}';
    }
}
