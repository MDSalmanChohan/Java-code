public class Family {

    public static void main(String[] args) {

        Person family[] = new Person[3];

        family[0] = new Person();
        family[0].name = "Salman khan";
        family[0].age = 19;
        family[0].yearOfBirth = 2022 - family[0].age;

        family[1] = new Person();
        family[1].name = "Islam khan ";
        family[1].age = 53;
        family[1].yearOfBirth = 2022 - family[1].age;

        family[2] = new Person();
        family[2].name = "Samina";
        family[2].age = 47;
        family[2].yearOfBirth = 2022 - family[2].age;

        for (int i = 0; i < family.length; i++) {

            if (family[i].age >= 20) {
                family[i].printPersonalCard();

            }

        }

    }
}
