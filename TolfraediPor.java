// PRÓFDÆMI 2017!!

public class TolfraediPor {
  public static void main(String[] args) {
    int[] Studlar = new int[(args.length)/2];
    double[] Stok = new double[(args.length)/2];

	  int j = 0;
	  int l = 0;

    int n = 0;

	  for (int i=0; i<args.length; i+=2) {
	    n+= Integer.parseInt(args[i]);
	    Studlar[j] = Integer.parseInt(args[i]);
	    j++;
	  }
	  for (int s=1; s<args.length; s+=2) {
	    Stok[l] = Double.parseDouble(args[s]);
	    l++;
    }

    double[] a = new double[n];
    int stada = 0;
    for (int k=0; k<Studlar.length; k++) {
      for (int h=0; h<Studlar[k]; h++){
        a[stada] = Stok[k];
        stada++;
      }
    }

    double summa = 0;
    double max = a[0];
    for (int t=0; t<a.length; t++) {
      summa += a[t];
      if (a[t]>max) {
        max = a[t];
      }
        }
    System.out.println("Heildarsumma: " + summa);
    System.out.println("Heildarfjöldi gilda: " + n);
    System.out.println("Meðaltal: " + summa/n);
    System.out.println("Stærsta gildi: " + max);

  }
}
