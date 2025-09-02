public class Main {
    public static void main(String[] args) {

            final int SIZE = 30;
            final float MIN = 32.0f;
            final float MAX = 40.0f;
            final float MAX_TEMPERATURE_OF_HEALTHY_PATIENT = 36.9f;
            final float MIN_TEMPERATURE_OF_HEALTHY_PATIENT = 36.2f;
            int sizeHealthyPatient = 0;
            float sum = 0;

            float[] temperature = new float[SIZE];
            for (int i = 0; i < temperature.length; i++) {
                temperature[i] = MIN + (float) Math.round((int) (MAX - MIN) * 10
                        * (float) Math.random()) / 10;
                sum = sum + temperature[i];
                if (temperature[i] <= MAX_TEMPERATURE_OF_HEALTHY_PATIENT &&
                        temperature[i] >= MIN_TEMPERATURE_OF_HEALTHY_PATIENT) {
                    sizeHealthyPatient++;
                }
                System.out.print(temperature[i] + ", ");
            }
            float averageTemperature = sum / SIZE;
            System.out.println();
            System.out.println("Колличество здоровых пациентов: " + sizeHealthyPatient);
            System.out.println("Средняя темература пациентов: " + averageTemperature);

        }
    }
