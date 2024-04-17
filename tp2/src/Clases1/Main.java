package Clases1;

public class Main {
    public static void main(String[] args) {
        Bird bird=new Bird("Piolin");
        bird.setSpeaks(true);
        bird.setPrice(100);
        bird.setSpecie("Loro");
        bird.setAge(1);
        bird.setAnimalType("Bird");
        if(bird.isSpeaks()){
            System.out.println("El pajaro canta");
        }else {
            System.out.println("El pajaro no canta");
        }

        Cat cat=new Cat("Gaturro");
        cat.setRace("Persa");
        cat.setAge(3);
        cat.setSterilized(true);
        cat.setPrice(300);
        cat.setAnimalType("Gato");
        if (cat.isSterilized()){
            System.out.println("el gato esta esterilizado");
        }else {
            System.out.println("el gato no esta esterilizado");
        }



        Dog dog=new Dog("Ginno");
        dog.setRace("Salchicha");
        dog.setAge(3);
        dog.setVaccinated(true);
        dog.setPrice(500);
        dog.setAnimalType("Perro");
        if(dog.isVaccinated()){
            System.out.println("el perro esta vacunado");
        }else {
            System.out.println("El perro no esta vacunado");
        }

        Fish fish=new Fish("Nemo");
        Store store=new Store();
        fish.setEspecie("Payaso");
        fish.setAge(1);
        fish.setAnimalType("pez");
        fish.setPrice(100);

        store.addAnimal(bird);
        store.addAnimal(cat);
        store.addAnimal(dog);
        store.addAnimal(fish);

        store.feedanimals("Ginno");
        store.listAnimals();
        store.sellAnimal("Ginno");
        store.listAnimals();


    }
}
