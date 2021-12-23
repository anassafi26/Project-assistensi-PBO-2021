package Entity;

public class ClusterEntity07331 {
    private int TingkatKematianCentroid07331;
    private int JumlahKasusCentroid07331;
    private int PotensiPenularan07331;
    private int clusterNumber07331;

    public ClusterEntity07331 (int TingkatKematianCentroid07331,int JumlahKasusCentroid07331,int PotensiPenularan07331,int clusterNumber07331){
        this.TingkatKematianCentroid07331 = TingkatKematianCentroid07331;
        this.JumlahKasusCentroid07331 = JumlahKasusCentroid07331;
        this.PotensiPenularan07331 = PotensiPenularan07331;
        this.clusterNumber07331 = clusterNumber07331;
    }

    public int getTingkatKematianCentroid07331() {
        return TingkatKematianCentroid07331;
    }
    public int getJumlahKasusCentroid07331() {
        return JumlahKasusCentroid07331;
    }
    public int getPotensiPenularan07331() {
        return PotensiPenularan07331;
    }
    public int getClusterNumber07331() {
        return clusterNumber07331;
    }

    public void setTingkatKematianCentroid07331(int tingkatKematianCentroid07331) {
        TingkatKematianCentroid07331 = tingkatKematianCentroid07331;
    }
    public void setJumlahKasusCentroid07331(int jumlahKasusCentroid07331) {
        JumlahKasusCentroid07331 = jumlahKasusCentroid07331;
    }
    public void setPotensiPenularan07331(int potensiPenularan07331) {
        PotensiPenularan07331 = potensiPenularan07331;
    }
    public void setClusterNumber07331(int clusterNumber07331) {
        this.clusterNumber07331 = clusterNumber07331;
    }

    public double calculateCentroid07331(RecordEntity07331 record07331) {
        return Math.sqrt(Math.pow((getTingkatKematianCentroid07331() - record07331.getTingkatKematian07331()),2) 
        + Math.pow((getJumlahKasusCentroid07331() - record07331.getJumlahKasus07331()),2) 
        + Math.pow((getPotensiPenularan07331() - record07331.getPotensiPenularan07331()),2));
    }
    
    public void updateCentroid07331(RecordEntity07331 record07331) {
        setTingkatKematianCentroid07331(getTingkatKematianCentroid07331()+record07331.getTingkatKematian07331()/2);
        setJumlahKasusCentroid07331(getJumlahKasusCentroid07331()+record07331.getJumlahKasus07331()/2);
        setPotensiPenularan07331(getPotensiPenularan07331()+record07331.getPotensiPenularan07331()/2);
    }

    public String toString(){
        return "Cluster[TingkatKematian="+TingkatKematianCentroid07331 
        +",JumlahKasus="+JumlahKasusCentroid07331
        +",PotensiPenularan="+PotensiPenularan07331
        +",ClusterNumber="+clusterNumber07331+"]";
    }
}