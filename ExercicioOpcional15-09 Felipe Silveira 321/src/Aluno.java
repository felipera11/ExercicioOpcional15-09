public class Aluno extends Usuario{

    private int matricula;
    private String curso;
    protected int nota;

    @Override
    public void fazerLogin(String log, String pass){
        if((log==this.login)&&(pass==this.senha)){
            System.out.println("O acesso foi liberado!!");
        } else System.out.println("Senha ou usuario errado!!");
    }

}
