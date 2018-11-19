/******************************************************************************
 *  Þýðing:   javac OliuLitun.java
 *  Keyrsla:  java OliuLitun mynd.jpg radius ljomaStig
 *
 *   Beinagrind að lausn á dæmi 5 í heimadæmum 11 í Tölvunarfræði 1
 *   Útfærir olíumálunarsíu (oil painting filter) á mynd.jpg.  Gefa þarf
 *   upp radíus í kringum hvern myndpunkt, en algengasta ljómastigið í
 *   nágrenninu ræður nýjum lit myndpunktsins.
 *
 *  % java OliuLitun mynd.jpg 3 20
 *
 ******************************************************************************/
import java.awt.Color;

public class OliuLitun {

  public static void main(String[] args) {
    Picture picInn = new Picture(args[0]);
    int radius = Integer.parseInt(args[1]);
    int fjoldiStiga = Integer.parseInt(args[2]);

    Picture picUt = new Picture(picInn);

    // Fyrir alla myndpunkta, sem ekki eru of nálægt jöðrum myndar
    for (int j = radius; j < picInn.height()-radius; j++) {
      for (int i = radius; i < picInn.width()-radius; i++) {
        // Fylki fyrir gildi í nágrenni (i, j)
        int[] ljomaFjoldi = new int[fjoldiStiga+1];    // Fjöldi punkta með tiltekið ljómastig
        int[] raudSumma = new int[fjoldiStiga+1];      // Summa rauð-gilda fyrir tiltekið ljómastig
        int[] graenSumma = new int[fjoldiStiga+1];     // Summa græn-gilda fyrir tiltekið ljómastig
        int[] blaSumma = new int[fjoldiStiga+1];       // Summa blá-gilda fyrir tiltekið ljómastig

        // Fyrir alla myndpunkta í tilteknum radíus frá myndpunkti (i, j)
        for (int rj = -radius; rj <= radius; rj++) {
          for (int ri = -radius; ri <= radius; ri++) {
          // Finna ljómastig þessa punktar
          Color lit = picInn.get(i+ri, j+rj);
          // **** Klára skipun (út frá fjoldiStiga og intensity-fallinu)
          // Telja hversu oft þetta ljómastig kemur fyrir í nágrenninu
          int ljomaStig = (int) (1.0*Luminance.intensity(lit)*(fjoldiStiga/255.0));
          // **** Hækka teljara fyrir þetta ljomaStig
          ljomaFjoldi[ljomaStig]++;
          // **** Summa RGB-litagildi fyrir þetta ljómaStig
          raudSumma[ljomaStig]+=lit.getRed();
          graenSumma[ljomaStig]+=lit.getGreen();
          blaSumma[ljomaStig]+=lit.getBlue();
          //
          //...
          //

          }
        }

    // Finna hvaða ljómastig er algengast
    int ljomiMax = 0;
    int kMax = 0;
    int N = ljomaFjoldi.length;
    for (int m=0; m<N; m++){
      if (ljomaFjoldi[m]>ljomiMax){
        ljomiMax=ljomaFjoldi[m];
        kMax = m;
      }
    }
    // **** Finna hvaða ljómastig er algengast, setja í ljomiMax
    // **** og hvaða ljómastig það er (setja í kMax)

    //
    // ...
    //


    // Setja lit myndpunktar (i, j) sem meðallit litanna með
    //  algengasta ljómastigið
    // **** Fyrir hvern litaþátt (R, G, B) finna meðalgildi fyrir
    // **** algengengasta ljómastigið.
    // **** Búa til nýjan lit úr þeim þáttum
    int r = raudSumma[kMax]/ljomiMax;
    int g = graenSumma[kMax]/ljomiMax;
    int b = blaSumma[kMax]/ljomiMax;

    Color lit = new Color(r,g,b);
    picUt.set(i, j, lit);

      }
    }
  picInn.show();
  picUt.show();
  }
}
