public abstract class zwierzeta {

    private String nazwa;
    private int wiek;

    public zwierzeta(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public abstract String wydajDzwiek();

    public abstract String poruszajSie();

    public void wyswietlInfo(){
        System.out.println("Nazwa" + nazwa + "Wiek" + wiek);
    }

    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
