package org.example.operation;

import org.example.DataRow;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightJoinOperationTest {

    @Test
    void join() {
        DataRow leftData = new DataRow();
        DataRow rightData = new DataRow();

        leftData.add( "Ukraine");
        leftData.add( "USA");
        leftData.add( "Germany");


        rightData.add( "Kiev");
        rightData.add("Vashington");
        rightData.add( "Berlin");
        rightData.add( "London");
        rightData.add( "Paris");
        rightData.add( "Xarkov");


        RightJoinOperation innerJoinOperation = new RightJoinOperation();
        Assert.assertEquals(6,innerJoinOperation.join(leftData,rightData).toArray().length);

    }
}