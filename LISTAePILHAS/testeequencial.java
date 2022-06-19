package br.edu.ifms.LISTAePILHAS;

import javax.sound.midi.Soundbank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 03569198200
 */
public class testeequencial {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.CreateList(8);
        lista.print();
        lista.insertValue(9);

        lista.insertValue(-2);

        lista.insertValue(7);

        lista.insertValue(3);

        lista.insertValue(24);
        lista.print();
        System.out.println("");

        lista.insertElement(2, -11);
        lista.print();

    }

}
