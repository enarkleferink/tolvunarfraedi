public class Sanngildi {  
    public static void main(String[] args) {  
        boolean sanngildi = Math.sqrt(2.0)*Math.sqrt(2.0)==2.0;
        double utkoma = Math.sqrt(2.0)*Math.sqrt(2.0);
        System.out.println(sanngildi);
        System.out.println("Það kemur ekki 2 út eins og maður mætti halda því Math.sqrt er námundun við óræðu töluna. " 
        + "Þetta margfeldi verður því ekki nákvæmt. Margfeldið var " + utkoma + ". ");
    }  
}  