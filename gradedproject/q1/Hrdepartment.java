package com.gradedproject.q1;

class Hrdepartment extends SuperDepartment {
	public String departmentName() {
        return "Welcome to HrDepartment";
    }

    public String getTodaysWork() {
        return "Fill today\'s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "complete by EOD";
    }

    public String doActivity() {
        return "Team lunch";
    }

}
