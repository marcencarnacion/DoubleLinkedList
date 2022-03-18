public class DataStructure
{
    //variables
    private Node head;
    private Node tail;

    //constructor
    public DataStructure()
    {
        head = null;
        tail = null;
    }//end constructor

    //to populate the list
    public void addNodeToStart(int dataInput)
    {
        Node newNode = new Node (dataInput, head, null);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
            head.next = null;
            tail.previous = null;
        }//end if statement
        if (head != null)
        {
            head.previous = newNode;
        }//end if statement
        head = newNode;
       // head = new Node(dataInput, head.next, head.previous);
    }//end addNodeToStart

    public void deleteNodeFromStart()
    {
        if(head != null)
        {
            head = head.getNext();
        }//end if statement
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }//end else statement
    }//end deleteNodeFromStart
    public void deleteNodeFromBack()
    {
        if(tail != null)
        {
            if(tail.previous == null)
            {
                tail = null;
                head = null;
            }//end if statement
            else
            {
                tail = tail.previous;
                tail.next = null;
            }//end else statement
        }//end if statement
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }//end else statement
    }//end deleteNodeFromBack

    //Returns if the list has a next
    public boolean hasNext()
    {
        Node position = head;
        if(position.getNext() != null)
        {
            return true;
        }//end if statement
        return false;
    }//end method hasNext

    public String getFirst()
    {
        if (head != null)
        {
            return head.getData() + "";
        }//end if statement
        return null;
    }//end getFirst
    public String getLast()
    {
        if (tail != null)
        {
            return tail.getData() + "";
        }//end if statement
        return null;
    }//end getFirst
    //Counts the length of the DLL
    public int length()
    {
        int count = 0;
        Node position  = head;
        while(position != null)
        {
            count++;
            position = position.getNext();
        }//end while loop
        return count;
    }//end method length

    //to display the list
    public void showList()
    {
        Node position  = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getNext();
        }//end while statement
    }//end method showList
    public void addNodeToBack(int dataInput)
    {
        Node newNode = new Node (dataInput, head, null);
        if (tail == null)
        {
            head = newNode;
            tail = newNode;
            head.next = null;
            tail.previous = null;
        }//end if statement
        if (tail != null)
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next= null;
        }//end if statement
        tail = newNode;
    }//end addNodeToBack
    private class Node
    {
        //instance variables
        private int data;
        private Node next; //instance of a self-referencing class
        private Node previous;
        //constructors
        public Node (int data, Node next, Node previous)
        {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }//end constructor
        //getters & setters
        public int getData()
        {
            return data;
        }//end getData
        public Node getNext()
        {
            return next;
        }//end getNext
        public Node getPrevious()
        {
            return previous;
        }//end getPrevious
        //toString
        public String toString()
        {
            return "data: " + data + " links to " + next + " and " + previous;
        }//end toString
    }//end inner class Node
}//end class Node