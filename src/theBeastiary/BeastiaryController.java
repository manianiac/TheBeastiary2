package theBeastiary;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class BeastiaryController {
 
    @Autowired
    private BeastiaryDao beastiaryDao;
    
    //@RequestMapping(value="/index")
    @RequestMapping(value="/")
    public ModelAndView beastiaryIndex(HttpServletRequest request) {
    	ModelAndView model =  new ModelAndView("Index");
        return model;
    }
    
    @RequestMapping(value="/monsterList", method = RequestMethod.GET)
    public ModelAndView beastiaryMonsterList(HttpServletRequest request) throws SQLException {
    	List<Monster> recentMonsters = beastiaryDao.getRecentMonsters();
    	
    	List<User> users = new ArrayList<User>();
    	boolean flag;
    	for(int i = 0; i < recentMonsters.size(); i++) {
    		flag = true;
    		for(int j = 0; j < users.size(); j++)
    		{
    			if(users.get(j).getUserid().equals(recentMonsters.get(i).getUserid())) {
    				flag = false;
    			}
    		}
    		if(flag) {
    			users.add(beastiaryDao.getUserByID(recentMonsters.get(i).getUserid()));
    		}
    	}
    	
    	ModelAndView list = new ModelAndView("List");
    	list.addObject("monsters", recentMonsters);
    	list.addObject("users", users);
    	list.addObject("test", "testThing");
        return list;
    }
    
    @RequestMapping(value="/createMonster")
    public ModelAndView beastiaryCreateMonster(HttpServletRequest request) {
    	return new ModelAndView("createMonster");
    }
    
	@RequestMapping(value="/monster")
    public ModelAndView beastiaryMonster(HttpServletRequest request) {
    	try {
    		String id = request.getParameter("id");
			Monster monster = beastiaryDao.getMonsterByMonsterID(id);
			ModelAndView monsterPage = new ModelAndView("Monster");
			monsterPage.addObject("monster", monster);
			return monsterPage;
		} catch (Exception e) {
			e.printStackTrace();
		}
        return new ModelAndView("SomethingWeird");
    }
    @RequestMapping(value="/user")
    public ModelAndView beastiaryUser(HttpServletRequest request) throws SQLException {
    	String id = request.getParameter("id");
    	User user = beastiaryDao.getUserByID(id);
    	ModelAndView model = new ModelAndView("User");
    	model.addObject("user", user);
        return model;
    }
    
    @RequestMapping(value="/createUser")
    public ModelAndView beastiaryCreateUser(HttpServletRequest request) {
    	String name = request.getParameter("name");
        return new ModelAndView("createUser");
    }
}