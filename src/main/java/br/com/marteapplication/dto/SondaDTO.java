package main.java.br.com.marteapplication.dto;

public class SondaDTO {

    private int x;
    private int y;
    private String direcao;
    private String movimento;

    public SondaDTO(){
    }

    public SondaDTO(int x, int y, String direcao, String movimento){
        this.x = x;
        this.y = y;
        this.direcao = direcao;
        this.movimento = movimento;
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

    public String getMovimento(){
        return this.movimento;
    }

    public void setMovimento(String movimento){
        this.movimento = movimento;
    }
}
