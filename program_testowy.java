import java.util.*;
public class program_testowy{
    public static void main(String[] args) {
        Random generator = new Random();
        walec Walec = new walec(4,2,3);
        kula Kula = new kula(10,5);
        pret Pret = new pret(2,20);
        Walec.info();
        Kula.info();
        Pret.info();
        ArrayList<punkt> tab = new ArrayList<punkt>();
        for(int i=0;i<10;i++){
            int c=generator.nextInt(3);
            switch (c) {
                case 0:
                    tab.add(new walec(3 * i, i + 2, 2 * i + 3));
                    break;
                case 1:
                    tab.add(new kula(2 * i, 4 * i + 2));
                    break;
                case 2:
                    tab.add(new pret(i + 1, 5 * i+2));
                    break;
                default:
                    System.out.println("Blad");
                    break;
            }
            }
        for(int i=0;i<10;i++){
            tab.get(i).info();
        }
        for(int i=0;i<10;i++){
        System.out.println("M. bezwladnosci wzgledem osi oddalonej o 5: "+tab.get(i).tw_Steinera(5));
        }
    }
    }
