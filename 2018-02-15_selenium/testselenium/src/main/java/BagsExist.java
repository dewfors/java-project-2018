import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zm on 26.07.2018.
 */
public class BagsExist {
    private String fileNamePathFromGolden;
    private String fileNamePathFromAsgard;
    private String fileNamePathToGolden_bagsUpdate;
    public List<String> allRows;
    public List<String> heads;
    public List<String> headsColumns;
    public List<String> rows;
    public List<Bag> bags;

    public List<String> allRowsAsgard;

    public int countHeadsColumns=0;


    public BagsExist(String fileNamePathFromGolden, String fileNamePathFromAsgard) throws Exception{
        this.fileNamePathFromGolden = fileNamePathFromGolden;
        this.fileNamePathFromAsgard = fileNamePathFromAsgard;
        this.allRows = getAllRows();
        this.heads = getHeads();
        this.rows = getRows();
        this.headsColumns = getHeadsColumns();
        this.bags = createBags();
        //из Asgard
        this.allRowsAsgard = getAllRowsAsgard();

    }


    private  List<String> getAllRows() throws Exception{
        List<String> findAllRows = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(fileNamePathFromGolden));

        String line = reader.readLine();
        while (line != null) {
            //System.out.println(line);
            findAllRows.add(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
        }

        return findAllRows;

    }

    public List<String> getRows(){
        List<String> findRows = new ArrayList<String>();


        for (int i = 1; i < allRows.size(); i++) {
            findRows.add(allRows.get(i));
        }


        //findRows.remove(0);

        return findRows;
    }

    public List<String> getHeads(){
        List<String> findHeads = new ArrayList<String>();
        findHeads.add(allRows.get(0));
        return findHeads;
    }

    public List<String> getHeadsColumns() {
        List<String> findHeadsColumns = new ArrayList<String>();
        String strHead = heads.get(0);

        String[] words = strHead.split(";");

        //System.out.println(words);

        //System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            findHeadsColumns.add(words[i]);
        }

        //System.out.println(words.length);
        this.countHeadsColumns = words.length;



        //rows.add(allRows.get(0));
        //System.out.println(rows);
        return findHeadsColumns;
    }

    private List<Bag> createBags(){

        List<Bag> findBags = new ArrayList<Bag>();

        for (int i = 0; i < rows.size(); i++) {
            //System.out.println(rows.get(i));

            String strElement = rows.get(i);

            String[] words = strElement.split(";",this.countHeadsColumns);

            //System.out.println(words);

            //System.out.println(Arrays.toString(words));

            Bag bagAsgard = new Bag(
                    words[0],
                    words[1],
                    words[2],
                    words[3],
                    words[4],
                    words[5],
                    words[6],
                    words[7],
                    words[8],
                    words[9],
                    words[10],
                    words[11],
                    words[12],
                    words[13],
                    words[14],
                    words[15],
                    words[16],
                    words[17],
                    words[18],
                    words[19],
                    words[20],
                    words[21],
                    words[22],
                    words[23],
                    words[24],
                    words[25],
                    words[26],
                    words[27],
                    words[28],
                    words[29],
                    words[30],
                    words[31],
                    words[32],
                    words[33],
                    words[34],
                    words[35],
                    words[36],
                    words[37],
                    words[38],
                    words[39],
                    words[40],
                    words[41],
                    words[42],
                    words[43],
                    words[44],
                    words[45],
                    words[46],
                    words[47],
                    words[48],
                    words[49],
                    words[50]);

            findBags.add(bagAsgard);
            //System.out.println(bagAsgard.toString());

        }

//        for (int i = 0; i < findBags.size(); i++) {
//            //System.out.println(findBags.get(i).toString());
//            System.out.println(findBags.get(i).toCSV());
//        }



        return findBags;
    }


    private  List<String> getAllRowsAsgard() throws Exception{
        List<String> findAllRows = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(fileNamePathFromAsgard));

        String line = reader.readLine();
        while (line != null) {
            //System.out.println(line);
            findAllRows.add(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
        }

        return findAllRows;

    }



    public void writeCSV_bagsUpdate(String fileNamePathToGolden_bagsUpdate){
        File myFile = new File(fileNamePathToGolden_bagsUpdate);

        try {
            //BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,true));
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,false));
            String lineSeparator = System.getProperty("line.separator");

            writer.write(this.heads.get(0) + lineSeparator);

            for (int i = 0; i < bags.size(); i++) {
                writer.write(bags.get(i).toCSV() + lineSeparator);
            }

//            writer.write("123" + lineSeparator);
//            writer.write("123" + lineSeparator);

            writer.flush();
            writer.close();



        }catch (IOException e){
            e.printStackTrace();
        } finally {

        }

    }

}
