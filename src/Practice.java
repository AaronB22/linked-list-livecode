public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w',null);

        Node otherNode= new Node('x',null);
  
        myNode.next=otherNode;

        Node coolNode= new Node('e',null);
        otherNode.next=coolNode;



        // System.out.println(myNode.value);
        // System.out.println(myNode.next.value);
        // System.out.println(coolNode.value);
        Node current= myNode;
        while(current!=null){
            System.out.println(current.value);
            current= current.next;
        }
    }
}
