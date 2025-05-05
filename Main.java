public class Main{
  public static void main(String[] args){
    boolean[][] testa = new boolean[8][60]; 
    for (int i = 10; i <15; i++) testa[1][i] = true; 
    for (int i = 30; i <45; i++) testa[1][i] = true; 
    for (int i = 50; i <60; i++) testa[1][i] = true; 
    AppointmentBook a = new AppointmentBook(testa); 
    System.out.println(a.findFreeBlock(2, 15));
    System.out.println(a.findFreeBlock(2, 9));
    System.out.println(a.findFreeBlock(2, 20));
    boolean[][] testb = new boolean[8][60]; 
    for (int i = 25; i <30; i++) testb[1][i] = true; 
    for (int i = 0; i <15; i++) testb[2][i] = true; 
    for (int i = 41; i <60; i++) testb[2][i] = true; 
    for (int i = 5; i <30; i++) testb[3][i] = true; 
    for (int i = 44; i <60; i++) testb[3][i] = true; 
    AppointmentBook b = new AppointmentBook(testb); 
    System.out.println(b.makeAppointment(2, 4, 22));
    System.out.println(b.makeAppointment(3, 4, 3));
    System.out.println(b.makeAppointment(2,4,30));
    b.printPeriod(2);
    b.printPeriod(3);
    b.printPeriod(4);
  }
}
