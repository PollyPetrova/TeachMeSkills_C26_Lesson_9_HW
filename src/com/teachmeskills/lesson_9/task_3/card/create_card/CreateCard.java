package com.teachmeskills.lesson_9.task_3.card.create_card;

import com.teachmeskills.lesson_9.task_3.card.BaseCard;
import com.teachmeskills.lesson_9.task_3.card.impl.BelCard;
import com.teachmeskills.lesson_9.task_3.card.impl.MasterCard;
import com.teachmeskills.lesson_9.task_3.card.impl.VisaCard;

public class CreateCard {

    public static BaseCard createCard(long whatCard){

        BaseCard baseCard;
        if(whatCard==1){
            return new BelCard(111222, 159, 15000, 1, "BYN", 1500);
        }
        else if(whatCard==2){
            return new BelCard(222333, 258, 100, 2, "BYN", 1500);
        }
        else if(whatCard==3){
            return new MasterCard(333444, 357, 10, 3, "BYN", 100);
        }
        else if(whatCard==4){
            return new VisaCard(444555, 456, 250000, 4, "USD", 2000);
        }
        else if(whatCard==5){
            return new MasterCard(555666, 654, 2500, 5, "BYN", 100);
        }else {
            System.out.println("Mistake in creating cards!");
            return null;
        }

    }

}
