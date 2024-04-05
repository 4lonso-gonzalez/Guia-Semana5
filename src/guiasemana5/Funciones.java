/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiasemana5;

/**
 *
 * @author alons
 */
public class Funciones {

    private int numero1;
    private int numero2;

    public Funciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Funciones(int numero1){
        this.numero1 = numero1;
        this.numero2 = 0;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getContar() {
        int numero1 = this.numero1;
        if (numero1 < 10) {
            return 1;
        } else {
            return 1 + new Funciones(numero1 / 10).getContar();
        }
    }

    public int getSuma() {
        int numero1 = this.numero1;
        if (numero1 < 10) {
            return numero1;
        } else {
            return numero1 % 10 + new Funciones(numero1 / 10).getSuma();
        }
    }

    public int getMCD() {
        int numero1 = this.numero1;
        int numero2 = this.numero2;
        if (numero2 == 0) {
            return numero1;
        } else {
            return new Funciones(numero2, numero1 % numero2).getMCD();
        }
    }
}

