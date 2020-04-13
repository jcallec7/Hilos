package controlador;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		long startTime = System.nanoTime();

		Principal principal = new Principal();

		principal.cargarDatos();

		principal.secuencial();
		//principal.x2Hilos();
		//principal.x4Hilos();
		//principal.x6Hilos();
		// principal.x8Hilos();
		 
		long elapsedTime = System.nanoTime() - startTime;

		System.out.println("Tiempo de procesado: " + elapsedTime / 1000000000);

	}

}
