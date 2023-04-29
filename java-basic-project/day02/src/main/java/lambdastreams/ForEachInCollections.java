package lambdastreams;

import java.util.*;

public class ForEachInCollections {
    public static void main(String[] args) {
        List<String> stringList1=new ArrayList<>();
        stringList1.add("abc");
        stringList1.add("def");
        stringList1.add("ghi");
        stringList1.forEach(s-> System.out.println(s));

        Set<String> set1=new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.forEach(s-> System.out.println(s));

        Map<String,String> mp=new HashMap<>();
        mp.put("1","one");
        mp.forEach((k,v)-> System.out.println(k+"=="+v));
        int i[]={1,2};
        Arrays.asList().forEach(e-> System.out.println(e));
    }


}
