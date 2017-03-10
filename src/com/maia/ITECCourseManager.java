package com.maia;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse infotech = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");

        infotech.addStudent("Max");
        infotech.addStudent("Nancy");
        infotech.addStudent("Orson");

        infotech.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1424, 30, "T3060");

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();


        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "T3088");

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ArrayList<ITECCourse> courses = new ArrayList<>();
        courses.add(infotech);
        courses.add(datacomCourse);
        courses.add(maintenanceCourse);

        for (ITECCourse e: courses)
        {
            System.out.println(e.getFreeSpots());
        }



    }


}
