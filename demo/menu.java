import java.util.*;
public class menu{
	Scanner sc = new Scanner(System.in);
	Docente l = new Docente();
	public int op=0, cont=0;
	

public void impMenu(){


				System.out.println("Nombre del docente: ");
							l.setName(sc.nextLine());
							sc.nextLine();
							

				System.out.println("Apellido del docente: ");
							l.setlastName(sc.nextLine());
							sc.nextLine();

				System.out.println("Tipo del docente: (ciencia / letras)");
							l.setTipo(sc.nextLine());
							sc.nextLine();	


				System.out.println("Número de horas");
							l.setHoras(sc.nextInt());
							sc.nextLine();	
							
				System.out.println("\n");
				System.out.println("Nombre del docente: " + l.getFullName());
				System.out.println("Saldo bruto: " + l.getSueldoBruto());
				System.out.println("Descuento: " + l.getDescuento());
				System.out.println("Sueldo Neto: " + l.getSueldoNeto());
				
	}
}