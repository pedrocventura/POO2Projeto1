/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        User user;
        Record record;
        boolean ok = true;
        Register register;
        System.out.println("Bem Vindo!");
        while (ok) {
            System.out.println("Digite o que deseja:"
                    + "1- Cadastrar novo usuario"
                    + "2- Entrar"
                    + "3 -Sair");
            int a = entrada.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Vamos cadastrar um novo user");
                    System.out.print("Digite o usuario: ");
                    String username = entrada.next();
                    System.out.print("\nCerto, agora digite seu email: ");
                    String email = entrada.next();
                    System.out.print("\nBeleza! O ultimo dado é o telefone: ");
                    String tel = entrada.next();
                    user = new User(username, email, tel);
                    System.out.println("OK! Agora eu preciso que vocẽ me informe qual\n"
                            + "método você deseja receber seus dados:\n"
                            + "1 - WPP\n"
                            + "2 - Email\n"
                            + "3 - SMS");

                    int b = entrada.nextInt();
                    switch (b) {
                        case 1:
                            record = new RecordWpp();
                            register = new Register(user, record);
                            if(register.register()){
                                System.out.println("Dados enviados!");
                            }else{
                                System.out.println("Oops! Algo deu errado, tente novamente");
                            }
                                
                    }
            }

        }
    }

}
