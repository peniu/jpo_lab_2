public class kula extends punkt {
    private double promien;
    public void setPromien(double r){
        {
            //akcesor z kontrola wartosci, promien musi byc dodatni
            if(r>0) {
                promien=r;
            }
            else {
                promien=1;
                System.out.println("Ustawiono promien 1, poniewaz nie moze byc on ujemny ani zerowy");
            }
        }
    }
    public double getPromien(){
        return promien;
    }
    public kula(double m, double r){
        //konstruktor uzywajacy parametrow superklasy
        super(m);
        setPromien(r);
    }
    public kula(){
        //konstruktor domyslny
        super();
        setPromien(1);
    }
    public void opis_obiektu(){
        System.out.println("Kula");
    }
    public double moment_bezwladnosci(){
        double I=2*(getMasa()*getPromien()*getPromien())/5;
        return I;
    }
    public void info(){
        opis_obiektu();
        System.out.println("Masa: "+getMasa());
        System.out.println("Promien: "+getPromien());
        System.out.println("Moment bezwladnosci: "+moment_bezwladnosci());
    }
    public static void main(String[] args) {
    }
}
