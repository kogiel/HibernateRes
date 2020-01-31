package com.sda.hibernate;

import com.sda.hibernate.entity.LegalBody;
import com.sda.hibernate.utils.JpaUtil;

import javax.persistence.EntityManager;

public class Application {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        LegalBody legalBody = new LegalBody();
        legalBody.setEmail("myemail@gmail.com");
        legalBody.setPhone("134817410874");
        legalBody.setName("Company");
        legalBody.setNip("43194814801");

        entityManager.persist(legalBody);
        
//        Post post = new Post();
//  --      post.setName("name");
//        Worker worker = new Worker();
//        worker.setFirstName("Patryk");
//        worker.setLastName("Konkel");
//        worker.setHireDate(LocalDateTime.now());
//
//        Worker worker2 = new Worker();
//        worker.setFirstName("Piotr");
//        worker.setLastName("Nowak");
//        worker.setHireDate(LocalDateTime.now())
//        PostDetails postDetails = new PostDetails();
//--        postDetails.setPostDetails();

//        Department department = new Department("My department");
//        department.addPost(Post);
//        department.addWorker(worker);
//        department.addWorker(worker2);

//        entityManager.persist(postDetails);
//        System.out.println("New Post added: " + postDetails);
        entityManager.getTransaction().commit();
        entityManager.close();
        JpaUtil.shutdown();


    }
}
