package view;

import model.logic.MVCModelo;

public class MVCView 
{
	    /**
	     * Metodo constructor
	     */
	    public MVCView()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("Elegir el trimestre del a�o:");
			System.out.println("1. 2018-1");
			System.out.println("2. 2018-2");
			System.out.println("3. 2018-3");
			System.out.println("4. 2018-4");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		
		public void printMenu1()
		{
			System.out.println("Elegir la funcion:");
			System.out.println("1. Consultar timepo promedio de viaje y su desviaci�n estandar.");
			System.out.println("2. Consultar la informaci�n de los viajes con mayor timpo promedio.");
			System.out.println("3. Comparar los tiempos prmedio de los viajes.");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(MVCModelo modelo)
		{
			// TODO implementar
		}
}
