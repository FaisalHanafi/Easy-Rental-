package javafx;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.Scanner;

public class testrental 
{
    public static void main(String[] args) {
      
            Client cl = new Client();
            Boolean type1;
            String name;
            long matric,id,license,phone;
            
            int cartype;
            int hourcar;
            double pays;
            double rate;
            double firstprice;
            double discount;
            double finalcharge;
            
            
            boolean cardtype;
            
            int daymotor,motortype;
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("Please enter your name:");
            cl.setname(name=input.next());
            System.out.println("Please enter your matric number:");
            cl.setmatric(matric=input.nextLong());
            System.out.println("Please enter your IC or passport number:");
            cl.setid(id=input.nextLong());
            System.out.println("Please enter your license number:");
            cl.setlicense(license=input.nextLong());
            System.out.println("Please enter your phone number:");
            cl.setphonenum(phone=input.nextLong());
        
            System.out.println("Please choose whether you want to choose either Car or Motorcycle to rent");
            System.out.println("For car please enter 'false'");
            System.out.println("For motorcycle please enter 'true'");
            
            cl.setvehicletype(type1=input.nextBoolean());
            if(type1 = true){
                Motorcycle vm = new Motorcycle();
                
                System.out.println("Please enter what type of car you want to rent");
                System.out.println("For Yamaha T135(LC) 2018 the rate is RM30 per day. Please enter '1'."); 
                System.out.println("For SYM VTS 200 2017 the rate is RM70 per day. Please enter '2'."); 
                System.out.println("For Kawasaki Z 650 2018 the rate is RM100 per day. Please enter '3'.");
                vm.setmotorcycletype(cartype = input.nextInt());
                rate = vm.getrate(cartype);
                System.out.println("Please enter the amount of time you want to rent the car for.");
                vm.setperiod(hourcar = input.nextInt());
                System.out.println("The total charge is: RM");
                firstprice=vm.getoneprice(rate,hourcar,cartype);
                discount=vm.getdiscount(firstprice);
                System.out.println("For member card holder, they will get a 10% discount");
                System.out.println("Do you have our member card?");
                System.out.println("Enter 0 if you dont, and 1 if you have it");
                vm.setmembercard(cardtype = input.nextBoolean());
                if(cardtype = false){
                    finalcharge = vm.getfinalprice(firstprice,discount,cardtype);
                    System.out.println("Since you are not a member card holder, the total charge is :RM"+finalcharge);
                    System.out.println("Please input the amount of payment: ");
                    vm.setpayment(pays = input.nextDouble());
                    System.out.println("The balance is :"+vm.getbalance(finalcharge,pays));
                }
                else {
                    finalcharge = vm.getfinalprice(firstprice,discount,cardtype);
                    System.out.println("Since you are a member card holder, the total charge is :RM"+finalcharge);
                    System.out.println("Please input the amount of payment: ");
                    vm.setpayment(pays = input.nextDouble());
                    System.out.println("The balance is :"+vm.getbalance(finalcharge,pays));
                    System.out.println("The member point you gained is :"+vm.getmemberpoint(firstprice));
                }   
            } 
            else{
                
                Car vc = new Car();
                
                System.out.println("Please enter what type of car you want to rent");
                System.out.println("For Perodua Viva the rate is RM7 per hour. Please enter '1'."); 
                System.out.println("For Proton Saga the rate is RM10 per hour. Please enter '2'."); 
                System.out.println("For Proton X70 the rate is RM14 per hour. Please enter '3'.");
                vc.setcartype(cartype = input.nextInt());
                rate = vc.getrate(cartype);
                System.out.println("Please enter the amount of time you want to rent the car for.");
                vc.setperiod(hourcar = input.nextInt());
                System.out.println("The total charge is: RM");
                firstprice=vc.getoneprice(rate,hourcar,cartype);
                discount=vc.getdiscount(firstprice);
                System.out.println("For member card holder, they will get a 10% discount");
                System.out.println("Do you have our member card?");
                System.out.println("Enter true if you are, false if you are not.");
                vc.setmembercard(cardtype = input.nextBoolean());
                if(cardtype = false){
                    finalcharge = vc.getfinalprice(firstprice,discount,cardtype);
                    System.out.println("Since you are not a member card holder, the total charge is :RM"+finalcharge);
                    System.out.println("Please input the amount of payment: ");
                    vc.setpayment(pays = input.nextDouble());
                    System.out.println("The balance is :"+vc.getbalance(finalcharge,pays));
                }
                else {
                    finalcharge = vc.getfinalprice(firstprice,discount,cardtype);
                    System.out.println("Since you are a member card holder, the total charge is :RM"+finalcharge);
                    System.out.println("Please input the amount of payment: ");
                    vc.setpayment(pays = input.nextDouble());
                    System.out.println("The balance is :"+vc.getbalance(finalcharge,pays));
                    System.out.println("The member point you gained is :"+vc.getmemberpoint(firstprice));
                }   
            }
    }
}
