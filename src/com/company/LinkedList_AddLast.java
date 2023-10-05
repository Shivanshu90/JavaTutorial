package com.company;
class Node1
{
    int data;
    Node1 next;
    Node1(int x)
    {
        data=x;
    }
}
class LinkedList1
{
    Node1 head;
    Node1 tail;
    int size;

    void addLast(int v)
    {
        Node1 n=new Node1(v);
        if(size==0)
        {
            head=tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
        size++;
    }
    void display()
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
class LinkedList_AddLast {
    public static void main(String[] args) {
        LinkedList1 l=new LinkedList1();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.display();
        System.out.println("Length: "+l.size);
    }
}
