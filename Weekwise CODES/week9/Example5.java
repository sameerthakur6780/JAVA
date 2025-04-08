package week9;

import java.util.*;
import java.util.stream.*;
class Candidate {
    private String name;
    private int id;

    public Candidate(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Example5 {
    public static void main(String[] args) {
        // Create an ArrayList to store Candidate objects
        List<Candidate> carr = new ArrayList<>();
        carr.add(new Candidate("Sanjay", 101));
        carr.add(new Candidate("Manu", 102));
        carr.add(new Candidate("Maya", 103));
        carr.add(new Candidate("Maya", 104));
        carr.add(new Candidate("Meena", 105));
         //collection into stream
       List<String> carrstream = carr.stream()
                .filter(candidate -> candidate.getName().substring(0,1).equals("M")) // Filter names starting with "M"
                .map(Candidate::getName) 
                .collect(Collectors.toList()); //collecting back into the list
        // Print the filtered carr
        System.out.println("List of candidates whose names start with 'M':");
        carrstream.forEach(System.out::println);

        
        Set<Integer> cSet = carr.stream()
                .filter(candidate -> candidate.getName().substring(0,1).equals("M"))
                .map(Candidate::getId)
                .collect(Collectors.toSet());

        // Print the filtered candidates
        System.out.println("Set of candidates whose names start with 'M':");
        cSet.forEach(System.out::println);
        
        
        TreeSet<String> cTreeSet = carr.stream()
                .filter(candidate -> candidate.getName().substring(0,1).equals("M"))
                .map(Candidate::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet of candidates whose names start with 'M':");
        cTreeSet.forEach(System.out::println);

       //Summarizing
        IntSummaryStatistics summary =
        		cTreeSet.stream().collect(
        		Collectors.summarizingInt(
        		String::length)
        		);
        System.out.println(summary.getSum()); 
        System.out.println(summary.getAverage());
        System.out.println(summary.getCount());
        System.out.println(summary.getMin());
        System.out.println(summary.getMax());
        //Double
        DoubleSummaryStatistics  summary2 =
        		cTreeSet.stream().collect(
        		Collectors.summarizingDouble(
        		String::length)
        		);
        System.out.println(summary2.getSum()); 
        System.out.println(summary2.getAverage());
        System.out.println(summary2.getCount());
        System.out.println(summary2.getMin());
        System.out.println(summary2.getMax());
        
        //Map
        Map<Integer, String> nameToID = carr.stream()
                .filter(candidate -> candidate.getName().substring(0,1).equals("M"))
                .collect(Collectors.toMap(
                        Candidate::getId,
                        Candidate::getName
                ));
        System.out.println("Map of candidates whose names start with 'M':");
        System.out.println(nameToID);
        
        
        //groupingby
        Map<String, List<Candidate>> nameTocandidates =
        		carr.stream().collect(
        		Collectors.groupingBy(
        		Candidate::getName
        		));
        System.out.println("Map nameTocandidates");
        nameTocandidates.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

        
        //partitioningby 
        //Map {true: {},false:{}}
        
        
        Map<Boolean, List<Candidate>> MAndOtherCandidates =
        		carr.stream().collect(
        		Collectors.partitioningBy(
        		c -> c.getName().substring(0,1).equals("M")
        		)
        		);
       // MAndOtherCandidates.forEach((k, v) -> System.out.println(k + ": " + v));
       List<Candidate> startingLetterM =
        		MAndOtherCandidates.get(true);
       
       startingLetterM.forEach(System.out::println);
       
       
    }
        
        
        
  
}
