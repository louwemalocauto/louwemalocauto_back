package com.louwemagroup.louwema.dao;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the user database table.
 *
 */
@Entity
@Table(name = "userapp")
public class UserApp implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id_user")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idUser;

    private String email;

    private String firstname;

    private String lastname;

    private String phone;


    public UserApp() {
    }

    public Long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}