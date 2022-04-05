
public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Lamborghini";
        meuCarro.modelo = "Aventador";
        meuCarro.cor = "vermelho";
        meuCarro.anoFabricado = 2009;
        meuCarro.valorDeMercado = 2.00f;
        meuCarro.flex = true;
        meuCarro.tipoCombustivel = "Álcool/Gasolina";

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoFabricado = 2009;
        seuCarro.cor = "Preto";

        System.out.println("Meu carro");
        System.out.println("----------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoFabricado);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("----------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFabricado);

    }
    
}
