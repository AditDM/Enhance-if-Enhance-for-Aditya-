public class ifs {
    public static void main(String[] args) {
        //if else tanpa enhance
        int AkunGame = 5; 
        String[][] Game = {{"Origami", "TobiichiOrigami"}, {"Shido", "ItsukaShido"}, {"Kotori", "ItsukaKotori"}, {"Mana", "TakamiyaMana"}, {"Yoshino", "Yoshinon"}};
        if (AkunGame == 0) { //ia menggunakan if else yang biasa dengan panjang baris lebih besar,if else ini memakai command if dan else untuk menguraikan data data yang ada
            System.out.println("Username: " + Game[0][0] + " Password: " + Game[0][1]); 
        } else if (AkunGame == 1) {
            System.out.println("Username: " + Game[1][0] + " Password: " + Game[1][1]);
        } else if (AkunGame == 2) {
            System.out.println("Username: " + Game[2][0] + " Password: " + Game[2][1]);
        } else if (AkunGame == 3) {
            System.out.println("Username: " + Game[3][0] + " Password: " + Game[3][1]);
        } else if (AkunGame == 4) {
            System.out.println("Username: " + Game[4][0] + " Password: " + Game[4][1]);
        } else {
            System.out.println("Akun Tidak Ditemukan");
            // dalam if else ini sering kali menggunakan {} yang dapat memperpanjang data
            // else if juga sering kali disebutkan oleh karena itu memiliki lebih panjang dibanding enhance if
        }


        // if else dalam enhance 
        int AkunGames = 5;        
        String[][] Games = {{"Origami", "TobiichiOrigami"}, {"Shido", "ItsukaShido"}, {"Kotori", "ItsukaKotori"}, {"Mana", "TakamiyaMana"}, {"Yoshino", "Yoshinon"}};
        String Akuns = (AkunGames == 0) ? "Username: " + Games[0][0] + " Password: " + Games[0][1] : //dalam data ini command yang dipake sangat singkat yaitu ? dan : ia juga sering pendek akibat tidak perlu {} yang mengakibatkan data lebih rapi
                     (AkunGames == 1) ? "Username: " + Games[1][0] + " Password: " + Games[1][1] :
                     (AkunGames == 2) ? "Username: " + Games[2][0] + " Password: " + Games[2][1] :
                     (AkunGames == 3) ? "Username: " + Games[3][0] + " Password: " + Games[3][1] :
                     (AkunGames == 4) ? "Username: " + Games[4][0] + " Password: " + Games[4][1] : "Akun Tidak Ditemukan";
        System.out.println(Akuns);
        // dalam perbandingan if else biasa dan enhance dapat di pastikan bahwa sanya barisan if else biasa memiliki 14 baris sedangkan enhance hanya memiliki 8 baris oleh karena itu 8 - 14 = 6 baris terpotong dan mengakibatkan koding lebih efisien dan lebih cepat di baca
        
    }
}
