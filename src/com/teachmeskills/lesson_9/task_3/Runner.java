package com.teachmeskills.lesson_9.task_3;

import com.teachmeskills.lesson_9.task_3.card.BaseCard;
import com.teachmeskills.lesson_9.task_3.card.create_card.CreateCard;
import com.teachmeskills.lesson_9.task_3.client.Client;
import com.teachmeskills.lesson_9.task_3.service.Transfer;

import java.util.Scanner;

/**
 * Создайте программу для перевода с одной банковской карты клиента на его другую карту.
 * Данные для перевода задаются с консоли.
 * Есть клиент.
 * В системе храниться информация о имени, фамилии, номере паспорта, дате рождения клинета.
 * А так же его почтовый индекс, страна, город, улица и номер дома.
 * У клиента может быть банковская карта (одна или более).
 * Сделать метод для перевода суммы с одной краты на другую.
 * Каждая карта содержит номер карты, CVC/CVV, текущую сумму на карте, код(id) карты.
 * Карты могут быть трех видов: BelCard, MasterCard, VisaCard.
 * Для переводов существуют лимиты. Лимиты проверяются только для карты с которой делается перевод.
 * Для каждого типа карты существуют свои лимиты.
 * Карты могут быть в разной валюте - следовательно, предусмотреть конвертацию.
 * За перевод снимается коммисия (задается в процентах).
 * Предусмотреть различные проверки и валидации.
 * Сценарий для проверки:
 * с консоли вводится код(id) карты с... (например, 1)
 * с консоли вводится код(2) карты на... (например, 2)
 * с консоли вводится сумма перевода.
 * В результате работы программы выводится сообщение:
 * Имя-Фамилия клиента
 * Количество карт клиента
 * Карта 1 - сумма до перевода
 * Карта 1 - сумма после перевода
 * Карта 2 - сумма до перевода
 * Карта 2 - сумма после перевода
 * Комиссия за перевод.
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the code of the card from which the money will be transferred: ");
        long cardFrom= scanner.nextInt();


        System.out.println("Enter the code of the card on which the money will be transferred: ");
        long cardTo= scanner.nextInt();


        System.out.println("Enter sum of transfer: ");
        double sumToTransfer= scanner.nextDouble();

        Client client=new Client("Polina","Petrova","12345AW67","25/10/2003",200040,
                "Belarus","Brest",23);

        BaseCard baseCard1=CreateCard.createCard(cardFrom);;
        BaseCard baseCard2=CreateCard.createCard(cardTo);

        Transfer.transferService(baseCard1, baseCard2, sumToTransfer, client);

    }

}
