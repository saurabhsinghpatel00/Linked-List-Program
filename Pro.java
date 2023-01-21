class LL
{

    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    //add - first, last
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add- last


    public static void main(String args[])
    {

        Pro list=new Pro();



    }
}