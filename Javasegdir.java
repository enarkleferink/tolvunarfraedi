public class Javasegdir {

    public static void main(String[] args) {

// Svar við dæminu fæst úr output-inu :)
      
      System.out.println("2 / (3 / 2)  gefur: " + 2/(3/2) );
      	System.out.println("Fyrst er reiknað innan svigans, en þar sem það eru" + 
                         " int breytur gefur 3/2 ekki 1.5 heldur 1. Síðan reiknast 2/1 sem er vitaskuld 1");
        System.out.println();
      System.out.println("2/3/2  gefur: " + 2/3/2 );
        System.out.println("Röð aðgerða er eins og í venjulegri stærðfræði. Fyrst er reiknað 2/3 sem er 0 þar sem þetta eru int breytur og 0/3 er 0.");
        System.out.println();
      System.out.println("\"2\" + (2 + 2)  gefur: " + "2" + (2 + 2) ); 
        System.out.println("Fyrst reiknast innan sviga 2+2=4. Síðan er \"2\" prentað og þar sem það er strengur breytir Java 4 í \"4\"");
        System.out.println();
      System.out.println("\"2\" + 2 + 2  gefur: " + "2" + 2 + 2 ); 
        System.out.println("Fyrst er \"2\" prentað og þar sem það er strengur breytir Java næsta tvist í streng og "+
                           "einnig þarnæsta sem leggst þá við strenginn \"2\" sem er þá kominn");
    }
}
