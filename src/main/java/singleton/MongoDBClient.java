package Singleton;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


public class MySQLDBClient {
    public static MySQLDBClient client = null;
    public static MongoClient mysqlClient;

    private MySQLDBClient()
    {
        try
        {

            mysqlClient = MongoClients.create(System.getProperty("mysql.uri"));

        }
        catch( MongoException me)
        {
            me.getStackTrace();
        }
    }
    public static MySQLDBClient getClient()
    {
        if (client == null){
            System.out.println("Primera vez");
            client = new MySQLDBClient();
        }

        return client;
    }

    public long getData(){
        return this.mysqlClient.getDatabase("myFirstDatabase").getCollection("bootcamp").countDocuments();
    }
}
