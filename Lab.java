import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Automobile auto1 = new Automobile(4, 4, 4);
		Automobile auto2 = new Automobile(2, 6, 6);
		Automobile auto3 = new Automobile(5, 6, 4);

		
		auto1.SetColor("yellow");
		auto1.SetName("Cabbie");
		auto1.About();
		String about1 = auto1.About();
		
		System.out.printf("%s\n\n", about1);
		
		auto2.SetColor("red");
		auto2.SetName("Sporty");
		auto2.About();
		String about2 = auto2.About();
		
		System.out.printf("%s\n\n", about2);
		
		auto3.SetColor("green");
		auto3.SetName("Vany");
		String about3 = auto3.About();
		
		System.out.printf("%s", about3);

	}

}