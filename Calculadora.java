import java.util.*;
public class Calculadora{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 3;

		while(opcao != 0){
			System.out.println("Qual operacao vc quer fazer?");
			System.out.println("1- Soma");
			System.out.println("2- Subtracao");
			System.out.println("3- Multiplicacao");
			System.out.println("4- Divisao");
			System.out.println("5- Potencia");
			System.out.println("6- Raiz");
			System.out.println("0- Sair");

			opcao = sc.nextInt();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double resultado;
			
			switch(opcao){
				// case 1:
				// 	resultado = new Soma().calcula();
			}
		}	

	}
}