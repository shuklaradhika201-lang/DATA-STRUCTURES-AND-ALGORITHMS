package LinkedList.SinglyLinkedList;

public class insertion {
    node head;
    node tail;
    int size;
    public insertion(){
        this.size=0;
    }
    public void insert(int value){
        node node1=new node(value);
        node1.next=head;
        head=node1;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertatend(int value){
        node node1=new node(value);
        //1st case if tail or head is empty toh create the list
        if(tail==null){
            insert(value);
            return;
        }
        tail.next=node1;
        tail=node1;
        size+=1;
    }
    public void insertatanyposition(int value , int position){
        node node1=new node(value);
        if(position==0){
            insert(value);
            return;
        }
        node temp=head;
        for(int i=0;i<position;i++){
            temp=temp.next;
        }
        node1.next=temp.next;
        temp.next=node1;
        size++;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " ->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    class node{
        int value;
        node next;
        public node(int value){
            this.value=value;
        }
        public node(int value , node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        insertion ll=new insertion();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        // ll.insertatend(5);
        ll.insertatanyposition(7,2);
        ll.display();
    }
}
