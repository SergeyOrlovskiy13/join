package org.example;


public class JoinedDataRow <K, V1, V2>  {

    public  int ind;
    public Object d1;
    public Object d2;

    @Override
    public String toString() {
        return "JoinedDataRow{" +
                "ind=" + ind +
                ", d1='" + d1 + '\'' +
                ", d2='" + d2 + '\'' +
                '}'+"\n";
    }
}
