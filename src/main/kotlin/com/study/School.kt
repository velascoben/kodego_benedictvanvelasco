package com.study

/*

Case Study -

Note : The classes and methods and code produced in the case study will be used in our mobile application sessions.
This will act as the base class Additional classes and methods will be discussed in the future.

You are assigned to create a mobile application for a school.
The mobile application is intended to be used by college administrators,program coordinators, deans, full time teachers
and part-time teachers and students.

The school needs the app to help the students’ needs.

Students should be able to use the application to view their classes for a term.
Students should be able to see their weekly schedule and view where the class is if it is face to face
and see the link if it is an online class.
Student should be able to see their professor and their professor’s available schedule and details


You must create the class mentioned above.
You must create the methods mentioned.
 */

class School : Process(), Display {

    var getStudents = Students()
    var getTeachers = Teachers()
    var getClassrooms = Classrooms()


    override fun enrollment() {
        TODO("Not yet implemented")
    }

    override fun border () {
        println("**************************************")
    }

    override fun loginPage () {
        println("-Login Page-")
    }

    override fun dashboardPage () {
        println("-Dashboard-")
    }

    override fun programTitle () {
        println("WELCOME TO THE PIONEER UNIVERSITY")
    }

    override fun schedule1() {
        println("Class Type: Face to Face")
        println("Subject: Kotlin101")
        println("Time: 8:00 AM to 10:00 AM")
        println("Classroom: Pioneer")
        println("Instructor: Koth Leen")
    }

    override fun schedule2() {
        println("Class Type: Face to Face")
        println("Subject: Programming 101")
        println("Time: 8:00 AM to 10:00 AM")
        println("Classroom: TBA")
        println("Instructor: Koth Leen")
    }

    override fun schedule3() {
        println("Class Type: Online")
        println("Subject: Android 101")
        println("Time: 8:00 AM to 10:00 AM")
        println("Classroom: https://us04web.zoom.us/j/5391993606?pwd=M1JLL2VLL2N6bUlaNVBYeHp4dndBUT09")
        println("Instructor: Anne Droid")
    }

    override fun schedule4() {
        println("Class Type: Online")
        println("Subject: Writing Code the Right Way")
        println("Time: 1:00 PM to 3:00 PM")
        println("Classroom: https://us04web.zoom.us/j/5391993606?pwd=M1JLL2VLL2N6bUlaNVBYeHp4dndBUT09")
        println("Instructor: Anne Droid")
    }

    override fun schedule5() {
        println("Class Type: Online")
        println("Subject: Life of a Programmer")
        println("Time: 3:00 PM to 5:00 PM")
        println("Classroom: https://us04web.zoom.us/j/5391993606?pwd=M1JLL2VLL2N6bUlaNVBYeHp4dndBUT09")
        println("Instructor: Anne Droid")
    }

    override fun schedule6() {
        println("Class Type: Online")
        println("Subject: Flutter 101")
        println("Time: 6:00 PM to 8:00 PM")
        println("Classroom: https://us04web.zoom.us/j/5391993606?pwd=M1JLL2VLL2N6bUlaNVBYeHp4dndBUT09")
        println("Instructor: Koth Leen")
    }

    override fun schedule7() {
        println("Class Type: Online")
        println("Subject: English 101")
        println("Time: 1:00 PM to 3:00 PM")
        println("Classroom: https://us04web.zoom.us/j/5391993606?pwd=M1JLL2VLL2N6bUlaNVBYeHp4dndBUT09")
        println("Instructor: Gram Marr")
    }

    override fun schedule8() {
        println("Class Type: Face to Face")
        println("Subject: PE 101")
        println("Time: 9:00 AM to 10:00 AM")
        println("Classroom: Pioneer Gymnasium")
        println("Instructor: Ma. Saraph")
    }

    override fun teachSchedule1() {
        println("Instructor: Ma. Saraph")
        println("Available Time for Consultation: 5:00 PM to 6:00 PM")
        println("Area for Consultation: College Faculty")
    }

    override fun teachSchedule2() {
        println("Instructor: Gram Marr")
        println("Available Time for Consultation: 5:00 PM to 6:00 PM")
        println("Area for Consultation: College Faculty")
    }

    override fun teachSchedule3() {
        println("Instructor: Koth Leen")
        println("Available Time for Consultation: 5:00 PM to 6:00 PM")
        println("Area for Consultation: College Faculty")
    }

    override fun teachSchedule4() {
        println("Instructor: Anne Droid")
        println("Available Time for Consultation: 5:00 PM to 6:00 PM")
        println("Area for Consultation: College Faculty")
    }
}