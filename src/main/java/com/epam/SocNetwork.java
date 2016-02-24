package com.epam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import repository.RoleRepository;
import repository.UserRepository;

public class SocNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-context.xml");    
        UserRepository userrepo = (UserRepository) ctx.getBean("userRepo");
        try{
        long user = userrepo.addUser("lena", "lena", "123");
        //long user1 = userrepo.addUser("lena", "lena", "123");
        }catch (DataIntegrityViolationException e){
            System.out.println("not added");
        }
        
        userrepo.listUsers();
        RoleRepository rolerepo = (RoleRepository) ctx.getBean("roleRepo");
        try{
        Long addRole = rolerepo.addRole("administrator");
         }catch (DataIntegrityViolationException e){
            System.out.println("not added");
        }
        rolerepo.listRoles();
    }
}
