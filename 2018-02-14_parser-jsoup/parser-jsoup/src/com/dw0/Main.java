package com.dw0;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws Exception {

        //Jsoup.parse("index.html");

        //Document document = Jsoup.connect("https://www.youtube.com/").get();
        Document document = Jsoup.connect("http://www.asbags.ru/Product/GetByShortNameWithFilter?shortName=r5722&showExisted=False").get();
        System.out.println(document.title());

        Elements elements = document.select("img");
        for (Element element : elements) {
            //System.out.println(element);
            System.out.println(element.attr("src"));
        }

    }

}
