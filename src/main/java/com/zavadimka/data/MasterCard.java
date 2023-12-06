package com.zavadimka.data;

public class MasterCard extends Card implements iCard {

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        // MasterCard работает везде, возвращаем true в любом случае
        return true;
    }
}
