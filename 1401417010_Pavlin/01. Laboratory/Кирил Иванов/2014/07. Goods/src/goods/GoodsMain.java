package goods;

public class GoodsMain {

    public static void main(String[] args) {

        Products product;
        
        if(Input.validationChoice() == 1) {
            
            product = new Chair(Input.validationModel(), Input.validationPrice());
        }
        
        else {
            
            product = new Tv(Input.validationModel(), Input.validationPrice(), Input.validationScreenSize());
        }
        
        int desiredNumber = Input.validationDesiredNumber();

        System.out.println("Общата цена на " + desiredNumber + " броя стоки е " + (desiredNumber * product.getPrice()));
    }
}
