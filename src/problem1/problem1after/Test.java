package problem1.problem1after;



public class Test {
    public static void main(String[] args) {
//        MySqlFactory mySqlFactory = new MySqlFactory();
//        SqlServerFactory sqlServerFactory = new SqlServerFactory();
//        OracleFactory oracleFactory = new OracleFactory();
//        new ReportDao(mySqlFactory).topStudents(3);
//        new ReportDao(sqlServerFactory).topStudents(3);
//        new ReportDao(oracleFactory).topStudents(3);

        new ReportDao(DatabaseFactory.forName("mysql")).topStudents(3);
        new ReportDao(DatabaseFactory.forName("sqlserver")).topStudents(3);
        new ReportDao(DatabaseFactory.forName("oracle")).topStudents(3);

        // 8. we must chaneg the abstarct class DatabaseFactory and all its implementations to add this new
        // functionnality (it must be coupled with each implementation)
        // 'Extra builder class for every complex product'


    }
}
