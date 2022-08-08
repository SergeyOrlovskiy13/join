package org.example.operation;

import org.example.DataRow;
import org.example.JoinOperation;
import org.example.JoinedDataRow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LeftJoinOperation implements JoinOperation {
    @Override
    public Collection join(Collection leftCollection, Collection rightCollection) {
        DataRow dataRow1 = (DataRow) leftCollection;
        DataRow dataRow2 = (DataRow) rightCollection;
        List<JoinedDataRow> res = new ArrayList();

        for(int i = 0; i < dataRow1.size(); ++i) {
            for(int j = 0; j < dataRow2.size(); ++j) {
                if (i == j) {
                    JoinedDataRow joinedDataRow = new JoinedDataRow();
                    joinedDataRow.ind = i;
                    joinedDataRow.d1 = dataRow1.get(i);
                    joinedDataRow.d2 = dataRow2.get(j);
                    res.add(joinedDataRow);
                }
            }
        }

        if (res.size() < dataRow1.size()){
            int t = dataRow1.size() - res.size();
            for (int n = 0 ; n < t ; n++ ){
                JoinedDataRow joinedDataRow = new JoinedDataRow();
                joinedDataRow.ind = dataRow1.size()-n;
                joinedDataRow.d1 = dataRow1.get(dataRow1.size()-n-1);
                res.add(joinedDataRow);
            }
        }



         return res;
    }
}