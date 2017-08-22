public class Main {

    public static void main(String[] args) {
	// entry point into the application
        //public = globally available
        //void means no return necessary (could be any other type of data i.e. String, bool, int etc.)
        //static?
        Animal hamster = new Animal(4, "white", "hamster", "Gandalf");
        hamster.printAnimalInfo();

        Animal dolphin = new Animal(null, "grey", "dolphin", "Sparkle");
        dolphin.printAnimalInfo();

        Animal spider = new Animal(8, "black", "spider", "Charlotte");
        spider.printAnimalInfo();

        Animal unicorn = new Animal(4, "purple", "unicorn", "Harry");
        unicorn.printAnimalInfo();
    }

}
