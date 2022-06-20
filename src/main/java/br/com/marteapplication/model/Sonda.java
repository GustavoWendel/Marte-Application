package main.java.br.com.marteapplication.model;


public class Sonda {
    private int x;
    private int y;
    private String direcao;

    public Sonda(int x, int y, String direcao){
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public Sonda(){
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public String getDirecao(){
        return this.direcao;
    }

    public void setDirecao(String direcao){
        this.direcao = direcao;
    }

    public void configSonda(int x, int y, String direcao){
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public String posicao(){
        return this.x + " " + this.y + " " + this.direcao;
    }
}
