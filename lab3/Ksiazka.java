public class Ksiazka
{
    private String tytul;
    private String autor;
    private int liczbaStron;
    
    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    
    public String getTytul() {
        return tytul;
    }
    public String getAutor() {
        return autor;
    }
    public int getLiczbaStron() {
        return liczbaStron;
    }
    public void setLiczbaStron(int liczbaStron) {
        if(liczbaStron > 0) {
            this.liczbaStron = liczbaStron;
        } else {
            System.out.printf("Niepoprawna liczba stron: %d%n", liczbaStron);
        }
    }
    @Override
    public String toString() {
        return "Ksiazka{tytul='" + tytul + "', autor='" + autor + "', liczbaStron=" + liczbaStron + "}";
    }
}