public class No {
    private Cliente cliente;
    private No esq, dir;
    public No(Cliente elemento) {
        this.cliente = elemento;
        this.esq = null;
        this.dir = null;
    };
    public No getEsq() {
        return this.esq;
    }
    public No setEsq(No no) {
        return this.esq = no;
    }
    public No getDir() {
        return this.dir;
    }
    public No setDir(No no) {
        return this.dir = no;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
