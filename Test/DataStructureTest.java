import org.junit.Test;

import static org.junit.Assert.*;

public class DataStructureTest
{
    @Test
    public void checkingFront()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        DLL.addNodeToBack(20);
        DLL.addNodeToStart(30);
        DLL.addNodeToBack(40);
        assertTrue(DLL.getFirst().equals("30"));
    }//end test CheckingFront
    @Test
    public void checkingFrontAgain()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        assertTrue(DLL.getFirst().equals("10"));
    }//end test CheckingFrontAgain
    @Test
    public void checkingBack()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        DLL.addNodeToBack(20);
        DLL.addNodeToStart(30);
        DLL.addNodeToBack(40);
        assertTrue(DLL.getLast().equals("40"));
    }//end test CheckingBack
    @Test
    public void checkingBackAgain()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToBack(40);
        assertTrue(DLL.getLast().equals("40"));
    }//end test CheckingBackAgain
    @Test
    public void checkingLength()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        DLL.addNodeToBack(20);
        DLL.addNodeToStart(30);
        DLL.addNodeToBack(40);
        assertTrue(DLL.length() == (4));
    }//end test CheckingLength
    @Test
    public void checkingLength2()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        assertTrue(DLL.length() == (1));
    }//end test CheckingLength
    @Test
    public void checkingLength3()
    {
        DataStructure DLL = new DataStructure();
        assertTrue(DLL.length() == (0));
    }//end test CheckingLength
    @Test
    public void checkingNext()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        DLL.addNodeToBack(20);
        DLL.addNodeToStart(30);
        DLL.addNodeToBack(40);
        assertTrue(DLL.hasNext() == true);
    }//end test CheckingNext
    @Test
    public void checkingNextFalse()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(10);
        assertTrue(DLL.hasNext() == false);
    }//end test CheckingNext
}//end test class DataStructureTest