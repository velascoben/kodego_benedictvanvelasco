package com.study

fun main() {

    // Declarations

    var userCredentials = SearchUsers()
    var userLogin = VerifyLogin()
    var schoolData = School()
    var options : String = ""
    var select : String = ""
    var day : String = ""
    var username : String = ""
    var password : String = ""
    var flag : Boolean = true
    var flag2 : Boolean = true

    // End Declarations

    while (flag) {

        schoolData.border()
        schoolData.programTitle()
        schoolData.border()
        schoolData.loginPage()
        print("Username: ")
        userLogin.user = readln()

        if(userLogin.user != "") {

            while (flag2) {

                schoolData.border()
                username = userLogin.user
                print("Password: ")
                userLogin.pass = readln()

                if (userLogin.pass != "") {
                    flag2 = false
                    password = userLogin.pass

                    if (userCredentials.searchUser(username, password)) {
                        flag = false

                        while (options != "X") {

                            schoolData.border()
                            schoolData.programTitle()
                            schoolData.border()
                            schoolData.dashboardPage()
                            println("[1] Display Classes")
                            println("[2] View Schedule of Instructors")
                            println("[X] Exit System")
                            print("Option: ")
                            options = readln().uppercase()

                            if (options == "1") {

                                while (select != "X") {

                                    schoolData.border()
                                    schoolData.programTitle()
                                    schoolData.border()
                                    println("-Display Classes-")
                                    println("[1] Semester")
                                    println("[2] Weekly")
                                    println("[X] Exit System")
                                    print("Option: ")
                                    select = readln().uppercase()

                                    if (select == "1") {

                                        schoolData.schedule1()
                                        schoolData.border()
                                        schoolData.schedule2()
                                        schoolData.border()
                                        schoolData.schedule3()
                                        schoolData.border()
                                        schoolData.schedule4()
                                        schoolData.border()
                                        schoolData.schedule5()
                                        schoolData.border()
                                        schoolData.schedule6()
                                        schoolData.border()
                                        schoolData.schedule7()
                                        schoolData.border()
                                        schoolData.schedule8()

                                    } else if (select == "2") {

                                        while (day != "X") {

                                            schoolData.border()
                                            schoolData.programTitle()
                                            schoolData.border()
                                            println("-Display Classes-")
                                            println("[1] Monday")
                                            println("[2] Tuesday")
                                            println("[3] Wednesday")
                                            println("[4] Thursday")
                                            println("[5] Friday")
                                            println("[X] Exit System")
                                            print("Option: ")
                                            day = readln().uppercase()

                                            if (day == "1") {
                                                println("[---------------------------MONDAY---------------------------]")
                                                schoolData.schedule1()
                                                schoolData.border()
                                                schoolData.schedule4()
                                            } else if (day == "2") {
                                                println("[---------------------------TUESDAY---------------------------]")
                                                schoolData.schedule2()
                                                schoolData.border()
                                                schoolData.schedule5()
                                            } else if (day == "3") {
                                                println("[---------------------------WEDNESDAY---------------------------]")
                                                schoolData.schedule3()
                                                schoolData.border()
                                                schoolData.schedule7()
                                            } else if (day == "4") {
                                                println("[---------------------------THURSDAY---------------------------]")
                                                schoolData.schedule6()
                                            } else if (day == "5") {
                                                println("[---------------------------FRIDAY---------------------------]")
                                                schoolData.schedule8()
                                            } else {
                                                println("Invalid input!")
                                            }

                                        }

                                    }

                                }

                            // View Schedule of Teachers
                            } else if (options == "2") {
                                println("-Display Classes-")
                                schoolData.teachSchedule1()
                                schoolData.border()
                                schoolData.teachSchedule2()
                                schoolData.border()
                                schoolData.teachSchedule3()
                                schoolData.border()
                                schoolData.teachSchedule4()
                            }

                        }

                    } else {
                        flag = true
                        println("Invalid credentials!")
                    }

                }

                if (flag2) {
                    println("Password cannot be empty!")
                }

            }

        } else {
            flag = true
            println("Username cannot be empty!")
        }


    }

}

class VerifyLogin {

    var user : String = ""
        get() = field
        set(value){
            if(value == "") {
                field = ""
            } else {
                field = value
            }
        }

    var pass : String = ""
        get() = field
        set(value){
            if(value == "") {
                field = ""
            } else {
                field = value
            }
        }
}


fun String.checkIntOrString(): Any {
    var v = toIntOrNull()
    return when(v) {
        null -> "false"
        else -> "true"
    }
}