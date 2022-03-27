package co.edureka.except;

import java.io.IOException;
import java.sql.SQLException;

class UserService{
	public void checkUserById(int id) throws SQLException, IOException{
		System.out.println("checking user....");		
	}
}

public class ThrowsTest1 {

	public static void main(String[] args) {
		UserService service = new UserService();
		try {
			service.checkUserById(101);
		} catch (SQLException | IOException e) {			
			e.printStackTrace();
		}
	}

}
