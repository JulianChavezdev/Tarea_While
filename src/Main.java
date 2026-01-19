void main(){
number8();
}

void number1() {
    int i = 0;
    while (i < 10 + 1) {
        System.out.println(i);
        i++;
    }
}
void number2() {
    int i = 10;
    while (i > 0 ){
        System.out.println(i);
    i--;
    }
}
void number3() {
    int i = 1;
    int sum = 0;
    while (i <= 10 + 1) {
        System.out.println(sum);
        sum += i;
        i++;
    }
}

void number4() {
    int i=1;
    int multiply = 2;
    while (i <= 20 ) {

        System.out.println(i * multiply);
        i++;
    }
}
void number5() {
    int i = 1;
    int numero = 8;
    int factorial = 1;

    while(i <= numero +1){

        System.out.println(factorial);
        factorial *= i;
        i++;
    }}
void number6() {
    int numrandom = new Random().nextInt(10)+1;
    boolean haAcertado = false;
    int numero;
    while(!haAcertado){
        System.out.println("Ingrese un numero del 1 al 10");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        if(numero == numrandom){
            System.out.println("El numero es correcto");
            haAcertado = true;
        }else {
            System.out.println("El numero es incorrecto, intente nuevamente");
        }
    }
}
void number7() {
    int i = 1;
    while(i <= 50){
        if(i % 3 == 0){
            System.out.println(i);
        }i++;
    }}

void number8() {

    System.out.println("Introduce usuario y luego contraseña");
    String user = "usuario";
    String password = "contra";
    boolean login = false;
    int i = 3;
    while(true) {
        Scanner sc = new Scanner(System.in);
        String user1 = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        String Password1 = sc2.nextLine();
        if (user1.equals(user) && Password1.equals(Password1)) {
            login = true;
            System.out.println("Login Correcto");
        } else {
            System.out.println("Incorrecto");
            i--;
        }
    if (i <= 0){
    System.out.println("Demasidados intentos");
}
    }
}

