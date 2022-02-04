 package com.example.andrew.TarkovSite;

 import java.util.List;

 public class ItemDataObject {
     private String itemName;
     private String itemNickname;
     private String fleaPrice;
     private String traderPrice;
     private String imgUrl;
     private boolean hasQuest;
     private boolean hasHideout;
     private List<String> questName;
     private List<String> hideoutName;

     public ItemDataObject(String itemName, String itemNickname, String fleaPrice, String traderPrice, String imgUrl, boolean hasQuest, boolean hasHideout, List<String> questName, List<String> hideoutName) {
         this.itemName = itemName;
         this.itemNickname = itemNickname;
         this.fleaPrice = fleaPrice;
         this.traderPrice = traderPrice;
         this.imgUrl = imgUrl;
         this.hasQuest = hasQuest;
         this.hasHideout = hasHideout;
         this.questName = questName;
         this.hideoutName = hideoutName;
     }

     public String getItemNickname() {
         return itemNickname;
     }

     public String getFleaPrice() {
         return fleaPrice;
     }

     public List<String> getHideoutName() {
         return hideoutName;
     }

     public String getImgUrl() {
         return imgUrl;
     }

     public String getItemName() {
         return itemName;
     }

     public List<String> getQuestName() {
         return questName;
     }

     public String getTraderPrice() {
         return traderPrice;
     }

     public boolean getHasHideout() {
         return hasHideout;
     }

     public boolean getHasQuest() {
         return hasQuest;
     }
 }
