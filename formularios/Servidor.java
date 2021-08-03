/*
 *
 *
*/

package br.com.Attack.formularios;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */

public class Servidor {

    private ServerSocket servidor;
    
    private final ArrayList<Processador_de_Clientes> clientes;

    public Servidor(int port) throws IOException {
        clientes = new ArrayList<Processador_de_Clientes>();
        listen(port);
    }

    private void listen(int port) throws IOException {

        
        servidor = new ServerSocket(port);
        System.out.println("À escuta em " + servidor);

        
        while (true) {

            Socket cliente = servidor.accept();
            System.out.println("Ligação aceite de " + cliente);

            
            clientes.add(new Processador_de_Clientes(this, cliente));
        }
    }

    public void replicarMensagem(String mensagem) {
        
        synchronized (clientes) {
            for (Processador_de_Clientes cl : clientes) {
                cl.enviarMensagem(mensagem);
            }
        }
    }

    public void removerCliente(Processador_de_Clientes cliente) {
        synchronized (clientes) {
            System.out.println("A remover a ligação de " + cliente);
            clientes.remove(cliente);
            System.out.println("Ligações restantes: " + clientes.size());
            try {
                cliente.fechar();
            } catch (IOException ex) {
                System.out.println("Erro ao desligar o contacto com " + cliente);
                System.out.println(ex.getMessage());
            }
        }
    }

    public void removeConnection(Socket cliente) {
    }

    public static void main(String args[]) {
        try {
            if (args.length == 0) {
                new Servidor(7678);
            } else {
                new Servidor(Integer.parseInt(args[0]));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
