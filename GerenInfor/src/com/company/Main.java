package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user, senha;
        Bd.init();
        Gerente gerente = new Gerente("Rochel", "00000000000", 22);



        do {
            JFrame janela = new JFrame("GerenInfor");

            user = JOptionPane.showInputDialog("Digite o usuario");
            senha = JOptionPane.showInputDialog("Digite a senha");

            if (!Login.logar(user, senha)) {
                JOptionPane.showMessageDialog(janela, "Credenciais erradas");
            } else {
                int opcao;
                do {
                    String op = JOptionPane.showInputDialog("1 - Cadastro Usuario\n2 - Cadastro Produto" +
                            "\n3 - Lista Usuario\n4 - Lista Produto\n\n0 - sair");
                    opcao = Integer.parseInt(op);

                    switch (opcao) {
                        case 1:
                            if(Login.getTipoLogin() == 0){
                                String nome = JOptionPane.showInputDialog("Digite o nome do novo usuario");
                                String cpf = JOptionPane.showInputDialog("Digite o cpf do novo usuario");
                                String idadeS = JOptionPane.showInputDialog("Digite a idade do novo usuario");
                                int idade = Integer.parseInt(idadeS);
                                String tipo = JOptionPane.showInputDialog("Digite o tipo do novo usuario");
                                gerente.cadUsuario(nome, cpf, idade, tipo);
                                break;
                            }else{
                                JOptionPane.showMessageDialog(janela, "NÃO TEM PERMISSÃO-ESCOLHA OUTRA OPÇÃO");
                            }

                        case 2:
                            if(Login.getTipoLogin() == 0){
                                String codigo = JOptionPane.showInputDialog("Digite o codigo do novo produto");
                                int codigop = Integer.parseInt(codigo);
                                String nomeP = JOptionPane.showInputDialog("Digite o nome do novo produto");
                                String marca = JOptionPane.showInputDialog("Digite a marca do novo produto");
                                String valorP = JOptionPane.showInputDialog("Digite o valor do novo produto");
                                double valor = Double.parseDouble(valorP);
                                String quantidade = JOptionPane.showInputDialog("Digite a quantidade do novo produto");
                                int estoque = Integer.parseInt(quantidade);

                                gerente.cadProduto(codigop, nomeP, marca, valor, estoque);
                                break;
                            }else{
                                JOptionPane.showMessageDialog(janela, "NÃO TEM PERMISSÃO-ESCOLHA OUTRA OPÇÃO");
                            }


                        case 3:
                            JOptionPane.showMessageDialog(janela, gerente.lerUsuario());
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(janela, gerente.lerProduto());
                            break;

                        default:
                            if(opcao == 0){
                                JOptionPane.showMessageDialog(janela, "Saindo... Até mais breve!");
                            }else {
                                JOptionPane.showMessageDialog(janela, "Item iválido, insira novamente!");
                            }
                    }
                }while (opcao != 0);


            }
        }while (!Login.logar(user, senha));


    }
}
