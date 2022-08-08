/* Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos */

class RodarAplicação {
   public static void main(String [] args) {

    Carro carro1 = new Carro();

    carro1.setCor("Vermelho");
    carro1.setModelo("BMW serie 3");
    carro1.setCapacidadeTanque("59");

    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCor());
    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(totalValorTanque(valorCombustivel: 6.39));

    Carro carro2 = new Carro (cor: "cinza", modelo: "Mercedes Bens Classe C", capacidadeTanque: "66");

    System.out.println(carro2.getModelo());
    System.out.println(carro2.getCor());
    System.out.println(carro2.getCapacidadeTanque());
    System.out.println(totalValorTanque(valorCombustivel:6,46));



   }


}