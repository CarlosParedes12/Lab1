package auto;

//import ClasesBase.Base;
import java.util.Scanner;

public class Auto {
    private String placa;
    private double velocidadActual;
    private double velocidadMaxima;
    private double velocidadMinima;
    private double gasolina;
    private double gasolinaActual;
    private double aceite;
    private double aceiteActual;
    private boolean estado;
    
    //metodo constructor por defecto
    public Auto(){
    this.placa="RD1234";
    this.velocidadActual=0;
    this.velocidadMaxima=150;
    this.velocidadMinima=0;
    this.gasolina=0;
    this.gasolinaActual=20;
    this.aceiteActual=10;
    
    this.estado=false;
}
    
    //Metodods de tipo set y get
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public void setVelocidadActual(double velocidadActual){
        this.velocidadActual=velocidadActual;
    }
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    public void setVelocidadMinima(double velocidadMinima){
        this.velocidadMinima=velocidadMinima;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    public void setgasolinaActual(double gasolinaActual){
        this.gasolinaActual=gasolinaActual;
    }
    public void setgasolina(double gasolina){
        this.gasolina=gasolina;
    }
    public void setaceiteActual(double aceiteActual){
        this.aceiteActual=aceiteActual;
    }
    public void setaceite(double aceite){
        this.aceite=aceite;
    }
    
    
    public String getPlaca(){
        return(this.placa);
    }
    public double getVelocidadActual(){
        return(this.velocidadActual);
    }
    public double getVelocidadMaxima(){
        return(this.velocidadMinima);
    }
    public boolean getEstado(){
        return(this.estado);
    }
    public double getgasolinaActual(){
        return(this.gasolinaActual);
    }
        public double getgasolina(){
        return(this.gasolina);
    }
    public double getaceiteActual(){
        return(this.aceiteActual);
    }
    public double getaceite(){
        return(this.aceite);
    }
    
    //Metodo operacinales
    
    public String devolverEstadoDelAuto() {
        if(getEstado()){
            return"Encendido";
        }
        return"Apagado";
    }
    
    public void formarMensajeDeSalidaPorConsola(String mensaje){
        int largo=mensaje.length();
        int i; System.out.print("+");
        
        for(i=1;i<=largo;i++){
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("|"+mensaje+"|");
        System.out.print("+");
        
        for(i=1;i<=largo;i++){
            System.out.print("-");
        }
        System.out.println("+"); System.out.println("");
    }
    
    public void encenderAuto(){
        if(getEstado()){
            formarMensajeDeSalidaPorConsola("El Auto Ya ESTABA encendido");
        }
        else{
            setEstado(true);
            formarMensajeDeSalidaPorConsola("El Auto HA SIDO encendido con exito");
        }
    }
    
    public void apagarAuto(){
        if (getEstado()){
            formarMensajeDeSalidaPorConsola("El Auto HA SIDO apagado con exito");
            setEstado(false);
        }else{
            formarMensajeDeSalidaPorConsola("El Auto Ya ESTABA apagado");
        }
    }
    
    public void aumentarVelocidadAuto(){
        Scanner sc = new Scanner (System.in);
        if(getEstado()){
            int dato;
            System.out.print("Velocidad Actual = "+ getVelocidadActual()+"\nIngrese la cantidad a aumentar: ");
            dato = sc.nextInt();
            System.out.println("");
            
            setVelocidadActual(getVelocidadActual()+dato);
            formarMensajeDeSalidaPorConsola("Velocidad del Auto Actual= "+getVelocidadActual());}
        else{formarMensajeDeSalidaPorConsola("El Auto esta APAGADO");}
        }
    
    public void reducirVelocidadAuto(){
        Scanner sc = new Scanner (System.in);
        if(getEstado()){
            int dato;
            System.out.print("Velocidad Actual = "+ getVelocidadActual()+"\nIngrese la cantidad a reducir: ");
            dato = sc.nextInt();
            System.out.println("");
            
            setVelocidadActual(getVelocidadActual()-dato);
            formarMensajeDeSalidaPorConsola("Velocidad del auto= "+getVelocidadActual());
        }
        else{formarMensajeDeSalidaPorConsola("El Auto esta APAGADO");}
    }
    
    public void cargartanque(){
        Scanner sc = new Scanner (System.in);
        if(getEstado()){
            int dato;
            System.out.print("gasolina en L Actual = "+ getgasolinaActual()+"Ingrese L a llenar:");
            dato = sc.nextInt();
            System.out.println("");
            
            setgasolinaActual(getgasolinaActual()+dato);
            formarMensajeDeSalidaPorConsola("Gasolina del vehiculo = "+getgasolinaActual());
        }
        else{formarMensajeDeSalidaPorConsola("El Auto esta APAGADO");}
    }
    
    public void cargarAceite(){
        Scanner sc = new Scanner (System.in);
        if(getEstado()){
            int dato;
            System.out.print("Aceite en L Actual = "+ getaceiteActual()+"Ingrese cantidad a llenar:");
            dato = sc.nextInt();
            System.out.println("");
            
            setaceiteActual(getaceiteActual()+dato);
            formarMensajeDeSalidaPorConsola("Aceite del vehiculo = "+getaceiteActual());
        }
        else{formarMensajeDeSalidaPorConsola("El Auto esta APAGADO");}
    }
    
    public void manejarTableroDeComandosDelAuto(){
        String arregloDeOpciones[]={"1.Encender Auto", "2.Aumentar velocidad", "3.Reducir velocidad", "4.Cargar Tanque de Gasolina", "5.Cargar Tanque de Aceite", "6.Mostrar Condiciones del Auto", "7.Apagar Auto", "8.Salir"
    };
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("************************");
            System.out.println("*Tablero de comandos del Auto*");
            for(int i=0;i<arregloDeOpciones.length;i++)
            {
                System.out.println(arregloDeOpciones[i]);
            }
            System.out.println("************************");
            System.out.println("Ingrese Opcion: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:encenderAuto();
                break;
                case 2:aumentarVelocidadAuto();
                break;
                case 3:reducirVelocidadAuto();
                break;
                case 4:cargartanque();
                break;
                case 5:cargarAceite();
                break;
                case 6:
                    formarMensajeDeSalidaPorConsola("Aceite del vehiculo = "+getaceiteActual()+"\nGasolina="+getgasolinaActual()+"\nAceite="+getVelocidadActual());
                break;
                case 7:apagarAuto();
                break;
                case 8:
                break;
            }
        }
    while(opcion != arregloDeOpciones.length);
        System.out.println("hasta la vista");
    } 
    
    
    public static void main(String args[]){
        Auto a = new Auto();
        a.manejarTableroDeComandosDelAuto();
        
    }
}

