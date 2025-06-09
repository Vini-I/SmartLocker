package Lockers;



public class Locker {
    private int id;
    
    public static final int SMALL = 10, MEDIUM = 20, LARGE = 30;
    private int size;
    
    public static final int FREE=1, BUSY=2, OUTOFSERVICE=3;
    private int state;
    
    private int packageId;
    
    private int userId; 

    public int getId() {
        return id;
    }

    public String getSize() {
        if (size <= Locker.SMALL) {
            return "Small";
        } else if (size > Locker.SMALL && size <= Locker.MEDIUM) {
            return "Medium";
        } else if (size > Locker.MEDIUM && size <= Locker.LARGE) {
            return "Large";
        } else {
        return "Package to large";
        }
    }

    public String getState() {
        switch(state) {
            case 1 -> {
                return "Free";
            }
            case 2 -> {
                return "Busy";
            }
            case 3 -> {
                return "Out of service";
            }
        }
        return "Not a possible state";
    }

    public int getPackageId() {
        return packageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setState(int state) {
        if (state >= 1 && state <= 3) {
            this.state = state;
        }
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Locker(int id, int size) {
        this.id = id;
        if (size == Locker.SMALL || size == Locker.MEDIUM) {
            this.size = size;
        } else {
            this.size = Locker.LARGE;
        }
        this.state = Locker.FREE;
        this.packageId = 0;
        this.userId = 0;
    }

    @Override
    public String toString() {
        return "\nLocker:" + "\nId: " + id + "\nSize:" + size + "\nState:" + state + "\nPackageId=" + packageId + "\nUserId=" + userId;
    }
}
