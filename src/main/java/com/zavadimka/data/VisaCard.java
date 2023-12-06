package com.zavadimka.data;

public class VisaCard extends Card {

    public VisaCard() {
        super(PaymentSystem.VISA);
    }


    protected boolean isCountryValidForThisCard(Country country) {
        // VisaCard работает везде, возвращаем true в любом случае
        return true;
    }
}
