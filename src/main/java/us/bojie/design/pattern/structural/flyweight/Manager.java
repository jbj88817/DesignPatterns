package us.bojie.design.pattern.structural.flyweight;

public class Manager implements Employee {

    // Inner condition
    private String title = "Department manager";
    
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(reportContent);
    }
}
