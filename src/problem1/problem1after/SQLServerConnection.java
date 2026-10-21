package problem1.problem1after;

public class SQLServerConnection implements  DbConnection{
    @Override
    public String connect() {
        return "Connected to SQL Server on port 1433";
    }
}
