public class ServerNameGenerator {

    /*
     * private - cant access except in class
     * package private - cant access outside of the package
     * protected - can access within a package AND any descendent
     * public - can accrss everywhere
     */


    static String[] adjectives = {"happy","sour","sad","ugly","pretty","sexy","spicy","cold","cool","hot","fat"};
    static String[] nouns = {"lemon","apple","banana","kitty","buffalo","chicken","tiger","pig","fish","puppy"};


    public static String generateRandom(String[] array){
//        int randomNum = (int) Math.floor((Math.random()*array.length-1)+1);  //or
        int randomNum = (int) (Math.random()*array.length-1)+1;
        return array[randomNum];
    }

    public static void createName(){
        String randomAdj = generateRandom(adjectives);
        String randomNoun = generateRandom(nouns);


        System.out.printf("Here is your server name:\n%s-%s!",randomAdj,randomNoun);
    }



    // #2
    public static void main(String[] args) {
        createName();
    }
}
