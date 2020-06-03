package edu.mum.cs.cs472.finalproject.repository;

import edu.mum.cs.cs472.finalproject.dbConnection.HibernateUtil;
import edu.mum.cs.cs472.finalproject.model.Account;
import edu.mum.cs.cs472.finalproject.model.BillPayment;
import edu.mum.cs.cs472.finalproject.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.*;
import java.io.Serializable;


public class AccountDao {

    public void saveAccount(Account account) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(account);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
