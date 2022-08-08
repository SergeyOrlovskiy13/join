package org.example;

import org.example.operation.LeftJoinOperation;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinOperationTest {

    @Test
    void join() {
        DataRow leftData = new DataRow();
        DataRow rightData = new DataRow();

        leftData.add( "Ukraine");
        leftData.add( "USA");
        leftData.add( "Germany");
        leftData.add( "Italy");
        leftData.add( "China");

        rightData.add( "Kiev");
        rightData.add("Vashington");
        rightData.add( "Berlin");

        LeftJoinOperation leftJoinOperation = new LeftJoinOperation();


        Assert.assertEquals(5,leftJoinOperation.join(leftData,rightData).toArray().length);
    }
}