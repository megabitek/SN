/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoryTest;

import entity.Role;
import entity.Users;
import java.util.List;
import java.util.Set;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import repository.UserRepository;
import static org.junit.Assert.*;

/**
 *
 * @author Elena_Kholkina
 */
public class UserRepositoryTest {
    
    public UserRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSessionFactory method, of class UserRepository.
     */
    @Test
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        UserRepository instance = new UserRepository();
        SessionFactory expResult = null;
        SessionFactory result = instance.getSessionFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionFactory method, of class UserRepository.
     */
    @Test
    public void testSetSessionFactory() {
        System.out.println("setSessionFactory");
        SessionFactory sessionFactory = null;
        UserRepository instance = new UserRepository();
        instance.setSessionFactory(sessionFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserRepository.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String username = "";
        String login = "";
        String password = "";
        UserRepository instance = new UserRepository();
        Long expResult = null;
        Long result = instance.addUser(username, login, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsers method, of class UserRepository.
     */
    @Test
    public void testListUsers() {
        System.out.println("listUsers");
        UserRepository instance = new UserRepository();
        List<Users> expResult = null;
        List<Users> result = instance.listUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserRepository.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        Long userid = null;
        String password = "";
        UserRepository instance = new UserRepository();
        instance.updateUser(userid, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserRepository.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        long userid = 0L;
        UserRepository instance = new UserRepository();
        instance.deleteUser(userid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserRepository.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        long userid = 0L;
        UserRepository instance = new UserRepository();
        Users expResult = null;
        Users result = instance.getUserById(userid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserRoles method, of class UserRepository.
     */
    @Test
    public void testGetUserRoles() {
        System.out.println("getUserRoles");
        long userid = 0L;
        UserRepository instance = new UserRepository();
        Set<Role> expResult = null;
        Set<Role> result = instance.getUserRoles(userid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserRoles method, of class UserRepository.
     */
    @Test
    public void testDeleteUserRoles() {
        System.out.println("deleteUserRoles");
        long userid = 0L;
        long roleid = 0L;
        UserRepository instance = new UserRepository();
        instance.deleteUserRoles(userid, roleid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUserRoles method, of class UserRepository.
     */
    @Test
    public void testAddUserRoles() {
        System.out.println("addUserRoles");
        long userid = 0L;
        long roleid = 0L;
        UserRepository instance = new UserRepository();
        instance.addUserRoles(userid, roleid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
