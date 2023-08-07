/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject1;

/**
 *
 * @author User
 */
public class Member {
    
    private char memberType;
    private int memberID;
    private String name;
    private double fees;
    
    public  Member(char pMemberType,int pMemberID,String pName,double pFees){
        memberType = pMemberType;
        memberID   = pMemberID;
        name       = pName;
        fees      =  pFees;
        
    }
    
    // Setter and getter for Membertype,MemberID,MemberName...
    public void setMemberType(char pMemberType){
        memberType = pMemberType;
    }
    
    public char getMemberType(){
        return memberType;
    }
    
    public void setMemberID(int pMemberID){
        memberID = pMemberID;
    }
    
    public int getmemberID(){
        return memberID;
    }
    
    public void setName(String pName){
        name = pName;
    }
    public String getName(){
            return name;
}
    public void setFees(double pFees){
        fees = pFees;
    }
    
    public double getFees(){
        return fees;
    }
    
    //overriding toString method
    
    @Override
    public String toString(){
        String result = memberType+ ", "+memberID+", "+name+", "+fees;
        return result;
        
    }
    
}
