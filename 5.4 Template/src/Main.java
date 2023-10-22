public class Main {
    public static void main(String[] args){
       
        SinglyLL sll = new SinglyLL();
        sll.test(sll);

        DoublyLL dll = new DoublyLL();
        dll.test(dll);

        CSinglyLL csll = new CSinglyLL();
        csll.test(csll);

        CDoublyLL cdll = new CDoublyLL();
        cdll.test(cdll);
    }
}
