package main.java.br.com.marteapplication.service;


import java.util.logging.Logger;

import main.java.br.com.marteapplication.dto.CreateSondaDTO;
import main.java.br.com.marteapplication.dto.SondaDTO;
import main.java.br.com.marteapplication.model.Sonda;

public class SondaService {
    private static final Logger logger = Logger.getLogger("MyLog");
    private static final String VALOR_INVALIDO = "\"Valor inválido\"";

    public void moverSonda(Sonda sonda, int maxX, int maxY) {
        logger.info("Come�ando a mover a sonda");
        switch (sonda.getDirecao()) {
            case "N", "n":
                if (sonda.getY() < maxY) {
                    sonda.setY(sonda.getY() + 1);
                }
                break;
            case "E", "e":
                if (sonda.getX() < maxX) {
                    sonda.setX(sonda.getX() + 1);
                }
                break;
            case "W", "w":
                if (sonda.getX() > 0) {
                    sonda.setX(sonda.getX() - 1);
                }
                break;
            case "S", "s":
                if (sonda.getY() > 0) {
                    sonda.setY(sonda.getY() - 1);
                }
                break;
        }
    }

    public void girarEsq(Sonda sonda) {
        logger.info("Girar para a esquerda");
        switch (sonda.getDirecao()) {
            case "N", "n" -> sonda.setDirecao("W");
            case "E", "e" -> sonda.setDirecao("N");
            case "W", "w" -> sonda.setDirecao("S");
            case "S", "s" -> sonda.setDirecao("E");
            default -> sonda.setDirecao(VALOR_INVALIDO);
        }
    }

    public void girarDir(Sonda sonda) {
        logger.info("Girar a dire��o");
        switch (sonda.getDirecao()) {
            case "N", "n" -> sonda.setDirecao("E");
            case "E", "e" -> sonda.setDirecao("S");
            case "W", "w" -> sonda.setDirecao("N");
            case "S", "s" -> sonda.setDirecao("W");
            default -> sonda.setDirecao(VALOR_INVALIDO);
        }
    }

    public String executarStringDeMovimentos(SondaDTO sondaDTO, int maxX, int maxY) {
        logger.info("Iniciando execu��o de movimentos da sonda");
        Sonda sonda = new Sonda(sondaDTO.getX(), sondaDTO.getY(), sondaDTO.getDirecao());
        for (int i = 0; i < sondaDTO.getMovimento().length(); i++) {
            String s = sondaDTO.getMovimento().substring(i, i + 1);
            switch (s) {
                case "M" -> this.moverSonda(sonda, maxX, maxY);
                case "R" -> this.girarDir(sonda);
                case "L" -> this.girarEsq(sonda);
                default -> logger.info(VALOR_INVALIDO);
            }
        }
        return sonda.posicao();
    }

    public String executarCaseSondaPousandoEmMarte(CreateSondaDTO createSondaDTO) {
        logger.info("Iniciando execução da sonda pousando em marte");
        StringBuilder sb = new StringBuilder();
        for (SondaDTO sondaDTO : createSondaDTO.getSondaDTOList()) {
            if (!sb.isEmpty()) {
                sb.append("\n").append(this.executarStringDeMovimentos(sondaDTO, createSondaDTO.getMaxX(), createSondaDTO.getMaxY()));
            } else {
                sb.append(this.executarStringDeMovimentos(sondaDTO, createSondaDTO.getMaxX(), createSondaDTO.getMaxY()));
            }
        }
        return sb.toString();
    }

}
