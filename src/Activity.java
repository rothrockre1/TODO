import java.util.Date;

public class Activity {
    private String name;
    private String description;
    private Date dueDate;

    public Activity(String name, String description, Date dueDate){
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }





}
