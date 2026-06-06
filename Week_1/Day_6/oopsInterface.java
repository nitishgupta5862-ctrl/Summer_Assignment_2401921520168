public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        // ── TEST CASE 1: KidUser ──────────────────────────────
        System.out.println("=== KidUser Tests ===");

        KidUser kid = new KidUser();

        // Age 10 → should register successfully
        kid.age = 10;
        kid.registerAccount();

        // Age 18 → should be rejected
        kid.age = 18;
        kid.registerAccount();

        // BookType "Kids" → should issue book
        kid.bookType = "Kids";
        kid.requestBook();

        // BookType "Fiction" → should be rejected
        kid.bookType = "Fiction";
        kid.requestBook();

        // ── TEST CASE 2: AdultUser ────────────────────────────
        System.out.println("\n=== AdultUser Tests ===");

        AdultUser adult = new AdultUser();

        // Age 5 → should be rejected
        adult.age = 5;
        adult.registerAccount();

        // Age 23 → should register successfully
        adult.age = 23;
        adult.registerAccount();

        // BookType "Kids" → should be rejected
        adult.bookType = "Kids";
        adult.requestBook();

        // BookType "Fiction" → should issue book
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}
