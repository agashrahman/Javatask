import java.util.Scanner;
class Ascii{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int charInput = (int) sc.next().charAt(0);
		System.out.println(charInput);
	}
}