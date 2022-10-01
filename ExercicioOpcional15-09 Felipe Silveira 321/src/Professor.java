public class Professor extends Usuario implements Funcionario{
    @Override
    public void autenticar(String pass) {
        if(pass==super.senha){
            System.out.println("O acesso foi autorizado!!");
        } else System.out.println("Senha errada!!");
    }

    public void publicarNota(Aluno aluno){
        System.out.println("A nota do aluno " + aluno.nome + " eh " + aluno.nota);
    }
}
