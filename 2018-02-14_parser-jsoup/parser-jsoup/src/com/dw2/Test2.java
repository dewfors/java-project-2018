package com.dw2;

import com.dw1.Article;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.rukzakoff.ru/product/ryukzak-asgard-galaktika-siniy-r-5437/").get();

//        System.out.println(doc.title());
//        System.out.println(doc);

        //Elements divElements = doc.getElementsByAttributeValue("class","col-xs-6 col-sm-3 col-md-2 product-item-div");
//        Elements divElements = doc.getElementsByAttributeValue("class","features striped").attr("tbody");
//
//
//        divElements.forEach(divElement->{
//
//            System.out.println( "1  " + divElement.text());
//            Element aElement = divElement.child(0).child(0);
//            String url = aElement.attr("href");
//            String title = aElement.text();
//
//            System.out.println(url);
//
//            //articleList.add(new Article(url, title));
//        });




    }
}
