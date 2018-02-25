package principal;
import Clase1.Clase1;
import Clase2.Clase2;
import Clase3.Clase3;
/**
 *
 * @author Dairo estiben Beltran Martinez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase1 a1 = new Clase1();
        Clase1 a2 = new Clase1();
        Clase1 a3 = new Clase1();
        Clase2 b1 = new Clase2();
        Clase2 b2 = new Clase2();
        Clase2 b3 = new Clase2();
        Clase3 c1 = new Clase3();
        Clase3 c2 = new Clase3();
        Clase3 c3 = new Clase3();
        //int de las clases
        System.out.println("Valor de la clase 1 objeto 1 e int "+a1.a1);
        System.out.println("Valor de la clase 1 objeto 2 e int "+a2.a1);
        System.out.println("Valor de la clase 1 objeto 3 e int "+a3.a1);
        System.out.println("Valor de la clase 2 objeto 1 e int "+b1.a2);
        System.out.println("Valor de la clase 2 objeto 2 e int "+b2.a2);
        System.out.println("Valor de la clase 2 objeto 3 e int "+b3.a2);
        System.out.println("Valor de la clase 3 objeto 1 e int "+c1.a3);
        System.out.println("Valor de la clase 3 objeto 2 e int "+c2.a3);
        System.out.println("Valor de la clase 3 objeto 3 e int "+c3.a3);
        System.out.println("-----------------------------------------");
        //String de las clases
        System.out.println("Valor de la clase 1 objeto 1 String "+a1.b1);
        System.out.println("Valor de la clase 1 objeto 2 String "+a2.b1);
        System.out.println("Valor de la clase 1 objeto 3 String "+a3.b1);
        System.out.println("Valor de la clase 2 objeto 1 String "+b1.b2);
        System.out.println("Valor de la clase 2 objeto 2 String "+b2.b2);
        System.out.println("Valor de la clase 2 objeto 3 String "+b3.b2);
        System.out.println("Valor de la clase 3 objeto 1 String "+c1.b3);
        System.out.println("Valor de la clase 3 objeto 2 String "+c2.b3);
        System.out.println("Valor de la clase 3 objeto 3 String "+c3.b3); 
        System.out.println("-----------------------------------------");
        //double de las clases
        System.out.println("Valor de la clase 1 objeto 1 double "+a1.c1);
        System.out.println("Valor de la clase 1 objeto 2 double "+a2.c1);
        System.out.println("Valor de la clase 1 objeto 3 double "+a3.c1);
        System.out.println("Valor de la clase 2 objeto 1 double "+b1.c2);
        System.out.println("Valor de la clase 2 objeto 2 double "+b2.c2);
        System.out.println("Valor de la clase 2 objeto 3 double "+b3.c2);
        System.out.println("Valor de la clase 3 objeto 1 double "+c1.c3);
        System.out.println("Valor de la clase 3 objeto 2 double "+c2.c3);
        System.out.println("Valor de la clase 3 objeto 3 double "+c3.c3);
        System.out.println("-----------------------------------------");
        //float de las clases
        System.out.println("Valor de la clase 1 objeto 1 float "+a1.d1);
        System.out.println("Valor de la clase 1 objeto 2 float "+a2.d1);
        System.out.println("Valor de la clase 1 objeto 3 float "+a3.d1);
        System.out.println("Valor de la clase 2 objeto 1 float "+b1.d2);
        System.out.println("Valor de la clase 2 objeto 2 float "+b2.d2);
        System.out.println("Valor de la clase 2 objeto 3 float "+b3.d2);
        System.out.println("Valor de la clase 3 objeto 1 float "+c1.d3);
        System.out.println("Valor de la clase 3 objeto 2 float "+c2.d3);
        System.out.println("Valor de la clase 3 objeto 3 float "+c3.d3);
        System.out.println("-----------------------------------------");
        //char de las clases
        System.out.println("Valor de la clase 1 objeto 1 char "+a1.e1);
        System.out.println("Valor de la clase 1 objeto 2 char "+a2.e1);
        System.out.println("Valor de la clase 1 objeto 3 char "+a3.e1);
        System.out.println("Valor de la clase 2 objeto 1 char "+b1.e2);
        System.out.println("Valor de la clase 2 objeto 2 char "+b2.e2);
        System.out.println("Valor de la clase 2 objeto 3 char "+b3.e2);
        System.out.println("Valor de la clase 3 objeto 1 char "+c1.e3);
        System.out.println("Valor de la clase 3 objeto 2 char "+c2.e3);
        System.out.println("Valor de la clase 3 objeto 3 char "+c3.e3);
        //cambio de valores de los atributos
        //int
        a1.a1 = 14;
        a2.a1 = 14;
        a3.a1 = 14;
        b1.a2 = 14;
        b2.a2 = 14;
        b3.a2 = 14;
        c1.a3 = 14;
        c2.a3 = 14;
        c3.a3 = 14;
        //String
        a1.b1 = "cambio de mensaje a string";
        a2.b1 = "cambio de mensaje a string";
        a3.b1 = "cambio de mensaje a string";
        b1.b2 = "cambio de mensaje a string";
        b2.b2 = "cambio de mensaje a string";
        b3.b2 = "cambio de mensaje a string";
        c1.b3 = "cambio de mensaje a string";
        c2.b3 = "cambio de mensaje a string";
        c3.b3 = "cambio de mensaje a string";
        //double
        a1.c1 = 14000;
        a2.c1 = 14000;
        a3.c1 = 14000;
        b1.c2 = 14000;
        b2.c2 = 14000;
        b3.c2 = 14000;
        c1.c3 = 14000;
        c2.c3 = 14000;
        c3.c3 = 14000;
        //float
        a1.d1 = 14.1f;
        a2.d1 = 14.1f;
        a3.d1 = 14.1f;
        b1.d2 = 14.1f;
        b2.d2 = 14.1f;
        b3.d2 = 14.1f;
        c1.d3 = 14.1f;
        c2.d3 = 14.1f;
        c3.d3 = 14.1f;
        //char
        a1.e1 = 65;
        a2.e1 = 65;
        a3.e1 = 65;
        b1.e2 = 65;
        b2.e2 = 65;
        b3.e2 = 65;
        c1.a3 = 65;
        c2.e3 = 65;
        c3.e3 = 65;
        //muestreo de datos
        //int de las clases
        System.out.println("Valor de la clase 1 objeto 1 e int "+a1.a1);
        System.out.println("Valor de la clase 1 objeto 2 e int "+a2.a1);
        System.out.println("Valor de la clase 1 objeto 3 e int "+a3.a1);
        System.out.println("Valor de la clase 2 objeto 1 e int "+b1.a2);
        System.out.println("Valor de la clase 2 objeto 2 e int "+b2.a2);
        System.out.println("Valor de la clase 2 objeto 3 e int "+b3.a2);
        System.out.println("Valor de la clase 3 objeto 1 e int "+c1.a3);
        System.out.println("Valor de la clase 3 objeto 2 e int "+c2.a3);
        System.out.println("Valor de la clase 3 objeto 3 e int "+c3.a3);
        System.out.println("-----------------------------------------");
        //String de las clases
        System.out.println("Valor de la clase 1 objeto 1 String "+a1.b1);
        System.out.println("Valor de la clase 1 objeto 2 String "+a2.b1);
        System.out.println("Valor de la clase 1 objeto 3 String "+a3.b1);
        System.out.println("Valor de la clase 2 objeto 1 String "+b1.b2);
        System.out.println("Valor de la clase 2 objeto 2 String "+b2.b2);
        System.out.println("Valor de la clase 2 objeto 3 String "+b3.b2);
        System.out.println("Valor de la clase 3 objeto 1 String "+c1.b3);
        System.out.println("Valor de la clase 3 objeto 2 String "+c2.b3);
        System.out.println("Valor de la clase 3 objeto 3 String "+c3.b3); 
        System.out.println("-----------------------------------------");
        //double de las clases
        System.out.println("Valor de la clase 1 objeto 1 double "+a1.c1);
        System.out.println("Valor de la clase 1 objeto 2 double "+a2.c1);
        System.out.println("Valor de la clase 1 objeto 3 double "+a3.c1);
        System.out.println("Valor de la clase 2 objeto 1 double "+b1.c2);
        System.out.println("Valor de la clase 2 objeto 2 double "+b2.c2);
        System.out.println("Valor de la clase 2 objeto 3 double "+b3.c2);
        System.out.println("Valor de la clase 3 objeto 1 double "+c1.c3);
        System.out.println("Valor de la clase 3 objeto 2 double "+c2.c3);
        System.out.println("Valor de la clase 3 objeto 3 double "+c3.c3);
        System.out.println("-----------------------------------------");
        //float de las clases
        System.out.println("Valor de la clase 1 objeto 1 float "+a1.d1);
        System.out.println("Valor de la clase 1 objeto 2 float "+a2.d1);
        System.out.println("Valor de la clase 1 objeto 3 float "+a3.d1);
        System.out.println("Valor de la clase 2 objeto 1 float "+b1.d2);
        System.out.println("Valor de la clase 2 objeto 2 float "+b2.d2);
        System.out.println("Valor de la clase 2 objeto 3 float "+b3.d2);
        System.out.println("Valor de la clase 3 objeto 1 float "+c1.d3);
        System.out.println("Valor de la clase 3 objeto 2 float "+c2.d3);
        System.out.println("Valor de la clase 3 objeto 3 float "+c3.d3);
        System.out.println("-----------------------------------------");
        //char de las clases
        System.out.println("Valor de la clase 1 objeto 1 char "+a1.e1);
        System.out.println("Valor de la clase 1 objeto 2 char "+a2.e1);
        System.out.println("Valor de la clase 1 objeto 3 char "+a3.e1);
        System.out.println("Valor de la clase 2 objeto 1 char "+b1.e2);
        System.out.println("Valor de la clase 2 objeto 2 char "+b2.e2);
        System.out.println("Valor de la clase 2 objeto 3 char "+b3.e2);
        System.out.println("Valor de la clase 3 objeto 1 char "+c1.e3);
        System.out.println("Valor de la clase 3 objeto 2 char "+c2.e3);
        System.out.println("Valor de la clase 3 objeto 3 char "+c3.e3);
    }
    
}
