package com.teachmeskills.lesson_9.task_3.card.impl;

import com.teachmeskills.lesson_9.task_3.card.BaseCard;

public class MasterCard extends BaseCard {

    public MasterCard(int cardNum, int CVC, int cardAmount, long cardId, String currency, double limit) {
        super(cardNum, CVC, cardAmount, cardId, currency, limit);
    }
}