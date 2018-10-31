import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		Mahasiswa.add("MULIANA");
		Mahasiswa.add("NADRA");
		Mahasiswa.add("NARTI");
		Mahasiswa.add("NILASARI");
		Mahasiswa.add("RAHMAYANA");
		
		ArrayList<String> Mahasiswa1 = Mahasiswa;
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		Mahasiswa.remove(2);
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		}

	}

