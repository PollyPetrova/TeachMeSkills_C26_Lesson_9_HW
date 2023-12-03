package com.teachmeskills.lesson_9.task_3.service;

import com.teachmeskills.lesson_9.task_3.card.BaseCard;
import com.teachmeskills.lesson_9.task_3.client.Client;

public class Transfer {

    public static void transferService(BaseCard cardFrom, BaseCard cardTo, double sumToTransfer, Client client){


        System.out.println(client.getName()+" "+client.getSurname());

        if(sumToTransfer<cardFrom.getLimit() && cardFrom.getCardId()!=cardTo.getCardId()){
            System.out.println("Card 1- amount before transaction: "+cardFrom.getCardAmount());
            cardFrom.setCardAmount(cardFrom.getCardAmount()-sumToTransfer);
            System.out.println("Card 1- amount after transaction: "+cardFrom.getCardAmount());

            System.out.println("Card 2- amount before transaction: "+cardTo.getCardAmount());
            cardTo.setCardAmount((cardTo.getCardAmount()+((sumToTransfer-sumToTransfer* cardFrom.getCommission()/100)* Conversion.conversion(cardFrom,cardTo))));
            System.out.println("Card 2- amount after transaction: "+cardTo.getCardAmount());
            System.out.println("The commission (0,8%) on your operation was: "+(sumToTransfer* cardFrom.getCommission()/100));
        }else if(cardFrom.getCardId()==cardTo.getCardId()) {
            System.out.println("You transfer money to the same card!");
        }else {
            System.out.println("You have exceeded the limit");
        }

    }

}
