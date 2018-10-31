import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
		Data.add(new Mahasiswa("MULIANA", "D0217323", "INFORMATIKA B", "BAURUNG"));
		Data.add(new Mahasiswa("NADRA", "D0217512", "INFORMATIKA B", "SEPABATU"));
		Data.add(new Mahasiswa("NILASARI", "D0217322", "INFORMATIKA B", "SENDANA"));
		Data.add(new Mahasiswa("NURLINAH", "D0217326", "INFORMATIKA B", "SIMULLU"));
		
		Data.forEach(data ->{;
			System.out.println("Nama : " + data.getNama() + ", Nim : " + data.getNim() + ", Kelas : " + data.getKelas() + ", Alamat :  " + data.getAlamat());
		});
		
	}

}
