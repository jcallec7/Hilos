package controlador;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class Principal {

	HashMap<String, List<String>> mapa = new HashMap<String, List<String>>();
	List<String> listComentarios = new ArrayList<String>();

	public List<String> cargarDatos() throws IOException {

		Path path = Paths.get("tweetsPequeno.txt");

		byte[] bytes = Files.readAllBytes(path);

		listComentarios = Files.readAllLines(path, StandardCharsets.UTF_8);

		return listComentarios;

	}

	public void secuencial() throws InterruptedException {

		Hilo secuencial = new Hilo(listComentarios);
		secuencial.start();
		secuencial.join();
		String[][] matrizComp = secuencial.getMatriz();
		
		printMatriz print = new printMatriz();
		System.out.println(matrizComp.length + " filas");

	}

	public void x2Hilos() throws InterruptedException {

		List<String> sublistComentarios1 = listComentarios.subList(0, listComentarios.size() / 2);
		List<String> sublistComentarios2 = listComentarios.subList(listComentarios.size() / 2, listComentarios.size());

		Hilo hilo1 = new Hilo(sublistComentarios1);
		Hilo hilo2 = new Hilo(sublistComentarios2);

		hilo1.start();
		hilo2.start();

		hilo1.join();
		hilo2.join();

		String[][] matrizComp1 = hilo1.getMatriz();
		String[][] matrizComp2 = hilo2.getMatriz();
		
		printMatriz print = new printMatriz();
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp1); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp2);

	}

	public void x4Hilos() throws InterruptedException {

		List<String> sublistComentarios1 = listComentarios.subList(0, listComentarios.size() / 4);
		List<String> sublistComentarios2 = listComentarios.subList(listComentarios.size() / 4,
				2 * listComentarios.size() / 4);
		List<String> sublistComentarios3 = listComentarios.subList(2 * listComentarios.size() / 4,
				3 * listComentarios.size() / 4);
		List<String> sublistComentarios4 = listComentarios.subList(3 * listComentarios.size() / 4,
				listComentarios.size());

		Hilo hilo1 = new Hilo(sublistComentarios1);
		Hilo hilo2 = new Hilo(sublistComentarios2);
		Hilo hilo3 = new Hilo(sublistComentarios3);
		Hilo hilo4 = new Hilo(sublistComentarios4);

		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();

		hilo1.join();
		hilo2.join();
		hilo3.join();
		hilo4.join();

		String[][] matrizComp1 = hilo1.getMatriz();
		String[][] matrizComp2 = hilo2.getMatriz();
		String[][] matrizComp3 = hilo3.getMatriz();
		String[][] matrizComp4 = hilo4.getMatriz();
		
		/*printMatriz print = new printMatriz();
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp1); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp2);
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp3); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp4);*/
		

	}

	public void x6Hilos() throws InterruptedException {

		List<String> sublistComentarios1 = listComentarios.subList(0, listComentarios.size() / 6);
		List<String> sublistComentarios2 = listComentarios.subList(listComentarios.size() / 6,
				2 * listComentarios.size() / 6);
		List<String> sublistComentarios3 = listComentarios.subList(2 * listComentarios.size() / 6,
				3 * listComentarios.size() / 6);
		List<String> sublistComentarios4 = listComentarios.subList(3 * listComentarios.size() / 6,
				4 * listComentarios.size() / 6);
		List<String> sublistComentarios5 = listComentarios.subList(4 * listComentarios.size() / 6,
				5 * listComentarios.size() / 6);
		List<String> sublistComentarios6 = listComentarios.subList(5 * listComentarios.size() / 6,
				listComentarios.size());

		Hilo hilo1 = new Hilo(sublistComentarios1);
		Hilo hilo2 = new Hilo(sublistComentarios2);
		Hilo hilo3 = new Hilo(sublistComentarios3);
		Hilo hilo4 = new Hilo(sublistComentarios4);
		Hilo hilo5 = new Hilo(sublistComentarios5);
		Hilo hilo6 = new Hilo(sublistComentarios6);

		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();

		hilo1.join();
		hilo2.join();
		hilo3.join();
		hilo4.join();
		hilo5.join();
		hilo6.join();

		String[][] matrizComp1 = hilo1.getMatriz();
		String[][] matrizComp2 = hilo2.getMatriz();
		String[][] matrizComp3 = hilo3.getMatriz();
		String[][] matrizComp4 = hilo4.getMatriz();
		String[][] matrizComp5 = hilo5.getMatriz();
		String[][] matrizComp6 = hilo6.getMatriz();
		
		/*printMatriz print = new printMatriz();
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp1); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp2);
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp3); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp4);
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp5); 
		System.out.println("-------------------------------------------");
        print.printMatriz(matrizComp6);*/

	}

	public void x8Hilos() throws InterruptedException {

		List<String> sublistComentarios1 = listComentarios.subList(0, listComentarios.size() / 8);
		List<String> sublistComentarios2 = listComentarios.subList(listComentarios.size() / 8,
				2 * listComentarios.size() / 8);
		List<String> sublistComentarios3 = listComentarios.subList(2 * listComentarios.size() / 8,
				3 * listComentarios.size() / 8);
		List<String> sublistComentarios4 = listComentarios.subList(3 * listComentarios.size() / 8,
				4 * listComentarios.size() / 8);
		List<String> sublistComentarios5 = listComentarios.subList(4 * listComentarios.size() / 8,
				5 * listComentarios.size() / 8);
		List<String> sublistComentarios6 = listComentarios.subList(5 * listComentarios.size() / 8,
				6 * listComentarios.size() / 8);
		List<String> sublistComentarios7 = listComentarios.subList(6 * listComentarios.size() / 8,
				7 * listComentarios.size() / 8);
		List<String> sublistComentarios8 = listComentarios.subList(7 * listComentarios.size() / 8,
				listComentarios.size());

		Hilo hilo1 = new Hilo(sublistComentarios1);
		Hilo hilo2 = new Hilo(sublistComentarios2);
		Hilo hilo3 = new Hilo(sublistComentarios3);
		Hilo hilo4 = new Hilo(sublistComentarios4);
		Hilo hilo5 = new Hilo(sublistComentarios5);
		Hilo hilo6 = new Hilo(sublistComentarios6);
		Hilo hilo7 = new Hilo(sublistComentarios7);
		Hilo hilo8 = new Hilo(sublistComentarios8);

		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();
		hilo7.start();
		hilo8.start();

		hilo1.join();
		hilo2.join();
		hilo3.join();
		hilo4.join();
		hilo5.join();
		hilo6.join();
		hilo7.join();
		hilo8.join();

		String[][] matrizComp1 = hilo1.getMatriz();
		String[][] matrizComp2 = hilo2.getMatriz();
		String[][] matrizComp3 = hilo3.getMatriz();
		String[][] matrizComp4 = hilo4.getMatriz();
		String[][] matrizComp5 = hilo5.getMatriz();
		String[][] matrizComp6 = hilo6.getMatriz();
		String[][] matrizComp7 = hilo7.getMatriz();
		String[][] matrizComp8 = hilo8.getMatriz();
		
		/*printMatriz print = new printMatriz();
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp1); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp2);
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp3); 
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp4);
		System.out.println("-------------------------------------------");
		print.printMatriz(matrizComp5); 
		System.out.println("-------------------------------------------");
        print.printMatriz(matrizComp6);
        System.out.println("-------------------------------------------");
	    print.printMatriz(matrizComp7); 
	    System.out.println("-------------------------------------------");
	    print.printMatriz(matrizComp8);*/
				 

	}

}