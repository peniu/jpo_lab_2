public class punkt {
    //klasa z informacjami o pkt materialnym
    private double masa;
    private double X,Y,Z;
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
    //obsluga wspolrzednych punktu, nieuzywana
    public void setX(double x){
        X=x;
    }
    public void setY(double y){
        X=y;
    }
    public void setZ(double z){
        X=z;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    public double getZ(){
        return Z;
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
        //konstruktor umozliwiajacy podanie masy, wspolrzedne zerowe
        setMasa(m);
        setX(0);
        setY(0);
        setZ(0);
    }
    public punkt(){
        //konstruktor domyslny, masa rowna 1, wspolrzedne zerowe
        setMasa(1);
        setX(0);
        setY(0);
        setZ(0);
    }
    public punkt(double m, double x, double y, double z){
        //konstruktor umozliwiajacy podanie masy i wspolrzednych punktu
        setMasa(m);
        setX(x);
        setY(y);
        setZ(z);
    }
    public void info(){
    }
    public static void main(String[] args){
    }
}