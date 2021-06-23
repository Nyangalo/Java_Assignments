import java.util.Scanner;

class BigJavaP4_30 {


            public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
              int   MaxTicket= 4;
                int tickets = 100;
                int buyers = 0;

                System.out.println(tickets + " tickets will be sold.");


                while(tickets > 0) {
                    System.out.println("How many tickets would you like to buy?");

                    int count = in.nextInt();


                    if(count < 0 || count > MaxTicket) {
                        System.out.println("You can only buy up to " + MaxTicket + " tickets.");
                        continue;
                    }

                    if(count == 0) {
                        System.out.println("You don't want to buy any tickets, bye!\n");
                        continue;
                    }

                    if(tickets < count) {
                        System.out.println("There are only " + tickets + " ticket(s) left.");
                        continue;
                    }

                    tickets -= count;
                    buyers++;
                    System.out.println("You've bought " + count + " ticket(s)!\n");
                }

                System.out.println("All tickets have been sold, to " + buyers + " buyers.");
            }
        }




