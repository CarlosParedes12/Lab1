
package labo;
import java.lang.Math;
import java.util.Scanner;
public class Clase {
    public Clase(){
        
    }
    Integer n1=0, n2=0, n3=0, n4=0;
        
        public void Igual(int x, int y){
            this.n1=x;
            this.n2=y;
            if (n1==n2){
                System.out.println("Numeros iguales");
            }else{
                System.out.println("Numeros diferentes");
            }
        }
        
        public void Mayor(int x, int y){
            this.n1=x;
            this.n2=y;
            if(n1<n2){
                System.out.println("Numero 2 es mayor: "+n2);
            }else{
                System.out.println("Numero 1 es mayor: "+n1);
            }
        }
        
       public void Menor(int x, int y){
            this.n1=x;
            this.n2=y;
            if(n1>n2){
                System.out.println("Numero 2 es menor: "+n2);
            }else{
                System.out.println("Numero 1 es menor: "+n1);
            }
        }
       
       public void EcuacionCuadratica(){
           double x, y, z, q;
           double potencia, r1, r2;
           Scanner sc = new Scanner(System.in);
           System.out.println("Ingrese numero a");
           x=sc.nextInt();
           System.out.println("Ingrese numero b");
           y=sc.nextInt();
           System.out.println("Ingrese numero c");
           z=sc.nextInt();
           potencia = Math.pow(y,2)-(4*x*z);
           r1=(-(y)-Math.sqrt(potencia)/2*x);
           r2=(-(y)+Math.sqrt(potencia)/2*x);
           System.out.println("resultado 1: "+r1);
           System.out.println("resultado 2: "+r2);
       }
       
