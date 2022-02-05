 package com.example.andrew.TarkovSite;


 import com.microsoft.playwright.Browser;
 import com.microsoft.playwright.Page;
 import com.microsoft.playwright.Playwright;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;

 import java.util.List;

 @RestController
 public class ItemDataController {
     private String itemName;
     private String itemNickname;
     private String fleaPrice;
     private String traderPrice;
     private String imgUrl;
     private List<String> questName;
     private List<String> hideoutName;
     private boolean hasQuest;
     private boolean hasHideout;


     @GetMapping("/item/value")
     public ItemDataObject itemValue(@RequestParam(value = "link") String url) {
         hasQuest = false;
         hasHideout = false;
         try(Playwright playwright = Playwright.create()) {
             Browser browser = playwright.chromium().launch();
             Page page = browser.newPage();
             page.navigate(url);
             page.waitForSelector(".quest-name-wrapper");
             itemName = page.locator(".item-image").first().getAttribute("alt");
             itemNickname = page.locator(".item-information-wrapper").locator("cite").textContent();
             fleaPrice = page.locator(".flea-wrapper ").textContent();
             traderPrice = page.locator(".first-trader-price").textContent();
             imgUrl = page.locator(".item-image").last().getAttribute("src");
             questName = page.locator(".quest-name-wrapper").allTextContents();
             hideoutName = page.locator(".hideout-name-wrapper").allTextContents();
             if (!questName.isEmpty()) {
                 hasQuest = true;
             }
             if(!hideoutName.isEmpty()) {
                 hasHideout = true;
             }

         }



         return new ItemDataObject(itemName, itemNickname, fleaPrice, traderPrice, imgUrl, hasQuest, hasHideout, questName, hideoutName);
     }




 }
