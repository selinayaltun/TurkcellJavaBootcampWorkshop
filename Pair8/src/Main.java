
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
            for (i = 1; i < number_First; i++) { // Birinci say�n�n b�lenlerinin toplam�n� bulur
                if (number_First % i == 0) {
                    sum_First = sum_First + i;
                }
            }

            for(number_Second = 0; number_Second < number_First; number_Second++) { // Birinci say�dan k���k olan say�lar� ikinci say� olarak kontrol eder
                sum_Second = 0;

                for (j = 1; j < number_Second; j++) { // �kinci say�n�n b�lenlerinin toplam�n� bulur 
                    if (number_Second % j == 0) {
                        sum_Second = sum_Second + j;
                    }
                }

                if (number_First == sum_Second && number_Second == sum_First) { // Arkada� say� m� diye kontrol eder ve printler
                    System.out.println("Arkada� say�lar: " + number_First + " - " + number_Second);
                    counter++;
                }
            }

            number_First++;
        }


	}

}
