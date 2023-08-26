import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /* //BubbleSort
        BubbleSort bs = new BubbleSort();
        int vetor[] = {1,3,5,9,7,2};
        System.out.println(Arrays.toString(bs.executar(vetor))); */  

        /* //InsertSort
        InsertSort is = new InsertSort();
        int vetor[] = {4,38,5,9,10,15};
        System.out.println(Arrays.toString(is.executar(vetor)));  */

        //SelectSort
        SelectSort ss = new SelectSort();
        int vetor[] = {9,7,57,4,21,54};
        System.out.println(Arrays.toString(ss.executar(vetor)));        
        
        //Busca Binária
        Buscabinaria bb = new Buscabinaria();
        System.out.println(bb.executar(vetor, 54, 0, 5));   

        
        /* String a = JOptionPane.showInputDialog("oi"); 
        JOptionPane.showMessageDialog(null,a); */    
    }

}

