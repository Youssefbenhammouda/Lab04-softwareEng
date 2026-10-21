package problem1.problem1after;

import problem1.problem1before.MySqlConnection;
import problem1.problem1before.MySqlDialect;
import problem1.problem1before.SqlServerConnection;

public abstract class DatabaseFactory {

    abstract public DbConnection  createConnection() ;

    abstract public  SqlDialect createDialect();


    static public DatabaseFactory forName(String name){

        return switch (name){
            case "mysql" -> new MySqlFactory();
            case "sqlserver" -> new SqlServerFactory();
            case "oracle" -> new OracleFactory();
            default -> throw new RuntimeException("Database `"+name+"` is not yet available.");
        };
    }
}
