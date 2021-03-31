import static javax.swing.JOptionPane.*;

public class CaraOuCoroa {


    public static void main(String[] args) {
    double pCara = 0, pCoroa = 0;
    int numVezes = Integer.parseInt(showInputDialog("Insira quantas vezes deseja que a moeda seja jogada?"));
    do{
       int caraOuCoroa = (int) (Math.random() * 2);
       if (caraOuCoroa == 0){
           System.out.println("\uD83D\uDE42 cara!");
           pCara++;
        }

       else{
           System.out.println("\uD83D\uDE43 coroa!");
           pCoroa++;
       }

    }while(--numVezes > 0);

    showMessageDialog(null, "Percentual de " + (int) (pCara + pCoroa)
    + " tentativas:\n Cara: " + (pCara / (pCara + pCoroa)) * 100 +
     "\n Coroa: " + (pCoroa / (pCara + pCoroa)) * 100);

    }

}
