package Packages;



public class Package {
    private int id;
    
    public static final int SMALL = 10, MEDIUM = 20, LARGE = 30;
    private int size;
    
    public static final int PENDING = 1, DELIVERED = 2, COLLECTED = 3;
    private int state;
    
    private String sender;
    
    public int getId() {
        return id;
    }
    
    public String getSize() {
        if (size <= Package.SMALL) {
            return "Small";
        } else if (size > Package.SMALL && size <= Package.MEDIUM) {
            return "Medium";
        } else if (size > Package.MEDIUM && size <= Package.LARGE) {
            return "Large";
        } else {
        return "Package to large";
        }
    }
    
    public String getState() {
        switch(state) {
            case Package.PENDING -> {return "Pending";}
            case Package.DELIVERED -> {return "Delivered";}
            case Package.COLLECTED -> {return "Collected";}
        }
        return "Not defined";
    }
    
    public String getSender() {
        return sender;
    }
    
    public void setState(int state) {
        if (state >= 1 && state <= 3) {
            this.state = state;
        } else {
            this.state = 1;
        }
    }
    
    public Package(int id, int size, String sender) {
        this.id = id;
        this.size = size;
        this.state = Package.PENDING;
        this.sender = sender;
    }
    
    /**
     *
     * @return
     */
    @Override
    
    public String toString() {
        return "Package information:\nid: " + this.id + "\nSize: " + this.getSize() + "\nState: " + this.getState() + "\nSender: " + this.sender ;
    }
}
