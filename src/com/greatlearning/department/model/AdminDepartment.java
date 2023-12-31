package com.greatlearning.department.model;

public class AdminDepartment extends SuperDepartment {
    public String getDepartmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String toString() {
        return "Welcome to " + this.getDepartmentName() + "\n" + this.getTodaysWork() + "\n" + this.getWorkDeadline() ;
    }

}