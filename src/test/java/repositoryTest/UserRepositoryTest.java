/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoryTest;

import entity.Users;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import junit.framework.Assert;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import repository.UserRepository;

/**
 *
 * @author Elena_Kholkina
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
@Transactional
public class UserRepositoryTest {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;
    @Autowired
    private UserRepository userrepo;

    @Test
    public void testAddUser() {
        int count = userrepo.listUsers().size();
        userrepo.addUser("lena", "lenaTest", "123");
        Assert.assertEquals(count + 1, userrepo.listUsers().size());
    }

    @Test
    public void testUpdateUser() {
        long userid = userrepo.addUser("lena", "lenaTest", "123");
        userrepo.updateUser(userid, "456");
        Users lena = userrepo.getUserById(userid);
        Assert.assertEquals("456", lena.getPassword());
    }

    @Test
    public void testDeleteUser() {
        long userid = userrepo.addUser("lena", "lenaTest", "123");
        int count = userrepo.listUsers().size();
        userrepo.deleteUser(userid);
        Assert.assertEquals(userrepo.listUsers().size(), count - 1);
    }

    @Test
    public void testGetById() {
        long userid = userrepo.addUser("lena", "lenaTest", "123");
        Users userget = userrepo.getUserById(userid);
        Assert.assertNotNull(userget);
    }
/*
   @Test  (expected =java.lang.AssertionError.class)
    public void testUniqueLogin() {
        int count = userrepo.listUsers().size();
        long userid = userrepo.addUser("lena", "lena", "123"); 
      Assert.assertNull(userid);
    }
*/}
