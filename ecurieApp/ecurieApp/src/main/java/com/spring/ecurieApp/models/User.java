package com.spring.ecurieApp.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    @GeneratedValue
    Long id;

    @Column
    String first_name;

    @Column
    String last_name;

    @Column
    String username;

    @Column
    String password;

    @Column
    Boolean activeAccount;

    @ManyToOne
    @JoinColumn(nullable = true)
    Role role;

    public User() {
    }

    public User(User u){
        this.first_name = u.first_name;
        this.last_name = u.last_name;
        this.username = u.username;
        this.password = u.password;
        this.role = u.role;
    }

    public User(String first_name, String last_name, String username, String password, Role role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
/*
<!---------- add event -------------->

<div class="modal fade" id="addEventDiv" data-backdrop="static" tabindex="-1" role="dialog" aria-hidden="true">
<div class="modal-dialog" role="document">
<div class="modal-content">

<div class="modal-body">
<div class="container" align="center">
<br/><br/><br/><br/><br/>
<div class="col-md-4 mb-3 mb-md-0">
<div class="card py-4 h-100" style="background-color: whitesmoke">
<div class="card-body text-center">

<div class="small text-black-50">


<form th:action="@{/login}" method="post">

        Nom de l'évenement
<br/><input type="text" id="eventName" name="eventName" required/>
<br/>

        Date
<br/><input type="date" id="eventDate" name="eventDate" required/>
<br/> <br/>

        Description
<br/><textarea id="eventDescription" name="eventDescription" required  rows="4" cols="50"/>
<br/>

<br/>
<p>
<input type="submit" class="btn btn-primary js-scroll-trigger" value="Ajouter"/>
</p>
</form>
<br/>
<br/>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
*/