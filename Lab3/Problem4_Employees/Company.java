import java.util.*;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee e){
        // TODO: prevent duplicate id; else throw IllegalArgumentException
        // throw new UnsupportedOperationException("TODO");
    for(Employee emp : employees){
            if(emp.getId().equals(e.getId())){
                throw new IllegalArgumentException("Duplicate ID: " + e.getId());
            }
        }
        employees.add(e);
    }

    public Employee richest(){
        // TODO: return employee with highest getPayment() (null if empty)
        // throw new UnsupportedOperationException("TODO");
         if(employees.isEmpty()) return null;

        Employee top = employees.get(0);
        for(Employee e : employees){
            if(e.getPayment() > top.getPayment()){
                top = e;
            }
        }
        return top;
    }

    public void raiseAll(double pct){
        // TODO: call raiseByPercent on all employees
        // throw new UnsupportedOperationException("TODO");
        for(Employee e : employees){
            e.raiseByPercent(pct);
        }
    }

    public int size(){ return employees.size(); }
}
