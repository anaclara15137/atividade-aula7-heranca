/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conza
 */
public abstract class Curso {

    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String duracao;
    private String tipoDuracao;
    private String modalidade;
    private boolean status;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String _codigo) {
        codigo = _codigo;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String _nome) {
        nome = _nome;

    }
    
    public int getcargaHoraria() {
        return cargaHoraria;
    }

    public void setcargaHoraria(int _cargaHoraria) {
        cargaHoraria = _cargaHoraria;
    }

    public String getduracao() {
        return duracao;
    }

    public void setduracao(String _duracao) {
        duracao = _duracao;
    }

    public String getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(String _tipoDuracao) {
        tipoDuracao = _tipoDuracao;
    }

    public String getmodalidade() {
        return modalidade;
    }

    public void setmodalidade(String _modalidade) {
        modalidade = _modalidade;
    }

    public boolean getstatus() {
        return status;
    }

    public void setstatus(boolean _status) {
        status = _status;
    }
}
