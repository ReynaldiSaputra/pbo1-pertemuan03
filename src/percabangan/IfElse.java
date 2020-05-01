package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Sadar diri astaga");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, angsul jer : "+angsul);
        }else{
            System.out.println("Uang pas hmm");
        }
    }
}
