
package com.mycompany.cotizacion;

public class QuotationList {
    private QuotationNode start;
    
    //constructor

    public QuotationList() {
        this.start = null;
    }
    
    public void addList(QuotationNode quotation){
        if(start==null){
            this.start=quotation;
        }else{
            QuotationNode aux=start;
            while(aux.getNext()!=null){
                aux=aux.getNext();
            }
            aux.setNext(quotation);
        }
    }
    
   public String showList(){
       String show="";
      if(start==null){
            show="No tiene Viajes";
        }else{
            QuotationNode aux=start;
            while(aux!=null){
                show+=aux.getQuotation().show();
                aux=aux.getNext();
            }
        } 
      return show;
   }
    
}
