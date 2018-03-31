public class walec extends punkt {
    private double promien;
    private double H;
    public void setH(double h){
        //akcesor z kontrola wartosci, wysokosc musi byc dodatnia
        if(h>0) {
            H=h;
        }
        else {
            H=1;
            System.out.println("Ustawiono wysokosc 1, poniewaz nie moze byc ona ujemna ani zerowa");
        }
    }
    public double getH(){
        return H;
    }
    public void setPromien(double r){
        {
            //akcesor z kontrola wartosci, promien musi byc dodatni
            if(r>0) {
                promien=r;
            }
            else {
                promien=1;
                System.out.println("Ustawiono promien 1, poniewaz nie moze byc ona ujemny ani zerowy");
            }
        }
    }
    public double getPromien(){
        return promien;
    }
    public walec(double m, double r, double h){
        //konstruktor pozwalajacy przypisac parametry
        super(m);
        setPromien(r);
        setH(h);
    }
    public walec(){
        //konstruktor domyslny
        super();
        setPromien(1);
        setH(1);
    }
    public void opis_obiektu(){
        System.out.println("Walec");
    }
    public double moment_bezwladnosci(){
        double I=(getMasa()*getPromien()*getPromien())/2;
        return I;
    }
    public void info(){
        opis_obiektu();
        System.out.println("Masa: "+getMasa());
        System.out.println("Promien podst: "+getPromien());
        System.out.println("Wysokosc: "+getH());
        System.out.println("Moment bezwladnosci: "+moment_bezwladnosci());
    }
    public static void main(String[] args) {
    }
}
