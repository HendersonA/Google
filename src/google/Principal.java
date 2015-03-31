/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d = new Data();
        Scanner sc = new Scanner(System.in);
        
        int dia,mes,ano;
        
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();
        
        d.setDia(dia);
        d.setMes(mes);
        d.setAno(ano);
        
        System.out.println(d);
        
    }
    
}
