import java.util.*;
class BillPrint{
	public static void main (String [] args){
        System.out.println("====================================================================================");
        System.out.println("__          __  _                           _           _ __  ___             _");
        System.out.println("\\ \\        / / | |                         | |         (_)  \\/   |           | |");
        System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ _ _ __  ___  | |_  ___    _| \\  /| | __,_ _,__ | |_");
        System.out.println("  \\ \\/  \\/ / _ \\ |/ __/   \\|  _ `_` \\/ _ \\ |  __/   \\  | | |\\/ | |/ _  |  ___| __|");
        System.out.println("   \\  /\\  /  _ / | (_| (_) | | | || |  __/ | | | (_) | | | |   | | (_| | |   | |");
        System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_||_|\\___| \\_\\_ \\___/  |_|_|   |_|\\__,_|_|   \\__|");
        System.out.println("====================================================================================");
		System.out.println("                                                          ");
		
		Scanner enterNum=new Scanner(System.in);
		int num;
		String name;
		System.out.print("Enter Customer Phone Number : ");
		num=enterNum.nextInt();
		Scanner enterName=new Scanner(System.in);
		System.out.print("Enter Customer Name         : ");
		name=enterName.nextLine();
		System.out.println("==========================================================");
		System.out.println("                                                          ");
		
		Scanner input=new Scanner(System.in);
		int basmathi,dhal,sugar,higland,yoghurt,flour,soap;
		System.out.print("Basmathi Qty(Kg) - ");
		basmathi=input.nextInt();
		System.out.print("Dhal Qty(Kg)     - ");
		dhal=input.nextInt();
		System.out.print("Sugar Qty(Kg)    - ");
		sugar=input.nextInt();
		System.out.print("Higland Qty      - ");
		higland=input.nextInt();
		System.out.print("Yoghurt Qty      - ");
		yoghurt=input.nextInt();
		System.out.print("Flour Qty        - ");
		flour=input.nextInt();
		System.out.print("Soap Qty         - ");
		soap=input.nextInt();

		float bup=250.0f;
		float dup=180.0f;
		float sup=150.0f;
		float hup=1200.0f;
		float yup=50.0f;
		float fup=120.0f;
		float supp=160.0f;

		float bp=(bup*basmathi);
		float dp=(dup*dhal);
		float sp=(sup*sugar);
		float hp=(hup*higland);
		float yp=(yup*yoghurt);
		float fp=(fup*flour);
		float spp=(supp*soap);

		float total = bp+dp+sp+hp+yp+fp+spp;
		float dis = total * (0.1f);
		float fPrice = total - dis;

		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|                                                               |");
		System.out.println("|                  _  __  __          _____ _______             |"); 
		System.out.println("|                 (_)|  \\/  |   /\\   |  _  \\__   __|            |");
		System.out.println("|                  _ | \\  / |  /  \\  | |_) |  | |               |");
		System.out.println("|                 | || |\\/| | / /\\ \\ |  _  /  | |               |");
		System.out.println("|                 | || |  | |/ ____ \\| | \\ \\  | |               |");
		System.out.println("|                 |_||_|  |_/_/    \\_\\_|  \\_\\ |_|               |");
		System.out.println("|                     225,Galle Road,Panadura.                  |");
		System.out.println("|                                                               |");
		System.out.println("+--------------------------------------------------------------+");
		System.out.println("|              # Tel : " + num + "                               |");
		System.out.println("|              # Name : " + name + "                                 |");
		System.out.println("+-----------------+------------+-------------------+-----------+");
		System.out.println("|                 | Qty        |  Unit Price       |   Price   |");
		System.out.println("+-----------------+------------+-------------------+-----------+");
		System.out.println("|  # Basmathi     |   "+basmathi+"       |  "+bup+"            |  "+bp+"   |");
		System.out.println("|  # Dhan         |   "+dhal+"        |  "+dup+"            |  "+dp+"    |");
		System.out.println("|  # Suger        |   "+sugar+"        |  "+sup+"            |  "+sp+"    |");
		System.out.println("|  # Highland     |   "+higland+"        |  "+hup+"           |  "+hp+"   |");
		System.out.println("|  # Yoghurt      |   "+yoghurt+"        |  "+yup+"             |  "+yp+"     |");
		System.out.println("|  # Flour        |   "+flour+"        |  "+fup+"            |  "+fp+"    |");
		System.out.println("|  # Soap         |   "+soap+"        |  "+supp+"            |  "+spp+"    |");
		System.out.println("+-----------------+------------+-------------------+-----------+");
		System.out.println("|                              |  Total            |   " + total + "  |");
		System.out.println("|                              +-------------------+-----------+");
		System.out.println("|                              |  Discount(10%)    |   " + dis+ "   |");                                             
		System.out.println("|                              +-------------------+-----------+");                                            
		System.out.println("|                              |  Discount(10%)    |   " + dis+ "   |");
		System.out.println("|                              +-------------------+-----------+");
		System.out.println("|                              |  Price            |   " + fPrice+ "  |");                                             
		System.out.println("+-----------------+------------+-------------------+-----------+");
		System.out.println("                                                                  ");
		System.out.println("                                                                  ");
		
		float cash;
		System.out.print("Enter your cash amount :");
		cash=input.nextInt();
		float change = cash - fPrice;
		
		
		System.out.println("                                                                  ");
		System.out.println("                                                                  ");
		System.out.println("+----------------+----------------+");
		System.out.println("|  Net Amount    |   " + fPrice + "       |");
		System.out.println("+----------------+----------------+");
		System.out.println("|  Cash          |   " + cash   + "      |");
		System.out.println("+----------------+----------------+");
		System.out.println("|  Change        |   " + change   + "       |");
		System.out.println("+----------------+----------------+");
		
		int fiveThousand = (int)(change/5000);
		int twoThousand = Math.round(change % 5000)/2000;
		int oneThousand = Math.round(change % 2000)/1000;
		int fiveHund = Math.round(change % 1000)/500;
		int hund = Math.round(change % 500)/100;
		int fifty = Math.round(change % 100)/50;
		int twenty = Math.round(change % 100)/20;
		int ten = Math.round(change % 20)/10;
		int five = Math.round(change % 10)/5;
		int two = Math.round(change % 5)/2;
		int one = Math.round(change % 2)/1;

		int notes = (fiveThousand+twoThousand+oneThousand+fiveHund+hund+fifty+twenty);
		int coins = (ten+five+two+one);
	
		
		System.out.println("                                                                  ");
		System.out.println("                                                                  ");
		System.out.println("                                                                  ");
		System.out.println("                                                                  ");System.out.println("+----------------+----------------+");
		System.out.println("|     Value      |     No         |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.5000   |     "+fiveThousand+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.2000   |     "+twoThousand+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.1000   |     "+oneThousand+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.500    |     "+fiveHund+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.100    |     "+hund+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.50     |     "+fifty+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.20     |     "+twenty+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.10     |     "+ten+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.5      |     "+five+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.2      |     "+two+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|      Rs.1      |     "+one+"          |");
		System.out.println("+----------------+----------------+");
		System.out.println("|  No of Notes   |    "+notes+"           |");
		System.out.println("+----------------+----------------+");
		System.out.println("|  No of Coins   |    "+coins+"           |");
		System.out.println("+----------------+----------------+");

	}
}
