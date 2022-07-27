// Buat class
public class Main {
  int x;  // buat atribut class nya

  // buat constuktor untuk main class
  public Main() {
    x = 5;  // Tetapkan nilai awal untuk atribut kelas x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Buat objek kelas Main (Ini akan memanggil konstruktor)
    System.out.println(myObj.x); //Cetak nilai x
  }
}
