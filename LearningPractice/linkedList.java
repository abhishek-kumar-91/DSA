public class linkedList{
    private  int data;
    private linkedList next;

    public linkedList(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }

    public linkedList getNext(){
        return next;
    }

    public void setNext(linkedList next){
        this.next = next;
    }

    //traverse

    public static void traverse(linkedList head){
        if(head == null){
            return;
        }

        while(head != null){
            System.out.print(head.getData() + " -> ");
            head = head.getNext();
        }
        System.out.println("NULL");
    }

    //length of linkded list

    public static int lengthOfLinkedList(linkedList head){
        if(head == null){
            return 0;
        }
        int count = 0;

        while(head != null){
            count++;
            head = head.getNext();
        }

        return count;
    }

    //insert at 0th position
    //step 1 nth number to create node and link with head and that head position move to the nth number;

    public static linkedList insertAtKthPosition(linkedList head, int data, int k){
        //validate
        if(k < 0 || k>lengthOfLinkedList(head)){
            System.out.println("k is not correct");
            return head;
        }

        if(k == 0){
            //we want to insert at start
            linkedList node = new linkedList(data);
            node.setNext(head);
            head = node;
        }else{
            linkedList node = new linkedList(data);
            //find the node at k-1th position
            linkedList temp = head;
            int count = 0;
            while(count < k){
                temp  = temp.getNext();
                count++;
            }

            //temp will be the node at k-1th index

            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        return head;
    }

    //delete kth position
    


    public static void main(String[] args){

        linkedList head = new linkedList(1);
        linkedList node1 = new linkedList(2);
        linkedList node2 = new linkedList(3);
        linkedList node3 = new linkedList(4);


        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        head.traverse(head);
        int s = head.lengthOfLinkedList(head);
        System.out.println(s);

        head.insertAtKthPosition(head, 6, 1);

        head.traverse(head);

    }
}