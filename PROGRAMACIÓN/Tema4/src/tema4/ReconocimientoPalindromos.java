/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;
import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class ReconocimientoPalindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] textos = {"Reconocer","AMANECER","Esto no es un palindromo","Dabale arroz a la zorra el abad.","A man, a plan, a canal: Panama.","A man a plan and a canal, Panama.","No deseo ese don..."};
        boolean [] resultados = new boolean [textos.length];
        boolean palindromo = true;
        String copia = "";
        System.out.println("RECONOCIMIENTO DE PALÍNDROMOS");
        System.out.println("-----------------------------");
        System.out.println("Los textos que vamos a analizar son:");
        
        for(int n=0;n<textos.length;n++){
            System.out.printf("%s%d%s%s%n","-Texto ",n+1,": ",textos[n]);
        }
        
        //Comprobar si es un palíndromo.
        for(int n=0;n<textos.length;n++){
            copia = textos[n];
            copia = copia.toLowerCase();
            copia = copia.replace(",", "").replace(".","").replace(":","").replace(";", "").replace(" ","");
            palindromo = true;
            for(int l=0,i=copia.length()-1;l<copia.length()/2;l++,i--){
                if(copia.charAt(l)!=copia.charAt(i)){
                    palindromo = false;
                }
                
            }//Termina bucle interior.
            resultados[n]=palindromo;
        }//Termina bucle exterior.
        
        System.out.println(Arrays.toString(resultados));
     
        
    }
    
}
