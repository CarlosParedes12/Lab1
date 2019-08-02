package laboratorioRep;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class LaboratorioRep {
       
       Scanner sc= new Scanner (System.in);
       int a, b, c, r, q, w, next;
       String y, z, x;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LaboratorioRep west = new LaboratorioRep();
       Scanner sc= new Scanner (System.in);
       int op;
       
       do{
           System.out.println("1.IDE\n2.Variables/operadores\n3.Condicionales\n4.Ciclos\n5.Arreglos\n6.Procedimientos\n7.Salir");
           System.out.println("Operacion: ");
           op = sc.nextInt();
           switch(op){
               case 1:
                    west.mostra();
                   break;
               case 2:
                   west.variable();
                   break;
               case 3:
                   west.condicion();
                   break;
               case 4:
                   west.ciclo();
                   break;
               case 5:
                   west.arreglo();
               case 6:
                   System.out.println("Se utilizaron funciones XD");
                   break;
               case 7:
                   System.out.println("");
                   break;

                   
           
       }
    }while(op!=7);}
    
    public void mostra(){
         System.out.println("Definicion de IDE\n");
                   System.out.println("Un entorno de desarrollo integrado o entorno de desarrollo interactivo, en inglés Integrated Development Environment (IDE), es una\n"
                           + " aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software.");
    }
    public void variable(){
        System.out.println("Declare lo que se le pide, por favor");
        System.out.println("Ingrese el numero 1, guardado en a: "); a= sc.nextInt();
        System.out.println("Ingrese el numero 2, guardado en b: "); b= sc.nextInt();
        System.out.println("Ingrese el numero 3, guardado en c: "); c= sc.nextInt();
        System.out.println("\n");
        r=a+c;
        System.out.println("Suma numero 1 y 3: "+r);
        q=r-b;
        System.out.println("Resta del resultado menos numero 2: "+q);
        w=a+b+c;
        System.out.println("Suma de los tres datos: "+w);
                if(r<q || q<w){
            System.out.println("de los resultados :"+q);
        }
        System.out.println("Continuar: 1.si/2.no"); while(next!=2);
}
    public void condicion(){
                   System.out.println("Trabajando condicionales:\n");
                   System.out.println("Ingrese 3 datos:\n");
                   System.out.println("Dato 1: "); a=sc.nextInt();
                   System.out.println("Dato 2: "); b=sc.nextInt();
                   System.out.println("Dato 3: "); c=sc.nextInt();
                   System.out.println("Se compara el numero 1 con el 2 y aparecera el mayor");
                   if (a>b){
                       System.out.println("El dato 1 igual a: "+a+" es mayor que b "+b);
                   }else{
                       System.out.println("El dato 2 igual b: "+b+" es mayor que a "+a);
                   }
    }
    public void ciclo(){
        System.out.println("Ingrese el recorrido del ciclo: ");
        int recorrido=sc.nextInt();
        for (int i=0; i<recorrido; i++){
            i=i*i++;
        }
    }
    public void arreglo(){
        int arreglo[] = {1, 5, 8, 7, 9};
        int arreglo2[]; arreglo2 = new int [5];
        int arreglo3[]; arreglo3 = new int [5];
        System.out.println("Ingrese 5 valores numericos al arreglo:");
        for (int i=0; i<arreglo2.length; i++){
            System.out.println("Valor "+(i+1)); arreglo2[i]=sc.nextInt();
        }
        for (int j=0; j<arreglo2.length; j++){
            arreglo3[j]= arreglo[j]+arreglo2[j];
        }
        for (int i=0; i<arreglo.length; i++){
            System.out.println(arreglo3[i]+"");
        }
    }
    }