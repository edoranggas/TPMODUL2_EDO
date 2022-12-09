public class MainApp {
    
    public static void main(String[] args) {
        System.out.println("Informasi Perangkat");
        Handphone Handphone = new Handphone("Snapdragon", 8, 4, false);
        Handphone.informasi();
        Handphone.telfon(628272560);
        Handphone.kirimSMS(628893745);
        Handphone.kirimSMS(628893745, 628272560);
        System.out.println(" ");

        Laptop Laptop = new Laptop("Sandisk", 16, 12, true);
        Laptop.informasi();
        Laptop.bukaGame("Valorant");
        Laptop.kirim_Email("edors26@gmail.com");
        Laptop.kirim_Email("edors26@gmail.com", "desjar2020@gmail.com");
    }

}
