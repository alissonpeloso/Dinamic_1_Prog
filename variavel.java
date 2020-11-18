public class VarInt{
    public int values[20];
    public int maior=-2147483630;
    public int menor=2147483630;
    
    public guardaInteiros(){
        for (int i =0; i<20;i++){
            System.out.printf("Informe o número");
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
        return(maior);
    }
} 
