package torneio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Participante {
	
    public static void main(String[] args) {
		ArrayList<String> resultado = new ArrayList<>();
		
    	int count = 0;
    	while (count <= 6) {
    		String s = null;
    		try {
        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        		s = br.readLine();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    		resultado.add(s);
    		count++;
    	}

    	obterGrupos(resultado);
 }

	public static int obterGrupos(ArrayList<String> resultado) {
    	int numeroVitorias = Collections.frequency(resultado, "v");

    	if (numeroVitorias >= 5) {
    		return 1;
    	} else if (numeroVitorias >= 3 && numeroVitorias <= 4) {
    		return 2;
		} else if (numeroVitorias >= 1 && numeroVitorias <= 2) {
    		return 3;
		} else {
    		return -1;
		}
	}}