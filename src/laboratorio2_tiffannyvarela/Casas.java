/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_tiffannyvarela;

/**
 *
 * @author tiffa
 */
public class Casas {
    private int num_casa;
    private int num_bloque;
    private String color;
    private double ancho;
    private double largo;
    private int compra;
    private int pisos;
    private int banos;
    private int cuartos;
    private String nom_dueno;
    private String estado;
    private String nom_ing;
    
    public Casas(){
        
    }
    
    public Casas(int num_casa, int num_bloque, String color, double ancho, double largo, int compra, int pisos, int banos, int cuartos, String nom_dueno, String estado, String nom_ing){
        this.num_casa=num_casa;
        this.num_bloque=num_bloque;
        this.color=color;
        this.ancho=ancho;
        this.largo=largo;
        this.compra=compra;
        this.pisos=pisos;
        this.banos=banos;
        this.cuartos=cuartos;
        this.nom_dueno=nom_dueno;
        this.estado=estado;
        this.nom_ing=nom_ing;
    }
    
    
    public void setNum_casa(int num_casa){
        this.num_casa=num_casa;
    }
    
    public int getNum_casa(){
        return num_casa;
    }
    
    public void setNum_bloque(int num_bloque){
        this.num_bloque=num_bloque;
    }
    
    public int getNum_bloque(){
        return num_bloque;
    }
    
    public void setColor(String Color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public double getAncho(){
        return ancho;
    }
    
    public void setLargo(double largo){
        this.largo=largo;
    }
    
    public double getLargo(){
        return largo;
    }
    
    public void setCompra(int compra){
        this.compra=compra;
    }
    
    public int getCompra(){
        return compra;
    }
    
    public void setPisos(int pisos){
        this.pisos=pisos;
    }
    
    public int getPisos(){
        return pisos;
    }
    
    public void setBanos(int banos){
        this.banos=banos;
    }
    
    public int getBanos(){
        return banos;
    }
    
    public void setCuartos(int cuartos){
        this.cuartos=cuartos;
    }
    
    public int getCuartos(){
        return cuartos;
    }
    
    public void setNom_dueno(String nom_dueno){
        this.nom_dueno=nom_dueno;
    }
    
    public String getNom_dueno(){
        return nom_dueno;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setNom_ing(String nom_ing){
        this.nom_ing=nom_ing;
    }
    
    public String getNom_ing(){
        return nom_ing;
    }
    
    
    public String toString(){
        return "Numero de casa = "+num_casa+""
                + "\nNumero de bloque = "+num_bloque
                + "\nColor = "+color+"\n"
                + "Ancho = "+ancho+"\n"
                + "Largo = "+largo+"\n"
                + "Comprada = "+compra+"\n"
                + "Numero de pisos = "+pisos+"\n"
                + "Numero de banos = "+banos+"\n"
                + "Numero de cuartos = "+cuartos+"\n"
                + "Nombre del dueno = "+nom_dueno+"\n"
                + "Estado = "+estado+"\n"
                + "Nombre del ingeniero encargado = "+nom_ing;
    }
}
