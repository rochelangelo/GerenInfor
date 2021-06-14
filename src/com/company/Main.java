package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean logar(String usuario, String senha){
        if(usuario.equals("usuario") && senha.equals("1234")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, senha;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        Gerente gerente = new Gerente("Rochel", "00000000000", 22);
        usuarios.add(gerente);

        do {
            JFrame janela = new JFrame("GerenInfor");

            user = JOptionPane.showInputDialog("Digite o usuario");
            senha = JOptionPane.showInputDialog("Digite a senha");

            if (!logar(user, senha)) {
                System.out.println("Credenciais erradas");
            } else {
                int opcao;
                do {
                    String op = JOptionPane.showInputDialog("1 - Cadastro Usuario\n2 - Cadastro Produto" +
                            "\n3 - Lista Usuario\n4 - Lista Produto\n\n0 - sair");
                    opcao = Integer.parseInt(op);

                    switch (opcao) {
                        case 1:
                            String nome = JOptionPane.showInputDialog("Digite o nome do novo usuario");
                            String cpf = JOptionPane.showInputDialog("Digite o cpf do novo usuario");
                            String idadeS = JOptionPane.showInputDialog("Digite a idade do novo usuario");
                            int idade = Integer.parseInt(idadeS);
                            String tipo = JOptionPane.showInputDialog("Digite o tipo do novo usuario");

                            usuarios.add(gerente.cadUsuario(nome, cpf, idade, tipo));
                            break;

                        case 2:
                            String codigo = JOptionPane.showInputDialog("Digite o codigo do novo produto");
                            int codigop = Integer.parseInt(codigo);
                            String nomeP = JOptionPane.showInputDialog("Digite o nome do novo produto");
                            String marca = JOptionPane.showInputDialog("Digite a marca do novo produto");
                            String valorP = JOptionPane.showInputDialog("Digite o valor do novo produto");
                            double valor = Double.parseDouble(valorP);
                            String quantidade = JOptionPane.showInputDialog("Digite a quantidade do novo produto");
                            int estoque = Integer.parseInt(quantidade);

                            produtos.add(gerente.cadProduto(codigop, nomeP, marca, valor, estoque));
                            break;

                        case 3:
                            String saida = "";
                            for( Usuario u : usuarios){
                                saida = saida + u.getNome() + " - " + u.getTipo() +"\n";
                            }
                            JOptionPane.showMessageDialog(janela, saida);
                            break;

                        case 4:
                            String saidaP = "";
                            for (Produto p : produtos){
                                saidaP = saidaP + p.getCodigo() + " - " + p.getEstoque() + " - " + p.getValor() + "\n";
                            }
                            JOptionPane.showMessageDialog(janela, saidaP);
                            break;

                    }
                }while (opcao != 0);


            }
        }while (!logar(user, senha));


    }
}
