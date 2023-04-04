/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collectionfw;
import java.util.*;
/**
 *
 * @author Dell
 */
public class CollectionFW {
    
    public static void main(String[] args) {
        demoArrayList();
        demo1();
        Countrydemo();
        treeMapDemo();
        
        
        System.out.println("\n");
        int score = 65;
        System.out.println("-----using if");
        System.out.println(gradeletter(score));
        System.out.println("-----using treeMap");
        System.out.println(gradeletterTreeMap(score));
        
        System.out.println("\n");
        demoSet();
        setDemo2();
        setDemo3();
        
        System.out.println("\n");
        uniondemo();
        uniondemo2();
        intersectionDemo();
        DifferanceDemo();
        
        System.out.println("---------------Stack");
        Stackdemo();
        
        System.out.println("---------------queue");
        Queuedemo();
        System.out.println("-------------");
        Queuedemo1();
    }

    public static void demoArrayList() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("orange", "Juice",40));
        menus.add(new Drink("apple", "Juice",20));
        menus.add(new Drink("lemon", "Juice",55));
        menus.add(new Drink("coke", "Soda",45));
        menus.add(new Drink("mocha", "Juice",30));
        menus.add(new Drink("coffee", "Coffee",20));
        menus.add(new Drink("fanta", "Soda",48));
        menus.add(new Drink("sprite", "Soda",10));
        
        Comparator<Drink> cmpPrice = new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };
        
            Collections.sort(menus, cmpPrice);
        
//        System.out.println(menus.get(3));
        
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }
    
    public static void demo1() {
        //Map Interface
        //HashMap implement Map Interface
        System.out.println("\n");
        Map<String, String> m = new HashMap<String, String>();
        m.put("cn", "China");
        m.put("th", "Thailand");
        m.put("jp", "Japan");
        
        System.out.println(m.get("th"));
        for(Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
        
        System.out.println("--------------");
        m.put("th", "siam");
        for(Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
        
        if(m.containsValue("Japan")) {
            System.out.println("Found Japan");
        }
        
        if(m.containsKey("cn")) {
            System.out.println("Found key cn");
            m.remove("cn");
            System.out.println("\n");
            System.out.println("-------remove cn");
            for(Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
        }
    }
    
      public static void Countrydemo() {
          System.out.println("\n");
        Map<String , Country> m = new HashMap<String , Country>();
        m.put("th", new Country("pra ted thai", "Thailand"));
        m.put("jp", new Country("pra ted yee pung", "Japan"));
        m.put("cn", new Country("pra ted jeen", "China"));
          System.out.println(m.get("jp"));
    }
      
      public static void treeMapDemo() {
          //treeMap assending automatic
          System.out.println("\n");
        TreeMap<Integer, String> m = new TreeMap<Integer, String>();
        m.put(1133, "test");
        m.put(112, "shhh");
        m.put(1112, "KFC");
        m.put(1150, "Pizza");
        
        
        for(Map.Entry<Integer, String> item : m.entrySet()) {
            Integer key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
    }
      
      public static String gradeletter(int score) {
        String grade = "";
          if(score >= 80) {
            grade = "A";
        } else if(score >= 70) {
            grade = "B";
        } else if(score >= 60) {
            grade = "C";
        } else if(score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        } 
          return grade;
    }
      
      public static String gradeletterTreeMap(int score) {
          TreeMap<Integer, String> gradeMap = new TreeMap<Integer, String> ();
          gradeMap.put(0, "F");
          gradeMap.put(50, "D");
          gradeMap.put(60, "C");
          gradeMap.put(70, "B");
          gradeMap.put(80, "A");
          return gradeMap.floorEntry(score).getValue();
         
          
      } 
      
    public static void demoSet() {
        Set<String> setA = new HashSet<String>();
        setA.add("mango");
        setA.add("banana");
        setA.add("orange");
        setA.add("strawberry");
        setA.add("banana");
        
        System.out.printf("%s%n", setA);
        
    }
    
     public static void setDemo2() {
        Set<String> setA = new HashSet<String>(Arrays.asList("mango", "banana","orange","strawberry","banana"));
        System.out.printf("%s%n", setA);
             
    }
 
     public static void setDemo3() {
        List<String> fruits = new ArrayList<String>(Arrays.asList("mango", "banana","orange","strawberry","banana"));
        
        Set<String> setA = new HashSet<String>(fruits);
        Set<String> setB = new LinkedHashSet<String>(fruits);
        Set<String> setC = new TreeSet<String>(fruits);
       
        System.out.printf("HashSet : %s%n", setA);
        System.out.printf("LinkedHashSet : %s%n", setB);
        System.out.printf("TreeSet : %s%n", setC);
             
    }  
      
     public static void uniondemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        
        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        setA.addAll(setB);
        System.out.printf("%s%n", setA);
       
    }
     
     public static void uniondemo2() {
        Set<String> setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        
        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);
        System.out.printf("setC = %s%n", setC);
       
    }
     
     public static void intersectionDemo() {
         Set<String> setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        
        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        Set<String> setC = new HashSet<>(setA);
        setC.retainAll(setB);
        System.out.printf("setC = %s%n", setC);
     }
     
     public static void DifferanceDemo() {
         Set<String> setA = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B","C","D","E","F"));
        
        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        Set<String> setC = new HashSet<>(setA);
        setC.removeAll(setB);
        System.out.printf("setC = %s%n", setC);
     }
     
    public static void Stackdemo() {
        Stack<String> st = new Stack<>();
        st.push("mango");
        st.push("coconut");
        st.push("banana");
        st.push("apple");
        
        System.out.println(st);
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.search("coconut"));
        System.out.println(st.search("mango"));

        System.out.println(st.contains("apple")); 
        //find your object
        System.out.println(st.contains("coconut"));
        
        System.out.println("---------poping-------");
        while(!st.empty()) {
            System.out.println(st.pop());
        }
        
        System.out.println(st);
        
    }
    
    public static void revertingString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            System.out.println(st);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()) {
            sb.append(st.pop());
        }
    }
    
    public static void Queuedemo() {
      Queue<String> q = new LinkedList<String>();
      q.offer("mango");
      q.offer("apple");
      q.offer("coffee");
      
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
    }
 
    
    public static void Queuedemo1() {
        Queue<WaitingLine> queues = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queues.offer(new WaitingLine());
            
        }
        displayQueueInfo(queues);
    }
    public static void displayQueueInfo(Queue<WaitingLine> queues) {
        for (WaitingLine queue : queues) {
            System.out.println(queues);
        }
    }

    }

    
