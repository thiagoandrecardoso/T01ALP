public class Main {

    public static void main(String[] args) {
        /*
         * Dados primitivos:
         */

        int age = 23;
        double temperature = 34.7645322123;
        float price = 34.7645322123f;

        // Diference in precision double x float:
        System.out.println("double -> " + temperature);
        System.out.println("float -> " + price);

        boolean isAllowed = true;

        char sex = 'F';

        byte valueByte = 127; // range  -128 a 127.
        short valueShort = 32766; // range -32768 a 32767

        long mat; // ocupa 8 bytes na memória. 0
        /*
         * Sabia que existe um tipo "Long", com o "L" maiúsculo?
         * classe wrapper
         * encapsula o "long"
         * aceita nulo
         */
        Long studentId = 2034321L;
        // Caso o aluno não tenha matricula, o "studentId" pode ser null.
        // studentId = null;
        System.out.println("Matricula: " + studentId);

        // wrapper types:
        /*
        byte: Byte
        short: Short
        int: Integer
        long: Long
        float: Float
        double: Double
        char: Character
        boolean: Boolean
         */

        //-------------------------------------------------------------------------------
        /*
        tipos de referência:
        - dados que representam objetos ou "instâncias" de classes
         */
        Meter meter = new Meter(200.50f, "Industry meter", true);

        System.out.println(meter.getDescription());

        String name = "Maria";
        System.out.println("Name: " + name);
        String lastName = "Da Silva";
        String fullName = name + " " + lastName;
        System.out.println("Full name: " + fullName);
        System.out.println("Len: " + fullName.length());

          /*
    EXECÍCIOS:
        Crie uma variável do tipo "int" chamada "idade" e atribua o valor 25 a ela.
        Declare uma variável do tipo double chamada "preço" e inicialize-a com o valor 19.99.
        Escreva um programa que converte um valor do tipo double para o tipo int.
        Crie uma variável do tipo String chamada "nome" e atribua a ela o valor "João da Silva".
        Escreva um programa que recebe como entrada um valor do tipo String que representa um número inteiro e converte esse valor para o tipo int.
        Crie uma classe chamada "Pessoa" com os seguintes atributos: nome (tipo String), idade (tipo int) e altura (tipo double).
        Escreva um programa que cria um objeto do tipo "Pessoa" e atribui valores aos seus atributos.
        Declare uma variável do tipo "long" chamada "numTelefone" e inicialize-a com o valor 9999999999L.
        Escreva um programa que recebe como entrada um valor do tipo "int" e o converte para o tipo String.
        Crie uma variável do tipo boolean chamada status e atribua o valor true a ela. Em seguida, escreva um programa que imprime na tela o valor dessa variável em formato de texto, ou seja, "true" ou "false".
     */

        int value = 4;


        double valorDouble = 5.5;
        int valorInteiro = (int) valorDouble; // valorInteiro agora é 5
        System.out.println(valorInteiro);

        String sobrenome;

    }

    public static class Meter {
        private float price;
        private String description;
        private Boolean hasUserOutput;

        public Meter(float price, String description, Boolean hasUserOutput) {
            this.price = price;
            this.description = description;
            this.hasUserOutput = hasUserOutput;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getHasUserOutput() {
            return hasUserOutput;
        }

        public void setHasUserOutput(Boolean hasUserOutput) {
            this.hasUserOutput = hasUserOutput;
        }
    }

}