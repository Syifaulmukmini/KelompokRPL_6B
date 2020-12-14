import java.util.Scanner;
public class TiketStadion{
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		String nama, email, tiket, noHp, hp, confirm;
		int pilih,pilihan;
		int price = 0;
		int jmlah = 0;
		boolean repeat = false;

	do{
		repeat = false;
		System.out.println("***************************************************************");
		System.out.println("				WELCOME								   ");
		System.out.println("***************************************************************");
		System.out.println(" ");
		System.out.println("Jadwal Pertandingan");
		System.out.println(" ");
		System.out.println("No. 	Time	Name");
		System.out.println(" ");
		System.out.println("1. 	Today:  Persija Jakarta VS Persipura Jayapura");
		System.out.println("2. 	Today:  PSM Makasar VS Borneo Fc");
		System.out.println("3. 	Today:  Arema Fc VS Bhayangkara Fc");
		System.out.println(" ");

		System.out.print("Pilih Pertandingan : ");
		pilih = scan.nextInt();

		if(pilih == 1 || pilih == 2 || pilih == 3){
			System.out.println(" ");
			System.out.print("Input Nama: ");
			nama = scan.next();
			System.out.print("Input Email: ");
			email = scan.next();
			System.out.print("Input No Hp: ");
			hp = scan.next();

				/*ystem.out.println(" ");
				System.out.println("Nama: " + nama);
				System.out.println("Email: " + email);
				System.out.println("No Hp: " + hp);*/

			System.out.println(" ");
			System.out.println("Daftar harga tiket");
			System.out.println(" ");
			System.out.println("No. 	Zone	Price");
			System.out.println(" ");
			System.out.println("1. 	South:  Rp. 100.000");
			System.out.println("2. 	West :  Rp. 150.000");
			System.out.println("3. 	North:  Rp. 100.000");
			System.out.println("4. 	East :  Rp. 150.000");
			System.out.println("5. 	VIP  :  Rp. 250.000");
			System.out.println("6. 	VVIP :  Rp. 400.000");
			System.out.println(" ");

			System.out.print("Pilih Tiket : ");
			pilihan = scan.nextInt();

				switch(pilihan){
					case 1: 
						System.out.println(" ");
						System.out.print("Input Jumlah: ");
						jmlah = scan.nextInt();
						price = (jmlah * 100000);

						if (jmlah > 4) {
							System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
							repeat = true;
						}
						else{
							System.out.println(" ");
							System.out.println("Zone        : South" );
							System.out.println("Price       : Rp. " + price);
							System.out.println("Jumlah tiket: " + jmlah);

							System.out.println(" ");
							System.out.println("Konfirmasi Pemesanan");
							System.out.println(" ");
							System.out.println("Nama: " + nama);
							System.out.println("Email: " + email);
							System.out.println("No Hp: " + hp);
							System.out.println(" ");
							System.out.println("Zone        : VVIP" );
							System.out.println("Price       : Rp. " + price);
							System.out.println("Jumlah tiket: " + jmlah);
							break;
						}
					case 2: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 150000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								repeat = true;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : West" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);

								System.out.println(" ");
								System.out.println("Konfirmasi Pemesanan");
								System.out.println(" ");
								System.out.println("Nama: " + nama);
								System.out.println("Email: " + email);
								System.out.println("No Hp: " + hp);
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								break;
							}
					case 3: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 100000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								repeat = true;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : North" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);

								System.out.println(" ");
								System.out.println("Konfirmasi Pemesanan");
								System.out.println(" ");
								System.out.println("Nama: " + nama);
								System.out.println("Email: " + email);
								System.out.println("No Hp: " + hp);
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								break;
							}
					case 4: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 150000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								repeat = true;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : East" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);

								System.out.println(" ");
								System.out.println("Konfirmasi Pemesanan");
								System.out.println(" ");
								System.out.println("Nama: " + nama);
								System.out.println("Email: " + email);
								System.out.println("No Hp: " + hp);
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								break;
							}
					case 5: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 250000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								repeat = true;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : VIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);

								System.out.println(" ");
								System.out.println("Konfirmasi Pemesanan");
								System.out.println(" ");
								System.out.println("Nama: " + nama);
								System.out.println("Email: " + email);
								System.out.println("No Hp: " + hp);
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								break;
							}
					case 6: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 400000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								repeat = true;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);

								System.out.println(" ");
								System.out.println("Konfirmasi Pemesanan");
								System.out.println(" ");
								System.out.println("Nama: " + nama);
								System.out.println("Email: " + email);
								System.out.println("No Hp: " + hp);
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								System.out.println(" ");
								break;
							}
					default:
							System.out.println("Tidak ada pilihan tersebut");
							repeat = true;
				}
					System.out.println(" ");
					System.out.print("Konfirmasi?");
					confirm = scan.next();
					System.out.println(" ");
					if(confirm.equals("Y")){
						System.out.println("Pilih metode pembayaran:");
						System.out.println("1. Transfer Bank");
						System.out.println("2. Indomaret atau Alfamart");
						System.out.print("Pilih: ");
						int metode = scan.nextInt();

						//String convertHarga = hargain;
						String ambilNama = nama.substring(0, 2); 
						String ambilHp =hp.substring(8);
						String ambilEmail =email.substring(0, 6); 
						//String totalinPart2 = Integer.toString(totalin);
						

						if(metode == 1){
							System.out.println(" ");
							System.out.println("Cara Pembayaran melalu Transfer Bank");
							System.out.println("1. Pilih Bank");
							System.out.println("2. Masukan kode bank");
							System.out.println("3. Masukan no Hp anda yang sudah terdaftar");
							System.out.println("4. Masukan Jumlah Sesuai yang diminta");
							System.out.println("5. Transaksi Selesai");
						}
						else if (metode == 2) {
							System.out.println("Berikut unique code kamu " +ambilNama.toUpperCase()+ambilHp.toUpperCase()+ambilEmail.toUpperCase());
						}else{
							System.out.println("Pilihan tidak ada");
							repeat = true;
						}

					}
				System.out.println(" ");
				System.out.println("Lakukan pembayaran sebelum 24 jam! jika tidak transaksi anda akan dibatalkan");
				System.out.println("...........");
				System.out.println("Tiket anda akan langsung dikirim apabila proses pembayaran telah selesai");
				System.out.println("Tiket dikirimkan melalu Email anda");
				System.out.println("Terima Kasih!");

				break;
		}else{
			System.out.println("Maaf pilihan pertandingan tidak sesuai");
			System.out.println("");
			repeat = true;
		}
	}while(repeat);
	}
}