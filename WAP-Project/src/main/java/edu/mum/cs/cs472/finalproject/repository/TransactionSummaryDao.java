package edu.mum.cs.cs472.finalproject.repository;

import edu.mum.cs.cs472.finalproject.dbConnection.HibernateUtil;
import edu.mum.cs.cs472.finalproject.model.TransactionSummary;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransactionSummaryDao {

    public void saveTransaction(TransactionSummary transactionSummary) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(transactionSummary);
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
