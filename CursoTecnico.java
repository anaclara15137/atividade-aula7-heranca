/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conza
 */
public class CursoTecnico extends Curso {
    
    private String eixoTecnologico;
    private int chEstagio;

    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    public void setEixoTecnologico(String _eixoTecnologico) {
        eixoTecnologico = _eixoTecnologico;
    }

    public int getChEstagio() {
        return chEstagio;
    }

    public void setChEstagio(int _chEstagio) {
        chEstagio = _chEstagio;
    }

    public boolean verificarEstagioObrigatorio() {
        return chEstagio > 0;
    }
}

