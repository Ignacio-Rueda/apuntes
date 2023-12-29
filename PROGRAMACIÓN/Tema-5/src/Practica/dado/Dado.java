/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica.dado;

/**
 *
 * @author Ignacio Rueda
 */
public class Dado {
    //Declaración de atributos objeto.
    private final int numeroCaras;
    private int [] registroCaras;//Array para conocer el registro de cada cara.
    //Declaración de atributos de clase.
    private long numeroLanzamientos;
    private static final String[] NOMBRE_CARAS = {"UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","ONCE","DOCE","TRECE","CATORCE","QUINCE","DIECISÉIS","DIECISISTE","DIECIOCHO","DIECINUEVE","VEINTE"};
    //Valores por omisión.
    public static final int NUMERO_CARAS_DEFAULT = 6;
    
    //Declaración de constructores.
    public Dado(int numeroCaras) throws IllegalArgumentException{
        //Comprobar la validez del número de caras.
        if(numeroCaras != 4 || numeroCaras != 6 || numeroCaras != 8 || numeroCaras != 12 || numeroCaras != 20){
            throw new IllegalArgumentException("Número de caras erróneo.");
        }
        //Inicializar los atributos del objeto.
        this.numeroCaras = numeroCaras;
        this.numeroLanzamientos = 0;
        this.registroCaras = new int [this.numeroCaras];//El array tendrá tantas posiciones como número de caras tenga el dado.
    }
    public Dado(){
        this(Dado.NUMERO_CARAS_DEFAULT);
    }
    
    //Declaración de métodos.
    public int getNumeroDeCaras(){
        //En el ejercicio se solicita que no se haga ahora uso del atributo numero de caras.
        //return this.numeroCaras;
        int numeroCaras = this.registroCaras.length;
        return numeroCaras;
    }
    public long getNumeroDeLanzamientos(){
        //En el ejercicio se solicita que no se haga ahora uso del atributo numero de lanzamientos.
        //return this.numeroLanzamientos;
        int numeroLanzamientos=0;
        for(int n=0;n<this.registroCaras.length;n++){
            numeroLanzamientos+=this.registroCaras[n];
        }
        return numeroLanzamientos;
    }
    
    public String lanzar(){
       int valorRandom = (int)(1+ Math.random()*(this.numeroCaras));
       //Registramos la cara que ha salido.
       this.registroCaras[valorRandom]++;
       //Devolver cara obtenida
       String resultado = Dado.NOMBRE_CARAS[valorRandom];
       return resultado;
    }
    @Override
    public String toString(){
        String resultado = String.format("Número de caras %d. Número de lanzamientos: %d",
              this.numeroCaras,
              this.numeroLanzamientos
        );
        return resultado;
    }
    
    public int getNumVecesCara(int cara) throws IllegalArgumentException{
        //Comprobamos que existe esa cara.
        if(cara<1 || cara>this.getNumeroDeCaras()){
            throw new IllegalArgumentException("Cara no válida");
        }
        int resultado = this.registroCaras[cara];
        return resultado;
    }
}
