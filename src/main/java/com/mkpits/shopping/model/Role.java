//package com.mkpits.shopping.model;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Role {
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long roleId;
//
//    private String name ;
//    @ManyToMany
//    private List <User> users;
//
//
//    public Role() {
//
//    }
//
//    public Role(long roleId, String name, List<User> users) {
//        this.roleId = roleId;
//        this.name = name;
//        this.users = users;
//    }
//
//    public long getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(long roleId) {
//        this.roleId = roleId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
//
//}
