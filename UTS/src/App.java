public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota dewak = new Anggota("Dewak", "01");
        dewak.display();
        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua garry = new Ketua("Garry", "02", "2019 / 2020");
        garry.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia roger = new KetuaPanitia("Roger", "03", "2020 / 2021");
        roger.display();

        System.out.println("coba dulu");
    }
}