package theBeastiary;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class BeastiaryDao {
	
	
	public static final String username = "Beastiary";
	public static final String password = "password";
	private Connection con;
	
	public BeastiaryDao() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}
		try {
			con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/TheBeastiary", username,
					password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Comments> getCommentsByMonsterID(String monsterID) {
		ArrayList<Comments> commentList = new ArrayList<Comments>();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USERCOMMENTS ORDER BY datecreated DESC WHERE monsterid = '" + monsterID + "';");
			while (rs.next()) {
				commentList.add(new Comments(
						rs.getString("commentid"),
						rs.getString("monsterid"),
						rs.getString("userid"),
						rs.getString("comment"),
						rs.getString("datecreated")
						));
					System.out.println(rs.getString("fluff"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commentList;
	}
	
	public ArrayList<Comments> getCommentsByUserID(String userID) {
		ArrayList<Comments> commentList = new ArrayList<Comments>();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USERCOMMENTS ORDER BY datecreated DESC WHERE userid = '" + userID + "';");
			while (rs.next()) {
				commentList.add(new Comments(
						rs.getString("commentid"),
						rs.getString("monsterid"),
						rs.getString("userid"),
						rs.getString("comment"),
						rs.getString("datecreated")
						));
					System.out.println(rs.getString("fluff"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commentList;
	}
	
	public User getUserByID(String userID) throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE userid = '" + userID + "';");
		if(rs.next()) {
			User user = new User(
					rs.getString("userid"),
					rs.getString("displayname"),
					rs.getString("datejoined"),
					rs.getString("passwords"),
					rs.getString("email")
					);
			return user;
		}
		return null;
	}
	
	public Monster getMonsterByMonsterID(String monsterID) throws SQLException{
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM MONSTERS WHERE monsterid = '" + monsterID + "';");
		if(rs.next()) {
			Monster monster = new Monster(
					rs.getString("monsterid"),
					rs.getString("userid"),
					rs.getString("datecreated"),
					rs.getString("datelastedit"),
					rs.getString("versionnumber"),
					rs.getString("rating"),
					rs.getString("picture"),
					rs.getString("monstername"),
					rs.getString("race"),
					rs.getString("size"),
					rs.getString("alignment"),
					rs.getString("armorclass"),
					rs.getString("armortype"),
					rs.getString("hitdice"),
					rs.getString("speed"),
					rs.getString("str"),
					rs.getString("dex"),
					rs.getString("con"),
					rs.getString("intelligence"),
					rs.getString("wis"),
					rs.getString("cha"),
					rs.getString("damageresistance"),
					rs.getString("damageimmunities"),
					rs.getString("conditionimmunities"),
					rs.getString("senses"),
					rs.getString("languages"),
					rs.getString("challenge"),
					rs.getString("skills"),
					rs.getString("saves"),
					rs.getString("abililties"),
					rs.getString("actions"),
					rs.getString("legendaryactions"),
					rs.getString("lairactions"),
					rs.getString("fluff")
					);
			return monster;
		}
		return null;
	}
	
	public ArrayList<Monster> getRecentMonsters() {
		ArrayList<Monster> recentMonsters = new ArrayList<Monster>();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MONSTERS ORDER BY datelastedit DESC	LIMIT 20;");
			while (rs.next()) {
				recentMonsters.add(new Monster(
						rs.getString("monsterid"),
						rs.getString("userid"),
						rs.getString("datecreated"),
						rs.getString("datelastedit"),
						rs.getString("versionnumber"),
						rs.getString("rating"),
						rs.getString("picture"),
						rs.getString("monstername"),
						rs.getString("race"),
						rs.getString("size"),
						rs.getString("alignment"),
						rs.getString("armorclass"),
						rs.getString("armortype"),
						rs.getString("hitdice"),
						rs.getString("speed"),
						rs.getString("str"),
						rs.getString("dex"),
						rs.getString("con"),
						rs.getString("intelligence"),
						rs.getString("wis"),
						rs.getString("cha"),
						rs.getString("damageresistance"),
						rs.getString("damageimmunities"),
						rs.getString("conditionimmunities"),
						rs.getString("senses"),
						rs.getString("languages"),
						rs.getString("challenge"),
						rs.getString("skills"),
						rs.getString("saves"),
						rs.getString("abililties"),
						rs.getString("actions"),
						rs.getString("legendaryactions"),
						rs.getString("lairactions"),
						rs.getString("fluff")
						));
					System.out.println(rs.getString("fluff"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return recentMonsters;
	}
	
	
	
//    // Injected database connection:
//    @PersistenceContext private EntityManager em;
// 
//    // Stores a new guest:
//    @Transactional
//    public void persist(Beastiary guest) {
//        em.persist(guest);
//    }
// 
//    // Retrieves all the guests:
//    public List<Beastiary> getAllGuests() {
//    	TypedQuery<Beastiary> query = em.createQuery(
//            "SELECT g FROM Guest g ORDER BY g.id", Beastiary.class);
//    	return query.getResultList();
//    }
}