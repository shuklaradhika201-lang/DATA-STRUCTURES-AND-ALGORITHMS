package LinkedList.question;
public class kkq2 {
    node head;
    node tail;
    int size;

    public kkq2() {
        this.size = 0;
    }

    public void insert(int value) {
        node node1 = new node(value);
        node1.next = head;
        head = node1;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    
    public void duplicateremove(){
        node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    class node {
        int value;
        node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        kkq2 ll = new kkq2();
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(4);
        ll.display();
        ll.duplicateremove();
        ll.display();
    }
}