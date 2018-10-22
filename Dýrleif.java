public class Dýrleif {
  public static void main(String[] args) {
    System.out.println("Halló hvað heitir þú? ");
    String input = StdIn.readString();
    String Dýrleif = "Dýrleif";

    if(input.equals(Dýrleif) || input.equals("Dyrleif")){
      System.out.println("Ég elska þig");
    }
    else{
      System.out.println("Fokkaðu þér þú ert ekki Dýrleif");
    }
  }
}
