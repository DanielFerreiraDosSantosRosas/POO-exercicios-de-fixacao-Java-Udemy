package entities;

public class Estudante {
	
	public String Name;
	public double T1, T2, T3;
	
	public double finalGrade() {
		return T1 + T2 + T3;
		}
		public double missingPoints() {
		if (finalGrade() < 60.0) {
		return 60.0 - finalGrade();
		}
		else {
		return 0.0;
		}
		}

}
