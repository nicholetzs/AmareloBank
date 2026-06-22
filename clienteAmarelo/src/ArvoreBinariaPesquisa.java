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
<<<<<<< HEAD

    public boolean pesquisar(String nome) {
        return pesquisar(nome, this.raiz) != null;
    }

=======
    public boolean pesquisar(String nome) {
        return pesquisar(nome, this.raiz) != null;
    }
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    private No pesquisar(String nome, No no) {
        if (no != null) {
            int comp = nome.compareToIgnoreCase(no.getCliente().getNome());
            if (comp < 0) {
                no = pesquisar(nome, no.getEsq());
            } else if (comp > 0) {
                no = pesquisar(nome, no.getDir());
            }
        }
        return no;
    }
<<<<<<< HEAD

=======
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    public Cliente consultar(String nome) {
        No no = pesquisar(nome, this.raiz);
        return no != null ? no.getCliente() : null;
    }
<<<<<<< HEAD

    public boolean pesquisarCpf(String cpf) {
        return pesquisarCpf(this.raiz, cpf);
    }

=======
    public boolean pesquisarCpf(String cpf) {
        return pesquisarCpf(this.raiz, cpf);
    }
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    private boolean pesquisarCpf(No no, String cpf) {
        if (no == null) {
            return false;
        }
        if (no.getCliente().getCpf().equals(cpf)) {
            return true;
        }
        return pesquisarCpf(no.getEsq(), cpf) || pesquisarCpf(no.getDir(), cpf);
    }
<<<<<<< HEAD

=======
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    public boolean inserir(Cliente cliente) {
        if (pesquisar(cliente.getNome()) || pesquisarCpf(cliente.getCpf())) {
            return false;
        } else {
            this.raiz = inserir(cliente, this.raiz);
            this.quantNos++;
            return true;
        }
    }
    private No inserir(Cliente cliente, No no) {
        if (no == null) {
            return new No(cliente);
        } else {
            int comp = cliente.getNome().compareToIgnoreCase(no.getCliente().getNome());
            if (comp < 0) {
                no.setEsq(inserir(cliente, no.getEsq()));
                return no;
            } else {
                no.setDir(inserir(cliente, no.getDir()));
                return no;
            }
        }
    }
    public boolean remover(String nome) {
        if (pesquisar(nome)) {
            this.raiz = remover(nome, this.raiz);
            this.quantNos--;
            return true;
        } else {
            return false;
        }
    }
    private No remover(String nome, No arv) {
        int comp = nome.compareToIgnoreCase(arv.getCliente().getNome());
        if (comp < 0) {
            arv.setEsq(remover(nome, arv.getEsq()));
        } else if (comp > 0) {
            arv.setDir(remover(nome, arv.getDir()));
        } else {
            if (arv.getDir() == null) {
                return arv.getEsq();
            } else if (arv.getEsq() == null) {
                return arv.getDir();
            } else {
                arv.setEsq(arrumar(arv, arv.getEsq()));
            }
        }
        return arv;
    }
    private No arrumar(No arv, No maior) {
        if (maior.getDir() != null) {
            maior.setDir(arrumar(arv, maior.getDir()));
        } else {
            arv.setCliente(maior.getCliente());
            maior = maior.getEsq();
        }
        return maior;
    }

<<<<<<< HEAD
    private No inserir(Cliente cliente, No no) {
        if (no == null) {
            return new No(cliente);
        } else {
            int comp = cliente.getNome().compareToIgnoreCase(no.getCliente().getNome());
            if (comp < 0) {
                no.setEsq(inserir(cliente, no.getEsq()));
                return no;
            } else {
                no.setDir(inserir(cliente, no.getDir()));
                return no;
            }
        }
    }

    public boolean remover(String nome) {
        if (pesquisar(nome)) {
            this.raiz = remover(nome, this.raiz);
            this.quantNos--;
            return true;
        } else {
            return false;
        }
    }

    private No remover(String nome, No arv) {
        int comp = nome.compareToIgnoreCase(arv.getCliente().getNome());
        if (comp < 0) {
            arv.setEsq(remover(nome, arv.getEsq()));
        } else if (comp > 0) {
            arv.setDir(remover(nome, arv.getDir()));
        } else {
            if (arv.getDir() == null) {
                return arv.getEsq();
            } else if (arv.getEsq() == null) {
                return arv.getDir();
            } else {
                arv.setEsq(arrumar(arv, arv.getEsq()));
            }
        }
        return arv;
    }

    private No arrumar(No arv, No maior) {
        if (maior.getDir() != null) {
            maior.setDir(arrumar(arv, maior.getDir()));
        } else {
            arv.setCliente(maior.getCliente());
            maior = maior.getEsq();
        }
        return maior;
    }

    public int contarPorSexo(String sexo) {
        return contarPorSexo(this.raiz, sexo);
    }

=======
    public int contarPorSexo(String sexo) {
        return contarPorSexo(this.raiz, sexo);
    }
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    private int contarPorSexo(No no, String sexo) {
        if (no == null) {
            return 0;
        }
        int count = no.getCliente().getSexo().equalsIgnoreCase(sexo) ? 1 : 0;
        return count + contarPorSexo(no.getEsq(), sexo) + contarPorSexo(no.getDir(), sexo);
    }
<<<<<<< HEAD

    public void listarPorFaixaEtaria(int min, int max) {
        listarPorFaixaEtaria(this.raiz, min, max);
    }

=======
    public void listarPorFaixaEtaria(int min, int max) {
        listarPorFaixaEtaria(this.raiz, min, max);
    }
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    private void listarPorFaixaEtaria(No no, int min, int max) {
        if (no != null) {
            listarPorFaixaEtaria(no.getEsq(), min, max);
            int idade = no.getCliente().getIdade();
            if (idade >= min && idade <= max) {
                System.out.println(no.getCliente());
            }
            listarPorFaixaEtaria(no.getDir(), min, max);
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    public Cliente obterClienteMenorIdade() {
        if (this.raiz == null) {
            return null;
        }
        return obterClienteMenorIdade(this.raiz, this.raiz.getCliente());
    }
<<<<<<< HEAD

=======
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    private Cliente obterClienteMenorIdade(No no, Cliente atualMenor) {
        if (no == null) {
            return atualMenor;
        }
        if (no.getCliente().getIdade() < atualMenor.getIdade()) {
            atualMenor = no.getCliente();
        }
        atualMenor = obterClienteMenorIdade(no.getEsq(), atualMenor);
        atualMenor = obterClienteMenorIdade(no.getDir(), atualMenor);
        return atualMenor;
    }
<<<<<<< HEAD

=======
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    public Cliente obterClienteMaiorIdade() {
        if (this.raiz == null) {
            return null;
        }
        return obterClienteMaiorIdade(this.raiz, this.raiz.getCliente());
    }
<<<<<<< HEAD

=======
>>>>>>> 6aaa596f45df22e234b42ea3f7028069621ef28e
    private Cliente obterClienteMaiorIdade(No no, Cliente atualMaior) {
        if (no == null) {
            return atualMaior;
        }
        if (no.getCliente().getIdade() > atualMaior.getIdade()) {
            atualMaior = no.getCliente();
        }
        atualMaior = obterClienteMaiorIdade(no.getEsq(), atualMaior);
        atualMaior = obterClienteMaiorIdade(no.getDir(), atualMaior);
        return atualMaior;
    }
}