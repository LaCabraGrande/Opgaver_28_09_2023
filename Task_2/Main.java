//Task 2
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please type your name ");
		String name = input.nextLine();
		System.out.println("Greeting "+name);
		System.out.println("Please type your age ");
		int age = input.nextInt();
		System.out.println("You are "+age+" years old");
		int retire = 67-age;
        System.out.println("You can retire in : "+retire+" years");
	}	
}