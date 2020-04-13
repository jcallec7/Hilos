package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hilo extends Thread {

	HashMap<String, List<String>> mapa = new HashMap<String, List<String>>();

	List<String> arrayComentarios;

	String matrizComp[][];

	public Hilo(List<String> arrayComentarios) {

		this.arrayComentarios = arrayComentarios;

	}

	public String[][] getMatriz() {

		return matrizComp;

	}

	public void run() {

		ContarPalabras contar = new ContarPalabras();

		for (String comentario : arrayComentarios) {

			mapa = contar.contarPalabra(comentario);
		}

		int cont = 0;

		for (String palabra : mapa.keySet()) {

			Set<String> hashSet = new HashSet<String>(mapa.get(palabra));
			cont += hashSet.size();

		}

		String matrizComp[][] = new String[cont][3];

		int i = 0;

		for (String palabra : mapa.keySet()) {

			List<String> idComentarios = new ArrayList();

			idComentarios = mapa.get(palabra);

			String idAnterior = "";

			int frecuencia = 1;

			for (int j = 0; j < idComentarios.size(); j++) {

				String idComentario = idComentarios.get(j);

				if (!idComentario.equals(idAnterior)) {

					frecuencia = 1;
					matrizComp[i][0] = palabra;
					matrizComp[i][1] = frecuencia + "";
					matrizComp[i][2] = idComentario;
					i++;

				} else {

					frecuencia++;
					matrizComp[i - 1][1] = frecuencia + "";

				}

				idAnterior = idComentario;

			}

		}

		this.matrizComp = matrizComp;

	}

}
