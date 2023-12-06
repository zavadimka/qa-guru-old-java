package com.zavadimka.data;

public class MirCard extends Card {

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return country == Country.RU;
    }
}
