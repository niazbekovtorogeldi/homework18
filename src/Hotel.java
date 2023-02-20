public class Hotel implements Deictvie {
    private int projivaet;
    private int nomerge;
    int a= 2;
    int b = 5000;

    public int summa(){
        return a*b;
    }



    public Hotel(int projivaet, int nomerge) {
        this.projivaet = projivaet;
        this.nomerge = nomerge;
    }

    public int getProjivaet() {
        return projivaet;
    }

    public void setProjivaet(int projivaet) {
        this.projivaet = projivaet;
    }

    public int getNomerge() {
        return nomerge;
    }

    public void setNomerge(int nomerge) {
        this.nomerge = nomerge;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "projivaet=" + projivaet +
                ", kvorplata=" + nomerge +",общая сумма облаты="+summa()+
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
