/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

public class Veiculo {

    public String marca;
    public String modelo = "";
    public int ano = 0;
    public String placa = "";
    public String tipo = "";
    public int capacidade = 0;
    public Objeto cargaVeiculo[];
    public String roteiroEntrega;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Objeto[] getCargaVeiculo() {
        return cargaVeiculo;
    }

    public void setCargaVeiculo(Objeto[] cargaVeiculo) {
        this.cargaVeiculo = cargaVeiculo;
    }

    public String getRoteiroEntrega() {
        return roteiroEntrega;
    }

    public void setRoteiroEntrega(String roteiroEntrega) {
        this.roteiroEntrega = roteiroEntrega;
    }

    
    
    public void gerarRoteiro() {

    }

    public void gerarCarga() {

    }

}
