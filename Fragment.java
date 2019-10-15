package sk.itsovy.ladislavracz;

public class Fragment {
    public Fragment(int numerator,int denominator){
        if (denominator==0)
           denominator=1;
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public Fragment(Fragment other){
        numerator=other.getNumerator();
        denominator=other.getDenominator();
    }
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private int numerator;

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private int denominator;
    public void changeToBasocShape(){
        int commonDivisor=getTheLargestCommonDivisor();
        numerator=numerator/commonDivisor;
        denominator=denominator/commonDivisor;
    }
    public void extendFragment(int value){
        if(value!=0){
        }
    }
    public double getRealValue(){
        return 0;
    }
    public void reverse(){
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }
    public void opposite(){
        numerator*=-1;
    }
    public Fragment copy(){
        Fragment newFragment=new Fragment(numerator, denominator);
        return newFragment;
    }
    private int getTheLargestCommonDivisor(){
        /*if(numerator<denominator)
        commonDivisor=numerator;
        else
        commonDivisor=denominator;
        namiesto if pouziem ternarny operator

         */
        int absNumerator=Math.abs(numerator);
        int absDenominator=Math.abs(denominator);
        int commonDivisor=absNumerator<absDenominator?absNumerator:absDenominator;
        while (absNumerator÷commonDivisor!=0 || absDenominator÷commonDivisor!=0){
            commonDivisor--;
        }
        return commonDivisor;
    }
    public boolean isFragmentInBasicShape(){
        if(getTheLargestCommonDivisor()==1){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString()
    {
        return numerator+" / "+denominator;
    }
}
