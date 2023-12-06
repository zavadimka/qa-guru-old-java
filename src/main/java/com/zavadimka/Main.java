package com.zavadimka;

import com.zavadimka.data.*;

import static com.zavadimka.data.Country.*;

public class Main {

    public static void main(String[] args) {
        
        String paymentSystem = "UNION_PAY";
        Card newCard = null;
        switch (paymentSystem){
            case "MASTERCARD":
                newCard = new MasterCard();
                break;
            case "MIR":
                newCard = new MirCard();
                break;
            case "UNION_PAY":
                newCard = new UnionPayCard();
                break;
            case "VISA":
                newCard = new VisaCard();
                break;
            default:
                System.out.println("Invalid payment system");
                break;
        }


        // Пример полиморфного кода
        SomeActions(newCard);
    }

    // Пример полиморфного кода
    public static void SomeActions(Card card){
        card.addBalance(120);
        card.getBalance();
        card.payInCountry(US, 50);
    }
}