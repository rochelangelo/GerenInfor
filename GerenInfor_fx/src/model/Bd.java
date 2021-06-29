package model;

import java.io.*;
import java.util.ArrayList;

public class Bd {
    public static ArrayList<Usuario> usersBd;
    public static ArrayList<Produto> prodsBd;
    public static ArrayList<Servico> servBd;

    public static void lerBdUsuario() {
        String conteudo = "";
        try{
            FileReader arqUser = new FileReader("Arquivos/BdUsuarios.txt");
            BufferedReader lerArqUser = new BufferedReader(arqUser);
            String linha = "";
            try{
                linha = lerArqUser.readLine();
                usersBd = new ArrayList<>();
                while (linha != null){
                    String usersT = linha;
                    String dadosUser[] = new String[4];
                    dadosUser = usersT.split(";");
                    if(dadosUser[3].equals("tecnico")){
                        Tecnico novoTecnico = new Tecnico(dadosUser[0], dadosUser[1], Integer.parseInt(dadosUser[2]));
                        usersBd.add(novoTecnico);
                    }else if(dadosUser[3].equals("caixa")){
                        Caixa novoCaixa = new Caixa(dadosUser[0], dadosUser[1], Integer.parseInt(dadosUser[2]));
                        usersBd.add(novoCaixa);
                    }else if(dadosUser[3].equals("gerente")){
                        Gerente novoGerente = new Gerente(dadosUser[0], dadosUser[1], Integer.parseInt(dadosUser[2]));
                        usersBd.add(novoGerente);
                    }
                    linha = lerArqUser.readLine();
                }
                arqUser.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }


    public static Boolean escreveBdUsuarios(String texto){
        try{
            FileWriter arqUser = new FileWriter("Arquivos/BdUsuarios.txt", true);
            PrintWriter gravarArq = new PrintWriter(arqUser);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static void lerBdProduto() {
        String conteudo = "";
        try{
            FileReader arqProd = new FileReader("Arquivos/BdProdutos.txt");
            BufferedReader lerArqProd = new BufferedReader(arqProd);
            String linha = "";
            try{
                linha = lerArqProd.readLine();
                prodsBd = new ArrayList<>();
                while (linha != null){
                    String prodT = linha;
                    String dadosProd[] = new String[4];
                    dadosProd = prodT.split(";");
                    Produto novoProduto = new Produto(Integer.parseInt(dadosProd[0]), dadosProd[1], dadosProd[2], Double.parseDouble(dadosProd[3]), Integer.parseInt(dadosProd[4]));
                    prodsBd.add(novoProduto);
                    linha = lerArqProd.readLine();
                }
                arqProd.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }


    public static Boolean escreveBdProdutos(String texto){
        try{
            FileWriter arqProd = new FileWriter("Arquivos/BdProdutos.txt", true);
            PrintWriter gravarArq = new PrintWriter(arqProd);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void lerBdServico() {
        String conteudo = "";
        try{
            FileReader arqServ = new FileReader("Arquivos/BdServicos.txt");
            BufferedReader lerArqServ = new BufferedReader(arqServ);
            String linha = "";
            try{
                linha = lerArqServ.readLine();
                prodsBd = new ArrayList<>();
                while (linha != null){
                    String prodT = linha;
                    String dadosServ[] = new String[4];
                    dadosServ = prodT.split(";");
                    Servico novoServico = new Servico(Integer.parseInt(dadosServ[0]), dadosServ[1], dadosServ[2], dadosServ[3], dadosServ[4], dadosServ[5], dadosServ[6], Double.parseDouble(dadosServ[7]));
                    servBd.add(novoServico);
                    linha = lerArqServ.readLine();
                }
                arqServ.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }


    public static Boolean escreveBdServico(String texto){
        try{
            FileWriter arqServ = new FileWriter("Arquivos/BdServicos.txt", true);
            PrintWriter gravarArq = new PrintWriter(arqServ);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static  void init(){
        lerBdUsuario();
        lerBdProduto();
        lerBdServico();
    }


}
