public class Usuario {

    protected String nome;
    protected String login;
    protected String senha;

    public void fazerLogin(String log, String pass){
        if((log==this.login)&&(pass==this.senha)){
            System.out.println("O acesso foi liberado!!");
        } else System.out.println("Senha ou usuario errado!!");
    }

}
