/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudos;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Bruno
 */
public class Main {

    public static void main(String[] args) {
       Motoboy boy = new Motoboy("20293232", "Bruno Pereira ", LocalDate.of(2012, Month.MARCH, 23), Genero.MASCULINO, Setor.OPERACOES, 2500);
       
       Diretor diretor = new Diretor("Juliano Ferraz", LocalDate.of(1999, Month.SEPTEMBER, 15), Genero.FEMININO, Setor.RECURSOS_HUAMNOS, 5000);
       
       boy.demitir(boy);
       diretor.admitir(diretor);
       

    
            
    }
}
