/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc4;

/**
 *
 * @author randozero
 */
public class Rc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println((int)'H');
        String s = Integer.toBinaryString((int)'Z');
        System.out.println(s);
        char a= (char)Integer.parseInt(s, 2);
        System.out.println(a);
        System.out.println((int) 1);
        s = Integer.toBinaryString((int)'1');
        System.out.println(s);
        a= (char)Integer.parseInt("01001010", 2);
        System.out.println(a);
    }
    
}
