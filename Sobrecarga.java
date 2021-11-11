public class Sobrecarga {
    public class FabricaCupcake {
        String nome, slogan;

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setSlogan(String slogan) {
            this.slogan = slogan;
        }
        public String getNome() {
            return nome;
        }
        public String getSlogan() {
            return slogan;
        }

        public FabricaCupcake() throws Exception {
            throw new Exception("É necessário pelo menos 1 parametro");
        }
        public FabricaCupcake(String nome) {
            this.nome = nome;
        }
        public FabricaCupcake(String nome, String slogan) {
            this.nome = nome;
            this.slogan = slogan;
        }

        public void cupcake(String massa) {
            System.out.format("Fazendo cupcake: \n\tmassa: %s", massa);
        }
        public void cupcake(String massa, String cobertura) {
            System.out.format("Fazendo cupcake: \n\tmassa: %s \n\tcobertura: %s", massa, cobertura);
        }
        public void cupcake(String massa, String cobertura, String recheio) {
            System.out.format("Fazendo cupcake: \n\tmassa: %s \n\tcobertura: %s \n\trecheio: %s", massa, cobertura, recheio);
        }
        public String cardapio() {
            return "massa: branca, chocolate; recheio: chocolate, goiabada, doce de leite; cobertura: doce de leite, leite condensado, chantilly";
        }
    }
}