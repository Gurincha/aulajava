public class ExemploFor {
    public static void execute(){
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(cont);
        }

        String[] frutas={"maçã", "Banana", "Goiaba"};

        for (int i = 0; i < 3; i++) {
            System.out.println(frutas[i]);
        }

        for (String item : frutas) {
            System.out.println(item);
            
        }
    }
    
}
