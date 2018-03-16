/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.model;

import assignment.ennity.News;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Admin
 */
public class ReadingModel {

    private static ArrayList<News> list = new ArrayList<>();
    private static HashSet<String> linkSet = new HashSet<>();
    private static HashMap<String, News> map = new HashMap<>();

   

    public static void getSportLinks() throws IOException {
        Document document = Jsoup.connect("https://vnexpress.net").get();
        Elements elements = document.select("section.container .sidebar_home_1 .title_news a[title]");
        Document document1 = Jsoup.connect("http://dantri.com.vn/su-kien.htm").get();
        Elements elements1 = document1.select(".clearfix .mt3 .mr1 h2 a[title]");
        
        
        for (int i = 0; i < elements.size(); i++) {
           Element get = elements.get(i);
           
       }
       for (Element element : elements) {
           System.out.println(element.text() +     "vnexpress");// lay tieu de
           element.attr("href");
        
         for (int i = 0; i < elements1.size(); i++) {
           Element get = elements1.get(i);
           
       }
       for (Element element1 : elements1) {
           System.out.println(element1.text() +      "DanTri");// lay tieu de
           element1.attr("href");
    }

}

    }

    public static void xaHoi() {
        try {
            Document document = Jsoup.connect("https://vnexpress.net/tin-tuc/the-gioi").get();
            Elements elements = document.select("section.container .sidebar_1 article.list_news a[title]");
            Document document1 = Jsoup.connect("http://dantri.com.vn/xa-hoi.htm").get();
            Elements elements1 = document1.select("#listcheckepl .mt3 .mr1 h2 a[title]");
            
            for (Element element : elements) {
                System.out.println(element.text());
            }
            for (Element element1 : elements1) {
                System.out.println(element1.text());

            }
        } catch (IOException ex) {
            Logger.getLogger(ReadingModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void theThao() {
        try {
            Document document = Jsoup.connect("https://thethao.vnexpress.net/").get();
            Elements elements= document.select("section.container .sidebar_1 article.list_news a[title]");
            Document document1 = Jsoup.connect("http://dantri.com.vn/the-thao.htm").get();
            Elements elements1 = document1.select("#listcheckepl .mt3 .mr1 h2 a[title]");
            for (Element element : elements) {
               System.out.println(element.text());          
            }
            for (Element element : elements1) {
                System.out.println(element.text());

            }

        } catch (IOException ex) {
            Logger.getLogger(ReadingModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void sucKhoe() {
        try {
            Document document = Jsoup.connect("https://suckhoe.vnexpress.net/").get();
            Elements elements = document.select("section.container .sidebar_1 article.list_news a[title]");
            Document document1 = Jsoup.connect("http://dantri.com.vn/suc-khoe.htm").get();
            Elements elements1 = document1.select("#listcheckepl .mt3 .mr1 h2 a[title]");

            for (Element element : elements) {
                System.out.println(element.text());
            }
            for (Element element1 : elements1) {
                System.out.println(element1.text());

            }
        } catch (IOException ex) {
            Logger.getLogger(ReadingModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void phapLuat(){
        try {
            Document document = Jsoup.connect("https://vnexpress.net/tin-tuc/phap-luat").get();
            Elements elements = document.select("section.container .sidebar_1 article.list_news a[title]");
            Document document1 = Jsoup.connect("http://dantri.com.vn/phap-luat.htm").get();
            Elements elements1 = document1.select("#listcheckepl .mt3 .mr1 h2 a[title]");

            for (Element element : elements) {
                System.out.println(element.text());
            }
            for (Element element1 : elements1) {
                System.out.println(element1.text());
                
            }   } catch (IOException ex) {
            Logger.getLogger(ReadingModel.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void giaoDuc(){
        try {
            Document document = Jsoup.connect("https://vnexpress.net/tin-tuc/giao-duc").get();
            Elements elements = document.select("section.container .sidebar_1 article.list_news a[title]");
            Document document1 = Jsoup.connect("http://dantri.com.vn/giao-duc-khuyen-hoc.htm").get();
            Elements elements1 = document1.select("#listcheckepl .mt3 .mr1 h2 a[title]");

            for (Element element : elements) {
                System.out.println(element.text());
            }
            for (Element element1 : elements1) {
                System.out.println(element1.text());
          }   
    } catch (IOException ex) {
            Logger.getLogger(ReadingModel.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}
}
