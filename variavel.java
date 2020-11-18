public class VarInt{
    public int values[20];
    public int maior;
    public int menor;
    
    public guardaInteiros(){
        for (int i =0; i<20;i++){
            System.out.printf("Informe o númeron");
            values[i] = ler.nextInt();
        }
    }
    public int menor(){
        for (int i = 0; i < 20; i++){
            if (valor[i]< menor){
                menor = values[i];
            }
        }
        return(menor);
    }



    
    public int maior(){
        for(int i=0 ; i<20 ; i++){
            if(values[i]>maior){
                maior = values[i];
            }
        }
        return maior;
    }
}
