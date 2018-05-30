
package Code;

class LinkedList
{
	private static Node head;
	public static void main(String [] args)
	{
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		LinkedList ll = new LinkedList(10);
		ll.addAtHead(11);
		ll.addAtHead(12);
		ll.addAtHead(13);
		ll.addAtTail(8);
		ll.addAtTail(7);
	}
	
	public LinkedList(Object dat)
	{
		head = new Node(dat);
	}
	public void addAtHead(Object dat)
	{
		Node temp = head;
		head = new Node(dat);
		head.next = temp;
	}
	
	public void addAtTail(Object dat)
	{
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new Node(dat);
	}
	class Node
	{
		private Node next;
		private Object data;
		public Node(Object dat)
		{
			data = dat;
		}
	}
}
