package javafx;

public class Motorcycle extends Vehicle {
    private int motorcycletype,period;
    private String model,color,plate;
    private double rate;
    private boolean auto;
    
    private double oneprice;
    private boolean membercard;
    private double discount;
    private double finalprice;
    private double payment;
    private double balance;
    private double memberpoint;
    
    public Motorcycle() {
    }
    
    public void setmotorcycletype(int motorcycletype) {
        this.motorcycletype=motorcycletype;
    }
    public int getmotorcycletype(){
        return motorcycletype;
    }
    
    public String getmodel(int motorcycletype){
        if(motorcycletype==1) {
            model = "Yamaha T135(LC) 2018" ;
        }
        else if(motorcycletype==2){
            model = "SYM VTS 200 2017" ;
        }
        else if(motorcycletype==3){
            model = "Kawasaki Z 650 2018";
        }
        else{
        model = "Wrong input submitted!";}
        return model;
    }
    
    public  void setauto(boolean auto){
        this.auto=auto;
    }
    public  boolean getauto(){
        return auto;
    }
    
      
    public  String getplate(boolean auto, int motorcycletype){
       if(auto==true)
       {   
        if(motorcycletype==1) {
            plate = "WB6233W" ;
        }
        else if(motorcycletype==2){
            plate = "WWV7421" ;
        }
        else if(motorcycletype==3){
            plate ="WB4124F";
        }
        else
        plate = "Wrong input submitted!"; 
    }
    else if(auto==false)
       {   
        if(motorcycletype==1) {
            plate = "WA3212X" ;
        }
        else if(motorcycletype==2){
            plate = "WVX7246" ;
        }
        else if(motorcycletype==3){
            plate = "WB8731E";
        }
        else
        plate = "Wrong input submitted!"; 
    }
    else {
    plate = "Wrong input submitted!";}
    return plate;
    }
    
    public  String getcolor(boolean auto, int motorcycletype){
        if(auto==true)
       {   
        if(motorcycletype==1) {
            color = "Green" ;
        }
        else if(motorcycletype==2){
            color ="Purple" ;
        }
        else if(motorcycletype==3){
            color ="White";
        }
        else
        color ="Wrong input submitted!"; 
    }
    else if(auto==false)
       {   
        if(motorcycletype==1) {
            color ="Red" ;
        }
        else if(motorcycletype==2){
            color ="Yellow" ;
        }
        else if(motorcycletype==3){
            color ="Brown";
        }
        else
        color ="Wrong input submitted!"; 
    }
    return color;
    }
    
    
    public double getrate(int motorcycletype) {
        if(motorcycletype==1) {
            rate=30;
        }
        else if(motorcycletype==2) {
            rate=70;
        }
        else{
            rate=100;}
            return rate;
    }
    
    public void setperiod(int period) {
        this.period=period;
    }
    public int getperiod() {
        return period;
    }
    
    public double getoneprice(double rate,double period,int motorcycletype) {
        oneprice=rate*period;
        
        if(motorcycletype=='1')
            if(period>=7 || oneprice>=180) {
                do {
                oneprice=180;
                period=period-7;
                oneprice += oneprice;
                }
                while(period>7);
                oneprice = oneprice+(period*rate);
            }
        
            else {
                oneprice=oneprice;
            }
        else if(motorcycletype=='2')
            if(period>=7 || oneprice>=420) {
                do {
                oneprice=420;
                period=period-7;
                oneprice += oneprice;
                }
                while(period>7);
                oneprice = oneprice+(period*rate);
            }
        
            else {
                oneprice=oneprice;
            }
        else if(motorcycletype=='3')
            if(period>=7 || oneprice>=600) {
                do {
                oneprice=600;
                period=period-7;
                oneprice += oneprice;
                }
                while(period>7);
                oneprice = oneprice+(period*rate);
            }
        
        return oneprice;
    }
    
   
    public void setmembercard(boolean membercard) {
        this.membercard=membercard;
    }
    public boolean getmembercard() {
        return membercard;
    }
    
    public double getdiscount(double oneprice) {
        return discount=0.1*oneprice;
    }
    
    public double getfinalprice(double oneprice,double discount, boolean membercard) {
        if(membercard = false)
        {
            finalprice=oneprice;
          }
          else
          {
             finalprice=oneprice-discount; 
          }
        return finalprice;
    }
    
    public void setpayment(double payment) {
        this.payment=payment;
    }
    public double getpayment() {
        return payment;
    }
    
    public double getbalance(double finalrpice,double payment) {
        return balance=payment-finalprice;
    }
    
    public double getmemberpoint(double oneprice) {
        return memberpoint=0.05*oneprice;
    }
}

