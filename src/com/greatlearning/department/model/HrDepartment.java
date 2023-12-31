package com.greatlearning.department.model;

public class HrDepartment extends SuperDepartment {
    public String getDepartmentName() {
        return "Hr Department";
    }

    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team Lunch";
    }


    public String toString() {
        return "Welcome to " + this.getDepartmentName() + "\n" +this.doActivity()+"\n"+ this.getTodaysWork() + "\n" + this.getWorkDeadline() ;
    }

}