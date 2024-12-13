package org.example.design.Design_Pattern.structural.facade_pattern;

public class CalculateTaxFacade {

    public Double calculateTaxForEmployee(Double ctc, boolean isOnNewRegime){

        if(isOnNewRegime){
            NewTaxRegime newTaxRegime = new NewTaxRegime();
            return newTaxRegime.calculateAnnualTax(ctc);
        }else {
            OldTaxRegime oldTaxRegime = new OldTaxRegime();
            return oldTaxRegime.calculateAnnualTax(ctc);
        }

    }

}
