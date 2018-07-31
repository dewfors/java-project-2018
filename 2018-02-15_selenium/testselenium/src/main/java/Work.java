import java.util.List;

/**
 * Created by zm on 31.07.2018.
 * Данный проект для загрузки и обновления рюкзаков Asgard
 */
public class Work {
    String fileCsvFromGolden = "src/main/resources/packs_exists.csv";
    String fileCsvToGoldenUpd = "src/main/resources/packs_exists_upd.csv";
    String fileCsvToGoldenNew = "src/main/resources/packs_exists_new.csv";
    String fileCsvFromPost = "src/main/resources/fromAsgard.csv";


    List<String> allRowsGolden;
    List<String> headsGolden;
    List<String> rowsGolden;
    List<String> headsColumnsGolden;
    List<Bag> bagsGoldenToUpdate;

    List<String> allRowsPost;
    List<String> headsPost;
    List<String> rowsPost;
    List<String> headsColumnsPost;
    List<Bag> bagsPostToUpdate;

    public void start() throws Exception{

        ParserCSV parser = new ParserCSV();

        allRowsGolden = parser.getAllRows(fileCsvFromGolden);
        headsGolden = parser.getHeads(allRowsGolden);
        rowsGolden = parser.getRows(allRowsGolden);
        headsColumnsGolden = parser.getHeadsColumns(headsGolden, ";");
        bagsGoldenToUpdate = parser.createBagsGolden(rowsGolden,headsColumnsGolden.size());

        allRowsPost = parser.getAllRows(fileCsvFromPost);
        headsPost = parser.getHeads(allRowsPost);
        rowsPost = parser.getRows(allRowsPost);
        headsColumnsPost = parser.getHeadsColumns(headsPost, ",");

        System.out.println(headsPost);


        //Запись обновленных данных
        //parser.writeCSV_bagsUpdate(fileCsvToGoldenUpd, headsGolden,bagsGoldenToUpdate);

        for (int i = 0; i < headsColumnsPost.size(); i++) {
            System.out.println((i+1) + " - " +headsColumnsPost.get(i));
        }



    }

}
