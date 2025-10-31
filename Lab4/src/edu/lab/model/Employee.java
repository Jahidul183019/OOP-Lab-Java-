package edu.lab.model;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id; this.name = name;
    }
    public int getId(){ return id; }
    public String getName(){ return name; }

    @Override
    public int compareTo(Employee other){
        // TODO: compare by name case-insensitively
        // throw new UnsupportedOperationException("TODO");
        if (other == null) return 1;
        return this.name.compareToIgnoreCase(other.name); // case-insensitive compare
    }

    @Override
    public String toString(){
        // TODO: "Employee{id=ID, name='NAME'}"
        // throw new UnsupportedOperationException("TODO");
          return "Employee{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o){
        // TODO: consistent with compareTo on name (case-insensitive)
        // throw new UnsupportedOperationException("TODO");
         if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
        return this.name.equalsIgnoreCase(other.name); // consistent with compareTo
    }
    @Override
    public int hashCode(){
        // TODO: consistent with equals
        // throw new UnsupportedOperationException("TODO");
        return Objects.hash(name.toLowerCase()); // consistent with equals

    }
}
