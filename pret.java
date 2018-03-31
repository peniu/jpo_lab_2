public class pret extends punkt {
    private double L;
    public void setL(double l){
        {
            //akcesor z kontrola wartosci, dlugosc preta musi byc dodatnia
            if(l>0) {
                L=l;
            }
            else {
                L=1;
                System.out.println("Ustawiono dlugosc 1, poniewaz nie moze byc ona ujemna ani zerowa");
            }
        }
    }
    public double getL(){
        return L;
    }
    public pret(double m, double l){
        //konstruktor uzywajacy parametrow superklasy
        super(m);
        setL(l);
    }
    public pret(){
        //konstruktor domyslny
        super();
        setL(1);
    }
    public void opis_obiektu(){
        System.out.println("Pret");
    }
    public double moment_bezwladnosci(){
        double I=(getMasa()*getL()*getL())/12;
        return I;
    }
    public void info(){
        opis_obiektu();
        System.out.println("Masa: "+getMasa());
        System.out.println("Dlugosc: "+getL());
        System.out.println("Moment bezwladnosci: "+moment_bezwladnosci());
    }
    public static void main(String[] args) {
    }
}
