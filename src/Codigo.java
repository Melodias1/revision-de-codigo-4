import java.util.Scanner;
//se importa dependencia de scanner
public class Codigo {
	//se agrega metodo main para poder correr funciones
	public static void main(String[] args) {
		
		//se completa la entrada de scanner
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Turno del jugador 1 introduzca piedra, papel o tijeras: ");
	    String j1 = s.nextLine();
	    //se corrige texto para mencionar al jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	   //se elimina instancia extra del scanner
	    String j2 = s2.nextLine();
	    //se borra parentesis sobrante
	    //se agregan breaks a cada case
	    //se cambia el == por equals para una comparacion correcta
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	            break;
	          }

	        case "papel":
	          if (j2.equals("piedra")) {
	             g = 1;
	             break;
	          }
	          //se agrega bracket faltante, se cambia el tijera por tijeras
	        case "tijeras":
	        	
	          if (j2.equals("papel")) {
	            g = 1;
	            break;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);

			
		
	}//main
	
	
	}//main
	
}//class
	