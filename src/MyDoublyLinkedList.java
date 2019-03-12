class Node {
    int data;
    Node previous;
    Node next;
}
class DoublyLinkedList{
    Node head;
    public void insertAtLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            newnode.previous=temp;
            temp.next=newnode;

        }
    }
    public void deletionAtLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp=temp.previous;
            temp.next=null;

        }
    }
    public void insertionAtBeginning(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            newnode.previous=null;
        }
        else
        {

           Node temp=head;
                       head=newnode;
                       newnode.next=temp;
                       newnode.previous=null;
                   


        }
    }
    public void deletionAtBeginning()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            Node temp=head;
            head=temp.next;
            head.previous=null;
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            System.out.println("My Doubly Linked List is : ");
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"<---->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[])
    {
        DoublyLinkedList obj= new DoublyLinkedList();
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();
        Node n5=new Node();
        n1.data=10;
        n1.next=null;
        

        n2.data=20;
        n2.next=null;

        n3.data=30;
        n3.next=null;
        n4.data=40;
        n4.next=null;
        n5.data=50;
        n5.next=null;
        obj.insertAtLast(n1);
        obj.display();
        obj.insertAtLast(n2);
        obj.insertAtLast(n3);
        obj.insertAtLast(n4);
        obj.insertAtLast(n5);
        obj.display();
        obj.deletionAtLast();
        obj.display();
         Node n6=new Node();
         n6.data=60;
         n6.next=null;
        obj.insertionAtBeginning(n6);
        obj.display();
        obj.deletionAtBeginning();
        obj.display();
        Node n7=new Node();
        n7.data=70;
        n7.next=null;
        obj.insertionAtBeginning(n7);
        obj.display();
        obj.deletionAtLast();
        obj.display();



        
    }
}