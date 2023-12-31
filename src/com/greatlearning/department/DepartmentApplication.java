package com.greatlearning.department;

import com.greatlearning.department.model.AdminDepartment;
import com.greatlearning.department.model.HrDepartment;
import com.greatlearning.department.model.SuperDepartment;
import com.greatlearning.department.model.TechDepartment;

public class DepartmentApplication {
    public void init() {
        AdminDepartment adminDepartment = new AdminDepartment();
        System.out.println(adminDepartment);

        SuperDepartment superDepartment = new AdminDepartment();
        System.out.print(superDepartment.isTodayAHoliday());

        System.out.println("\n");
        HrDepartment hrDepartment = new HrDepartment();
        System.out.println(hrDepartment);

        superDepartment = new HrDepartment();
        System.out.print(superDepartment.isTodayAHoliday());

        System.out.println("\n");
        TechDepartment techDepartment = new TechDepartment();
        System.out.println(techDepartment);

        superDepartment = new TechDepartment();
        System.out.print(superDepartment.isTodayAHoliday());
    }
}
