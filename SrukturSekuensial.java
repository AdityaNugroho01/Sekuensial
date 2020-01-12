/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sruktur.sekuensial;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class SrukturSekuensial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(System.in);
        int p,l,K,L;
        System.out.print("Panjang");
        p = Baca.nextInt();
        System.out.print("Lebar");
        l = Baca.nextInt();
        
        K = 2*(p+l);
        L = p*l;
        
        System.out.println("Keliling =" +K);
        System.out.println("Luas =" +L);
        // TODO code application logic here
    }
    
}
