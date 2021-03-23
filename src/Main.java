import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String opcao;

        // Instancia Scanner
        Scanner scan = new Scanner(System.in);

        do {
            printMenu();
            System.out.print("> ");
            opcao = scan.nextLine();

            switch (opcao.toLowerCase()) {
                default:
                    System.out.println("Opcao invalida");
            }

        } while (!opcao.equals("7"));

    }

    public static void printMenu() {
        System.out.println("--- Menu ---");
        String menu = "";

        menu += "1. Cadastrar Empregado\n" +
                "2. Cadastrar Cliente\n" +
                "3. Pesquisar\n" +
                "4. Listar Empregados\n" +
                "5. Listar Clientes\n" +
                "6. Remover\n" +
                "7. Finalizar";

        System.out.println(menu);
    }


}

