package org.example;


import org.junit.Assert;

import org.example.operation.InnerJoinOperation;
import java.util.List;

class JoinMethodTest {

    @org.junit.jupiter.api.Test
    void join() {
        DataRow leftData = new DataRow();
        DataRow rightData = new DataRow();

        leftData.add(0,"Ukraine");
        leftData.add(1, "USA");
        leftData.add(2, "Germany");
        leftData.add(3, "Italy");
        leftData.add(4, "China");

        rightData.add(0,"Kiev");
        rightData.add(1,"Vashington");
        rightData.add(2,"Berlin");

        InnerJoinOperation innerJoinOperation = new InnerJoinOperation();
        List <JoinedDataRow> joinedDataRows = (List<JoinedDataRow>) innerJoinOperation.join(leftData,rightData);

        Assert.assertEquals(3,joinedDataRows.toArray().length);

    }
}