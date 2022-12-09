public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam ){
        super(drive, ram, processor);
        this.webcam = webcam;

    }

    public void informasi(){
        if (webcam == true ){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar" + ram + " GB dan processor secepat " + processor+ " Selain itu laptop ini juga memiliki Webcam");
        }else{
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar" + ram + " GB dan processor secepat "+ processor+ " Ghz.");
        }
    }

    public void bukaGame(String Namagame){
        System.out.println("Laptop sedang membuka game "+ Namagame);

    }
    public void kirim_Email(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);

    }
    public void kirim_Email(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+ email1+" dan ke " +email2);
    }
}