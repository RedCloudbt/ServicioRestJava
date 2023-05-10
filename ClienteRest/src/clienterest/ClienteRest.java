/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterest;

import PkRest.Tbusuarios;
import java.util.Scanner;
import pkCRest.NewJerseyClient;

/**
 *
 * @author leo_n
 */
public class ClienteRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient obj = new NewJerseyClient ();
        // Variable
        int id;
        // Peticion de datos del nuevo Uusario
        Scanner datos = new Scanner(System.in);
       System.out.println("iD del usuario: ");
       id = datos.nextInt();
       Tbusuarios objusuario = obj.find_XML(Tbusuarios.class, "" + id);
       System.out.println("\n Nombre: "+objusuario.getNombre());
       System.out.println("\n Usuario: "+objusuario.getUsuario());
       System.out.println("\n Contraseña: "+objusuario.getPsw());
     
        
    }
    
}
