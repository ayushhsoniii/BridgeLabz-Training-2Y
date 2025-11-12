import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType { public String toString() { return "Exam Course"; } }
class AssignmentCourse extends CourseType { public String toString() { return "Assignment Course"; } }
class ResearchCourse extends CourseType { public String toString() { return "Research Course"; } }

class Course<T extends CourseType> {
    T courseType;
    Course(T courseType) { this.courseType = courseType; }
    public String toString() { return courseType.toString(); }
}

class University {
    static void showCourses(List<? extends CourseType> list) {
        for (CourseType c : list) System.out.println(c);
    }

    public static void main(String[] args) {
        showCourses(Arrays.asList(new ExamCourse(), new AssignmentCourse()));
    }
}

