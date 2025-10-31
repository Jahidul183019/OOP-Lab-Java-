import java.util.*;

public class Student {
    private String id;
    private String name;
    private HashMap<String, Integer> marks = new HashMap<>(); // subject -> marks

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    // TODO: addSubjectMark(String subject, int mark)
    // - Overwrite if subject already exists
    // - Validate: 0 <= mark <= 100, else throw IllegalArgumentException
    public void addSubjectMark(String subject, int mark){
        // throw new UnsupportedOperationException("TODO");
        
        if(mark<0 || mark>100){
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        marks.put(subject,mark);
    }

    // TODO: average() -> double
    // - Return average marks across all subjects (0 if no subjects)
    public double average(){
        // throw new UnsupportedOperationException("TODO");
        if(marks.size()==0){
            return 0.0;
        }
        double sum =0.0;

    for(int m: marks.values()){
        sum+=m;
    }
     return sum/marks.size();
    }

    // TODO: highestSubject() -> String (subject name)
    // - Return subject with highest mark (null if none)
    public String highestSubject(){
        // throw new UnsupportedOperationException("TODO");

        if(marks.size()==0){
            return null;
        }
        String highestSub = null;
        int highestMark = -1;

        for(Map.Entry<String,Integer> entry: marks.entrySet()){
            if(entry.getValue()>highestMark){
                highestMark = entry.getValue();
                highestSub = entry.getKey();
            }
        }
        return highestSub;
    }

    // TODO: lowestSubject() -> String (subject name)
    // - Return subject with lowest mark (null if none)
    public String lowestSubject(){
        // throw new UnsupportedOperationException("TODO");

        if(marks.size()==0){
            return null;
        }
        String lowerSub = null;
        int lowerMark = 101;

        for(Map.Entry<String,Integer>entry : marks.entrySet()){
            if(entry.getValue()<lowerMark){
                lowerMark = entry.getValue();
                lowerSub = entry.getKey();
            }
        }
         return lowerSub;

    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public Map<String,Integer> getMarksView(){ return Collections.unmodifiableMap(marks); }
}
