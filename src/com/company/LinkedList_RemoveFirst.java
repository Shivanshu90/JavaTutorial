package com.company;

class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
    }
}
class LinkedList
{
    Node head;
    Node tail;
    int size;

    void addLast(int v)
    {
        Node n=new Node(v);
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

    void removeFirst()
    {
        if(size==0)
            System.out.println("List is Empty");
        else if(size==1)
        {
            head=tail=null;
            size=0;
        }
        else
        {
            head=head.next;
            size--;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

class LinkedList_RemoveFirst {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.display();
        l.removeFirst();
        l.display();
    }
}
