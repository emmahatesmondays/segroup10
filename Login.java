
package com.foo.newsapplication;

/**
 *
 * @author timi
 */
public class Login {
    private static final String adminuser = "foouser";
    private static final String adminpass = "foopass";
    private static boolean isloggedin = false;
    
    public Login(){
        
    }
    
    public boolean login(String user, String pass){
        if(user==adminuser && pass==adminpass){
            isloggedin = true;
        }
        else{
            isloggedin = false;
        }
        return isloggedin;
    }
    
    public void logout(){
        isloggedin = false;
    }
    
    public boolean isloggedin(){
        return isloggedin;
    }
    
    
}
