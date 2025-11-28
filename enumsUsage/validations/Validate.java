package enumsUsage.validations;

public class Validate {
    public static void main(String[] args) {
        boolean validEmail = Validator.EMAIL.validate("abc@gmail.com");
        boolean validPhone = Validator.PHONE.validate("123-456-7890");
        boolean zipCode = Validator.ZIP_CODE.validate("12345");
        System.out.println("Is valid email: " + validEmail);
        System.out.println("Is valid phone: " + validPhone);
        System.out.println("Is valid zip code: " + zipCode);
    }
}
