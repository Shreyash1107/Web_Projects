package org.techhub.model;

public class LoginModel {
    private String username;
    private String password; // corrected from Password to password for consistency
    private String contact;
    private String email;
    private String logintype; // corrected from Logintype to logintype for consistency

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }

    public String getLogintype() {
        return logintype;
    }
}
