package passport;

public class TicketBooking {
 public Ticket booking(CustomerDetails cc){
     Ticket tt = new Ticket("20","c");
     System.out.println(cc);
     return tt;

 }

  public static void main(String[]args){
     TicketBooking tb = new TicketBooking();
     PassPortDetails pp = new PassPortDetails(543,18/04/2024);
     Ticket ticket=tb.booking(new CustomerDetails("appu","vijayawada",20,pp));
     System.out.println(ticket);

    }
}
