package padroesestruturais.adapter;

public class AvaliacaoAdapter extends AvaliacaoInteligencia {

    private IAvaliacaoGurreiro avaliacaoGuerreiro;

    public AvaliacaoAdapter(IAvaliacaoGurreiro avaliacaoGuerreiro) {
        this.avaliacaoGuerreiro = avaliacaoGuerreiro;
    }

    public String recuperarAvaliacao() {
        if (this.getInteligencia() >= 9.0f)
            avaliacaoGuerreiro.setAvaliacao("A");
        else
            if (this.getInteligencia() >= 8.0f)
                avaliacaoGuerreiro.setAvaliacao("B");
            else
                if (this.getInteligencia() >= 7.0f)
                    avaliacaoGuerreiro.setAvaliacao("C");
                else
                    avaliacaoGuerreiro.setAvaliacao("D");
        return avaliacaoGuerreiro.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoGuerreiro.getAvaliacao().equals("A"))
            this.setInteligencia(9.0f);
        else
            if (avaliacaoGuerreiro.getAvaliacao().equals("B"))
                this.setInteligencia(8.0f);
            else
                if (avaliacaoGuerreiro.getAvaliacao().equals("C"))
                    this.setInteligencia(7.0f);
                else
                    this.setInteligencia(0.0f);
    }
}
