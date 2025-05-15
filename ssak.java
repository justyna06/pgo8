public class ssak extends zwierzeta{
    private String futro;

    public ssak(String nazwa, int wiek, String futro) {
        super(nazwa, wiek);
        this.futro = futro;
    }

    public String wydajOdglosJedzenia() {
        return "omniomniom";
    }

    @Override
    public String wydajDzwiek() {
        return "rawr";
    }

    @Override
    public String poruszajSie() {
        return "tup tup tup tup tup";
    }
}
