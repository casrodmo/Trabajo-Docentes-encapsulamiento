import java.util.*;

public class Docente {
	private String name, lastName, tipo;
	private int horas;
	
	

	public Docente(String name, String lastName, String tipo, int horas){
		this.name = name;
		this.lastName = lastName;
		this.tipo = tipo;
		this.horas = horas;

	}


	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setlastName(String lastName){
		this.lastName = lastName;
	}

	public String getlastName(){
		return this.lastName;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getTipo(){
		return this.tipo;
	}

	public void setHoras(int horas){
		this.horas = horas;
	}

	public int getHoras(){
		return this.horas;
	}

//Da el apellido completo
	public String getFullName(){
		return this.name + " " +  this.lastName;
	}

//metodos
	public int getSueldoBruto(){
		if (this.tipo.equals("ciencia")){
		return this.horas * 500 ;
		}

		else if (this.tipo.equals("letras")){
		return this.horas * 1000;
		}
		else
			return 0;
	}

	public double getDescuento(){
		double desc = this.getSueldoBruto() * .10;
		return desc;
	}

	public double getSueldoNeto(){
		double neto = getSueldoBruto() - getDescuento();
		return neto;
	}
}
