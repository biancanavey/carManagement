import java.math.BigDecimal;
import java.util.ArrayList;

public class Car {

        //PROPERTIES
        private Colour colour;
        private String registration;
        private Brand brand;
        private BigDecimal price;

        //CONSTRUCTOR
        public Car(Colour colour, String registration, Brand brand, BigDecimal price) {
                this.colour = colour;
                this.registration = registration;
                this.brand = brand;
                this.price = price;
        }



}
