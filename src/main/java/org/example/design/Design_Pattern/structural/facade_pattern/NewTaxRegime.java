package org.example.design.Design_Pattern.structural.facade_pattern;

public class NewTaxRegime implements CalculateTax{


    @Override
    public double calculateAnnualTax(double ctc) {

        if(ctc<=50000){
            return 0.0;//0%
        }else if(ctc>50000 && ctc<=100000){
            return 10.0;//10%
        } else if (ctc>100000 && ctc<=150000) {
            return 15.0;//15%
        } else if (ctc>150000 && ctc<=200000) {
            return 20.0;//20%
        }else{
            return 1.0;//consider error case
        }

    }
}
