package org.example;

import org.example.operation.InnerJoinOperation;
import org.example.operation.LeftJoinOperation;
import org.example.operation.RightJoinOperation;

public class Main {
    public static void main(String[] args) {
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

        InnerJoinOperation innerJoinOperation = new InnerJoinOperation();
        RightJoinOperation rightJoinOperation = new RightJoinOperation();
        LeftJoinOperation leftJoinOperation = new LeftJoinOperation();

        System.out.println(innerJoinOperation.join(leftData, rightData));
        System.out.println("-------------------------------------------");
        System.out.println(rightJoinOperation.join(leftData,rightData));
        System.out.println("-------------------------------------------");
        System.out.println(leftJoinOperation.join(leftData, rightData));
    }
}