public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int row = 0; row < 8; row++) {
         for (int col = 0; col < 8; col++) {
            if ((row + col) % 2 == 0) {
               chessboard[row][col] = '\u25A1'; // Cuadro negro ('\u25A0')
            } else {
               chessboard[row][col] = '\u25A0'; // Cuadro blanco ('\u25A1')
            }
         }
      }
      for (int row = 0; row < 8; row++) {
         for (int col = 0; col < 8; col++) {
            System.out.print(chessboard[row][col]);
         }
         System.out.println(); // Nueva línea al final de cada fila
      }
   }
}




