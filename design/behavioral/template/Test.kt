package design.behavioral.template

fun main() {
    val designPatterCourse = DesignPatterCourse()
    designPatterCourse.makeCourse()
    println()
    val feCourse = FECourse(true)
    feCourse.makeCourse()
}