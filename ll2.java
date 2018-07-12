package compicod;


class ll2
{
    Node head; 
   
    class Node
    {
        int data;
        Node next;
        Node(int d) {
        	data = d;
        	next = null;
        	}
    }
    
    
    public void printList()
    {
        Node cur = head;
        while (cur != null)
        {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }   
        public void push(int new_data)
        {
            
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
     
}
class m {
    public static void main(String[] args)
    {
        
        ll2 t = new ll2();
        t.push(30);
        t.push(340);
        t.push(50);
       
 
        System.out.println("\nCreated Linked list is: ");
        t.printList();
    }}