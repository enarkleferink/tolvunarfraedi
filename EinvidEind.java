public class EinvidEind{
  public static int einvidEind(int n){
 /* hermir eftir eind sem ferðast um í einvíðu rúmi,
    þ.e. á heiltölu talnalínunni.
    Ef eindin er í sæti i þá eru helmingslíkur á að hún fari
    til vinstri (þ.e. í sæti i-1) og helmingslíkur á að hún fari
    til hægri (þ.e. í sæti i+1). Sæti 0 er speglandi veggur,
    þannig að ef eindin er í sæti 0 þá getur hún bara farið til hægri
    í næsta skrefi. Lokamarkið er sæti n á talnalínunni.
    Ef eindin kemst þangað þá hættir hermunin og fallið skilar fjölda
    skrefa sem það tók eindina að komast á leiðarenda.                  */
    int stada=1;
    int count=0;
    while (stada<n){
      if (stada==1) {
        stada++;
      }
      else if (Math.random()<0.5) {
        stada--;
      }
      else{
        stada++;
      }
      count++;
    }
    return count;
  }
  public static void main(String[] args) {
    int T = Integer.parseInt(args[0]); //Fjöldi hermanna
    int n = Integer.parseInt(args[1]); //Endastöð eindar
    int summa = 0;
    for (int i=0; i<T; i++) {
      summa += einvidEind(n);
    }
    StdOut.printf("Meðalfjöldi fyrir n=%d: ", n);
    StdOut.print(summa/T + "\n");
  }
}
