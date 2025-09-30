public class Main {
    public static void main(String[] args) {

        SinglyLL sll = new SinglyLL();
        // testPrintingElems(sll);
        // testAddingElems(sll);
        // testRemovingElems(sll);
        // testReversePrintingElems(sll);

        DoublyLL dll = new DoublyLL();
        // testPrintingElems(dll);
        // testReversePrintingElems(dll);
        // testAddingElems(sll);
        // testRemovingElems(sll);

        CSinglyLL csll = new CSinglyLL();
        // testPrintingElems(csll);
        // testAddingElems(csll);
        // testRemovingElems(csll);
        // testReversePrintingElems(csll);

        CDoublyLL cdll = new CDoublyLL();
        // testPrintingElems(cdll);
        // testAddingElems(cdll);
        // testRemovingElems(cdll);
        // testReversePrintingElems(cdll);

    }

    public static void testAddingElems(ParentLL list) {

        System.out.println("\n\n" + list.getClass().getName()
                + " TEST ADDING* ELEMENTS ---------------------------------------------------------------");

        list.add(0, "Asher"); // add to empty
        list.add(0, "Frank"); // add to front
        list.add(2, "Jasiah"); // add to end
        list.add(1, "Seth"); // add to middle

        System.out.println("\tActual output:");
        System.out.print("\t| ");
        list.printAll();
        System.out.print("\t| ");
        list.add(10, "David");// invalid add (IOOB)

        System.out.println("\tExpected output:");
        System.out.println("\t| Asher, Seth, Frank, Jasiah");
        System.out.println("\t| \u001B[31m" + list.getClass().getName() + " invalid index provided: add(" + 10
                + ", \"" + "David" + "\")\u001B[30m");

        list.clear();
        System.out.println("\t*This test utilizes print(). If it failed, the issue could be in 'print()' or 'add()'.");

    }

    public static void testPrintingElems(ParentLL list) {

        System.out.println("\n\n" + list.getClass().getName()
                + " TEST PRINTING* ELEMENTS -----------------------------------------------------------");

        list.add(0, "Asher");
        list.add(1, "Seth");
        list.add(2, "Frank");
        list.add(3, "Jasiah");

        System.out.println("\tActual output:");
        System.out.print("\t| ");
        list.printAll();

        System.out.println("\tExpected output:");
        System.out.println("\t| Asher, Seth, Frank, Jasiah");

        list.clear();
        System.out.println("\t*This test utilizes add(). If it failed, the issue could be in 'print()' or 'add()'.");

    }

    public static void testReversePrintingElems(ParentLL list) {

        System.out.println("\n\n" + list.getClass().getName()
                + " TEST REVERSE PRINTING* ELEMENTS ---------------------------------------------------");

        list.add(0, "Asher");
        list.add(1, "Seth");
        list.add(2, "Frank");
        list.add(3, "Jasiah");

        System.out.println("\tActual output:");
        System.out.print("\t| ");
        list.revPrintAll();

        System.out.println("\tExpected output:");
        System.out.println("\t| Jasiah, Frank, Seth, Asher");

        list.clear();
        System.out.println("\t*This test utilizes add(). If it failed, the issue could be in 'revprint()' or 'add()'.");

    }

    public static void testRemovingElems(ParentLL list) {

        System.out.println("\n\n" + list.getClass().getName()
                + " TEST REMOVING* ELEMENTS ------------------------------------------------------------");
        System.out.println("\tActual output:");
        System.out.print("\t| ");

        list.remove(0); // remove empty
        list.add(0, "Asher");
        list.remove(0); // remove from 1-element list
        list.add(0, "Seth");
        list.add(1, "Frank");
        list.add(2, "Jasiah");
        list.add(3, "Owen");
        list.remove(3); // remove from end
        list.remove(1); // remove from middle

        System.out.print("\t| ");
        list.printAll();

        System.out.println("\tExpected output:");
        System.out
                .println("\t| \u001B[31m" + list.getClass().getName() + " invalid index provided: remove(0)\u001B[30m");
        System.out.println("\t| Seth, Jasiah");

        list.clear();
        System.out.println(
                "\t*This test utilizes add() and print(). If it failed, the issue could be in 'print()',\n\t'remove()', or 'add()'.");

    }

}
