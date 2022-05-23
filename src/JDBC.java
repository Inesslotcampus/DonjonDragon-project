import java.sql.*;

public class JDBC {

    public void connectToBDD(String Type,String Name,int LeveLife,int Strength){

  try {
      Class.forName("org.mariadb.jdbc.Driver");

      Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/donjondragon", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from hero");

//        while (resultSet.next()){
//
//            System.out.println(resultSet.getString("name")+" Force : "+resultSet.getInt("LeveLife")+" La vie : "+resultSet.getInt("Strength"));
//
//        }

      PreparedStatement myStmt;
      myStmt = connection.prepareStatement("INSERT INTO hero(Type, Name, LeveLife,strength) " +
              "VALUES ( '" + Type + "','" + Name + "','" + LeveLife + "','" + Strength +  "')");

      ResultSet myRs= myStmt.executeQuery();





      connection.close();



  }catch (SQLException  e ){
        e.printStackTrace();
    }
  catch (ClassNotFoundException f){
      System.out.println("y a ClassNotFoundException ");

  }
    }







}
