import java.util.*;

abstract class JobRole { public String toString() { return getClass().getSimpleName(); } }
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
}

class ResumeSystem {
    static void processResumes(List<? extends JobRole> list) {
        for (JobRole r : list) System.out.println("Processing " + r);
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>(new DataScientist());
        processResumes(Arrays.asList(r1.role, r2.role));
    }
}

