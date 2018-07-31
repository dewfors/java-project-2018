package com.dw3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://www.rukzakoff.ru/product/ryukzak-asgard-galaktika-siniy-r-5437/").get();
        //System.out.println(document.title());

        //Elements table = document.select("tr");
        Elements tables = document.getElementsByAttributeValue("class","features striped");
        for (Element table : tables) {

            
            Elements trs = table.select("tr");
            int i = 0;
            for (Element tr : trs) {
                Elements names = tr.getElementsByAttributeValue("class","name");

                for (Element name : names) {
                    i++;
                    System.out.println(i);
                    System.out.println(name);
                    //System.out.println(name.getElementsByAttributeValueNot("class","featurestips_wrapper"));
                }
                //System.out.println(name.last().text());
                //System.out.println(name);
            }
            
            //System.out.println(trs);
            //System.out.println(element.attr("src"));
        }



    }
}
