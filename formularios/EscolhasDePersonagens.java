/* Nessa classe é onde o usário seleciona o sexo, idade, é onde fazemos o filtro 
 * de informações, nas quais se referem ao personagem e equipamentos.
 * Poderiamos dizer que essa tela seria o coração do nosso jogo. 
 */

package br.com.Attack.formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */
public class EscolhasDePersonagens {
    public static void main(String[] args) {
        
        //VAR
        String sexo;
        int personaM1;
        int personaM2;
        int personaM3;
        int personaF1;
        int personaF2;
        int personaF3;
        int  idade;
        boolean tacerto=false;
        
        
        //INICIO DE SELEÇÃO
        
        sexo= JOptionPane.showInputDialog("Qual é o seu sexo?");
        
        if("Masculino".equals(sexo) || "masculino".equals(sexo)){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            
            //SELEÇÃO DO PÚBLICO
            if(idade== 17 || idade <=19){    
                
                //PÚBLICO A
                personaM1= Integer.parseInt(JOptionPane.showInputDialog("Digite o "
                    + "número do personagem "
                    + "que "+ "você quer jogar?\n" + "1-O Sociólogo\n"
                    + "2-O Filosófico\n" + "3-O Nerd\n" + "4-O Físico\n"
                    + "5-O Linguístico"));
                int chamadapersona= boasvindasPersonagemM1(personaM1);
            }
                
            else if(idade== 20 || idade <=24){
                
                //PÚBLICO B
                personaM2= Integer.parseInt(JOptionPane.showInputDialog("Digite o "
                    + "número do personagem "
                    + "que "+ "você quer jogar?\n" + "1-O antropólogo\n"
                    + "2-O Historiador\n" +"3-O Intercambista\n"
                    + "4-O Geógrafo Político\n" +"5-O Turista"));
                int chamadapersona= boasvindasPersonagemM2(personaM2);
            }
            
            
            else if(idade== 25 || idade <=100){
                    
                //PÚBLICO C
                personaM3 = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                    + " o número do personagem "
                    + "que "+ "você quer jogar\n?" + "1-O Curioso\n"
                    + "2-O Esportista\n" +"3-O Financeiro\n" + "4-O Empresário\n"
                    + "5-O Programador"));
                    int chamadapersona= boasvindasPersonagemM3(personaM3);
            }
        } // Final Público Masculino

        
        else {
            if("feminino".equals(sexo)|| "feminino".equals(sexo)){
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
                
                //SELEÇÃO DO PÚBLICO
                if(idade== 17 || idade <=19){    
                    //PÚBLICO A
                    personaF1= Integer.parseInt(JOptionPane.showInputDialog("Digite "
                            + "o número do personagem "
                            + "que " + "você quer jogar?\n" + "1-A Socióloga\n"
                            + "2-A Filosófica\n" + "3-A Nerd\n" + "4-A Física\n"
                            + "5-A Linguística"));
                    int chamadapersona= boasvindasPersonagemF1(personaF1);
                    
                }
                
                else if(idade== 20 || idade <=24){   //Público B
                    personaF2= Integer.parseInt(JOptionPane.showInputDialog("Digite "
                            + "o número do personagem "
                            + "que "+ "você quer jogar?\n" + "1-A Antropóloga\n"
                            + "2-A Historiadora\n" +"3-A Intercambista\n"
                            + "4-A Geógrafa Política\n" +"5-A Turista"));
                    int chamadapersona= boasvindasPersonagemF2(personaF2);
                }
                
                
                else if(idade== 25 || idade <=100){   //Público C
                    personaF3= Integer.parseInt(JOptionPane.showInputDialog("Digite "
                            + "o número do personagem "
                            + "que "+ "você quer jogar?\n" + "1-A Curiosa\n"
                            + "2-A Esportista\n" + "3-A Financeira\n" 
                            + "4-A Empresária\n" + "5-A Programadora"));
                    int chamadapersona= boasvindasPersonagemF3(personaF3);
                }
            }
        }// Final Público Feminino
           
    }
    
    //AQUI SE ENCONTRA AS FUNÇÕES DE BOAS VINDAS PARA OS USUÁRIOS DOS TRÊS PÚBLICOS.
    public static int boasvindasPersonagemM1(int personaM1){
    int boasvindasP = 0;
    
    switch(personaM1){
        case 1:
            JOptionPane.showMessageDialog(null,"Boa escolha, esse personagem é ótimo "
                    + "em perguntas da sociedade e atualidades.");    
        break;
        
        case 2:
            JOptionPane.showMessageDialog(null,"É muito experiente "
                    + "em perguntas filosóficas, se você se identifica com filosofia "
                    + "é o personagem ideal para você.");
            
        break; 
        
        case 3:
            JOptionPane.showMessageDialog(null,"Nerd tem facilidade em resolver "
                    + "calcúlos matemáticos, se você se identifica fez a "
                    + "escolha certa");
        break; 
        
        case 4:
            JOptionPane.showMessageDialog(null," Físico, tem a super capacidade "
                    + "em resolver calcúlos físicos, se você se identifica"
                    + "fez a escolha certa");
        break;
        
        case 5:
            JOptionPane.showMessageDialog(null,"Adora o Brasil, é muito inteligente "
                    + "em língua portuguesa, se você se identifica fez a escolha certa");    
        break; 
    }
    
    
    return boasvindasP ;
    
}   
    public static int boasvindasPersonagemM2(int personaM2){
    int boasvindasP  = 0;
    
    switch(personaM2){
        case 1:
            JOptionPane.showMessageDialog(null,"Sabe tudo sobre a humanidade, "
                    + "se você se você se identifica, fez a escolha certa.");
        break;
        
        case 2:
            JOptionPane.showMessageDialog(null,"Sabe tudo sobre História, se "
                    + "você se você se identifica, fez a escolha certa.");    
        break; 
        
        case 3:
            JOptionPane.showMessageDialog(null," Então você quer fazer algumas"
                    + "viagens pelo o mundo a fora? Você fez a escolha certa.");  
        break; 
        
        case 4:
            JOptionPane.showMessageDialog(null,"Conhece tudo sobre geografia "
                    + "política você se identifica, fez a escolha certa.");     
        break;
        
        case 5:
        JOptionPane.showMessageDialog(null,"Amante por países, cidades, "
                + "províncias,conhece o mundo a fora. Quando o assunto é "
                + "cultura, sabe de tudo.");    
        break; 
    }
    
    
    return boasvindasP ;
    
}     
    public static int boasvindasPersonagemM3(int personaM3){
        int boasvindasP  = 0;
    
        switch(personaM3){
            case 1:
            JOptionPane.showMessageDialog(null,"Então você é uma pessoa que "
                    + "gosta de curiosidades? Se você se identifica, "
                    + "fez a escolha certa."); 
                break;
        
            case 2:
            JOptionPane.showMessageDialog(null,"Quando o assunto é esporte o "
                    + "seu sorriso é mais reluzente que o sol Acho que alguém "
                    + "se identificou, você fez a escolha certa.");     
                break; 
        
            case 3:
            JOptionPane.showMessageDialog(null,"Quando é assunto de finanças, "
                    + "seus olhos brilham? "
                    + "Temos um amante de finanças aqui!");    
                break; 
        
            case 4:
            JOptionPane.showMessageDialog(null,"Então quer dizer que, quando o "
                + "assunto é empreender, seu coração bate mais forte?");     
                break;
        
            case 5:
            JOptionPane.showMessageDialog(null,"Amante por programação "
                    + "detectado. Vai um café?");    
            break; 
    }
    
    
    return boasvindasP ;
    
}
    public static int boasvindasPersonagemF1(int personaF1){
    int boasvindasP = 0;
    
    switch(personaF1){
        case 1:
            JOptionPane.showMessageDialog(null,"Boa escolha, esse personagem é ótimo"
                    + "em perguntas da sociedade e atualidades.");    
        break;
        
        case 2:
            JOptionPane.showMessageDialog(null,"É muito experiente "
                    + "em perguntas filosóficas, se você se identifica com filosofia  "
                    + "é o personagem ideal para você.");
            
        break; 
        
        case 3:
            JOptionPane.showMessageDialog(null,"Nerd tem facilidade em resolver "
                    + "calcúlos matemáticos, se você se identifica fez a "
                    + "escolha certa");
        break; 
        
        case 4:
            JOptionPane.showMessageDialog(null," Físico, tem a super capacidade"
                    + "em resolver calcúlos físicos, se você se identifica"
                    + "fez a escolha certa");
        break;
        
        case 5:
            JOptionPane.showMessageDialog(null,"Adora o Brasil, é muito inteligente"
                    + "em língua portuguesa, se você se identifica fez a escolha certa");    
        break; 
    }
    
    
    return boasvindasP ;
    
}   
    public static int boasvindasPersonagemF2(int personaF2){
    int boasvindasP  = 0;
    
    switch(personaF2){
        case 1:
            JOptionPane.showMessageDialog(null,"Sabe tudo sobre a humanidade, se você se "
                    + "você se identifica, fez a escolha certa.");
        break;
        
        case 2:
            JOptionPane.showMessageDialog(null,"Sabe tudo sobre História, se você se "
                    + "você se identifica, fez a escolha certa.");    
        break; 
        
        case 3:
            JOptionPane.showMessageDialog(null," Então você quer fazer algumas viagens"
                    + "pelo o mundo a fora? Você fez a escolha certa.");  
        break; 
        
        case 4:
            JOptionPane.showMessageDialog(null,"Conhece tudo sobre geografia política"
                    + "você se identifica, fez a escolha certa.");     
        break;
        
        case 5:
        JOptionPane.showMessageDialog(null,"Amante por países, cidade, províncias,"
                + "conhece o mundo a fora. Quando o assunto é cultura, sabe de tudo.");    
        break; 
    }
    
    
    return boasvindasP ;
    
}     
    public static int boasvindasPersonagemF3(int personaF3){
        int boasvindasP  = 0;
    
        switch(personaF3){
            case 1:
            JOptionPane.showMessageDialog(null,"Então você é uma pessoa que gosta "
                    + "de curiosidades? Se você se identifica, fez a escolha certa."); 
                break;
        
            case 2:
            JOptionPane.showMessageDialog(null,"Quando o assunto é esporte o seu "
                    + "sorriso é mais reluzente que o sol  "
                    + "Acho que alguém se identificou, você fez a escolha certa.");     
                break; 
        
            case 3:
            JOptionPane.showMessageDialog(null,"Quando é assunto de finanças, "
                    + "seus olhos brilham? "
                    + "Temos um amante de finanças aqui!");    
                break; 
        
            case 4:
            JOptionPane.showMessageDialog(null,"Então quer dizer que, quando o "
                + "assunto é empreender, seu coração bate mais forte?");     
                break;
        
            case 5:
            JOptionPane.showMessageDialog(null,"Amante por programação detectado. "
                + "Vai um café?");    
            break; 
    }
    
    
    return boasvindasP ;
    
}
    
    ////////////////////////////////////////////////////////////////////////////////
    // AQUI SÃO METÓDOS DE ATRIBUTOS DOS EQUIPAMENTOS PARA CADA PÚBLICO E PERSONA.
    
    //MÉTODOS DOS PERSONAGENS PÚBLICO A
    public static int persPubASociologia(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calçado=0+d;
        
        return valorAtributos;
    }
    public static int persPubAFilosofia(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubANerd(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubAFisica(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubAPorgutugues(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calçado=0+d;
        
        return valorAtributos;
    }
    
    //MÉTODOS DOS PERSONAGENS PÚBLICO B
    public static int persPubBAntrapologia(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubBHistoria(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubBIntercambio(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubBGeopolitica(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubBTurismo(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    
    //MÉTODOS DOS PERSONAGENS PÚBLICO C
    public static int persPubCCuriosidades(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubCEsportes(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubCFinancas(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubCEmpreendedorismo(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
    public static int persPubCProgramadora(int a, int b, int c, int d){
        int valorAtributos=0;
        
        int capacete=0 +a;
        int roupa=0+b;
        int arma=0+c;
        int calcado=0+d;
        
        return valorAtributos;
    }
}