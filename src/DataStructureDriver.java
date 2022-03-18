public class DataStructureDriver
{
    public static void main(String[] args)
    {
        //Instantiating the object
        DataStructure DLL = new DataStructure();
        System.out.println("Introduction to Double Linked Lists!");
        //Adding node to front
        DLL.addNodeToStart(1);
        DLL.addNodeToStart(2);
        DLL.addNodeToStart(3);

        //Adding node to back
        DLL.addNodeToBack(4);
        DLL.addNodeToBack(5);
        DLL.addNodeToBack(6);
        DLL.showList();
        System.out.println("The list length is: " + DLL.length() + "\n");

        //Deleting from the front and back
        DLL.deleteNodeFromStart();
        DLL.deleteNodeFromBack();
        DLL.showList();
        System.out.println("After deleting from the front and back, the list length is now: " + DLL.length() + "\n");

        //Deleting from the front and back
        DLL.deleteNodeFromStart();
        DLL.deleteNodeFromBack();
        DLL.showList();
        System.out.println("After deleting from the front and back, the list length is now: " + DLL.length() + "\n");

        //Repopulating the list
        DLL.addNodeToStart(100);
        DLL.addNodeToBack(200);
        DLL.showList();
        System.out.println("After repopulating from the front and the back, the list length is now: " + DLL.length() + "\n");

        //Repopulating the list
        DLL.addNodeToStart(1000);
        DLL.addNodeToBack(2000);
        DLL.showList();
        System.out.println("After repopulating from the front and the back, the list length is now: " + DLL.length() + "\n");

        //Using methods getFirst and getLast
        System.out.println("\n" + "The first value in the DLL is " + DLL.getFirst());
        System.out.println("The last value in the DLL is " + DLL.getLast());

        //Checking if the DLL has a value
        if (DLL.hasNext())
        {
            System.out.println("Checking if this DLL has at least one value..." + "\n" + "This DLL contains at least one value. Great Job!");
        }//end if statement
    }//end main method
}//end DataStructureDriver