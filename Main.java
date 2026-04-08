package src.app; 

import src.model.Personagem; 

public class Main {

    public static void main(String[] args) {
        // 1. Criar personagem 
        Personagem arthas = new Personagem("Arthas", "Guerreiro", 1000.00);

        // 2. Imprimir dados (toString)
        System.out.println(arthas.toString());

        // 3. Curar 500.00 e imprimir vida
        arthas.curar(500.00);
        System.out.println("Após cura de 500: " + arthas.getVida());

        // 4. Tentar curar valor inválido
        arthas.curar(-100.00);

        // 5. Receber dano de 200.00
        arthas.recDano(200.00);
        System.out.println("Após dano de 200: " + arthas.getVida());

        // 6. Tentar receber dano fatal
        arthas.recDano(5000.00);

        // 7. Criar personagem "Zara" com vida negativa
        Personagem zara = new Personagem("Zara", "Maga", -500.00);

        // 8. Imprimir dados 
        System.out.println(zara.toString());
    }
}