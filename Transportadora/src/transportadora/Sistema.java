/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

public class Sistema {

    Carga carga = new Carga();
    Garagem garagem = new Garagem();

    public boolean verificaVeiculoDisp(Veiculo veiculo) {

        return true;
    }

    public boolean verificaCNH(Motorista motorista, Veiculo veiculo) {

        return true;
    }

    public void cadastrarObjeto(Objeto obj) {

        carga.adicionarObj(obj);
    }

    public void cadastrarVeiculo(Veiculo veiculo) {

        garagem.adicionarVeiculo(veiculo);

    }

    public void separarCarga(Veiculo veiculo) {
        
        veiculo.gerarCarga();
        
    }

}
