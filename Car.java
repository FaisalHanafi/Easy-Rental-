package javafx;

public class Car extends Vehicle {
    private int cartype, period;
    private String model, color, plate;
    private double rate;
    private boolean auto;

    private double oneprice;
    private boolean membercard;
    private double discount;
    private double finalprice;
    private double payment;
    private double balance;
    private double memberpoint;

    public Car() {
    }

    public void setcartype(int cartype) {
        this.cartype = cartype;
    }

    public int getcartype() {
        return cartype;
    }

    public String getmodel(int cartype) {
        if (cartype == 1) {
            model = "Perodua Myvi 2018";
        } else if (cartype == 2) {
            model = "Proton X70 2019";
        } else if (cartype == 3) {
            model = "BMW 740d - G11 2017";
        } else {
            model = "Wrong input submitted!";
        }
        return model;
    }

    public void setauto(boolean auto) {
        this.auto = auto;
    }

    public boolean getauto() {
        return auto;
    }

    public String getplate(boolean auto, int cartype) {
        if (auto == true) {
            if (cartype == 1) {
                plate = "WA5045E";
            } else if (cartype == 2) {
                plate = "WC7623D";
            } else if (cartype == 3) {
                plate = "WWB 7832";
            } else
                plate = "Wrong input submitted!";
        } else if (auto == false) {
            if (cartype == 1) {
                plate = "WA3643D";
            } else if (cartype == 2) {
                plate = "WD4142E";
            } else if (cartype == 3) {
                plate = "WWF 5321";
            } else
                plate = "Wrong input submitted!";
        } else {
            plate = "Wrong input submitted!";
        }
        return plate;
    }

    public String getcolor(boolean auto, int cartype) {
        if (auto == true) {
            if (cartype == 1) {
                color = "Black";
            } else if (cartype == 2) {
                color = "Crimson Red";
            } else if (cartype == 3) {
                color = "Gold";
            } else
                color = "Wrong input submitted!";
        } else if (auto == false) {
            if (cartype == 1) {
                color = "Grey";
            } else if (cartype == 2) {
                color = "Ocean Blue ";
            } else if (cartype == 3) {
                color = "Chrome";
            } else
                color = "Wrong input submitted!";
        } else {
            color = "Wrong input submitted!";
        }
        return color;
    }

    public double getrate(int cartype) {
        if (cartype == '1') {
            rate = 7;
        } else if (cartype == '2') {
            rate = 10;
        } else {
            rate = 14;
        }
        return rate;
    }

    public void setperiod(int period) {
        this.period = period;
    }

    public int getperiod() {
        return period;
    }

    public double getoneprice(double rate, int period, int cartype) {

        oneprice = rate * period;

        if (cartype == '1')
            if (period >= 24 || oneprice >= 140) {
                do {
                    oneprice = 140;
                    period = period - 24;
                    oneprice += oneprice;
                } while (period > 24);
                oneprice = oneprice + (period * rate);
            }

            else {
                oneprice = oneprice;
            }
        else if (cartype == '2')
            if (period >= 24 || oneprice >= 200) {
                do {
                    oneprice = 200;
                    period = period - 24;
                    oneprice += oneprice;
                } while (period > 24);
                oneprice = oneprice + (period * rate);
            }

            else {
                oneprice = oneprice;
            }
        else if (cartype == '3')
            if (period >= 24 || oneprice >= 280) {
                do {
                    oneprice = 280;
                    period = period - 24;
                    oneprice += oneprice;
                } while (period > 24);
                oneprice = oneprice + (period * rate);
            }

        return oneprice;
    }

    public void setmembercard(boolean membercard) {
        this.membercard = membercard;
    }

    public boolean getmembercard() {
        return membercard;
    }

    public double getdiscount(double oneprice) {
        return discount = 0.1 * oneprice;
    }

    public double getfinalprice(double oneprice, double discount, boolean membercard) {
        if (membercard = false) {
            finalprice = oneprice;
        } else {
            finalprice = oneprice - discount;
        }
        return finalprice;
    }

    public void setpayment(double payment) {
        this.payment = payment;
    }

    public double getpayment() {
        return payment;
    }

    public double getbalance(double finalrpice, double payment) {
        return balance = payment - finalprice;
    }

    public double getmemberpoint(double oneprice) {
        return memberpoint = 0.05 * oneprice;
    }
}