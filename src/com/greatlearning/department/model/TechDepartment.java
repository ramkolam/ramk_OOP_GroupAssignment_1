package com.greatlearning.department.model;

public class TechDepartment extends SuperDepartment {
    public String getDepartmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }

    public String toString() {
        return "Welcome to " + this.getDepartmentName() + "\n" + this.getTodaysWork() + "\n" + this.getWorkDeadline()+"\n"+this.getTechStackInformation();
    }

}