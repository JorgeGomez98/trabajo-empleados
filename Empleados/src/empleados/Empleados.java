/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long edad1, telefono1, edad2, telefono2, edad3, telefono3, edad4, telefono4, edad5, telefono5;
        String nombre1, direccion1, nombre2, direccion2, nombre3, direccion3, nombre4, direccion4, nombre5, direccion5;
        nombre1 = JOptionPane.showInputDialog("Digite nombre del empleado 1");
        direccion1 = JOptionPane.showInputDialog("Digite direccion del empleado 1");
        edad1 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 1"));
        telefono1 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 1"));
        nombre2 = JOptionPane.showInputDialog("Digite nombre del empleado 2");
        direccion2 = JOptionPane.showInputDialog("Digite Direccion del empleado 2");
        edad2 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 2"));
        telefono2 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 2"));
        nombre3 = JOptionPane.showInputDialog("Digite nombre del empleado 3");
        direccion3 = JOptionPane.showInputDialog("Digite direccion del empleado 3");
        edad3 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 3"));
        telefono3 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 3"));
        nombre4 = JOptionPane.showInputDialog("Digite nombre del empleado 4");
        direccion4 = JOptionPane.showInputDialog("Digite direccion del empleado 4");
        edad4 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 4"));
        telefono4 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 4"));
        nombre5 = JOptionPane.showInputDialog("Digite nombre del empleado 5");
        direccion5 = JOptionPane.showInputDialog("Digite direccion del empleado 5");
        edad5 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 5"));
        telefono5 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 5"));
        Personas p1 = new Personas(nombre1, direccion1, edad1, telefono1);
        Personas p2 = new Personas(nombre2, direccion2, edad2, telefono2);
        Personas p3 = new Personas(nombre3, direccion3, edad3, telefono3); 
        Personas p4 = new Personas(nombre4, direccion4, edad4, telefono4);
        Personas p5 = new Personas(nombre5, direccion5, edad5, telefono5);
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el empleado: \n 1."+nombre1+"\n 2."+nombre2+"\n 3."+nombre3+"\n 4."+nombre4+"\n 5."+nombre5+"\n 0. Salir."));
        
        
        switch(menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombre1+"\nDireccion: "+direccion1+"\nEdad: "+edad1+"\nTelefono: "+telefono1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombre2+"\nDireccion: "+direccion2+"\nEdad: "+edad2+"\nTelefono: "+telefono2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombre3+"\nDireccion: "+direccion3+"\nEdad: "+edad3+"\nTelefono: "+telefono3);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombre4+"\nDireccion: "+direccion4+"\nEdad: "+edad4+"\nTelefono: "+telefono4);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombre5+"\nDireccion: "+direccion5+"\nEdad: "+edad5+"\nTelefono: "+telefono5);
                break;    
            }
        
    }
}
