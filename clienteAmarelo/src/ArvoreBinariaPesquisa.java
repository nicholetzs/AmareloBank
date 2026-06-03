public class ArvoreBinariaPesquisa {
    private No raiz;
    private int quantNos;

    public ArvoreBinariaPesquisa() {
        this.quantNos = 0;
        this.raiz = null;
    }

    public boolean eVazia() {
        return this.raiz == null;
    }

    public No getRaiz() {
        return this.raiz;
    }

    public int getQuantNos() {
        return this.quantNos;
    }
}