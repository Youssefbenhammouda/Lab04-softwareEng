package problem1.problem1after;

public class MySqlFactory extends DatabaseFactory{


    @Override
    public DbConnection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public SqlDialect createDialect() {
        return new MySQLDialect();
    }
}
