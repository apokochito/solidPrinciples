package com.principles.is;

public interface SchoolAdmin {

    // Same system but Interface Segregation implemented
    String blockScheduling(String studentId);

    String leaderships(String society);

    String counselorEducation(String counselor);

}
