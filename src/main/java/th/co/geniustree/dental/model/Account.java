/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Best
 */
@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "BANK_ACCOUNT")
    private String bankAccount;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
}
