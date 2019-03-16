abstract class GeneralBank {
    public abstract double getSavingInterestRate();
    public abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {
    public double getSavingInterestRate() { return 0.04; }

    public double getFixedInterestRate() { return 0.085; }
}

class KotMBank extends GeneralBank {
    public double getSavingInterestRate() { return 0.06; }

    public double getFixedInterestRate() { return 0.09; }
}

class Prog1{
    public static void main(String[] args){
        ICICIBank ic = new ICICIBank();
        KotMBank kot = new KotMBank();
        System.out.println(ic.getSavingInterestRate()*100 + "%");
        System.out.println(ic.getFixedInterestRate()*100 + "%");
        System.out.println(kot.getSavingInterestRate()*100 + "%");
        System.out.println(kot.getFixedInterestRate()*100 + "%");
        GeneralBank gb1 = new ICICIBank();
        GeneralBank gb2 = new KotMBank();
        System.out.println(gb1.getSavingInterestRate()*100 + "%");
        System.out.println(gb1.getFixedInterestRate()*100 + "%");
        System.out.println(gb2.getSavingInterestRate()*100 + "%");
        System.out.println(gb2.getFixedInterestRate()*100 + "%");
    }
    
}