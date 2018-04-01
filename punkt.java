public class punkt {
    //klasa z informacjami o pkt materialnym
    private double masa;
    public void setMasa(double m){
        //akcesor z kontrola wartosci, masa nie moze byc ujemna ani zerowa
        if(m>0) {
            masa=m;
        }
        else {
            masa=1;
        }
    }
    public double getMasa(){
        return masa;
    }
    public double moment_bezwladnosci(){
        int I=0;
        return I;
    }
    public double tw_Steinera(double x){
        double I=moment_bezwladnosci()+masa*x*x;
        return I;
    }
    public void opis_obiektu(){
        System.out.println("Punkt materialny");
    }
    public punkt(double m){
        //konstruktor umozliwiajacy podanie masy
        setMasa(m);
    }
    public punkt(){
        //konstruktor domyslny, masa rowna 1,
        setMasa(1);
    }
    public void info(){
    }
    public static void main(String[] args){
    }
}