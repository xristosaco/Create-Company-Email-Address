/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class Email {
   private String firstName;
   private String lastName;
   private String  password;
   private String department;
   private String email;
   private int mailBocCapasity=500;
   private int defaultPassLen=10;
   private String alternateMail;
   private String companyMail="company.com";
  
    public Email (String firstName, String lastName ){
    
        this.firstName=firstName;
        this.lastName=lastName;
//        System.out.println("Email Created : "+this.firstName+" "+this.lastName);
        
        this.department=setDepartment();
//        System.out.println("Department is "+this.department);
        
        this.password=randomPassword(defaultPassLen);
       System.out.println("Your password is :"+this.password);
        
        email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+companyMail;
//        System.out.println("Your Email is : "+email);
    }
    
    private String setDepartment(){
    System.out.println("Enter the Department\n1 for Sales\n2 for Development\n0 for none");
    Scanner io= new Scanner(System.in);
    int departSet=io.nextInt();
    if(departSet==1){return "Sales";}
    else if (departSet ==2) {return "development";}
    else {return "None";}
    
    }
    private String randomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTuVWXYZ1234567890!@#$";
    char[] password=new char[length];
      for (int i =0; i<length; i++){
       int rad =(int) (Math.random() * passwordSet.length());
       password[i]=passwordSet.charAt(rad);
       
      }
    return new String(password);
    }
            
          public void setMailBoxCapasity(int capasity){
          this.mailBocCapasity=capasity;
          
          }
          public void setAlternateMail(String altEmail){
          this.alternateMail=altEmail;
          }
            
          public void changePass(String password){
          this.password= password;
          }
          
          public int getMailBocCapasity(){return mailBocCapasity;}
          public String  getalternateMail(){return alternateMail;}  
          public String getPassword(){return password;}
          
          
          public String showInfo(){
          return "Display Name"+firstName+" "+lastName+"\nCompany Email"+email+"\nMailboc Capasity"+
             mailBocCapasity+"mb";     
          }
}
