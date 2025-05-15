public class gad extends zwierzeta {
    private int iloscNog;

    public gad(String nazwa, int wiek, int iloscNog) {
        super(nazwa, wiek);
        this.iloscNog = iloscNog;
    }

    public String zjedzCzłowieka(){
        return "Zjada Człowieka";
    }

    @Override
    public String wydajDzwiek() {
        return "mlem";
    }

    @Override
    public String poruszajSie() {
        return "tap tap tap tap tap";
    }
}
