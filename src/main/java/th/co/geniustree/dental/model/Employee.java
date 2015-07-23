/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;



/**
 *
 * @author Best
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   @Column(name = "EMAIL" , nullable = false,unique = true)
   @NotBlank(message = "E-mail not Empty")
   @Email(message = "E-mail Incompatible example@example.xom")
   private String email;
   @Column(name = "PASSWORD" , nullable = false)
   @NotBlank(message = "Password not Empty")
   private String password;
   @Column(name = "PID" , nullable = false)
   @NotBlank(message = "Personal ID not Empty")
   private String pid;
   @Column(name = "NAME_TH" , nullable = false)
   @NotBlank(message = "Name(TH) not Empty")
   private String nameTh;
   @Column(name = "NAME_ENG")
   private String nameEng;
   @Column(name = "BIRTH_DATE")
   private Date birthDate;
   @Column(name = "SEX")
   private String sex;
   @Column(name = "BLOOD" , nullable = false)
   @NotBlank(message = "Blood not Empty")
   private String blood;
   @Column(name = "MARRY_STATUS")
   private String marryStatus;
   @Column(name = "NATION" , nullable = false)
   @NotBlank(message = "Nation not Empty")
   private String nation;
   @Column(name = "RACE" , nullable = false)
   @NotBlank(message = "Race not Empty")
   private String race;
   @Column(name = "SOLDER_STATUS")
   private String soldierStatus;
   @Column(name = "ADDRESS_OF_PID")
   private String addressOfPid;
   @Column(name = "CURRENT_ADDRESS" , nullable = false)
   @NotBlank(message = "Current Address not Empty")
   private String currentAddress;
   @Column(name = "TEL")
   private String tel;
   @Column(name = "MOBILE" , nullable = false)
   @NotBlank(message = "Mobile not Empty")
   private String mobile;
   @Column(name = "START_WORK" , nullable = false)
   @NotBlank(message = "Start Work not Empty")
   private Date startWork;
   @Column(name = "END_WORK")
   private Date endWork;
   @Column(name = "WORK_STATUS" , nullable = false)
   @NotBlank(message = "Work Satus not Empty")
   private String workStatus;
   @Column(name = "PICTURE")
   private String picture;
   
   
    
}
