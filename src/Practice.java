public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w',null);

        Node otherNode= new Node('x',null);
  
        myNode.next=otherNode;

        Node coolNode= new Node('e',null);
        Node helloNode= new Node('f',null);
        otherNode.next=coolNode;
        coolNode.next=helloNode;
        // int numNodes= length(myNode);
        // System.out.println(numNodes);
        Node newHead= removeAt(myNode, 2);

        // System.out.println(myNode.value);
        // System.out.println(myNode.next.value);
        // System.out.println(coolNode.value);
        Node current= newHead;
        while(current!=null){
            System.out.println(current.value);
            current= current.next;
        }
    }

    public static int length(Node head){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public static Node removeAt(Node head, int removeIdx){
        if(removeIdx==0){
            return head.next;
        }
        Node current= head;
        
        for(int i=0; i<removeIdx-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }
}
