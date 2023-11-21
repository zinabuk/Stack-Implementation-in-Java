package stackImplementation;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackandSLL stack = new StackandSLL();
		Scanner scan = new Scanner(System.in);	
		char yes_no;

		//     options

		System.out.println("\nStack using Linked List Operations\n");
		do{

			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peak");
			System.out.println("4. check empty");
			System.out.println("5. size");
			System.out.println("6. display");
			System.out.println("7. Search");
			int choice = scan.nextInt();

			switch(choice){
			case 1:
				System.out.println("Enter integer element to push");
				stack.push(scan.nextInt());
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				System.out.println("peeked element ="+stack.peak());
				break;
			case 4:
				System.out.println("Empty status ="+stack.isEmpty());
				break;
			case 5:
				System.out.println("Size of linkedstack =" +stack.getSize());
				break;
			case 6:
				System.out.println();
				stack.display();
				break;
			case 7:
				System.out.println("Enter data to search for");
				System.out.println("found at position " +stack.search(scan.nextInt()));
				break;
			default:
				System.out.println("Wrong entry\n\n");
				break;
			}
			System.out.println("Do you want to continue?");
			yes_no = scan.next().charAt(0);
		}while(yes_no == 'Y' || yes_no == 'y');

	}

}
