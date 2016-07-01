public class Potencia {
	public static void pot(double num, double base){
		double resp = num;
		for (int i=0; i<base; i++)
			resp*=num;
		System.out.println("O resultado eh: " + resp);
	}
	
}