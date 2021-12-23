package Entity;

public class RecordEntity07331 {
    private String provinsi07331;
    private int TingkatKematian07331;
    private int JumlahKasus07331;
    private int PotensiPenularan07331;
    private int clusterNumber07331;

    public RecordEntity07331(String provinsi07331,int TingkatKematian07331,int JumlahKasus07331,int PotensiPenularan07331){
        super();
        this.provinsi07331 = provinsi07331;
        this.TingkatKematian07331 = TingkatKematian07331;
        this.JumlahKasus07331 = JumlahKasus07331;
        this.PotensiPenularan07331 = PotensiPenularan07331;
    }

    public String getProvinsi07331() {
        return provinsi07331;
    }
    public int getTingkatKematian07331() {
        return TingkatKematian07331;
    }
    public int getJumlahKasus07331() {
        return JumlahKasus07331;
    }
    public int getPotensiPenularan07331() {
        return PotensiPenularan07331;
    }
    public int getClusterNumber() {
        return clusterNumber07331;
    }

    public void setProvinsi(String provinsi07331) {
        this.provinsi07331 = provinsi07331;
    }
    public void setTingkatKematian(int tingkatKematian07331) {
        TingkatKematian07331 = tingkatKematian07331;
    }
    public void setJumlahKasus(int jumlahKasus07331) {
        JumlahKasus07331 = jumlahKasus07331;
    }public void setPotensiPenularan(int potensiPenularan07331) {
        PotensiPenularan07331 = potensiPenularan07331;
    }
    public void setClusterNumber(int clusterNumber07331) {
        this.clusterNumber07331 = clusterNumber07331;
    }

    public String toString(){
        return "Record[Provinsi="+provinsi07331+",TingkatKematian="+TingkatKematian07331
        +",JumlahKasus="+JumlahKasus07331+",PotensiPenularan="+PotensiPenularan07331
        +",ClusterNumber="+clusterNumber07331+"]";
    }


}
