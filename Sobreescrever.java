import Sobrecarga.FabricaCupcake;

public class Sobreescrever {
    public class FabricaBolo extends FabricaCupcake {
        public String cardapio() {
            return "massa: branca, chocolate, banana, abacaxi, morango; recheio: chocolate, goiabada, doce de leite, creme de leite em pó, mousse de chocolate; cobertura: doce de leite, leite condensado, chantilly, chocolate, chocolate branco";
        }
    }
}
