package Controller;

import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import Entity.*;
import Model.*;

public class ClusterController07331 implements ClusterControllerInterface07331 {
    Map<ClusterEntity07331,List<RecordEntity07331>> clusterRecords07331 = new HashMap<ClusterEntity07331,List<RecordEntity07331>>();
    String text;

    @Override
    public void initializeClusterAndCentroid(int clusterNumber07331) {
        int counter07331 = 1;

        Iterator<RecordEntity07331> iterator = AllObjectModel07331.modelRecord07331.getData07331().iterator();
        RecordEntity07331 record = null;
        
        while(iterator.hasNext()){
            record = iterator.next();
            if(counter07331 <= clusterNumber07331){
                record.setClusterNumber(counter07331);
                initializeCluster(counter07331, record);
                counter07331++;
            }else{
                text+=""+record+"\n";
                text+=""+"*** Cluster Information1 ***"+"\n";
                for(ClusterEntity07331 cluster : AllObjectModel07331.modelCluster07331.getClusters()){
                    text+=""+cluster+"\n";
                }
                text+=""+"***********************"+"\n";
                double minDistance = Integer.MAX_VALUE;
                ClusterEntity07331 whichCluster = null;

                for(ClusterEntity07331 cluster : AllObjectModel07331.modelCluster07331.getClusters()){
                    double distance = cluster.calculateCentroid07331(record);
                    text+=""+cluster+"\n";
                    if(minDistance > distance){
                        minDistance = distance;
                        whichCluster = cluster;
                    }
                }
                record.setClusterNumber(whichCluster.getClusterNumber07331());
                whichCluster.updateCentroid07331(record);
                clusterRecords07331.get(whichCluster).add(record);
            }
            text+=""+"*** Cluster Information1 ***"+"\n";
            for(ClusterEntity07331 cluster : AllObjectModel07331.modelCluster07331.getClusters()){
                text+=""+cluster+"\n";
            }
            text+=""+"***********************"+"\n";
        }
    }
    @Override
    public void initializeCluster(int clusterNumber07331, RecordEntity07331 record07331) {
        ClusterEntity07331 cluster = new ClusterEntity07331(record07331.getTingkatKematian07331()
        ,record07331.getJumlahKasus07331(),record07331.getPotensiPenularan07331(),clusterNumber07331);
        AllObjectModel07331.modelCluster07331.getClusters().add(cluster);
        List<RecordEntity07331> clusterRecord = new ArrayList<RecordEntity07331>();
        
        clusterRecord.add(record07331);
        clusterRecords07331.put(cluster, clusterRecord);
    }
    @Override
    public void FinalCluster() {
        text+=""+"****** FINAL Cluster Information ******"+"\n";
        for(Map.Entry<ClusterEntity07331,List<RecordEntity07331>> entry : clusterRecords07331.entrySet()){
            text+="Key = "+entry.getKey()+",Value = "+entry.getValue()+"\n";
        }
        for(RecordEntity07331 record : AllObjectModel07331.modelRecord07331.getData07331()){
            text+=""+record+"\n";
        }     
        
    }
    @Override
    public String viewDataCluster() {
        FinalCluster();
        return this.text;
    }
}