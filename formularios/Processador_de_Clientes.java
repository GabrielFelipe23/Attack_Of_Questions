/*
*   Em todas as etapas da criação desse jogo foi dada algumas funções para cada
*   integrante, nesta etapa de criação de chat, o Gustavo Gomes teve como função
*   desenvolver o chat para o nosso jogo. 
*/


package br.com.Attack.formularios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */

public class Processador_de_Clientes extends Thread {

    private Servidor servidor;
    private Socket socket;
    private DataOutputStream dout;

    public Processador_de_Clientes(Servidor servidor, Socket socket) throws IOException {
        this.servidor = servidor;
        this.socket = socket;
        dout = new DataOutputStream(socket.getOutputStream());
       
        start();
    }

    @Override
    public void run() {
        try {
            
            DataInputStream din = new DataInputStream(socket.getInputStream());
            String mensagem;
            while (true) {
                mensagem = din.readUTF();
                System.err.println("SR LIDO: " + mensagem);
                
                servidor.replicarMensagem(mensagem);
            }
        } catch (EOFException ex) {
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            servidor.removeConnection(socket);
        }
    }

    public void enviarMensagem(String mensagem) {
        try {
            dout.writeUTF(mensagem);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void fechar() throws IOException {
        socket.close();
    }
}
