package main.java.br.com.marteapplication.controller;


import main.java.br.com.marteapplication.dto.CreateSondaDTO;
import main.java.br.com.marteapplication.service.SondaService;

public class SondaController {

    private final SondaService service = new SondaService();

    public void executarCaseSondaPousandoEmMarte(CreateSondaDTO createSondaDTO){
        System.out.println(service.executarCaseSondaPousandoEmMarte(createSondaDTO));
    }
}
