/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiasemana5;

/**
 *
 * @author alons
 */
public class Palabra {

    private String caracter;

    public Palabra(String caracter) {
        this.caracter = caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getInvertir() {
        String caracter = this.caracter;
        if (caracter.isEmpty() || caracter.length() == 1) {
            return caracter;
        } else {
            return new Palabra(caracter.substring(1)).getInvertir() + caracter.charAt(0);
        }
    }
}
