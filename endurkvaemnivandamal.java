public class endurkvaemnivandamal {

  public static int endurk(int n) {
// vitlaust:   if (n <= 0) return 0;
/*lagfæring:*/ if (n<= 0) return 1;
               else return n * endurk(n-1);
  }

  public static void main(String[] args) {
    int x = 4;
    System.out.println(endurk(x));
  }
}
/* fallið fer frá upphafsgildi og
rekur sig niður alltaf um -1 þangað til að n=0 en þá er skilað 0
síðan rekur forritið sig upp og inntakið er alltaf 0
en þá skilar það alltaf núllgildi og útkoman verður 0.
Í staðinn væri hægt að hafa skilagildi 1. Þá koma mismunandi niðurstöður.*/
