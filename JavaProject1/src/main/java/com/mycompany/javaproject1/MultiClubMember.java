/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject1;

/**
 *
 * @author User
 */
public class MultiClubMember extends Member {
    
    private int membershipPoints;
    
    public MultiClubMember(char pMemberType,int pMemberID,String pName,double pFees,int pMembershipPoints){
        super(pMemberType , pMemberID , pName, pFees);
        membershipPoints = pMembershipPoints;
    }
    
    //get and set of membershipPoints
    
    public void setMembershipPoints(int pMembershipPoints){
        membershipPoints = pMembershipPoints;
    }
    public int getMembershipPoints(){
        return membershipPoints;
    }
    
    public String toString(){
        
        return super.toString()+" ,"+membershipPoints;
    }
    
    
   
}
