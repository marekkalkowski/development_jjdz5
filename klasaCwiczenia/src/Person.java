
public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private String skinColor;
    private String country;
    private String primaryLanguage;
    private String scondaryLanguage;

    public Person() {
        name = "Marek";
    }

    ;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public void setScondaryLanguage(String scondaryLanguage) {
        this.scondaryLanguage = scondaryLanguage;
    }

    public void running (){
        System.out.println("Biegam szybko");
    }



}


