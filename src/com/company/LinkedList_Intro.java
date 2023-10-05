package com.company;

class LL
{
    Node head;
    Node tail;
    int size;

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    // ADD FIRST
    void addFirst(int v)
    {
        Node n=new Node(v);
        n.next=head;
        head=n;
        if(size==0)
        {
            tail=n;
        }
        size++;
    }

    //ADD LAST
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

    //ADD AT ANY INDEX
    void addIndex(int v, int index)
    {
        Node n=new Node(v);

        if (index == 0)
            addFirst(v);
        else if (index == size)
            addLast(v);
        else
        {
            Node t = head;
            for (int i = 0; i < index - 1; i++)
            {
                t = t.next;
            }
            n.next = t.next;
            t.next = n;
            size++;
        }
    }

    //REMOVE FIRST
    void removeFirst()
    {
        if(size==0)
        {
            System.out.println("List is Empty");
            return;
        }
        else if(size==1)
        {
            head=tail=null;
        }
        else
        {
            head=head.next;
        }
        size--;
    }

    //REMOVE LAST
    void removeLast()
    {
        if(size==0)
        {
            System.out.println("List is Empty");
            return;
        }
        else if(size==1)
        {
            head=tail=null;
        }
        else
        {
            Node t=head;
            for(int i=0;i<size-2;i++)
            {
                t=t.next;
            }
            t.next=null;
            tail=t;
        }
        size--;
    }

    //REMOVE AT ANY INDEX
    void removeIndex(int index)
    {
        if(size==0)
        {
            System.out.println("List is Empty");
            return;
        }
        else if(size==1)
        {
            head=tail=null;
        }
        else
        {
            Node t=head;
            for(int i=0;i<index-1;i++)
            {
                t=t.next;
            }
            t.next=t.next.next;
        }
        size--;
    }

    //GET ELEMENT FROM LINKED LIST
    void getValue(int index)
    {
        if(size==0)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            if(index<0 && index>=size)
            {
                System.out.println("Invalid Index");
                return;
            }
            else if(index==0)
                System.out.println("Element at "+index+" index is "+head.data);
            else if(index==(size-1))
                System.out.println("Element at "+index+" index is "+tail.data);
            else
            {
                Node t=head;
                for(int i=0;i<index;i++)
                {
                    t=t.next;
                }
                System.out.println("Element at "+index+" index is "+t.data);
            }
        }
    }

    // PRINT LINKED LIST
    void display()
    {
        Node t=head;
        for(int i=0;i<size;i++)
        {
            System.out.print(t.data+" -> ");
            t=t.next;
        }
        System.out.println("null");
    }
}

public class LinkedList_Intro {
    public static void main(String[] args) {
        LL l=new LL();
        l.addFirst(10);
        l.addLast(30);
        l.addLast(40);
        l.removeLast();
        l.removeFirst();
        l.removeLast();

        l.addFirst(30);
        l.addFirst(10);
        l.addLast(40);
        l.addIndex(20, 1);
        l.addIndex(50, 4);
        l.addIndex(5, 0);
        l.addIndex(35, 4);
        l.removeIndex(4);
        l.removeFirst();

        l.display();
        l.getValue(2);
        System.out.println("Size of LinkedList: "+l.size);
    }
}