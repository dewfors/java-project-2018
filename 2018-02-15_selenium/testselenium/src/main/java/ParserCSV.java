import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zm on 31.07.2018.
 */
public class ParserCSV {

    List<String> getAllRows(String fileName) throws Exception{
        List<String> findAllRows = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = reader.readLine();
        while (line != null) {
            //System.out.println(line);
            findAllRows.add(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
        }

        return findAllRows;

    }


    public List<String> getHeads(List<String> allRows){
        List<String> findHeads = new ArrayList<String>();
        findHeads.add(allRows.get(0));
        return findHeads;
    }

    public List<String> getRows(List<String> allRows){
        List<String> findRows = new ArrayList<String>();

        for (int i = 1; i < allRows.size(); i++) {
            findRows.add(allRows.get(i));
        }

        return findRows;
    }

    public List<String> getHeadsColumns(List<String> heads, String regex) {
        List<String> findHeadsColumns = new ArrayList<String>();
        String strHead = heads.get(0);

        //String[] words = strHead.split(";");
        String[] words = strHead.split(regex);


        for (int i = 0; i < words.length; i++) {
            findHeadsColumns.add(words[i]);
        }

        return findHeadsColumns;
    }

    List<Bag> createBagsGolden(List<String> rows, int sizeColumn){

        List<Bag> findBags = new ArrayList<Bag>();

        for (int i = 0; i < rows.size(); i++) {

            String strElement = rows.get(i);

            String[] words = strElement.split(";",sizeColumn);

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
        }


        return findBags;
    }

    List<BagPost> createBagsPost(List<String> rows, int sizeColumn){

        List<BagPost> findBags = new ArrayList<BagPost>();

        for (int i = 0; i < rows.size(); i++) {

            String strElement = rows.get(i);
            //System.out.println(strElement);

            strElement = replaceIncorrectSymbols(strElement);
            //System.out.println(strElement);

            String[] words = strElement.split(",",sizeColumn);

            //System.out.println(Arrays.toString(words));

            BagPost bagPost = new BagPost(
                    words[0],
                    words[1],
                    words[2],
                    words[3],
                    words[4],
                    words[5]);

            findBags.add(bagPost);
//            break;
        }


        return findBags;
    }

    public void writeCSV_bagsUpdate(String fileNamePathToGolden_bagsUpdate, List<String> heads, List<Bag> bags){
        File myFile = new File(fileNamePathToGolden_bagsUpdate);

        try {
            //BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,true));
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,false));
            String lineSeparator = System.getProperty("line.separator");

            writer.write(heads.get(0) + lineSeparator);

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

        System.out.println("Файл: " + fileNamePathToGolden_bagsUpdate + " записан");

    }


    private String replaceIncorrectSymbols(String str){
        str = str.replaceAll(",00\"",".00\"");
        str = str.replaceAll(",\"",",");
        str = str.replaceAll("\",",",");
        str = str.replaceAll("\"","");
        return str;
    }


}
