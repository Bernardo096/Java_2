package Academico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Funcionario extends Pessoa {

    public int HrTrab;
    public String Cargo;

    public void andar() {
        JOptionPane.showMessageDialog(null, Nome + "  está andando");
    }
}
