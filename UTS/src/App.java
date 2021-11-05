public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota orang1 = new Anggota("Dewak", "01");
        orang1.display();

        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua orang2 = new Ketua("Garry", "02", "2019 / 2020");
        orang2.display();

        System.out.println("test");
        System.out.println("test");
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia orang3 = new KetuaPanitia("Roger", "03", "2020 / 2021");
        orang3.display();

    }
}