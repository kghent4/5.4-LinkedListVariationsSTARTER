public class ParentLL {

    //Node represents each element of a linked list, containing the data and pointer(s) to other node(s).
    protected static class Node{
        int data;
        Node next;
        Node prev; //only for doubly linked lists

        protected Node(int info){
            data = info;
            next = null;
            prev = null;
        }
    }

    public void add(int i, int j){

    }

    public void remove(int i){

    }

    public void printAll(){

    }

    //This print will trigger if the data structure does not have
    //this behavior defined.
    public void revPrintAll(){
        System.out.println("This data struct does not have the ability to access in reverse.");
    }

    //Test out your data structure to see if it works as intended!
    public void test(ParentLL ll){
        try{

        
        System.out.println("--------------------------------------------\n" +
                           "Test for " + ll.getClass().getName() + 
                           "\n\nExpected result: \n" +
                           "Invalid index provided: add(10)\n" + 
                           "Invalid index provided: remove(10)\n"+
                           "1\n3");
        if(ll.getClass().getName().equals("SinglyLL") || ll.getClass().getName().equals("CSinglyLL"))
            System.out.println("This data struct does not have the ability to access in reverse");
        else
            System.out.println("3\n1");

        System.out.println("\nActual result:");
        ll.add(10, 1);//should fail
        ll.add(0, 0);
        ll.add(1, 1);
        ll.add(2, 2);
        ll.add(3, 3);
        ll.add(4, 4);
        ll.remove(4);
        ll.remove(0);
        ll.remove(1);
        ll.remove(10);//should fail
        ll.printAll(); //should print 1, 3
        ll.revPrintAll();//should print 3, 1 if valid
        System.out.println("--------------------------------------------\n");
        }
        catch(Exception e){
            System.out.println("\u001B[31mSomething's wrong with " + ll.getClass().getName() + "\u001B[30m");
        }
    }
}
