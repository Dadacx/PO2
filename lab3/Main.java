public class Main
{
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Pan Tadeusz","Adam Mickiewicz",344);
        System.out.printf("Tytuł: %s%n", ksiazka1.getTytul());
        System.out.printf("Autor: %s%n", ksiazka1.getAutor());
        
        ksiazka1.setLiczbaStron(-5);
        ksiazka1.setLiczbaStron(352);
        
        System.out.println(ksiazka1);
    }
}