/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author kangu
 */
public class Ahorcado {
    private static final int TAM_ABE = 26;
    
    private final char[] abecedario; 
    private final String[] diccionario;
    private final boolean[] siOno;
    private int tam_dicc;
    private int cantid_dicc;
    
    private int vida;
    private int posib;
    
    public Ahorcado() {
        
        // <editor-fold defaultstate="collapsed" desc="Declaracion del diccionario del ahorcado">
        
        diccionario = new String[300];
        diccionario[0]="casa";  
        diccionario[1]="pan";  
        diccionario[2]="pata";  
        diccionario[3]="paso";  
        diccionario[4]="mano";  
        diccionario[5]="cama";  
        diccionario[6]="lana";  
        diccionario[7]="sana";  
        diccionario[8]="pantano";  
        diccionario[9]="pez"; 
        diccionario[10]="zapato";  
        diccionario[11]="naranjo";  
        diccionario[12]="rojo";   
        diccionario[13]="azul";   
        diccionario[14]="comida";   
        diccionario[15]="dormir";   
        diccionario[16]="sombrero";   
        diccionario[17]="liquido";   
        diccionario[18]="goma";   
        diccionario[19]="taza";  
        diccionario[20]="lapiz";   
        diccionario[21]="lapicero";   
        diccionario[22]="papel";   
        diccionario[23]="perro";   
        diccionario[24]="gato";   
        diccionario[25]="cuaderno";   
        diccionario[26]="estampado";   
        diccionario[27]="embolia";   
        diccionario[28]="arbol";   
        diccionario[29]="picante";  
        diccionario[30]="supercalifragilisticoespialidoso";
        diccionario[31]="calendario";  
        diccionario[32]="recipiente";   
        diccionario[33]="declarar";   
        diccionario[34]="esperanza";   
        diccionario[35]="amor";   
        diccionario[36]="cerebro";   
        diccionario[37]="espalda";   
        diccionario[38]="ola";   
        diccionario[39]="moto";  
        diccionario[40]="bus";   
        diccionario[41]="trailer";   
        diccionario[42]="camion";   
        diccionario[43]="semaforo";   
        diccionario[44]="calle";   
        diccionario[45]="carretera";   
        diccionario[46]="locion";   
        diccionario[47]="pegamento";   
        diccionario[48]="raton";   
        diccionario[49]="tarjeta"; 
        diccionario[50]="juego";  
        diccionario[51]="ahorcado";  
        diccionario[52]="cepillo";   
        diccionario[53]="dientes";   
        diccionario[54]="diente";   
        diccionario[55]="ojo";   
        diccionario[56]="sapo";   
        diccionario[57]="rana";   
        diccionario[58]="seguro";   
        diccionario[59]="contenido";  
        diccionario[60]="litro";   
        diccionario[61]="agua";   
        diccionario[62]="peso";   
        diccionario[63]="kilogramo";   
        diccionario[64]="lluvia";   
        diccionario[65]="sol";   
        diccionario[66]="wachiturro";   
        diccionario[67]="febrero";   
        diccionario[68]="marzo";   
        diccionario[69]="abril"; 
        diccionario[70]="moca";  
        diccionario[71]="junio";  
        diccionario[72]="julio";   
        diccionario[73]="agosto";   
        diccionario[74]="setiembre";   
        diccionario[75]="septiembre";   
        diccionario[76]="octubre";   
        diccionario[77]="noviembre";   
        diccionario[78]="diciembre";   
        diccionario[79]="tierra";  
        diccionario[80]="urano";   
        diccionario[81]="neptuno";   
        diccionario[82]="pikachu";   
        diccionario[83]="jupiter";   
        diccionario[84]="pluton";   
        diccionario[85]="luna";   
        diccionario[86]="marte";   
        diccionario[87]="saturno";   
        diccionario[88]="venus";   
        diccionario[89]="mercurio"; 
        diccionario[90]="cancer";  
        diccionario[91]="capricornio";  
        diccionario[92]="unicornio";   
        diccionario[93]="caballo";   
        diccionario[94]="chata";   
        diccionario[95]="piscis";   
        diccionario[96]="tiburon";   
        diccionario[97]="ballena";   
        diccionario[98]="correo";   
        diccionario[99]="nota";  
        diccionario[100]="codigo";   
        diccionario[101]="abierto";   
        diccionario[102]="cerrado";   
        diccionario[103]="palabra";   
        diccionario[104]="contar";   
        diccionario[105]="tema";   
        diccionario[106]="deseo";   
        diccionario[107]="nuevo";   
        diccionario[108]="viejo";   
        diccionario[109]="adulto"; 
        diccionario[110]="lobo";  
        diccionario[111]="cortina";  
        diccionario[112]="televisor";   
        diccionario[113]="pantalla";   
        diccionario[114]="geta";   
        diccionario[115]="chocolate";   
        diccionario[116]="cacao";   
        diccionario[117]="peine";   
        diccionario[118]="cepillo";   
        diccionario[119]="grapadora";  
        diccionario[120]="corchos";   
        diccionario[121]="camisa";   
        diccionario[122]="masilla";   
        diccionario[123]="maza";   
        diccionario[124]="alcohol";   
        diccionario[125]="cerveza";   
        diccionario[126]="vodka";   
        diccionario[127]="costa";   
        diccionario[128]="mundial";   
        diccionario[129]="peluca"; 
        diccionario[130]="escudo";
        diccionario[131]="zaondo"; 
        diccionario[132]="huargo"; 
        diccionario[133]="palurdo"; 
        diccionario[134]="espeso"; 
        diccionario[135]="vinilo"; 
        diccionario[136]="tronamesa";
        diccionario[137]="reflexion";
        diccionario[138]="concierto";
        diccionario[139]="angel";
        diccionario[140]="pejivalle";   
        diccionario[141]="flauta";   
        diccionario[142]="trombon";   
        diccionario[143]="violin";   
        diccionario[144]="guitarra";   
        diccionario[145]="bateria";   
        diccionario[146]="bajo";   
        diccionario[147]="alto";   
        diccionario[148]="tablero";   
        diccionario[149]="tabla"; 
        diccionario[150]="bosque";   
        diccionario[151]="magma";   
        diccionario[152]="lava";   
        diccionario[153]="volcan";   
        diccionario[154]="parque";   
        diccionario[155]="nacion";   
        diccionario[156]="oceano";   
        diccionario[157]="arrecife";   
        diccionario[158]="encaje";   
        diccionario[159]="muelle"; 
        diccionario[160]="somnoliento";   
        diccionario[161]="naranja";   
        diccionario[162]="bomba";   
        diccionario[163]="judio";   
        diccionario[164]="cristiano";   
        diccionario[165]="formulario";   
        diccionario[166]="caracter";   
        diccionario[167]="sopa";   
        diccionario[168]="pinto";   
        diccionario[169]="huevo"; 
        diccionario[170]="carne";   
        diccionario[171]="somnifero";   
        diccionario[172]="macarron";   
        diccionario[173]="barril";   
        diccionario[174]="carton";   
        diccionario[175]="espuma";   
        diccionario[176]="carpeta";   
        diccionario[177]="impresora";   
        diccionario[178]="borrador";   
        diccionario[179]="tajador"; 
        diccionario[180]="obtener";   
        diccionario[181]="lugar";   
        diccionario[182]="risa";   
        diccionario[183]="mundo";   
        diccionario[184]="antena";   
        diccionario[185]="victoria";   
        diccionario[186]="perdida";   
        diccionario[187]="bebe";   
        diccionario[188]="observatorio";   
        diccionario[189]="pizza"; 
        diccionario[190]="cangrejo";   
        diccionario[191]="mejor";   
        diccionario[192]="mal";   
        diccionario[193]="malo";   
        diccionario[194]="respuesta";   
        diccionario[195]="incorrecto";   
        diccionario[196]="correcta";   
        diccionario[197]="demente";   
        diccionario[198]="asesino";   
        diccionario[199]="villano"; 
        diccionario[200]="heroe";      
        diccionario[201]="espiritu";   
        diccionario[202]="matazano";   
        diccionario[203]="nube";   
        diccionario[204]="cielo";   
        diccionario[205]="uno";   
        diccionario[206]="dos";   
        diccionario[207]="tres";   
        diccionario[208]="cuatro";   
        diccionario[209]="depurar"; 
        diccionario[210]="seis";   
        diccionario[211]="siete";   
        diccionario[212]="ocho";   
        diccionario[213]="nueve";   
        diccionario[214]="diez";   
        diccionario[215]="once";   
        diccionario[216]="doce";   
        diccionario[217]="discreto";   
        diccionario[218]="pelicula";   
        diccionario[219]="comedia"; 
        diccionario[220]="suspenso";
	diccionario[221]="drama";   
        diccionario[222]="divino";   
        diccionario[223]="arco";   
        diccionario[224]="acolchonado";   
        diccionario[225]="diamante";   
        diccionario[226]="operario";   
        diccionario[227]="lol";   
        diccionario[228]="caca";   
        diccionario[229]="pedo"; 
        diccionario[230]="documento";   
        diccionario[231]="dinosaurio";   
        diccionario[232]="conocido";   
        diccionario[233]="vida";   
        diccionario[234]="familia";   
        diccionario[235]="entretener";   
        diccionario[236]="concurso";   
        diccionario[237]="diversion";   
        diccionario[238]="gerente";   
        diccionario[239]="oficina"; 
        diccionario[240]="trato";   
        diccionario[241]="contrato";   
        diccionario[242]="firmar";   
        diccionario[243]="estrella";   
        diccionario[244]="portada";   
        diccionario[245]="proyecto";   
        diccionario[246]="fama";   
        diccionario[247]="placer";   
        diccionario[248]="sal";   
        diccionario[249]="enemigo"; 
        diccionario[250]="cazar";   
	diccionario[251]="foton";   
        diccionario[252]="gringo";   
        diccionario[253]="extranjero";   
        diccionario[254]="cosa";
        diccionario[255]="google";   
        diccionario[256]="facebook";   
        diccionario[257]="feisbuk";   
        diccionario[258]="cancion";   
        diccionario[259]="partidario";    
        diccionario[260]="pertenencia";   
        diccionario[261]="afuera";   
        diccionario[262]="dentro";   
        diccionario[263]="destructor";   
        diccionario[264]="garrapata";   
        diccionario[265]="pulga";   
        diccionario[266]="descalzo";   
        diccionario[267]="tennis";   
        diccionario[268]="corresponsal";   
        diccionario[269]="flama"; 
        diccionario[270]="voz";   
        diccionario[271]="faringe";   
        diccionario[272]="asistencia";   
        diccionario[273]="robo";   
        diccionario[274]="hurto";   
        diccionario[275]="huerto";   
        diccionario[276]="cruel";   
        diccionario[277]="ovni";   
        diccionario[278]="caspa";   
        diccionario[279]="agujeros"; 
        diccionario[280]="claudio";   
        diccionario[281]="andres";   
        diccionario[282]="jean";   
        diccionario[283]="carlo";   
        diccionario[284]="carlos";   
        diccionario[285]="idea";   
        diccionario[286]="descanzar";   
        diccionario[287]="reposar";   
        diccionario[288]="orientacion";   
        diccionario[289]="escuela"; 
        diccionario[290]="colegio";   
        diccionario[291]="matematica";   
        diccionario[292]="ingles";   
        diccionario[293]="raiz";   
        diccionario[294]="arce";   
        diccionario[295]="arceus";   
        diccionario[296]="bala";   
        diccionario[297]="citrico";   
        diccionario[298]="fresa";   
        diccionario[299]="mora";
        // </editor-fold>
        
        //Llena tamanno y cantidad del diccionario.
        tam_dicc = 300;
        cantid_dicc = 300;
        
        vida = 10;
        posib = 10;
        
        abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        //Pone como posibles todas las palabras.
        siOno = new boolean[tam_dicc];
        for(int i = 0; i < tam_dicc; i++) 
            siOno[i] = true;
    
    }
    
