package SoftServe.GenericCollection.HomeWork;


import java.util.*;
import java.util.function.Function;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class Main {
    private static Set<Integer> setOne = new HashSet<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
    private static Set<Integer> setTwo = new HashSet<>(Arrays.asList(5,6,7,8,9,10,11,12,13,14));
    private static Map<String,String> map = new HashMap<>();
    static{
        map.put("Doe",    "John");
        map.put("Lun",    "Greg");
        map.put("Smith",  "Jack");
        map.put("Johnson","Will");
        map.put("Brown",  "Jack");
        map.put("Davis",  "Adam");
        map.put("Miller", "Fill");
        map.put("Wilson", "Adam");
        map.put("Morris", "Peter");
        map.put("Cooper ", "Alan");
    }

    public static void main(String[] args) {
        //---------------1-----------------------
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        System.out.println(union(setOne,setTwo));
        //[5, 6, 7, 8, 9] something like inner join
        System.out.println(intersect(setOne,setTwo));
        System.out.println();

        //---------------2------------------------------
        //2.1
        map.forEach((K,V) -> System.out.println(K +" "+ V));
        System.out.println();

       /*
        System.out.println(map);

        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }*/

        //2.2
        Map<String,Integer> countDuplicateName = new HashMap<>();
        for(Map.Entry<String,String> entry : map.entrySet()){
            String firstNameTmp = entry.getValue();
            if(!countDuplicateName.containsKey(firstNameTmp)){
                countDuplicateName.put(firstNameTmp, 1);
            }else{
                countDuplicateName.put(firstNameTmp,countDuplicateName.get(firstNameTmp)+1);
            }
        }
        countDuplicateName.forEach((K,V)->{
            if(V >= 2) System.out.println("There are " + V + " " + K +"(s)");
        });

        /*
         Or we can use super power Java 8
         PS. Like SQL :)

         Map<String, Long> countDuplicateNameJava8 = map.values()
                .stream().collect(groupingBy(Function.identity(), counting()));

        */

        //2.3 remove all Adam's from map
        // If we'll be try remove element through map traversing, java will throw ConcurrentModificationException
        // that's why we must use iterator or java 8 feature
        String valueToRemove = "Adam";
        Iterator<Map.Entry<String,String>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()){
            Map.Entry<String, String> entry = mapIterator.next();
            if(entry.getValue().equals(valueToRemove)){
                mapIterator.remove();
            }
        }

        /*  or Java 8
         map.entrySet().removeIf(entry -> entry.getValue().equals(valueToRemove));
       */

        //{Brown=Jack, Johnson=Will, Lun=Greg, Miller=Fill, Smith=Jack, Morris=Peter, Cooper =Alan, Doe=John}
        System.out.println(map);

    }



    private static <T> Set<T> union(Set<T> setOne, Set<T> setTwo) throws IllegalArgumentException{
        if(setOne == null || setTwo == null){
            throw new IllegalArgumentException("Argument cannot be null");
        }

        Set<T> union = getSetImplCopy(setOne);
        union.addAll(setTwo);
        return union;

    }

    private static <T> Collection<T> intersect(Set<T> setOne, Set<T> setTwo)throws IllegalArgumentException{
        if(setOne == null || setTwo == null){
            throw new IllegalArgumentException("Argument cannot be null");
        }

        Set<T> intersect = getSetImplCopy(setOne);
        intersect.retainAll(setTwo);
        return intersect;
    }


    private static <T> Set<T> getSetImplCopy(Set<T> set) throws IllegalArgumentException{
        if(set.getClass() == HashSet.class){
            return new HashSet<>(set);
        }
        else if(set.getClass() == TreeSet.class){
            return new HashSet<>(set);
        }
        else if(set.getClass() == LinkedHashSet.class) {
            return new LinkedHashSet<>(set);
        }else throw new IllegalArgumentException("Unsupported Set interface implementation");
    }
}
