/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusBento
 */
public class JogoDaVelha {
    Jogador matrix[][] = new Jogador[3][3];
    Jogador jogador1 = new Jogador();
    Jogador jogador2 = new Jogador();
    
    public JogoDaVelha(Jogador jg1, Jogador jg2){
        // int t=-1;
        Jogador aux = new Jogador();
        aux.setNome("0");
        aux.setSimbolo("0");
        for (Jogador[] matrix1 : this.matrix) {
            for (int y = 0; y < matrix1.length; y++) {
                 matrix1[y] = aux;
                //t--;
            }
        }
        this.jogador1 = jg1;
        this.jogador2 = jg2;
    }
    public int Jogar(int posx, int posy, Jogador jg){
        
        
        if("0".equals(matrix[posx][posy].getNome()) && "0".equals(matrix[posx][posy].getSimbolo())){
            matrix[posx][posy] = jg;
            //System.out.println("POS X :" + posx + " POS Y:"+posy + " VALOR: "+jg);
        }else{
            return -1; // Codigo -1: Ja ta setado na posição
        }
        int num = checaLinhas();
        if( num != 0){
            return num;
        }
        num = checaColunas();
        if( num != 0){
            return num;
        }
        num = checaDiagonais();
        if( num != 0){
            return num;
        }
        return 1; //Codigo 1 : Deu certo
    }
    public int checaLinhas(){
        for(int linha=0 ; linha<3 ; linha++){
            if(matrix[linha][0].equals(this.jogador1)){
                if(matrix[linha][1].equals(this.jogador1)){
                    if(matrix[linha][2].equals(this.jogador1)){
                        return 40;
                     }
                }
            }
                    
                if(matrix[linha][0].equals(this.jogador2)){
                //System.out.println(matrix[linha][0] + " - ");
                 if(matrix[linha][1].equals(this.jogador2)){
                    //System.out.println(matrix[linha][1] + " - ");
                       if(matrix[linha][2].equals(this.jogador2)){
                           //System.out.println(matrix[linha][2] + " - ");
                            return 40;
                    }
                }
            }
            
            
           // if( (matrix[linha][0] + matrix[linha][1] + matrix[linha][2]) == 6 || (matrix[linha][0] + matrix[linha][1] + matrix[linha][2]) == 3)
             //   return 40;
        }
        
        return 0;
                
    }
    public int checaColunas(){
        for(int coluna=0 ; coluna<3 ; coluna++){
            if(matrix[0][coluna].equals(this.jogador2)){
                if(matrix[1][coluna].equals(this.jogador2)){
                    if(matrix[2][coluna].equals(this.jogador2)){
return 40;
                    }
                }
            }           
                            
                            
               if(matrix[0][coluna].equals(this.jogador1)){
               // System.out.println(matrix[0][coluna] + " - ");
                 if(matrix[1][coluna].equals(this.jogador1)){
                    //System.out.println(matrix[1][coluna] + " - ");
                        if(matrix[2][coluna].equals(this.jogador1)){
                          // System.out.println(matrix[2][coluna] + " - ");
                           return 40;
                    }
                }
            }
            
            
            //if( (matrix[0][coluna] + matrix[1][coluna] + matrix[2][coluna]) == 6 || (matrix[0][coluna] + matrix[1][coluna] + matrix[2][coluna]) == 3)
                //return 40;
       // }
        }
        return 0;
            
    }
    
    public int checaDiagonais(){
        if (matrix[0][0].equals(this.jogador1) && matrix[1][1].equals(this.jogador1) && matrix[2][2].equals(this.jogador1)){
            return 40;
        }else if (matrix[0][0].equals(this.jogador2) && matrix[1][1].equals(this.jogador2) && matrix[2][2].equals(this.jogador2)){
            return 40;
        }
        if (matrix[0][2].equals(this.jogador1) && matrix[1][1].equals(this.jogador1) && matrix[2][0].equals(this.jogador1)){
            return 40;
        }else if (matrix[0][2].equals(this.jogador2) && matrix[1][1].equals(this.jogador2) && matrix[2][0].equals(this.jogador2)){
            return 40;
        }
        
        //if( (matrix[0][0] + matrix[1][1] + matrix[2][2]) == 6 || (matrix[0][0] + matrix[1][1] + matrix[2][2]) == 3 ){
        //    return 40;
    // }
      //  if( (matrix[0][2] + matrix[1][1] + matrix[2][0]) == 6 || (matrix[0][2] + matrix[1][1] + matrix[2][0]) == 3){
       //     return 40;
       // }
        
        return 0;
    }
    
}
