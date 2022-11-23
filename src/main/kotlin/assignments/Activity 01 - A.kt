package assignments

/*

You are tasked to create a directory of the students taking this course.

The data will be used to send updates regarding the classes.

There is also a need to know the progress of the students during the progress of this course.



List down all data that can be used to implement this. Use the proper data types.

 */

fun main() {
    // ------------------------------------------- DECLARATIONS ------------------------------- //

    // Student Data
    var studentID : Int = 0
    var studentFirstName : String = ""
    var studentMiddleName : String = ""
    var studentLastName : String = ""
    var studentClassCode : String = ""

    // Final Grades
    var studentFinalGrade : Double = 0.00
    var studentMonth1Grade : Double = 0.00
    var studentMonth2Grade : Double = 0.00
    var studentMonth3Grade : Double = 0.00
    var studentMonth4Grade : Double = 0.00

    // Month1 Grades
    var studentM1Week1Grade : Double = 0.00
    var studentM1Week2Grade : Double = 0.00
    var studentM1Week3Grade : Double = 0.00
    var studentM1Week4Grade : Double = 0.00

    // Month2 Grades
    var studentM2Week1Grade : Double = 0.00
    var studentM2Week2Grade : Double = 0.00
    var studentM2Week3Grade : Double = 0.00
    var studentM2Week4Grade : Double = 0.00

    // Month3 Grades
    var studentM3Week1Grade : Double = 0.00
    var studentM3Week2Grade : Double = 0.00
    var studentM3Week3Grade : Double = 0.00
    var studentM3Week4Grade : Double = 0.00

    // Month4 Grades
    var studentM4Week1Grade : Double = 0.00
    var studentM4Week2Grade : Double = 0.00
    var studentM4Week3Grade : Double = 0.00
    var studentM4Week4Grade : Double = 0.00

    // ------------------------------------------- DECLARATIONS END ------------------------------- //

    // ------------------------------------------- FORMULA ------------------------------- //

    studentMonth1Grade = studentM1Week1Grade + studentM1Week2Grade + studentM1Week3Grade + studentM1Week4Grade
    studentMonth2Grade = studentM2Week1Grade + studentM2Week2Grade + studentM2Week3Grade + studentM2Week4Grade
    studentMonth3Grade = studentM3Week1Grade + studentM3Week2Grade + studentM3Week3Grade + studentM3Week4Grade
    studentMonth4Grade = studentM4Week1Grade + studentM4Week2Grade + studentM4Week3Grade + studentM4Week4Grade

    studentFinalGrade = studentMonth1Grade + studentMonth2Grade + studentMonth3Grade + studentMonth4Grade

    // ------------------------------------------- FORMULA END ------------------------------- //
}