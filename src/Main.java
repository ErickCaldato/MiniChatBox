import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MiniChatBot bot = new MiniChatBot();
        String inicio = bot.inicio();
        System.out.println(inicio);


        String respostaUsuario = "";

        do{
            System.out.print("Usuário :");
            respostaUsuario = sc.nextLine();

            bot.criarMiniChatbot(respostaUsuario);



        }while (!respostaUsuario.contains("Sair"));



    }
}
