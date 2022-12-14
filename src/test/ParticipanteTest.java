package test;

import torneio.Participante;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ParticipanteTest {


	@Test
	public void deveRetornarUmQuandoGanhouTodosJogos() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), 1);
	}
	
	@Test
	public void deveRetornarUmQuandoGanharCincoJogos() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("p");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), 1);
	}
	
	@Test
	public void deveRetornarDoisQuandoGanharQuatroJogos() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("p");
		resultados.add("p");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), 2);
	}
	
	@Test
	public void deveRetornarDoisQuandoGanharTresJogos() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("v");
		resultados.add("v");
		resultados.add("v");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), 2);
	}
	
	@Test
	public void deveRetornarTresQuandoGanharDoisJogos() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("v");
		resultados.add("v");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), 3);
	}
	
	@Test
	public void deveRetornarTresQuandoGanharUmJogos() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("v");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), 3);
	}
	
	@Test
	public void deveRetornarMenosUmQuandoNaoGanhar() {
		ArrayList<String> resultados = new ArrayList<String>();
		
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		resultados.add("p");
		
		Assert.assertEquals(Participante.obterGrupos(resultados), -1);
	}
}
