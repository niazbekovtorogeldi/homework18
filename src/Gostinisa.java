import java.awt.image.Kernel;
import java.util.Random;

public class Gostinisa implements Deictvie {
    private int projivaet;
    private int kvarplata;
    private int uslugi;
    int a = 3;
    int b= 4000;
    int c= 600;

    public int summaG(){
        return a*b;
    }
    public int summaG1(){
        return a*c;
    }

    public Gostinisa(int projivaet, int kvarplata, int uslugi) {
        this.projivaet = projivaet;
        this.kvarplata = kvarplata;
        this.uslugi = uslugi;
    }

    public int getProjivaet() {
        return projivaet;
    }

    public void setProjivaet(int projivaet) {
        this.projivaet = projivaet;
    }

    public int getKvarplata() {
        return kvarplata;
    }

    public void setKvarplata(int kvarplata) {
        this.kvarplata = kvarplata;
    }

    public int getUslugi() {
        return uslugi;
    }

    public void setUslugi(int uslugi) {
        this.uslugi = uslugi;
    }

    @Override
    public String toString() {
        return "Gostinisa{" +
                "projivaet=" + projivaet +
                ", kvarplata=" + kvarplata +
                ", uslugi=" + uslugi +", общая плата за гостиницу="+summaG()+",за услуги гостиницы="+summaG1()+
                '}';
    }

    @Override
    public void adamJashait() {

    }

    @Override
    public void kvarplata() {

    }

    @Override
    public void komUslugi() {

    }
}

