package stackImplementation;

public class StackandSLL {
	//global reference variable
	Node head;
	int size;
	StackandSLL(){
		this.head = null;
		this.size = 0;
	}

	public int getSize() {
		return size;
	}

	public void push(int data) {

		Node newnode = new Node();
				if(newnode == null) {
					System.out.println("Heap Overflow");
				}

		newnode.data = data;
		newnode.next = head;
		head = newnode;

		size++;

		if(size>=100) {
			
			System.out.println("I am full ");

			System.exit(0);
		}
	}

	public boolean isEmpty() {

		return head==null;


	}

	public int peak() {
		if(!isEmpty()) {
			return head.data;	
		}else {
			System.out.println("Empty Stack");
			return -1;
		}

	}

	public void pop() {

		if(isEmpty()) {
			System.out.println("Stack Underflow\n");
			return;
		}
		System.out.println("popped data \n" + head.data);
		head = head.next;
		//		System.out.println("Data remained in the stack");
		//		display();

		size--;
	}

	public void display() {

		if(isEmpty()) {
			System.out.println("No data in the stack");
			return;
		}

		Node to_be_displayed = head;
		System.out.printf("Data in the Stack ");
		while(to_be_displayed !=null) {
			System.out.printf("%d ->",to_be_displayed.data);
			//			System.out.println("\n\nData in the Stack" +to_be_displayed.data);
			to_be_displayed = to_be_displayed.next;
		}

		System.out.println();


	}

	public int search(int x) {
		Node to_be_searched = head;
		int i=0;
		if(to_be_searched == null || to_be_searched.data !=x) {
			return -1;
		}
		for(int j = 0;j<size;j++) {
			if(to_be_searched!=null && to_be_searched.data!=x) {
				i++;
				to_be_searched =to_be_searched.next;
			}

		}

		return i+1;
	}

}
