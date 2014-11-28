/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z14;

/**
 *
 * @author User
 */
public class U2_z14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[] = { 1, -5, -4, 20, 0, 5, -4, 7 };
        int сума = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] <= 0) {
                сума += m[i];
                continue;
            }
        System.out.println("m[" + i + "] = " + m[i]);
        }

System.out.println("Сумата на отрицателните числа е "+ сума);

        // TODO code application logic here
    }
    
}
