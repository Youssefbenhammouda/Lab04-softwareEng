package problem1.problem1after;

import problem1.problem1before.MySqlConnection;
import problem1.problem1before.MySqlDialect;
import problem1.problem1before.SqlServerConnection;

public class ReportDao {
    private final DatabaseFactory db;

    public ReportDao(DatabaseFactory db) {
        this.db = db;
    }

    public void topStudents(int n) {

        DbConnection dbConnection = db.createConnection();
        System.out.println(dbConnection.connect());
        System.out.println(db.createDialect().selectTop("students",n));

    }
}