    //Modifica un elemento del dicionario.
    public void setElemD(int i, String pal){
        diccionario[i] = pal;
    }
    
    //Retorna un elemento del vector siOno.
    public boolean getElemSoN(int i){
        return siOno[i];
    }

    //Retorna un elemento del dicionario.
    public String getElemD(int i){
        return diccionario[i];
    }

    //Modifica la cantidad del diccionario.
    public void setCantidadD(int i){
        cantid_dicc = i;
    }

    //Retorna la cantidad del diccionario.
    public int getCantidadD(){
        return cantid_dicc;
    }
    
    //Modifica el tamaño del diccionario.
    public void setTamD(int i){
        tam_dicc = i;
    }

    //Retorna el tamaño del diccionario.
    public int getTamD(){
        return tam_dicc;
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getPosib(){
        return this.posib;
    }
    
    public void setPosib(int posib){
        this.posib = posib;
    }
    
    //Imprime solo los elementos posibles del diccionario.
    @Override
    public String toString(){
	String s = "";
	for(int i = 0; i < cantid_dicc; i++)
            if(siOno[i] == true)
                s += "[" + diccionario[i] + "] ";
        return s;
        
    }
    
    //Pone en "false" si la palbra no tiene el tamaño requerido.
    public void reducirtamanio(int tamannio){ 
        for(int i = 0; i < tam_dicc; i++)
            if(tamannio != diccionario[i].length())
                siOno[i] = false;
    }
    
    //Calcula el numero de palabras que posean true 
    public int palabrasPos(){   
        int posible = 0;
	for(int i = 0; i < tam_dicc; i++){
            if(siOno[i] == true)
                posible++;
	}
	return posible;
    }
    
    //Calcula el numero de palabras donde aparece una letra en especifica.
    public double cantidLetrPala(int i){ 
	int cont = 0;
	String caracter;
	for(int s = 0, t = 0; s < cantid_dicc; s++, t = 0){
            if (siOno[s] == true){
                caracter = diccionario[s];
		do{
                    if(caracter.charAt(t) == abecedario[i]){
                        cont++;
                    }
                    t++;
		}
                /*Aqui problema*/
                while(caracter.charAt(t-1) != abecedario[i] && t < caracter.length());
            }
	}
        return cont;
    }
    
    // calcula la entropia de cada letra y devuelve la letra menor entropia
    // tambien elmima la letra ya retornada
    public char entropia(){ 
	double temp=2.0;
	char x = ' ';
	double iD3;
		         
        // detemina la menor entropia
	for(int i = 0; i < TAM_ABE; i++){
            iD3 = -((this.cantidLetrPala(i)/this.palabrasPos())* (Math.log((this.cantidLetrPala(i)/this.palabrasPos()))/Math.log(2.00)));
            if(temp > iD3){
                temp = iD3;
		x = abecedario[i];
            }
        }
	
        // elimina la letra ya usada
	for(int s = 0; s < TAM_ABE; s++)
            if(abecedario[s] == x)
                abecedario[s] = ' ';

	return x;
    }
    
    public void reducirPos(int[] pos, char entropia, char respuesta, int veces){ 
        String cadena;

        // si respuesta es si, pone false todas las palbras que
        // en esa posicion no tenga esa palabra.
	if(respuesta == 's')
            for(int i = 0; i < cantid_dicc; i++)
		if(siOno[i] == true){
                    cadena = diccionario[i];
                        for(int s = 0; s < veces; s++)
                            if(cadena.charAt(pos[s]-1) != entropia)
				siOno[i]=false;
		}

        //si repuesta es no, pone false todas las palbras con esa letra 
	if(respuesta == 'n')
            for(int s = 0; s < cantid_dicc; s++){
		if(siOno[s] == true){
                    cadena = diccionario[s];
                    for(int t = 0; t < diccionario[s].length(); t++)
			if(cadena.charAt(t) == entropia)
                            siOno[s]=false;
		}
            }
    }
    
    // imprime en pantalla y realiza el llamado de varios metodos
    // cambia el valor de vida,de la clase A y de posib
    //Quitadas: Ahorcado A, int vida, int posib
    public void imprimir(){
	// pos es un vector para posiciones digitadas por el usuario.
        
        int[] pos = new int[20];
        int veces;
	char respuesta = ' ';
        
	//posib = A.palabrasPos();
        this.posib = this.palabrasPos();
        
        System.out.println("Numero de vidas ==> " + this.vida);
        System.out.println("Hay " + this.posib +" posibles");
        
        // si hay mas de una palabra posible
	//if(A.palabrasPos() > 1){
        if(this.palabrasPos() > 1){
            //char ent = A.entropia(A);
            char ent = this.entropia();
            System.out.println("Su palabra tiene la letra " + ent + " ?");

            // no permite que la respuesta sea diferente de 's' o 'n'
            while(respuesta != 's' && respuesta != 'n'){
                System.out.println("Digite 's' para si y 'n' para no ==>");
                Scanner respuestaLector = new Scanner(System.in);
                respuesta = respuestaLector.next().charAt(0);
            }

            // si la respuesta es 'n'
            if (respuesta == 'n'){
                this.vida = this.vida - 1;
                //ya que no se ocupan 'pos' ni 'veces', se pueden poner nulas
		//A.reducirPos(null, ent, respuesta, 0);
                this.reducirPos(null, ent, respuesta, 0);
            }
            
            // si la respuesta es 's'
            else{
                System.out.println("Cuantas veces aparece la letra en la palabra? ");
                Scanner apareceVeces = new Scanner(System.in);
                veces = apareceVeces.nextInt();
				
                System.out.println("En que posicion esta la letra?");
				
		// llena el vector 'pos' segun las veces que aparece la letra en la palabra
                Scanner posScan;
		for(int i = 0; i < veces; i++){
                    posScan = new Scanner(System.in);
                    pos[i] = posScan.nextInt();
                }
                //A.reducirPos(pos,ent,respuesta,veces);
                this.reducirPos(pos,ent,respuesta,veces);
            }

            System.out.println("- - - - - - - - - - - - - - - - - - -- - - - - - ");
	}
    }
}
