public class HundredthPrime {
   public static void main(String[] args) {
      int contadorPrimos = 0;
      int numeroActual = 2;

      while (contadorPrimos < 100) {
         boolean esPrimo = true;
         for (int i = 2; i * i <= numeroActual; i++) {
            if (numeroActual % i == 0) {
               esPrimo = false;
               break;
            }
         }

         if (esPrimo) {
            contadorPrimos++;
         }

         numeroActual++;
      }

      System.out.println((numeroActual - 1));
   }
}