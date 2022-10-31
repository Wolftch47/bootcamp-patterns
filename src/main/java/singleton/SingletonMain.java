package Singleton;

public class SingletonMain {

    public static void main(String[]arg){
        MySQLDBClient mysqlDBClient = MySQLDBClient.getClient();
        System.out.println(mysqlDBClient.getData());
        MySQLDBClient mysqlDBClient2 = MySQLDBClient.getClient();
        System.out.println(mysqlDBClient2.getData());
        MySQLDBClient mysqlDBClient3 = MySQLDBClient.getClient();
        System.out.println(mysqlDBClient3.getData());
    }
}