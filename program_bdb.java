import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class program_bdb {
        public static void main(String[] args) throws NumberFormatException, IOException{
            int flaga=0; //do sprawdzenia czy zakonczyc prace programu
            while(flaga==0) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Wybierz bryle: ");
                System.out.println("1.Walec");
                System.out.println("2.Kula");
                System.out.println("3.Pret");
                System.out.println("0.Zakoncz program");
                int c = Integer.parseInt(br.readLine());
                //wybor bryly, deklaracja zmiennych ktore wystepuja we wszystkich brylach
                double m;
                double x;
                switch (c) {
                    case 0:
                        flaga = 1;
                        System.out.println("Zegnaj.");
                        break;
                    case 1:
                        System.out.println("Wybrales walec.");
                        System.out.println("Podaj mase:");
                        m = Double.parseDouble(br.readLine());
                        System.out.println("Podaj promien podstawy:");
                        double r = Double.parseDouble(br.readLine());
                        System.out.println("Podaj wysokosc:");
                        double h = Double.parseDouble(br.readLine());
                        walec Walec = new walec(m, r, h);
                        System.out.println("M. bezwladnosci: " + Walec.moment_bezwladnosci());
                        System.out.println("Podaj odleglosc od nowej osi:");
                        x = Double.parseDouble(br.readLine());
                        System.out.println("M. bezwladnosci wzgledem nowej osi: " + Walec.tw_Steinera(x));
                        break;
                    case 2:
                        System.out.println("Wybrano kule.");
                        System.out.println("Podaj mase:");
                        m = Double.parseDouble(br.readLine());
                        System.out.println("Podaj promien:");
                        double rr = Double.parseDouble(br.readLine());
                        kula Kula = new kula(m,rr);
                        System.out.println("M. bezwladnosci: " + Kula.moment_bezwladnosci());
                        System.out.println("Podaj odleglosc od nowej osi:");
                        x = Double.parseDouble(br.readLine());
                        System.out.println("M. bezwladnosci wzgledem nowej osi: " + Kula.tw_Steinera(x));
                        break;
                    case 3:
                        System.out.println("Wybrano pret.");
                        System.out.println("Podaj mase:");
                        m = Double.parseDouble(br.readLine());
                        System.out.println("Podaj dlugosc:");
                        double dl = Double.parseDouble(br.readLine());
                        pret Pret = new pret(m,dl);
                        System.out.println("M. bezwladnosci: " + Pret.moment_bezwladnosci());
                        System.out.println("Podaj odleglosc od nowej osi:");
                        x = Double.parseDouble(br.readLine());
                        System.out.println("M. bezwladnosci wzgledem nowej osi: " + Pret.tw_Steinera(x));
                        break;
                    default:
                        System.out.println("Nieprawidlowy numer, sprobuj ponownie");
                        break;
                }
            }
        }
}
