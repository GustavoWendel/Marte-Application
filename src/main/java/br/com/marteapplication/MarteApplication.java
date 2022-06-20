package main.java.br.com.marteapplication;

import main.java.br.com.marteapplication.controller.SondaController;
import main.java.br.com.marteapplication.dto.CreateSondaDTO;
import main.java.br.com.marteapplication.dto.SondaDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarteApplication {

	private static final Scanner s = new Scanner(System.in);
	private static final SondaController sondaController = new SondaController();
	private static final int QUANTIDADE_REPETICOES = 2;

	public static void main (String[] args){

		CreateSondaDTO createSondaDTO = new CreateSondaDTO();

		createSondaDTO.setMaxX(s.nextInt());
		createSondaDTO.setMaxY(s.nextInt());
		List<SondaDTO> sondaDTOList = new ArrayList<>();

		for(int i = 0; i < QUANTIDADE_REPETICOES; i++){
			SondaDTO sondaDTO = new SondaDTO();
			sondaDTO.setX(s.nextInt());
			sondaDTO.setY(s.nextInt());
			sondaDTO.setDirecao(s.next());
			sondaDTO.setMovimento(s.next());
			sondaDTOList.add(sondaDTO);
		}
		createSondaDTO.setSondaDTOList(sondaDTOList);
		sondaController.executarCaseSondaPousandoEmMarte(createSondaDTO);
	}

}
