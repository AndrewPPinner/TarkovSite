 package com.example.andrew.TarkovSite;

 import com.microsoft.playwright.*;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;

 import java.nio.file.Paths;
 import java.sql.SQLOutput;
 import java.util.*;


 public class Barter {
     private List<Map<String, String>> urlsList = new ArrayList<>();


     public Barter(String itemsPage) {
         getLinks(itemsPage);
     }

     private void getLinks(String itemsPage) {
         System.out.println("Barter");
         Map<String, String> urlMap = new HashMap<>();
         try(Playwright playwright = Playwright.create()) {
             Browser browser = playwright.chromium().launch();
             Page page = browser.newPage();
             page.navigate("https://tarkov-tools.com/items/" + itemsPage);
             page.waitForSelector(".craft-reward-item-title");
             for (int i = 0; i < 250; i++) {
                 page.mouse().wheel(0, 100);
             }
             List<String> item = page.locator(".craft-reward-item-title").allTextContents();
             for (int i = 0; i < item.size(); i++) {
                 String url = "https://tarkov-tools.com" + page.locator(".craft-reward-item-title").nth(i).getAttribute("href");
                 String name = item.get(i);
                 urlMap.put(name,url);
             }
             urlsList.add(urlMap);
         }
     }

     public List<Map<String, String>> getUrlsList() {
         return urlsList;
     }
 }
