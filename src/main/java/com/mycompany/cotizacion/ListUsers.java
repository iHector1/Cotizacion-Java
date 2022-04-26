/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cotizacion;

/**
 *
 * @author PC
 */
public class ListUsers {
    private Node start;
    
    //constructor
    public ListUsers() {
        this.start = null;
    }
    
    public void addUser(User user){
        Node node=new Node(user);
        if(this.start==null){
            this.start=node;
        }else{
            Node aux=start;
            while(aux.getNode()!=null){
                aux=aux.getNode();
            }
            aux.setNode(node);
        }
    }
    
    public int searchUser(User user){
        if(this.start==null){
           return -2; 
        }else{
            Node aux=start;
            while(aux.getNode()!=null){
                if(aux.getUser().getName().equals(user.getName()) && 
                        aux.getUser().getPassword().equals(user.getPassword())){
                    return 1;
                }
                aux=aux.getNode();
            }
            return -1;
        }
        
    }
    public String showList(){
       String show="";
      if(start==null){
            show="si";
        }else{
            Node aux=start;
            while(aux!=null){
                show+=aux.getUser().getName()+"\n";
                aux=aux.getNode();
            }
        } 
      return show;
   }
    
}
