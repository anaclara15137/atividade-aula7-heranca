/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conza
 */
   public class Graduacao extends Curso {

    private String tipo;
    private boolean tccObrigatorio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String _tipo) {
        tipo = _tipo;
    }

    public boolean isTccObrigatorio() {
        return tccObrigatorio;
    }

    public void setTccObrigatorio(boolean _tccObrigatorio) {
        tccObrigatorio = _tccObrigatorio;
    }

    public boolean validarTCC() {
        return tccObrigatorio;
    }
}

