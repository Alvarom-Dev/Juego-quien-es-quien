/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alvar
 */
public class Personajes {
    private String nombre, hombre,mujer,sombrero,gafas,bigote,pelo,calvo,contento,triste,rubio,moreno,pelirrojo;
    
   //Constructor por defecto
    
    public Personajes(){
        
        nombre = "";
        hombre = "";
        mujer = "";
        sombrero = "";
        gafas = "";
        bigote = "";
        pelo = "";
        calvo = "";
        contento = "";
        triste = "";
        rubio = "";
        moreno= "";
        pelirrojo = "";
    }
    
    //Constructor por parámetros
    
    public Personajes(String nombre, String hombre, String mujer, String sombrero, String gafas, String bigote, String pelo, String calvo, String contento, String triste, String rubio, String moreno, String pelirrojo){
        
        this.nombre = nombre;
        this.hombre = hombre;
        this.mujer = mujer;
        this.sombrero = sombrero;
        this.gafas = gafas;
        this.bigote = bigote;
        this.pelo = pelo;
        this.calvo= calvo;
        this.contento = contento;
        this.triste = triste;
        this.rubio = rubio;
        this.moreno = moreno;
        this.pelirrojo = pelirrojo;
        
    }
    
    //GETTERS
    
    public String getNombre(){
        return nombre;
    }
    
    public String getHombre(){
        return hombre;
    }

    public String getMujer() {
        return mujer;
    }

    public String getSombrero() {
        return sombrero;
    }

    public String getGafas() {
        return gafas;
    }

    public String getBigote() {
        return bigote;
    }

    public String getPelo() {
        return pelo;
    }

    public String getCalvo() {
        return calvo;
    }

    public String getContento() {
        return contento;
    }

    public String getTriste() {
        return triste;
    }

    public String getRubio() {
        return rubio;
    }

    public String getMoreno() {
        return moreno;
    }

    public String getPelirrojo() {
        return pelirrojo;
    }
    
  //SETTERS
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setHombre(String hombre) {
        this.hombre = hombre;
    }

    public void setMujer(String mujer) {
        this.mujer = mujer;
    }

    public void setSombrero(String sombrero) {
        this.sombrero = sombrero;
    }

    public void setGafas(String gafas) {
        this.gafas = gafas;
    }

    public void setBigote(String bigote) {
        this.bigote = bigote;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public void setCalvo(String calvo) {
        this.calvo = calvo;
    }

    public void setContento(String contento) {
        this.contento = contento;
    }

    public void setTriste(String triste) {
        this.triste = triste;
    }

    public void setRubio(String rubio) {
        this.rubio = rubio;
    }

    public void setMoreno(String moreno) {
        this.moreno = moreno;
    }

    public void setPelirrojo(String pelirrojo) {
        this.pelirrojo = pelirrojo;
    }
    
    // Método toString

    @Override
    public String toString() {
        return "Personajes{" + "nombre" + nombre + "hombre=" + hombre + ", mujer=" + mujer + ", sombrero=" + sombrero + ", gafas=" + gafas + ", bigote=" + bigote + ", pelo=" + pelo + ", calvo=" + calvo + ", contento=" + contento + ", triste=" + triste + ", rubio=" + rubio + ", moreno=" + moreno + ", pelirrojo=" + pelirrojo + '}';
    }
    
    
    
    
}


 