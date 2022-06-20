package main.java.br.com.marteapplication.dto;


import java.util.List;


public class CreateSondaDTO{

    private int maxX;
    private int maxY;
    private List<SondaDTO> sondaDTOList;

    public CreateSondaDTO(){
    }

    public CreateSondaDTO(int maxX, int maxY, List<SondaDTO> sondaDTOList){
        this.maxX = maxX;
        this.maxY = maxY;
        this.sondaDTOList = sondaDTOList;
    }

    public int getMaxX(){
        return this.maxX;
    }

    public void setMaxX(int maxX){
        this.maxX = maxX;
    }

    public int getMaxY(){
        return this.maxY;
    }

    public void setMaxY(int maxY){
        this.maxY = maxY;
    }

    public List<SondaDTO> getSondaDTOList(){
        return this.sondaDTOList;
    }

    public void setSondaDTOList(List<SondaDTO> sondaDTOList){
        this.sondaDTOList = sondaDTOList;
    }
}

