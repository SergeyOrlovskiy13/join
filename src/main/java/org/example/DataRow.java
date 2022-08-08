package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class DataRow <K,V> extends ArrayList implements Collection {


    private String data;

    public String getData() {
        return data;
    }


}
