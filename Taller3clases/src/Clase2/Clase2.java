package Clase2;
public class Clase2 {
   public int a2 = 5;
   public String b2 = "Estiben Beltran clase 2 usando String";
   public double c2 = 5;
   public float d2 = 0.5f;
   public char e2 = 6;
   public int aa2(){
       return 8;
       /**
        * devuelve un valor int a la clase 1
        */
   }
   public String bb2(){
       return "Esta funcionando";
       /**
        * devuelve un mensaje String a la clase 1
        */
   }
   public void cc2(){
       System.out.println("Clase 1");
       /**
        * solo devuelve un mensaje void a la clase 1
        */
   }
   public float dd2(){
       return 0.8f;
       /**
        * devuelve un valor float a la clase 1
        */
   }
   public double ee2(){
    return 1000; 
        /**
        * devuelve un valor double a la clase 1
        */
   }
   @Override
   public String toString(){
       return "aqui se llama el metodo toString de la clase 2";
   }
}
