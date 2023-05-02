package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void retornarConceitoGuerreiro() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("A");

        assertEquals("A", guerreiro.getAvaliacao());
    }

    @Test
    void retornarInteligenciaGuerreiro() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("B");

        assertEquals(8.0f, guerreiro.getInteligencia());
    }

}