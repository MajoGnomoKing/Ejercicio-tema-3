public class jv {
    public static void main(String[] args) {
   coche micoche= new coche();
   micoche.AñadirPuerta();
   System.out.println(micoche.puertas);
    }
    
}

class coche {
    public int puertas = 2;
    public void AñadirPuerta(){
        this.puertas++;
    }
}