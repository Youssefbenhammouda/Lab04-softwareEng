package problem1.problem1before;

public class Test {
    public static void main(String[] args) {
        new ReportDao("mysql").topStudents(3);
        new ReportDao("sqlserver").topStudents(3);

        // 1. sqlserver should not use LIMIT 3
        // instead the correct sql query is SELECT TOP 3 * FROM students
        // the compiler didn't detect the problem because the current design
        // doesn't there isn't a way to enforce DB and dialect from same family

        // 2. The code smells:
        //     Long method (cohesion) - Duplicated code (DRY) - SHotgun surgery (OCP)/Coupling

        // 3.
    }
}
