import java.util.*;

public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        // TODO: Prevent duplicate IDs (case-sensitive). If duplicate, throw IllegalArgumentException.
        // throw new UnsupportedOperationException("TODO");

        for(Student student: students){
            if(student.getId().equals(s.getId())){
                throw new IllegalArgumentException("Duplicate ID: " + s.getId());
            }
        }
        students.add(s);
    }

    public Student findById(String id){
        // TODO: Return student with matching id or null if not found
        // throw new UnsupportedOperationException("TODO");

        for(Student st : students){
            if(st.getId().equals(id)){
                return st;
            }
        }
        return null;
    }

    public double classAverage(){
        // TODO: Average of student averages (0 if empty)
        // throw new UnsupportedOperationException("TODO");
        if (students.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for(Student st : students){
            total +=st.average();
        }
        return total/students.size();
    }

    public ArrayList<Student> topK(int k){
        // TODO: Return top-k by average (descending). If k > size, return all.
        // throw new UnsupportedOperationException("TODO");
        ArrayList<Student> sortedList = new ArrayList<>(students);
        sortedList.sort((a,b) -> Double.compare(b.average(), a.average()));
        if(k>sortedList.size()){
            return sortedList;
        }
        return new ArrayList<>(sortedList.subList(0,k));    
    }
}
