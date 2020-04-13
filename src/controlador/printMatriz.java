package controlador;

public class printMatriz {

	public void printMatriz(String[][] matriz) {

		for (int m = 0; m < matriz.length; m++) {

			for (int n = 0; n < matriz[m].length; n++) {

				String value = String.format("%11s", matriz[m][n]);

				System.out.print(" " + value + " ");

			}

			System.out.println();
		}

	}

}
