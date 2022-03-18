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
    @Test   //Adding to the back and checking the front
    public void checkingFrontAgain2()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToBack(10);
        assertTrue(DLL.getFirst().equals("10"));
    }//end test CheckingFrontAgain2
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
    @Test //Adding to start but checking the back
    public void checkingBackAgain2()
    {
        DataStructure DLL = new DataStructure();
        DLL.addNodeToStart(40);
        assertTrue(DLL.getLast().equals("40"));
    }//end test CheckingBackAgain2
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