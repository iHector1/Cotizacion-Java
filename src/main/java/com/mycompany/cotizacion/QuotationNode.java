/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cotizacion;

/**
 *
 * @author PC
 */
public class QuotationNode {
    private Quotation quotation;
    private QuotationNode next;
    //getter and setter
    public Quotation getQuotation() {
        return quotation;
    }

    public void setQuotation(Quotation quotation) {
        this.quotation = quotation;
    }

    public QuotationNode getNext() {
        return next;
    }

    public void setNext(QuotationNode next) {
        this.next = next;
    }
    
    //constructor

    public QuotationNode(Quotation quotation) {
        this.quotation = quotation;
        this.next = null;
    }
    
    
}
