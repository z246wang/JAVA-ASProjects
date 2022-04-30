package com.example.mcalc;

public class MortgageModel {
    private double principle;
    private int amortization;
    private double interest;

    public MortgageModel(String p, String a, String i) {
        this.principle = Double.parseDouble(p);
        this.amortization = Integer.parseInt(a);
        this.interest = Double.parseDouble(i);
    }

    public String computePayment() {
        double numerator = this.interest / 100 / 12 * this.principle;
        double denominator = 1 - Math.pow((1 + this.interest / 100 / 12), -this.amortization * 12);
        double result = numerator / denominator;
        return "$" + String.format("%,.2f" , result);
    }
}
