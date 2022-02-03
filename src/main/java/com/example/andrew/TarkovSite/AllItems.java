// package com.example.andrew.TarkovSite;

// import org.springframework.http.converter.xml.SourceHttpMessageConverter;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;
// import java.util.Map.Entry;

// @RestController
// public class AllItems {
//     private List<Map<String, String>> allItemList = new ArrayList<>();
//     private Set<String> listOfItems = new HashSet<>();
//     private List<ItemBuilderObject> listOfObjects = new ArrayList<>();

//     Barter barter = new Barter("barter-items");
//     Provisions provisions = new Provisions("provisions");
//     Containers containers = new Containers("containers");
//     Weapons weapons = new Weapons("guns");
//     Keys keys = new Keys("keys");
//     List<Map<String, String>> barterList = barter.getUrlsList();
//     List<Map<String, String>> provisionsList = provisions.getUrlsList();
//     List<Map<String, String>> containersList = containers.getUrlsList();
//     List<Map<String, String>> weaponsList = weapons.getUrlsList();
//     List<Map<String, String>> keyList = keys.getUrlsList();


//     @GetMapping("/test")
//     public List<ItemBuilderObject> gettingInfo() {
//         for (Map<String, String> item : barterList) {
//             allItemList.add(item);
//         }
//         for (Map<String, String> item : provisionsList) {
//             allItemList.add(item);
//         }
//         for (Map<String, String> item : containersList) {
//             allItemList.add(item);
//         }
//         for (Map<String, String> item : weaponsList) {
//             allItemList.add(item);
//         }
//         for (Map<String, String> item : keyList) {
//             allItemList.add(item);
//         }

//         for (Map<String, String> entry : allItemList) {
//             listOfItems.addAll(entry.keySet());
//         }
//         for (String item : listOfItems) {
//             listOfObjects.add(new ItemBuilderObject(item));

//         }



//         return listOfObjects;
//     }
// }
