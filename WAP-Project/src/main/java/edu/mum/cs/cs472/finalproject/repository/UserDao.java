package edu.mum.cs.cs472.finalproject.repository;

import edu.mum.cs.cs472.finalproject.dbConnection.HibernateUtil;
import edu.mum.cs.cs472.finalproject.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDao {

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public boolean validate(String userName, String password) {

        Transaction transaction = null;
        User user = null;

//        if (HibernateUtil.getSessionFactory().isOpen())
//            HibernateUtil.getSessionFactory().close();

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            System.out.println("validate 0 =>");
//            Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
           // transaction = session.beginTransaction();
            // get an user object
            System.out.println("validate 1 =>"+session);
//            user = (User) session.createQuery("FROM User U WHERE U.userName = :userName").setParameter("userName", userName)
//                    .uniqueResult();

            String hql = "from User U WHERE U.username = :userName";
            System.out.println("validate 1.0 =>");
            Query query = session.createQuery(hql);
            System.out.println("validate 1.1 =>");
            query.setParameter("userName", userName);
            System.out.println("validate 1.2=>");
            user = (User)  query.uniqueResult();
            System.out.println("validate 1.3=>");

            System.out.println("validate 2 =>"+user);
            if(user != null && user.getPassword().equals(password)) {
                return true;
            }
            System.out.println("validate 3 =>"+user.getPassword());
            // commit transaction
         //   transaction.commit();
            System.out.println("validate 4 =>");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println("validate Exception =>"+e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}
