package com.principles.is;

public class School implements SchoolAdmin, SchoolAlerts {


    @Override
    public String blockScheduling(String studentId) {
        return null;
    }

    @Override
    public String leaderships(String society) {
        return "Society added";
    }

    @Override
    public String counselorEducation(String counselor) {
        return null;
    }

    @Override
    public String cyberbullying(String classId) {
        return "Alert added";
    }

    @Override
    public String dressCode(String studentId) {
        return null;
    }

    @Override
    public String drugTesting(String studentId) {
        return null;
    }
}
