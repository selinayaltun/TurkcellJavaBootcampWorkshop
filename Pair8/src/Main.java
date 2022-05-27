
public class Main {

	public static void main(String[] args) {
		int i, j;
        int number_First = 3;
        int number_Second;
        int sum_First;
        int sum_Second;
        int counter = 0;

        while (counter != 2) { 

            sum_First = 0;
            for (i = 1; i < number_First; i++) { // Birinci sayının bölenlerinin toplamını bulur
                if (number_First % i == 0) {
                    sum_First = sum_First + i;
                }
            }

            for(number_Second = 0; number_Second < number_First; number_Second++) { // Birinci sayıdan küçük olan sayıları ikinci sayı olarak kontrol eder
                sum_Second = 0;

                for (j = 1; j < number_Second; j++) { // İkinci sayının bölenlerinin toplamını bulur 
                    if (number_Second % j == 0) {
                        sum_Second = sum_Second + j;
                    }
                }

                if (number_First == sum_Second && number_Second == sum_First) { // Arkadaş sayı mı diye kontrol eder ve printler
                    System.out.println("Arkadaş sayılar: " + number_First + " - " + number_Second);
                    counter++;
                }
            }

            number_First++;
        }


	}

}
