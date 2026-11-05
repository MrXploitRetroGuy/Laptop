
public class Laptop
{
    // Attribute
    private String hersteller = "Lenovo";
    private int kosten = 1000;
    private boolean neu = true;

    // Konstruktor mit allen Attributen
    public Laptop(String neuHersteller, int neuKosten, boolean neuNeu)
    {
        hersteller = neuHersteller;
        kosten = neuKosten;
        neu = neuNeu;
    }

    // Konstruktor mit Hersteller und neu
    public Laptop(String neuHersteller, boolean neuNeu)
    {
        hersteller = neuHersteller;
        neu = neuNeu;
    }

    // Standardkonstruktor
    public Laptop()
    {
    }

    // Getter und Setter für Hersteller
    public String getHersteller()
    {
        return hersteller;
    }

    public void setHersteller(String neuHersteller)
    {
        hersteller = neuHersteller;
    }

    // Getter und Setter für Kosten
    public int getKosten()
    {
        return kosten;
    }

    public void setKosten(int neuKosten)
    {
        kosten = neuKosten;
    }

    // Getter und Setter für neu
    public boolean getNeu()
    {
        return neu;
    }

    public void setNeu(boolean neuNeu)
    {
        neu = neuNeu;
    }
}
