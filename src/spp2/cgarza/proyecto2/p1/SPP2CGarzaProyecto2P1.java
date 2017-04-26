/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarza.proyecto2.p1;

/**
 *
 * @author Carlos Rafael
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SPP2CGarzaProyecto2P1 {

    /**
     * 1.Desarrolla un programa en Java que solicite la cantidad de materias que llevas en este semestre, 
     * solicite cada materia y las guarde en un vector, después solicite para cada materia las calificaciones 
     * parciales para cada materia deberás mostrar el nombre de la materia al solicitar la calificación parcial, 
     * las guarde en una matriz, calcule y muestre el promedio para cada una, mostrando el nombre de cada materia.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam=solicitaentero("Escribe el número de materias");
            String[] materia=nombremateria(tam);
            double [][]arreglo=arreglo(tam,materia);
            imprimirarreglo(arreglo,materia);    
    }
    
     public static String[] nombremateria(int tam){

         String []materia= new String[tam];
         for (int i=0; i<tam;i++){
            materia[i]=JOptionPane.showInputDialog("Introduce el nombre de la materia "+(i+1)+": ");            
        } 
        return materia;
        }
     
       public static double[][] arreglo(int tam,String materia[]){

        double [][]arreglo= new double [tam][3];
      
        for (int i=0; i<tam;i++){
        for (int j=0;j<3;j++){
        
        arreglo[i][j]= solicitadouble("Calificación del parcial: "+(j+1)+": ");
        }
        }
        return arreglo;
        }
    
            
         public static void imprimirarreglo(double [][]a, String materia[]){
        double suma=0,prom=0;
              
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            suma= suma+a[i][j];
            prom=suma/3;
        }
        System.out.println();
        JOptionPane.showMessageDialog(null, "Promedio de "+materia[i]+":\n"+ prom);
        prom=0;
        suma=0;
            
        }
            
        }
         
         public static int solicitaentero(String men){
        int num=0;
        boolean flag;
        do{
   
                    try{
                String dato = JOptionPane.showInputDialog(men);
                num = Integer.parseInt(dato);
                 flag=false;}
                    catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                flag=true;
            }
                     
        }
        while(flag);
        return num;
    }
         
          public static double solicitadouble(String men){
        double num=0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Double.parseDouble(dato);
                flag=false;
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "Error");
                flag=true;
            }
        }
        while(flag);
        return num;
    }
    
}  
     
