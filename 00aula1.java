
/* Classe de exemplo para o exercício da Aula 3 de Orientação a Objetos */
class carro {

  string cor;
  string modelo;
  int capacidadeTanque;
  
  // Construtor Aqui

  Carro() {

  }

  Carro(String cor, String modelo, int capacidadeTanque) {
    
  }

  void setCor(String cor) {
    this.cor = cor;
  }
  
  String getCor() {
    return cor;
  } 

  void setModelo(String modelo) {

   this.modelo = modelo;
  
  }

  String getModelo () {
    return modelo;
  }

  // Get e set tanque

  void setCapacidadeTanque(int capacidadeTanque) { 
   this.capacidadeTanque = capacidadeTanque;
  }

  int getCapacidadeTanque(capacidadeTanque){
    return capacidadeTanque;
  }

  // metodo do total para encher o tanque
  
  double totalValorTanque(double valorCombustivel) {
    return capacidadeTanque * valorCombustivel;
    
  }
}
