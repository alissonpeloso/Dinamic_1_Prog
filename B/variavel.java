import java.util.Scanner; 

public class VarInt{
    public int values[];
    public int maior=-2147483630;
    public int menor=2147483630;
    public float media = 0.0;
    int tamVetor = 0;
    Scanner ler = new Scanner(System.in);
    public guardaInteiros(){
        System.out.printf("Digit o numero de elementos do vetor");
        tamVetor = ler.nextInt();
        for (int i =0; i<tamVetor; i++){
            System.out.printf("Informe o número");
            values[i] = ler.nextInt();
        }
    }
    public int menor(){
        for (int i = 0; i<tamVetor; i++){
            if (values[i]< menor){
                menor = values[i];
            }
        }
        return(menor);
    }
    public int maior(){
        for(int i=0 ; i<tamVetor ; i++){
            if(values[i]>maior){
                maior = values[i];
            }
        }
        return(maior);
    }
    public int media(){
        for(int i=0; i<tamVetor; i++){
           media+=values[i];
            
        }
        media = media/tamVetor;
        return media;
    }
} 
