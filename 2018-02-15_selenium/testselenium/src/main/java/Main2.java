import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zm on 26.07.2018.
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
//        String fileNamePathFromGolden = "src/main/resources/packs_exists2.csv";
//        String fileNamePathToGolden_bagsUpdate = "src/main/resources/packs_exists2_update.csv";
        String fileNamePathFromGolden = "src/main/resources/packs_exists4.csv";
        String fileNamePathFromAsgard = "src/main/resources/fromAsgard.csv";
        String fileNamePathToGolden_bagsUpdate = "src/main/resources/packs_exists_update4.csv";



        //загружаем из файла Goldentreck
        BagsExist bagsExist = new BagsExist(fileNamePathFromGolden,fileNamePathFromAsgard);




        //запись файла
        //bagsExist.writeCSV_bagsUpdate(fileNamePathToGolden_bagsUpdate);








//        System.out.println("size allRows: " + headsCSV.allRows.size());
//        for (int i = 0; i < headsCSV.allRows.size(); i++) {
//            System.out.println((i+1) + " - " +headsCSV.allRows.get(i));
//        }
//
//        System.out.println("size heads: " + headsCSV.heads.size());
//        for (int i = 0; i < headsCSV.heads.size(); i++) {
//            System.out.println((i+1) + " - " +headsCSV.heads.get(i));
//        }
//
//        System.out.println("size rows: " + headsCSV.rows.size());
//        for (int i = 0; i < headsCSV.rows.size(); i++) {
//            System.out.println((i+1) + " - " +headsCSV.rows.get(i));
//        }

        //System.out.println("size rows: " + headsCSV.headsColumns.size());
//        for (int i = 0; i < headsCSV.headsColumns.size(); i++) {
//            System.out.println((i+1) + " - " +headsCSV.headsColumns.get(i));
//        }


        System.out.println("size allRows: " + bagsExist.allRowsAsgard.size());
        for (int i = 0; i < bagsExist.allRowsAsgard.size(); i++) {
            System.out.println((i + 1) + " - " + bagsExist.allRowsAsgard.get(i));
        }



        System.out.println(bagsExist.rows.get(0));
        System.out.println(bagsExist.bags.get(0).toCSV());






    }
}
