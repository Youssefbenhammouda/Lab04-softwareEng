package problem1.problem1after;

public class SqlServerFactory extends DatabaseFactory{

    @Override
    public DbConnection createConnection() {
        return new SQLServerConnection();
    }

    @Override
    public SqlDialect createDialect() {
        return new SQLServerDialect();
    }
}
