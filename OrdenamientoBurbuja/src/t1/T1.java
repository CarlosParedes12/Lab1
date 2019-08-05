/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.util.Scanner;//Sirve para las operaciones basicas de java, osea, recibir datos
import java.util.Random;//util para generar numeros random


/**
 *
 * @author Carlos
 */
public class T1 {


    public static void main(String[] args) {
        Random numero = new Random();//objeto que guardara el random (no se uso pero lo deje por el bien de la comparacion)
        Scanner sc= new Scanner(System.in);//Scanner que leera los archivos
        int op, aux;//variables entero op que sirve para darle tamaño al arreglo con un maximo de 50
        int a[] = new int [50];//Declarando arreglo con 50 casillas
        System.out.println("Bienvenido");
        System.out.println("Ingrese la cantidad a ordenar\nde 1 a 50");
        op = sc.nextInt();//se pide el ingreso de la cantidad de datos
        
        for (int i=0; i<op; i++){//Ciclo for que generara y guardara los datos en nuestro arreglo
            a[i]=(int)(Math.random()*100);
        }
        for(int i=0; i<(op-1); i++){
            for (int k=0; k<(op-1); k++){
                if(a[k]>a[k+1]){
                    aux = a[k];
                    a[k] = a[k+1];
                    a[k+1] = aux;
                }
            }
        }
        for (int j=0; j<op; j++){//Ciclo for que mostrara los datos guardados
            System.out.println((j+1)+"  -\t - "+a[j]);
        }
    }
    
}
