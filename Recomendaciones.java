import java.util.Random;

public class Recomendaciones {

    public static void main(String[] args) {
        String[] recommendations = {
            "Beber al menos 8 vasos de agua al día.",
            "Realizar 30 minutos de ejercicio diario.",
            "Comer una dieta equilibrada rica en frutas y verduras.",
            "Dormir al menos 7 horas cada noche.",
            "Evitar el consumo de tabaco y alcohol."
        };

        Random random = new Random();
        int index = random.nextInt(recommendations.length);
        System.out.println("Recomendación médica del día: " + recommendations[index]);
    }
}