       public void Multiplicacion(int x, int y){
           this.n1=x;
           this.n2=y;
           int Resultado;
           Resultado=x*y;
           System.out.println("Resultados de la multiplicacion: "+Resultado);
       }
       public void Suma(int x, int y){
           this.n1=x;
           this.n2=y;
           int Resultado;
           Resultado=x+y;
           System.out.println("Resultados de la Suma: "+Resultado);
       }
       public void Resta(int x, int y){
           this.n1=x;
           this.n2=y;
           int Resultado;
           Resultado=x-y;
           System.out.println("Resultados de la multiplicacion: "+Resultado);
       }
       public void Raiz(int x){
           this.n1=x;
           float Resultado;
           Resultado=(float) Math.sqrt(x);
           System.out.println("la raiz de "+x+" es :"+Resultado);
       }
       public void Division(int x, int y){
           this.n1=x;
           this.n2=y;
           float Resultado;
           Resultado=x/y;
           System.out.println("El divisor es: "+x+"\t el dividendo es: "+y+"\t Resultado: "+Resultado);
       }
       public void AND(int x, int y){
           this.n1=x;
           this.n2=y;
           if(x>3&&y>3){
               System.out.println("Los valores son mayores que tres");
           }else{
               System.out.println("Uno de los valores no cumple la condicion");
           }
       }
       public void OR(int x, int y){
           this.n1=x;
           this.n2=y;
           if(x>3||y>3){
               System.out.println("Un valor cumple la condicion");
           }else{
               System.out.println("Ningun valor cumple la condicion");
           }
       }
       public void NOT(int x){
           this.n1=x;
           if(x!=3){
               System.out.println("El valor no es igual a 3");
           }else{
               System.out.println("El valor es igual a tres");
           }
       }
       public void china(){
           Scanner sc=new Scanner (System.in);
           System.out.println("Cantidad numerica?");
           System.out.println("1.Unidad/t2.decena");
           int opcion;
           opcion=sc.nextInt();
           switch(opcion){
               case 1:
                   unidad();
                   break;
               case 2:
                   decena();
                   break;
           }
       }
       public void unidad(){
           Scanner sc=new Scanner (System.in);
           int a;
           System.out.println("Ingrese el numero: ");
           a=sc.nextInt();
           if(a==1){
               System.out.println(a+" - 壹");
           }
           if(a==2){
               System.out.println(a+" - 贰");
           }
           if(a==3){
               System.out.println(a+" - 叄");
           }
           if(a==4){
               System.out.println(a+" - 肆");
           }
           if(a==5){
               System.out.println(a+" - 伍");
           }
           if(a==6){
               System.out.println(a+" - 陸");
           }
           if(a==7){
               System.out.println(a+" - 柒");
           }
           if(a==8){
               System.out.println(a+" - 捌");
           }
           if(a==9){
               System.out.println(a+" - 玖");
           }
           if(a==0){
               System.out.println(a+" - 零");
           }
           if(a==10){
               System.out.println(a+" - 十");
           }
       }
       public void decena(){
           Scanner sc=new Scanner (System.in);
           int a, b;
           System.out.println("Ingrese la decena: ");
           a=sc.nextInt();
           System.out.println("Ingrese centena: ");
           b=sc.nextInt();
           if(a==1){
               if(b==1){
                   System.out.println("十一 ");
               }
               if(b==2){
                   System.out.println("十二 ");
               }
               if(b==3){
                   System.out.println("十三 ");
               }
               if(b==4){
                   System.out.println("十四 ");
               }
               if(b==5){
                   System.out.println("十五 ");
               }
               if(b==6){
                   System.out.println("十六 ");
               }
               if(b==7){
                   System.out.println("十七 ");
               }
               if(b==8){
                   System.out.println("十八 ");
               }
               if(b==9){
                   System.out.println("十九 ");
               }
           }
           if(a==2){
               if (b==0){
                   System.out.println("二十");
               }
               if (b==1){
                   System.out.println("二一");
               }
               if (b==2){
                   System.out.println("二二");
               }
               if (b==3){
                   System.out.println("二三");
               }
               if (b==4){
                   System.out.println("二四");
               }
               if (b==5){
                   System.out.println("二五");
               }
               if (b==6){
                   System.out.println("二六");
               }
               if (b==7){
                   System.out.println("二七");
               }
               if (b==8){
                   System.out.println("二八");
               }
               if (b==9){
                   System.out.println("二九");
               }
           }
           if(a==3){
               if (b==0){
                   System.out.println("三十");
               }
               if (b==1){
                   System.out.println("三一");
               }
               if (b==2){
                   System.out.println("三二");
               }
               if (b==3){
                   System.out.println("三三");
               }
               if (b==4){
                   System.out.println("三四");
               }
               if (b==5){
                   System.out.println("三五");
               }
               if (b==6){
                   System.out.println("三六");
               }
               if (b==7){
                   System.out.println("三七");
               }
               if (b==8){
                   System.out.println("三八");
               }
               if (b==9){
                   System.out.println("三九");
               }
           }
           if(a==3){
               if (b==0){
                   System.out.println("二十");
               }
               if (b==1){
                   System.out.println("二一");
               }
               if (b==2){
                   System.out.println("二二");
               }
               if (b==3){
                   System.out.println("二三");
               }
               if (b==4){
                   System.out.println("二四");
               }
               if (b==5){
                   System.out.println("二五");
               }
               if (b==6){
                   System.out.println("二六");
               }
               if (b==7){
                   System.out.println("二七");
               }
               if (b==8){
                   System.out.println("二八");
               }
               if (b==9){
                   System.out.println("二九");
               }
           }
           if(a==4){
               if (b==0){
                   System.out.println("四十");
               }
               if (b==1){
                   System.out.println("四一");
               }
               if (b==2){
                   System.out.println("四二");
               }
               if (b==3){
                   System.out.println("四三");
               }
               if (b==4){
                   System.out.println("四四");
               }
               if (b==5){
                   System.out.println("四五");
               }
               if (b==6){
                   System.out.println("四六");
               }
               if (b==7){
                   System.out.println("四七");
               }
               if (b==8){
                   System.out.println("四八");
               }
               if (b==9){
                   System.out.println("四九");
               }
           }
           if(a==5){
               if (b==0){
                   System.out.println("五十");
               }
               if (b==1){
                   System.out.println("五一");
               }
               if (b==2){
                   System.out.println("五二");
               }
               if (b==3){
                   System.out.println("五三");
               }
               if (b==4){
                   System.out.println("五四");
               }
               if (b==5){
                   System.out.println("五五");
               }
               if (b==6){
                   System.out.println("五六");
               }
               if (b==7){
                   System.out.println("五七");
               }
               if (b==8){
                   System.out.println("五八");
               }
               if (b==9){
                   System.out.println("五九");
               }
           }
           if(a==6){
               if (b==0){
                   System.out.println("六十");
               }
               if (b==1){
                   System.out.println("六一");
               }
               if (b==2){
                   System.out.println("六二");
               }
               if (b==3){
                   System.out.println("六三");
               }
               if (b==4){
                   System.out.println("六四");
               }
               if (b==5){
                   System.out.println("六五");
               }
               if (b==6){
                   System.out.println("六六");
               }
               if (b==7){
                   System.out.println("六七");
               }
               if (b==8){
                   System.out.println("六八");
               }
               if (b==9){
                   System.out.println("六九");
               }
           }
           if(a==7){
               if (b==0){
                   System.out.println("七十");
               }
               if (b==1){
                   System.out.println("七一");
               }
               if (b==2){
                   System.out.println("七二");
               }
               if (b==3){
                   System.out.println("七三");
               }
               if (b==4){
                   System.out.println("七四");
               }
               if (b==5){
                   System.out.println("七五");
               }
               if (b==6){
                   System.out.println("七六");
               }
               if (b==7){
                   System.out.println("七七");
               }
               if (b==8){
                   System.out.println("七八");
               }
               if (b==9){
                   System.out.println("七九");
               }
           }
           if(a==8){
               if (b==0){
                   System.out.println("八十");
               }
               if (b==1){
                   System.out.println("八一");
               }
               if (b==2){
                   System.out.println("八二");
               }
               if (b==3){
                   System.out.println("八三");
               }
               if (b==4){
                   System.out.println("八四");
               }
               if (b==5){
                   System.out.println("八五");
               }
               if (b==6){
                   System.out.println("八六");
               }
               if (b==7){
                   System.out.println("八七");
               }
               if (b==8){
                   System.out.println("八八");
               }
               if (b==9){
                   System.out.println("八九");
               }
           }
           if(a==9){
               if (b==0){
                   System.out.println("九十");
               }
               if (b==1){
                   System.out.println("九一");
               }
               if (b==2){
                   System.out.println("九二");
               }
               if (b==3){
                   System.out.println("九三");
               }
               if (b==4){
                   System.out.println("九四");
               }
               if (b==5){
                   System.out.println("九五");
               }
               if (b==6){
                   System.out.println("九六");
               }
               if (b==7){
                   System.out.println("九七");
               }
               if (b==8){
                   System.out.println("九八");
               }
               if (b==9){
                   System.out.println("九九");
               }
           }
       }
}