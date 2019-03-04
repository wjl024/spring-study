package com.spring.IoC;

public class UserLogin {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean userLogin(User user){
        if(getUser().getAccount().equals("admin")&&getUser().getPassword().equals("111")){
            return true;
        }else{
            return false;
        }
    }
}
