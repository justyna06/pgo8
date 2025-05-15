public class ptak extends zwierzeta {
    private String kolorPior;

    public ptak(String nazwa, int wiek, String kolorPior) {
        super(nazwa, wiek);
        this.kolorPior = kolorPior ;
    }

    public String obsrajPassata() {
        return "Brudzi passata sąsiada";
    }

    @Override
    public String wydajDzwiek() {
        return "kwek";
    }

    @Override
    public String poruszajSie() {
        return "plep plep";
    }
}
