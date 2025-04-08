package week4;

import java.util.Date;

interface QIF {
    public abstract int getStatus(int trainno, Date d);
}

class RailwayBooking {
    public QIF login(String u, String p) {
    	QueryObject qobj;
        if (valid_login(u, p)) {
        	qobj = new QueryObject();
            return qobj;
        } else {
            return null; // Return null or handle invalid login appropriately
        }
    }

    public boolean valid_login(String u, String p) {
        // Assuming a real validation check, here we just return true for simplicity
        return false;
    }

    private class QueryObject implements QIF {
        public int getStatus(int trainno, Date d) {
            return 56;
        }
    }
}

public class UserBook {
    public static void main(String[] args) {
        RailwayBooking r = new RailwayBooking();
        QIF q = r.login("kubra", "kgh");
        if (q != null) {
            int status = q.getStatus(0, new Date());
            System.out.println("Train status: " + status);
        } else {
            System.out.println("Invalid login.");
        }
    }
}
