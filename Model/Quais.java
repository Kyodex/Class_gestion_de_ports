package com.example.gestiondeportsfx.Model;

public class Quais {
    private int nbQuais;
    private int quaisOcc;
    //constructeur vide
    public Quais(){

    }
    public Quais(int nbQuai){
        this.nbQuais = nbQuai;
    }

   public boolean ajouterBateau(){
        if (this.quaisOcc>= this.nbQuais){
            return false;
        }else {
            this.quaisOcc++;
            return true;
        }
    }

    public boolean estPlein(){
        if(this.quaisOcc>=nbQuais){
            return true;
        }else{
            System.out.println("place libre");
            return false;
        }
    }

    public void retraitBateau(){
        this.quaisOcc--;
    }

    public int getNbQuais() {
        return nbQuais;
    }

    public void setNbQuais(int nbQuais) {
        this.nbQuais = nbQuais;
    }

    public int getQuaisOcc() {
        return quaisOcc;
    }

    public void setQuaisOcc(int quaisOcc) {
        this.quaisOcc = quaisOcc;
    }
}
