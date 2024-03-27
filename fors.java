public class fors {
    public static void main(String[] args) {
            //for biasa
            String[][] akun = {{"Origami", "TobiichiOrigami"}, {"Shido", "ItsukaShido"}, {"Kotori", "ItsukaKotori"}, {"Mana", "TakamiyaMana"}, {"Yoshino", "Yoshinon"}};
            for (int i = 0; i < 5; i++) {
            System.out.println("Username: " + akun[i][0] + " Password: " + akun[i][1]);
            }
            System.out.println("================================="); //pembatas

            String[][] akuns = {{"Origami", "TobiichiOrigami"}, {"Shido", "ItsukaShido"}, {"Kotori", "ItsukaKotori"}, {"Mana", "TakamiyaMana"}, {"Yoshino", "Yoshinon"}};
            for (String[] data : akuns) {  // dalam for enhance ini dia lansung auto update alhasil saat ada data yang baru ia akan lansung print tanpa perlu inisial lagi sebagai contoh 1 < 5 maka ia akan print 5x saja bahkan jika ada data baru tapi untuk for enhance ini dia gak perlu
                System.out.println("Username: " + data[0] + " Password: " + data[1]);
                // dalam for ini dia hemat 2 space
        }
    }
}