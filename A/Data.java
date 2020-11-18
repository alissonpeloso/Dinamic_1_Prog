public class Data {
    protected int dia;
    protected int mes;
    protected int ano;
    protected int hora;
    protected int minuto;

    Data(int hora, int minuto, int dia, int mes, int ano){
        setHora(hora);
        setMinuto(minuto);
        setDia(dia);
        setMes(mes);
        setAno(ano);
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

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12){
            this.mes = mes;
        } else {
            System.out.println("Valor informado inválido!");
        }
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0){
            this.ano = ano;
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

    public void isAmIsPm(){
        if(this.hora > 0 && this.hora < 12){
            System.out.println("É AM!");
        }else{
            System.out.println("É PM!");
        }
    }
}