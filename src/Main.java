public class Main {

    public static void main(String[] args) {
	int sumliczb = 0;
	for (int i = 1; i <= 100; i++ ){
	    if (i % 2 == 0) {
            sumliczb += i;
        }
        }
     System.out.println("Suma liczb parzystych w przedziale 1 do 100 wynosi: " + sumliczb);
    }
}
