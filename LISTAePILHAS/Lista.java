                     /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.LISTAePILHAS;

/**
 *
 * @author 03569198200
 */
public class Lista {

    int number[]; // Dont declarate size of array when create a list
    int initArray = -1;
    int maxSize;
    int first; //
    int last;//inicio de uma lista o ultimo é o 0

    void CreateList(int size) {
        maxSize = size;
        number = new int[size];
        emptyList();

    }

    void emptyList() { // esvaziar lista
        first = initArray;
        last = first + 1; // or 0 (zero)
    }

    boolean isEmpty() {//esta vazia?
        return first == last - 1;
    }

    void insertValue(int value) { // Insert a value
        if (last >= maxSize) {
            System.out.println("Full list!");
        }
        number[last] = value;
        last++; // When add a new value in list, incremment this value
    }

    void insertElement(int indice, int valor) {
        if (last < maxSize) {
            for (int j = last; j > indice; j--) {
                number[j] = number[j - 1];
            }
            number[indice] = valor;
            last++;
        } else {
            System.out.println("Lista cheia");
        }

    }

    void print() {
        if (!isEmpty()) {
            for (int i = 0; i < last; i++) {
                System.out.printf("lista[%d] = %d\n", i, number[i]);
            }

        } else {
            System.out.println("Lista vazia");
        }

    }

    void remove(int indice) {
        if (isEmpty() || indice < last) {
            System.out.println("Lista Vazia!");
        } else {
            last--;
            for (int aux = indice; aux <= last; aux++) {
                number[aux] = number[aux + 1];
            }

        }

    }

}
