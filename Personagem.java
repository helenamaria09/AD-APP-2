// Alunas: Maria Helena da Silva Almeida e Ana Luisa da Silva Fernandes

package src.model; 
public class Personagem {
    
    // Atributos Privados para garantir o Encapsulamento
    private String nome;
    private String classe;
    private double vida;

    // Construtor: Trata vida negativa conforme o requisito
    public Personagem(String nome, String classe, double vidaInicial) {
        this.nome = nome;
        this.classe = classe;
        // Se a vida for negativa, inicia com 0.00
        if (vidaInicial < 0) {
            this.vida = 0.00;
        } else {
            this.vida = vidaInicial;
        }
    }

    // Método para curar: valida se o valor é maior que 0
    public void curar(double valor) {
        if (valor > 0) {
            this.vida += valor;
        } else {
            System.out.println("Valor de cura inválido."); // Mensagem obrigatória
        }
    }

    // Método para dano: valida valor positivo e se há vida suficiente
    public void recDano(double valor) {
        if (valor > 0 && valor <= this.vida) {
            this.vida -= valor;
        } else {
            System.out.println("Vida insuficiente para receber o dano."); // Mensagem obrigatória
        }
    }

    public double getVida() {
        return vida;
    }

    @Override
    public String toString() {
        // Formatação exata conforme o resultado visual esperado
        return String.format("Personagem: %s | Classe: %s | Vida: %.2f", nome, classe, vida);
    }
}