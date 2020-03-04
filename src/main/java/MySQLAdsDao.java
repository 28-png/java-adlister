import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;

     public MySQLAdsDao(Config config)  {
         try {
             DriverManager.registerDriver(new Driver());
             this.connection = DriverManager.getConnection(
                     config.getUrl(),
                     config.getUsername(),
                     config.getPassword()
             );
         } catch (SQLException e) {
             e.printStackTrace();
         }

    }

    @Override
   public List<Ad> all() {
    List<Ad> output = new ArrayList<>();
    String query = "SELECT * FROM ads";
    try {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
    while(rs.next()) {
        output.add(
                new Ad(
                     rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                )
        );
    }


    } catch (SQLException e) {
        e.printStackTrace();
    }
    return output;

    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }



}