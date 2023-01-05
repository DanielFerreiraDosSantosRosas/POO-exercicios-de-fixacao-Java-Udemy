package entities;

public class Funcionario {
	
	public String Name;
	public double Tax, GrossSalary;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	public void increaseSalary ( double percentage ) {
		GrossSalary += GrossSalary * percentage / 100.0;
	}
	public String toString() {
		return Name + ", $ " + String.format("%.2f", NetSalary());
	}
	

}
