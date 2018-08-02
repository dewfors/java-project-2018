import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zm on 31.07.2018.
 * Данный проект для загрузки и обновления рюкзаков Asgard
 */

// TODO: 02.08.2018 Сделать фильтр по товарам из файла голден, которые не Асгард 

public class Work {
    String fileCsvFromGolden = "src/main/resources/packs_exists_2018-08-02_utf-8.csv";
    String fileCsvToGoldenUpd = "src/main/resources/packs_exists_upd.csv";
    String fileCsvToGoldenNew = "src/main/resources/packs_exists_new.csv";
    String fileCsvFromPost = "src/main/resources/fromAsgard.csv";


    List<String> allRowsGolden;
    List<String> headsGolden;
    List<String> rowsGolden;
    List<String> headsColumnsGolden;
    List<Bag> bagsGolden;

    List<String> allRowsPost;
    List<String> headsPost;
    List<String> rowsPost;
    List<String> headsColumnsPost;
    List<BagPost> bagsPost;

    Map<String,Bag> mapBagsGolden = new HashMap<String, Bag>();
    Map<String,BagPost> mapBagsPost  = new HashMap<String, BagPost>();

    List<String> namesGoldenUpdate = new ArrayList<String>();
    List<String> namesGoldenNew = new ArrayList<String>();

    public void start() throws Exception{

        ParserCSV parser = new ParserCSV();

        allRowsGolden = parser.getAllRows(fileCsvFromGolden);
        headsGolden = parser.getHeads(allRowsGolden);
        rowsGolden = parser.getRows(allRowsGolden);
        headsColumnsGolden = parser.getHeadsColumns(headsGolden, ";");
        bagsGolden = parser.createBagsGolden(rowsGolden,headsColumnsGolden.size());

        allRowsPost = parser.getAllRows(fileCsvFromPost);
        headsPost = parser.getHeads(allRowsPost);
        rowsPost = parser.getRows(allRowsPost);
        headsColumnsPost = parser.getHeadsColumns(headsPost, ",");
        bagsPost = parser.createBagsPost(rowsPost,headsColumnsPost.size());

//        for (int i = 0; i < bagsPost.size(); i++) {
//            System.out.println(bagsPost.get(i));
//        }


        //создаем мэп Голден
        for (int i = 0; i < bagsGolden.size(); i++) {
            Bag bag = bagsGolden.get(i);

            //System.out.println(bag.toString());
            //System.out.println(bag.name);
            mapBagsGolden.put(bag.name,bag);
        }


//        Bag bag1 = bagsGolden.get(0);
//        mapBagsGolden.put(bag1.name,bag1);
        //System.out.println(mapBagsGolden.get("\"Рюкзак Asgard Р-5555 ХакиW\""));
        //System.out.println(mapBagsGolden.size());

        //


        //создаем мэп от поставщика
        for (int i = 0; i < bagsPost.size(); i++) {
            BagPost bagPost = bagsPost.get(i);
            mapBagsPost.put(bagPost.name,bagPost);
        }

        //создаем список  товаров для обновления
        // при этом фильтруем товары от поставщика по первой букве "Р-"
        for (int i = 0; i < bagsGolden.size(); i++) {
            Bag bag = bagsGolden.get(i);
            String productName = bag.name;
            namesGoldenUpdate.add(productName);
        }



        //создаем список новых товаров
        for (int i = 0; i < bagsPost.size(); i++) {
            BagPost bagPost = bagsPost.get(i);
            String productName = bagPost.productName;

            if (productName.charAt(0) == 'Р' && productName.charAt(1) == '-'){
                //System.out.println(bagsPostToUpdate.get(i).productName);
                if (isExistInGolden(bagPost.name)){
                    //namesGoldenUpdate.add(bagPost.name);
                } else {
                    namesGoldenNew.add(bagPost.name);
                }
            }
        }

//        mapBagsGolden.forEach((k, v) -> System.out.println(k + ": " + v));
//        System.out.println("---");

        //обновляем товары
        for (int i = 0; i < namesGoldenUpdate.size(); i++) {
            //System.out.println(namesGoldenUpdate.get(i));

            String nameToUpdate = namesGoldenUpdate.get(i);
            Bag bag = mapBagsGolden.get(nameToUpdate);
            BagPost bagPost = mapBagsPost.get(nameToUpdate);

            if (bagPost == null){
                //если нет соответствия
                //System.out.println("-----не нашел рюкзак: " + nameToUpdate);

                //bag.priceZakup = bagPost.priceZakup;
                bag.count = "0";
                bag.countM = "0";
                //bag.priceSale = bagPost.priceSale;

            } else {
                //если есть соответствие
                //System.out.println("рюкзак: " + nameToUpdate);

                bag.priceZakup = bagPost.priceZakup;
                bag.count = bagPost.count;
                //bag.countM = "";
                bag.countM = bagPost.count;
                bag.priceSale = bagPost.priceSale;
            }

        }



//        mapBagsGolden.forEach((k, v) -> System.out.println(k + ": " + v));


        //mapBagsGolden.forEach((k, v) -> System.out.println(k + ": " + v));
        //mapBagsPost.forEach((k, v) -> System.out.println(k + ": " + v));


        System.out.println(headsPost);

//        for (int i = 0; i < bagsPost.size(); i++) {
//            System.out.println(bagsPost.get(i));
//        }


        //System.out.println(isExistInGolden("Рюкзак Asgard Р-5555 ХакиW"));



        //Запись обновленных данных
        parser.writeCSV_bagsUpdate(fileCsvToGoldenUpd, headsGolden,bagsGolden);



    }

    private boolean isExistInGolden(String name){
        //System.out.println(name);
        //System.out.println(mapBagsGolden.get(name));
        if (mapBagsGolden.get(name) != null) return true;
        return false;
    }











}
