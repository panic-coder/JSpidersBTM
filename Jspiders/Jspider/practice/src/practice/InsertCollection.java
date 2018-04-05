package practice;

public class InsertCollection {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addPos(0,151);
		list.addPos(1,1551);
		list.addPos(2,122);
		list.addPos(3, 121);
		list.addPos(4, 666);
		list.printListPalindrome();
		System.out.println();
		list.delete(0);
		list.delete(1);
		list.add(777);
		
		list.printList();
	}
}
