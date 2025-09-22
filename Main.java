import ru.netology.service.CustomsService;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int productPrice = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int productWeight = scanner.nextInt();

        CustomsService.calculateCustoms(productPrice, productWeight);
    }
}
