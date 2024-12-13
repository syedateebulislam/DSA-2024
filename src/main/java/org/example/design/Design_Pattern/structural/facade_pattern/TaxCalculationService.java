package org.example.design.Design_Pattern.structural.facade_pattern;

public class TaxCalculationService {

    public static void main(String[] args) {

        double ctc = 100000.0;
        boolean isOnNewRegime = false;

        CalculateTaxFacade calculateTaxFacade = new CalculateTaxFacade();
        double taxPercentage = calculateTaxFacade.calculateTaxForEmployee(ctc,isOnNewRegime);

        if (taxPercentage == 1.0){
            System.out.println("Some error occurred during calculation");
        }else{
            String taxRegime = (isOnNewRegime) ? "New":"Old";
            System.out.println("Total income tax liability - \n" + ((ctc/100)*taxPercentage) +
                    " with " + taxPercentage + "% tax as per " + taxRegime + " Tax Regime.");
        }


    }

}
