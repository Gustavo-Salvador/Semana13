public class Heranca {
    public class FabricaCupcakeBiscoito extends FabricaCupcake{
        public FabricaCupcakeBiscoito(String nome, String slogan) {
            super(nome, slogan);
        }
        public FabricaCupcakeBiscoito(String nome) {
            super(nome);
        }
        public FabricaCupcakeBiscoito() {
            super();
        }

        public void Biscoito(String biscoito, String recheio) {
            System.out.format("Fazendo Biscoito: \n\t Biscoito: %s \n\t recheio: %s", biscoito, recheio);
        }
    }
}
