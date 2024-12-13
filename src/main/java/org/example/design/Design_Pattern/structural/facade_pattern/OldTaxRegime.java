package org.example.design.Design_Pattern.structural.facade_pattern;

public class OldTaxRegime implements CalculateTax{
    @Override
    public double calculateAnnualTax(double ctc) {

        if(ctc<=80000){
            return 0.0;//0%
        }else if(ctc>80000 && ctc<=120000){
            return 8.0;//8%
        } else if (ctc>120000 && ctc<=160000) {
            return 12.0;//12%
        } else if (ctc>160000 && ctc<=200000) {
            return 15.0;//15%
        }else{
            return 1.0;//consider error case
        }

    }
}
