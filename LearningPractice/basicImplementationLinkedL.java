public class basicImplementationLinkedL{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        
    }
    public static void display(Node head){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void count(Node head){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            System.out.println("Total Element: "+count);
        }
    public static void main(String[] args){
            Node a = new Node(5);
            Node b = new Node(8);
            Node c = new Node(6);
            Node d = new Node(66);
            Node e = new Node(88);
            Node f = new Node(4);
            Node g = new Node(3);
            Node h = new Node(2);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;
            g.next = h;

            display(a);
            count(a);
    }
}