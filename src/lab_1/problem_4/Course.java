package lab_1.problem_4;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String description;
    private int credits;
    private List<String> prerequisites;

    public Course(String name, String description, int credits) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = new ArrayList<>();
    }

    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (").append(credits).append(" credits)");
        if(!prerequisites.isEmpty()){
            sb.append("\nPrerequisites: ").append(String.join(", ", prerequisites));
        }
        return sb.toString();
    }
}
