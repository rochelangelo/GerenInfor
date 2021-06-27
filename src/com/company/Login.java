package com.company;

import java.util.ArrayList;

public class Login {

    private static int tipoLogin;

    public static void setTipoLogin(int tl) {
        tipoLogin = tl;
    }

    public static int getTipoLogin() {
        return tipoLogin;
    }

    public static Boolean logar(String usuario, String senha){
        ArrayList<Usuario> users = Bd.usersBd;
        Boolean resultado = null;


        for (Usuario u : users){
            if(u.getNome().equals(usuario) && u.getCpf().equals(senha)){
                if(u.getTipo().equals("gerente")){
                    setTipoLogin(0);
                }else if(u.getTipo().equals("tecnico")){
                    setTipoLogin(1);
                }else if(u.getTipo().equals("caixa")){
                    setTipoLogin(2);
                }

                resultado = true;
                break;
            }else{
                resultado = false;
            }
        }
        return resultado;
    }

}
