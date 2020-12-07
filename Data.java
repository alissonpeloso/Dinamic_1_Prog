public class Data {
    protected int dia;
    protected int hora;
    protected int minuto;
    protected int segundo;

    Data(){
    }

    Data(int hora, int minuto, int segundo, int dia){
        setHora(hora);
        setMinuto(minuto);
        setDia(dia);
        setSegundos(segundo);
    }

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia < 32){
            this.dia = dia;
        } else {
            System.out.println("Valor informado inválido!");
        }
    }

    public int getHora(){
        return this.hora;
    }
    
    public void setHora(int hora){
        if(hora > 0 && hora < 24){
            this.hora = hora;
        } else {
            System.out.println("Valor informado inválido!");
        }
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setMinuto(int minuto){
        if(minuto > 0 && minuto < 60){
            this.minuto = minuto;
        } else {
            System.out.println("Valor informado inválido!");
        }
    }

    public int getSegundos() {
        return this.segundo;
    }

    public void setSegundos(int segundo){
        if (segundo > 0 && segundo < 60){
            this.segundo = segundo;
        } else {
            System.out.println("Valor informado inválido!");
        }
    }

    public int isAmIsPm(){
        if(this.hora > 0 && this.hora < 12){
            // System.out.println("É AM!");
            return 0;
        }else{
            // System.out.println("É PM!");
            return 1;
        }

    }

    public void printData(){
        int a = this.isAmIsPm();
        if (a == 1){
            System.out.print("Data: %d/%d/%d, %d:%d:%d PM");
        }else{
            System.out.print("Data: %d/%d/%d, %d:%d:%d AM");
        } 
    }

    public void diferencaTempo(Data data2){
        Data data3 = new Data();
        data3.setSegundos(this.segundo - data2.segundo);
        data3.setMinuto(this.minuto - data2.minuto);
        data3.setHora(this.hora - data2.hora);
        data3.setDia(this.dia - data2.dia);
        


        
    }
}