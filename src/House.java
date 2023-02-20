public class House implements Deictvie {
    private int projivaet = 5;

    private  int uslugi = 700;
    int a = 5;
    int b=700;

    public int summa(){
        return a*b;
    }

    public House(int projivaet, int uslugi) {
        this.projivaet = projivaet;
        this.uslugi = uslugi;
    }

    public int getProjivaet() {
        return projivaet;
    }

    public void setProjivaet(int projivaet) {
        this.projivaet = projivaet;
    }

    public int getUslugi() {
        return uslugi;
    }

    public void setUslugi(int uslugi) {
        this.uslugi = uslugi;
    }

    @Override
    public String toString() {
        return "House{" +
                "projivaet=" + projivaet +
                ", uslugi=" + uslugi +",опласивают за услугу="+summa()+
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
