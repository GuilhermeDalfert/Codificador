public class App {
    public static void main(String[] args) throws Exception {

        Codificador cod1 = new Codificador1();

        System.out.println("Codificador: "+cod1.getNome());
        System.out.println("Versao: "+cod1.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod1.getNivelSeguranca());
        
        String texto1 = "Este e o string a ser codificado";
        String codificado1 = cod1.codifica(texto1);
        String decodificado1 = cod1.decodifica(codificado1);

        System.out.println("Texto original: "+texto1);
        System.out.println("Texto codificado: "+codificado1);
        System.out.println("Texto decodificado: "+decodificado1);
        
//---------------------------------------------
        
         Codificador cod2 = new Codificador2();

        System.out.println("Codificador: "+cod2.getNome());
        System.out.println("Versao: "+cod2.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod2.getNivelSeguranca());
        
        String texto2 = "Este e o string a ser codificado";
        String codificado2 = cod2.codifica(texto2);
        String decodificado2 = cod2.decodifica(codificado2);

        System.out.println("Texto original: "+texto2);
        System.out.println("Texto codificado: "+codificado2);
        System.out.println("Texto decodificado: "+decodificado2);
        
//----------------------------------------------------
        
         Codificador cod3 = new Codificador3();

        System.out.println("Codificador: "+cod3.getNome());
        System.out.println("Versao: "+cod3.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod3.getNivelSeguranca());
        
        String texto3 = "Este e o string a ser codificado";
        String codificado3 = cod3.codifica(texto3);
        String decodificado3 = cod3.decodifica(codificado3);

        System.out.println("Texto original: "+texto3);
        System.out.println("Texto codificado: "+codificado3);
        System.out.println("Texto decodificado: "+decodificado3);
    }
}

