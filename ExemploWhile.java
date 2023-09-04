public class ExemploWhile {
    public static void execute(){
        int contWhile=0;

        while(contWhile < 4){
            System.out.println("while:"+ contWhile);
            contWhile++;
        }

        int  contdoWhile=0;
        do{
            System.out.println("DoWhile" + contdoWhile);
            contdoWhile++;
        }while(contdoWhile < 4);
    }
}
