package us.bojie.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("Creating manager: " + department);
            String reportContent = department + " Reporting...";
            manager.setReportContent(reportContent);
            System.out.println(" Created " + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
