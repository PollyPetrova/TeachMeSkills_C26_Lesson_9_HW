package com.teachmeskills.lesson_9.task_3.card;

public abstract class BaseCard {

    private int cardNum;
    private int CVC;
    private double cardAmount;
    private long cardId;
    private String currency;
    private double limit;



    public BaseCard(int cardNum, int CVC, double cardAmount, long cardId, String currency, double limit) {
        this.cardNum = cardNum;
        this.CVC = CVC;
        this.cardAmount = cardAmount;
        this.cardId = cardId;
        this.currency = currency;
        this.limit=limit;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public double getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getCommission() {
        return 0.8;
    }

}
