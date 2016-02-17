/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoryTest;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    private SessionFactory exampleSessionFactory;
    @Autowired
    private UserRepository employeeDAO;

    @Test
    public static void testAddUser() {
        
    }

}
