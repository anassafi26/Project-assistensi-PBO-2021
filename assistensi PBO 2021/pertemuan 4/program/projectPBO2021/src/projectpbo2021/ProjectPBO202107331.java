package projectpbo2021;
import Controller.AllObjectController07331;
import java.util.Scanner;
import Gui.RecordGui07331;
public class ProjectPBO202107331 {
    static Scanner input07331 = new Scanner(System.in);
    public static void main(String[] args) {
        dataDefault();
        RecordGui07331 g07331 = new RecordGui07331();
    }
    static void dataDefault(){
        AllObjectController07331.recordController07331.InsertRecord07331("Jatim", 19, 15, 39);
        AllObjectController07331.recordController07331.InsertRecord07331("Jateng", 21, 15, 81);
        AllObjectController07331.recordController07331.InsertRecord07331("Kalbar", 20, 16, 6);
        AllObjectController07331.recordController07331.InsertRecord07331("Jabar", 23, 16, 77);
        AllObjectController07331.recordController07331.InsertRecord07331("Sulteng", 31, 17, 40);
        AllObjectController07331.recordController07331.InsertRecord07331("sumut", 22, 17, 76);
        }    
    }
