package problem1.problem1after;

public class OracleFactory extends DatabaseFactory {
    @Override
    public DbConnection createConnection() {
        return new OracleConnection();
    }

    @Override
    public SqlDialect createDialect() {
        return new OracleDialect();
    }
}
