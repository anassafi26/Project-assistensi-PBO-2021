package Controller;

import Entity.*;
import Model.*;

public class RecordController07331 implements RecordControllerInterface07331{
    @Override
    public void InsertRecord07331(String provinsi07331, int TingkatKematian07331, int JumlahKasus07331, int PotensiPenularan07331) {
        AllObjectModel07331.modelRecord07331.getData07331().add(new RecordEntity07331(provinsi07331, TingkatKematian07331, JumlahKasus07331, PotensiPenularan07331));
    }
    @Override
    public void UpdateRecord07331(int index07331, String provinsi07331, int TingkatKematian07331, int JumlahKasus07331, int PotensiPenularan07331) {
        AllObjectModel07331.modelRecord07331.getData07331().set(index07331, new RecordEntity07331(provinsi07331, TingkatKematian07331, JumlahKasus07331, PotensiPenularan07331));
    }
    @Override
    public void DeleteRecord07331(int index) {
        AllObjectModel07331.modelRecord07331.getData07331().remove(index);
    }
    @Override
    public String ViewDataRecord07331() {
        String text07331;
        text07331 = "Provinsi\tTingkat Kematian\tJumlah Kasus\tPotensi Penularan\n";
        for (int i = 0; i < AllObjectModel07331.modelRecord07331.getData07331().size(); i++) {
            text07331+= ""+ AllObjectModel07331.modelRecord07331.getData07331().get(i).getProvinsi07331()
            +"\t\t"+AllObjectModel07331.modelRecord07331.getData07331().get(i).getTingkatKematian07331()
            +"\t\t"+AllObjectModel07331.modelRecord07331.getData07331().get(i).getJumlahKasus07331()
            +"\t\t"+AllObjectModel07331.modelRecord07331.getData07331().get(i).getPotensiPenularan07331()+"\n";
        }
        return text07331;
    }
}