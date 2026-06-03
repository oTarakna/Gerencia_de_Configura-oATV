import javax.swing.JOptionPane;
public class Media1 {

        public static void main(String args[])  {

            int n1, n2, n3, n4, media;
            
            String msn1, msn2, msn3, msn4;

            msn1 = JOptionPane.showInputDialog("Entre com a primeira Nota");
            msn2 = JOptionPane.showInputDialog("Entre com a segunda Nota");
            msn3 = JOptionPane.showInputDialog("Entre com a terceira Nota ");
            msn4 = JOptionPane.showInputDialog("Entre com a quarta Nota");


            n1= Integer.parseInt(msn1);
            n2= Integer.parseInt(msn2);
            n3= Integer.parseInt(msn3);
            n4= Integer.parseInt(msn4);


            media =(n1 + n2 + n3 + n4) / 4;
            JOptionPane.showMessageDialog(null, "O Total " + media, ".", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Total  =" + media);
            System.exit(0);
                    }