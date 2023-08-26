public class traversal {
    public static void traverse(linkedList head){
        if(head == null){
            return;
        }

        while(head != null){
            System.out.print(head.getData() + " -> ");
            head = head.getNext();
        }
    }
}
