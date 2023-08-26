public class linkedListMethods {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        //Insert at begning of linked list

        void insertAtBegning(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
                return;
            }else{
               temp.next = head;
                head = temp;
            }
        }
        //Add element on the end of node
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
                return;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }

        //get size of linked list
        int size(){
            Node temp = head;
            int count = 0;

            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        //print linked list element
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        //get element of linked list
        void getElement(int idx){
            Node temp = head;
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            System.out.println("Your element is: "+temp.data);
        }
        //insert a data at given index or position
        void insertAt(int idx, int data){
            Node t = new Node(data);
            Node temp = head;
            if(idx == size()){
                insertAtEnd(data);
                return;
            }else if(idx == 0){
                insertAtBegning(data);
                return;
            }else if(idx < 0){
                System.out.println("Enter the valid index:" + idx);
                return;
            }

            for(int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }
               t.next = temp.next;
               temp.next = t;
               t = temp;  
        }

        //Delete element using index
        void deleteAt(int idx){
            Node temp = head;

            for(int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(66);
        ll.insertAtEnd(7);
        ll.insertAtEnd(22);
        ll.insertAtBegning(100);
        ll.insertAtBegning(666);
        ll.insertAt(2, 220);
        ll.display();
        ll.insertAt(8, 101);
        ll.display();
        // System.out.println(ll.tail.data);
        // ll.insertAt(0, 203);
        // ll.display();
        // System.out.println(ll.head.data);
        // ll.insertAt(-1, 2000);
        // ll.display();
        ll.deleteAt(2);
        ll.display();
    }
}
