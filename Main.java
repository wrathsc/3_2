class Main {
  public static void main(String[]args) {
  int wysokosc = 5;
  int szerokosc=6;
  for(int i=0; i<wysokosc; i++) {
    for(int j=0; j<szerokosc-i-1; j++) {
      System.out.print("*");
    }
  
    System.out.println();
  }
}
}