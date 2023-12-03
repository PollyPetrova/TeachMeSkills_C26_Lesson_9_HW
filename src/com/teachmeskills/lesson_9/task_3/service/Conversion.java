package com.teachmeskills.lesson_9.task_3.service;

import com.teachmeskills.lesson_9.task_3.card.BaseCard;

public class Conversion {

    public static double conversion(BaseCard fromCurrency, BaseCard toCurrency){
        double conversion=1;
        if(fromCurrency.getCurrency().equals("BYN") && toCurrency.getCurrency().equals("USD")){
            return conversion=0.32;
        } else if (fromCurrency.getCurrency().equals("USD") && toCurrency.getCurrency().equals("BYN")) {
            return conversion=3.2;
        }return conversion;
    }

}
