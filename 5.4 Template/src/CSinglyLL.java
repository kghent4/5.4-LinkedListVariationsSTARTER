public class CSinglyLL extends ParentLL{
    Node head;

    public void add(int index, int info){
        //If the list is currently empty
        if(head == null && index == 0){

        }

        //Otherwise...
        try{
            int count = 0;
            Node currentNode = head;

            //Loop up to the correct spot

            //Create and plug in the new node
        }
        catch(Exception e){
            System.out.println("Invalid index provided: add(" + index + ")");
        }
    }

    public void remove(int index){

        //If removing the first node
        if(index == 0){
            
        }

        //Otherwise...
        try{
            int count = 0;
            Node currentNode = head;

            //Loop up to the correct spot

            //Remove the node
        }
        catch(Exception e){
            System.out.println("Invalid index provided: remove(" + index + ")");
        }
    }

    public void printAll(){
        Node currentNode = head;

        //Loop through until you get back to head, printing along the way

    }

}
