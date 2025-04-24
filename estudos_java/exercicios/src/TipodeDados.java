
public class TipodeDados {

    public static void main (String[] args) {

        exibirDadosPessoais();
        soma();
        conversao();
        ascii();
        booleanos();
        floatDouble();
        nomeComppleto();
        notacao();
        octalHexadecimal();
        misturaDeTipos();

    }

    //1. Declarando variáveis
    //Declare uma variável de cada tipo: int, double, char, boolean, String. Imprima seus valores.

    public static void exibirDadosPessoais() {

        int idade = 35;
        double altura = 1.66;
        char inicial = 'G';
        boolean solteira = true;
        String nome = "Gabriela";

        System.out.println(nome + " tem " + idade + " anos de idade, " + altura + " de altura, a inicial de seu nome é " + inicial +". " + "Se ela está solteira? " + solteira);

    }

    //2. Tipos primitivos e soma
    //Declare duas variáveis int e imprima a soma delas.

    public static void soma() {

        int numero1 = 5;
        int numero2 = 7;
        int soma = numero1 + numero2;

        System.out.println("A soma dos valores é: " + soma);

    }
    //3. Conversão implícita
    //Atribua um int a um double. O que acontece?

    public static void conversao() {
        int x = 4;
        double y = x;

        System.out.println(y);
    }

    //4. Caracteres e ASCII
    //Imprima o valor char e seu código ASCII.

    public static void ascii() {
        char letra = 'G';
        System.out.println(((int)letra));
    }

    //5. Literais booleanos
    //Mostre os valores true e false com explicação

    public static void booleanos() {
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("Quando uma variável booleana é verdadeira ela se mostra " + verdadeiro + " e quando é falso, ela se mostra " + falso);
    }

    //6. Float e Double
    //Declare valores e mostre a diferença de precisão.

    public static void floatDouble() {
        float pi = 3.141592653589793f;
        double pid = 3.141592653589793;

        System.out.println("A diferença do número de pi entre float e double é: " + pi + " pra float, e " + pid + " pra double.");
    }

    //7. String: nome completo
    //Imprima o tamanho e as letras inicial e final.

    public static void nomeComppleto() {
        String nome = "Gabriela Lopez Bravo";

        System.out.println("O tamanho do nome completo é: " + nome.length());
        System.out.println("A letra inicial do nome completo é: " + nome.charAt(0));
        System.out.println("A letra final do nome completo é: " + nome.charAt(nome.length()-1));

    }

    //8. Notação científica
    //Use um double com 1.5e2 e imprima o valor real.

    public static void notacao() {
        double x = 1.5e2;

        System.out.println(x);
    }



    //9. Octal e Hexadecimal
    //Declare e imprima valores octal e hexadecimal.

    public static void octalHexadecimal() {
        int octal = 012; // 10 decimal
        int hexa = 0xA; // 10 decimal

        System.out.println(octal);
        System.out.println(hexa);

    }


    //10. Mistura de tipos
    //Some um int com double e imprima o resultado.

    public static void misturaDeTipos() {
        int aleluia = 8;
        double glorias = 8.65432;
        double soma = aleluia + glorias;

        System.out.println(soma);

    }

}
