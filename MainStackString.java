
public class MainStackString {
	public static void main(String[] args) {
		StackString Nama = new StackString();
		Nama.Cetak();
		
		Nama.push("MULIANA");Nama.Cetak();
		Nama.push("NADRA");Nama.Cetak();
		Nama.push("NARTI");Nama.Cetak();
		Nama.push("NILASARI");Nama.Cetak();
		Nama.push("RAHMAYANA");Nama.Cetak();
		
		String nm1 = Nama.pop();Nama.Cetak();
		System.out.println(nm1);
		String nm2 = Nama.pop();Nama.Cetak();
		System.out.println(nm2);
		String nm3 = Nama.pop();Nama.Cetak();
		System.out.println(nm3);
		String nm4 = Nama.pop();Nama.Cetak();
		System.out.println(nm4);
		String nm5 = Nama.pop();Nama.Cetak();
		System.out.println(nm5);

	}

}
