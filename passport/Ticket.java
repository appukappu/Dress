package passport;

public class Ticket {
    String seatNum;
    String row;

    public Ticket(String seatNum, String row) {
        this.seatNum = seatNum;
        this.row = row;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "seatNum='" + seatNum + '\'' +
                ", row='" + row + '\'' +
                '}';
    }
}
