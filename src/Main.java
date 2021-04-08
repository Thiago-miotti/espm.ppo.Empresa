import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {


        ArrayList<Empregado> lista_empregado = new ArrayList<>();
        ArrayList<Cliente> lista_cliente = new ArrayList<>();
        String opcao;

        // Instancia Scanner
        Scanner scan = new Scanner(System.in);

        do {
            printMenu();
            System.out.print("> ");
            opcao = scan.next();

            switch (opcao.toLowerCase()) {
                case "1":
                    String gerenteVendedor = criarSubmenu();
                    cadastrarEmpregado(lista_empregado, gerenteVendedor);
                    break;
                case "2":
                    cadastrarCliente(lista_cliente);
                    break;
                case "3":
                    Pesquisar(lista_empregado, lista_cliente);
                    break;
                case "4":
                    ListarEmpregados(lista_empregado);
                    break;
                case "5":
                    ListarClientes(lista_cliente);
                    break;


                default:
                    System.out.println("Opcao invalida");
            }

        } while (!opcao.equals("7"));

        scan.close();

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


    public static void cadastrarEmpregado(ArrayList<Empregado> lista_empregado, String opcao) {
        switch (opcao) {
            case "g":
            case "G":
                Gerente novoGerente = cadastrarGerente();
                lista_empregado.add(novoGerente);
                break;
            case "v":
            case "V":
                Vendedor novoVendedor = cadastrarVendedor();
                lista_empregado.add(novoVendedor);
                break;
        }
    }

    public static String criarSubmenu() {
        // Instancia Scanner
        Scanner scan = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("Cadastro para vendedor[V] ou para gerente[G] ? ");
            System.out.print("> ");
            opcao = scan.nextLine();

        } while (!opcao.equalsIgnoreCase("g") && !opcao.equalsIgnoreCase("v"));

        return opcao;
    }

    public static Gerente cadastrarGerente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Matricula: ");
        String matricula = scanner.nextLine();

        System.out.println("Salario: ");
        Double salario = scanner.nextDouble();

        System.out.println("Bonus: ");
        Double bonus = scanner.nextDouble();

        Gerente gerente = new Gerente(nome, cpf, matricula, salario, bonus);
        return gerente;
    }

    public static Vendedor cadastrarVendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Matricula: ");
        String matricula = scanner.nextLine();
        System.out.println("Total de Vendas: ");
        Double totalDeVendas = scanner.nextDouble();
        System.out.println("comissão: ");
        Double comissao = scanner.nextDouble();


        Vendedor vendedor = new Vendedor(nome, cpf, matricula, totalDeVendas, comissao);
        return vendedor;
    }

    public static Cliente cadastrarCliente(ArrayList<Cliente> lista_cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Valor da divida: ");
        Double valorDaDivida = scanner.nextDouble();


        Cliente cliente = new Cliente(nome, cpf, valorDaDivida);
        lista_cliente.add(cliente);
        return cliente;
    }

    public static void Pesquisar(ArrayList<Empregado> lista_empregado, ArrayList<Cliente> lista_cliente) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> lista_cliente_empregado = new ArrayList<>();
        lista_cliente_empregado.addAll(lista_empregado);
        lista_cliente_empregado.addAll(lista_cliente);

        System.out.println("Qual CPF será pesquisado?");
        System.out.println(">");
        String cpf = scanner.nextLine();
    }

    public static void ListarEmpregados(ArrayList<Empregado> lista_empregado) {
        for (Empregado e : lista_empregado) {
            if (e != null) {
                System.out.println( "Matricula:" + e.getMatricula() + " Nome: " + e.getNome() + " -> " + "CPF:" + e.getCpf());
            } else {
                System.out.println("Nenhum Empregado Cadastrado");
            }
        }
    }

    public static void ListarClientes(ArrayList<Cliente> lista_cliente) {
        for (Cliente c : lista_cliente) {
            if (c != null) {
                System.out.println("Nome: " + c.getNome() + " -> " + "CPF:" + c.getCpf());
            } else {
                System.out.println("Nenhum Cliente Cadastrado");
            }
        }
    }
}




