/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

public class Carreta extends Veiculo {

    public Carreta(Veiculo veiculo) {

        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
        this.placa = veiculo.getPlaca();
        this.tipo = "Carreta";
        this.capacidade = 10;
        this.cargaVeiculo = new Objeto[capacidade];
        this.roteiroEntrega = "";
    }

    @Override
    public void gerarCarga() {

        Carga carga = new Carga();

        carga.gerarCargaVeiculo(this);
    }

    @Override
    public void gerarRoteiro() {

        Roteiro roteiro = new Roteiro();

        roteiro.gerarRoteiroEntrega(this);

    }

}
