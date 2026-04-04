package mypackage;

public class RailwaySysMain {
public static void main(String[] args) 
{
	Train t=new Train();
	t.showSystem();
	t.showTrainName();
	
	System.out.println();
	
	Ticket tc=new Ticket();
	tc.showSystem();
	tc.showTicketNo();
	
	System.out.println();
	
	Passenger p=new Passenger();
	p.showSystem();
	p.ShowPassName();
	
}
}
