public class length {

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
    public static void main(String[] args){

    }
}
