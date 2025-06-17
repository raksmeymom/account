// Student.java
package kh.edu.cstad.account;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id = 100;
    private String fullname = "Mey";
    private double score = 92.0;

    public int getId() { return id; }
    public String getFullname() { return fullname; }
    public double getScore() { return score; }

    public void setId(int id) { this.id = id; }
    public void setFullname(String fullname) { this.fullname = fullname; }
    public void setScore(double score) { this.score = score; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", fullname='" + fullname + "', score=" + score + "}";
    }
}
