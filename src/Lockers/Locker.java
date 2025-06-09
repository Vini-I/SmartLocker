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

    public int getState() {
        return state;
    }

    public int getPackageId() {
        return packageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Locker(int id, int size) {
        this.id = id;
        this.size = size;
        this.state = Locker.FREE;
        this.packageId = 0;
        this.userId = 0;
    }

    @Override
    public String toString() {
        return "\nLocker:" + "\nId: " + id + "\nSize:" + size + "\nState:" + state + "\nPackageId=" + packageId + "\nUserId=" + userId;
    }
}
