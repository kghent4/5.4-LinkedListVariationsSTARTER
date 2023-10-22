public class SinglyLL extends ParentLL{
    Node head;

    public void add(int index, int info){

        //If the LL is currently empty
        if(head == null && index == 0){
 
        }

        //Otherwise...
        try{
            int count = 0;
            Node currentNode = head;

            //Loop up to the appropriate spot

            //If adding at the end of the LL

            //If adding in the middle of the LL
        }
        catch(Exception e){
            System.out.println("Invalid index provided: add(" + index + ")");
        }
    }

    public void remove(int index){
        //If removing the first element
        if(index == 0){
           
        }
        try{
            int count = 0;
            Node currentNode = head;

            //Loop up to the appropriate spot

            //Remove the element

        }
        catch(Exception e){
            System.out.println("Invalid index provided: remove(" + index + ")");
        }
    }

    public void printAll(){
        Node currentNode = head;

        //Loop through, printing along the way
    }

}
