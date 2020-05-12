package edu.mum.cs.cs472.finalproject.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table( name = "transaction_summary")
public class TransactionSummary implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "transaction_type")
        private String transactionType;

        @Column(name = "transaction_desc")
        private String transactionDesc;

        @Column(name = "from_account")
        private long fromAccount;

        @Column(name = "to_account")
        private long toAccount;

        @Column(name = "amount")
        private double amount;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        @Column(name = "transaction_date")
        private Date transactionDate;

        public String getTransactionType() {
                return transactionType;
        }

        public void setTransactionType(String transactionType) {
                this.transactionType = transactionType;
        }

        public long getFromAccount() {
                return fromAccount;
        }

        public void setFromAccount(long fromAccount) {
                this.fromAccount = fromAccount;
        }

        public long getToAccount() {
                return toAccount;
        }

        public void setToAccount(long toAccount) {
                this.toAccount = toAccount;
        }

        public double getAmount() {
                return amount;
        }

        public void setAmount(double amount) {
                this.amount = amount;
        }

        public Date getTransactionDate() {
                return transactionDate;
        }

        public void setTransactionDate(Date transactionDate) {
                this.transactionDate = transactionDate;
        }

        public String getTransactionDesc() {
                return transactionDesc;
        }

        public void setTransactionDesc(String transactionDesc) {
                this.transactionDesc = transactionDesc;
        }

    }
