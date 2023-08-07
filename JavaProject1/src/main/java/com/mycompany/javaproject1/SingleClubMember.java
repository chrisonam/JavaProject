/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject1;

/**
 *
 * @author User
 */
public class SingleClubMember extends Member {
    private int club;
    public SingleClubMember(char pMemberType,int pMemberID,String pName,double pFees,int pClub){
        super(pMemberType , pMemberID , pName, pFees);
        club = pClub;
    }
    
    public void setClub(int pClub){
        club = pClub;
    }
    public int getClub(){
        return club;
    }
    
    //method toString from superClass
    public String toString(){
       return super.toString()+","+club;
    }
}
