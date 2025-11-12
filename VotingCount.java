import java.util.*;
class VotingCount {
    public static void main(String[] args) {
        String[] votes = {"A","B","A","C","A","B","A","C","B","B"};
        Map<String,Integer> map = new HashMap<>();
        for(String v:votes) map.put(v,map.getOrDefault(v,0)+1);
        String winner = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Votes: "+map);
        System.out.println("Winner: "+winner);
    }
}

