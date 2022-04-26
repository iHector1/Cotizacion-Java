/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cotizacion;

/**
 *
 * @author PC
 */
public class Quotation {
    private int cantDays;
    private String destination;
    private String typeRoom;
    private String paymentType;
    private double subTotal;
    private double iva;
    private double monthlyPayment;
    private double ivaSubtotal;
    private double total;
    //getters and setters

    public int getCantDays() {
        return cantDays;
    }

    public void setCantDays(int cantDays) {
        this.cantDays = cantDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getIvaSubtotal() {
        return ivaSubtotal;
    }

    public void setIvaSubtotal(double ivaSubtotal) {
        this.ivaSubtotal = ivaSubtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    //constructor

    public Quotation(int cantDays, String destination, String typeRoom, 
            String paymentType, double subTotal) {
        this.cantDays = cantDays;
        this.destination = destination;
        this.typeRoom = typeRoom;
        this.paymentType = paymentType;
        this.subTotal = subTotal;
    }
     public Quotation() {
        this.cantDays = 0;
        this.destination = "";
        this.typeRoom = "";
        this.paymentType = "";
        this.subTotal = 0;
    }
    public void calculedIva(){
        this.iva=this.subTotal*.16;
    }
      public void setTotalPago(){
        this.total = this.iva+this.subTotal;
    }
    public String show(){
        return "\n-------------------------------------\n"
                + "Destino del viaje: "+this.getDestination()+"\n"
                + "Dias: "+this.getCantDays()+"\n"
                + "Tipo de Habitacion: "+this.getTypeRoom()+"\n"
                + "Tipo de pago: "+this.getPaymentType()+"\n"
                + "Total a pagar a meses: "+this.getMonthlyPayment()+"\n"
                + "Total a pagar: "+this.getTotal()+"\n";
    }
}
