package javafx;

public class Client
{
    private String name;
    private long matric;
    private long id;
    private long license;
    private long phonenum;
    private boolean custtype,vehicletype;
    
    
    public Client() {
    }
    public Client(String name,long matric,long id,long license,long phonenum) {
        this.name=name;
        this.matric=matric;
        this.id=id;
        this.license=license;
        this.phonenum=phonenum;
    }
    public void setname(String name) {
        this.name=name;
    }
    public String getname() {
        return name;
    }
    
    public void setmatric(long matric) {
        this.matric=matric;
    }
    public long getmatric() {
        return matric;
    }
    
    public void setid(long id) {
        this.id=id;
    }
    public long gettid() {
        return id;
    }
    
    public void setlicense(long license) {
        this.license=license;
    }
    public long getlicense() {
        return license;
    }
    
    public void setphonenum(long phonenum) {
        this.phonenum=phonenum;
    }
    public long getphonenum() {
        return phonenum;
    }
    
    public void setvehicletype(boolean vehicletype) {
        this.vehicletype=vehicletype;
    }
    public boolean getvehicletype() {
        return vehicletype;
    }
    
    public void setcusttype(boolean custtype) {
        this.custtype=custtype;
    }
    public boolean getcusttype() {
        return custtype;
    }
}

