package ro.Fasttrackit.lab7;

 class Object{
    public static void main(String[] args) {
        System.out.println();
        Person personA = new Person("Ion", 24, true);
        Person personB = new Person("Vasile", 32, false);
        Person personC = new Person("Gheorghe", 45, true);

      printPerson(personA);
      printPerson(personB);
      printPerson(personC);

    }

    public static void printPerson(Person person) {
        if(person.isMarried()) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old and married");
        } else {
            System.out.println(person.getName() + " is " + person.getAge() + " years old and not married");
        }
    }
}
