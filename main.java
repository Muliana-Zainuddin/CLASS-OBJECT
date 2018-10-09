
public class main {
	public static void main(String[] args) {
		System.out.println("------Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(12.24);
		main.setlebar(5.10);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
			
		System.out.println("------Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Muliana";
		mahasiswa.nim = "D0217322";
		mahasiswa.alamat = "Baurung";
		mahasiswa.golonganDarah = "--";
		mahasiswa.status = "pelajar";
		mahasiswa.tinggiBadan = "160";
		mahasiswa.beratBadan = "49";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "Maybelin";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "Muliana";
		stack.value[1] = "Nurlinah";
		stack.value[2]= "Nadra";
		stack.value[3]= "Yuliana";
		stack.value[4]= "Nilasari";
		stack.value[5]= "Rosalina";
		stack.value[6]= "Marwah";
		stack.value[7]= "Nirma";
		stack.value[8]= "Ramlah";
		stack.value[9]= "Risdayanti";
		stack.value[10]= "Sri wahyuni";
		stack.value[11]= "Aswandi";
		stack.value[12]= "Aswad";
		stack.value[13]= "Muh mohar";
		stack.value[14]= "Herianto";
		stack.value[15]= "Muh sadly ramli";
		stack.value[16]= "M jaimuddin";
		stack.value[17]= "Faeruddin";
		stack.value[18]= "Ruslan";
		stack.value[19]= "Muh akbar";
		stack.value[20]= "Subhan tarman";
		stack.value[21]= "Udin";
		stack.value[22]= "Firman";
		stack.value[23]= "Faturusi";
		stack.value[24]= "Jumardi";
		stack.value[25]= "Arnoldus renaldi";
		stack.value[26]= "Mensi jenjaka";
		stack.value[27]= "Wahyuddin";
		stack.value[28]= "Muh tasbi Zainuddin";
		stack.value[29]= "Muh amin zainuddin";
		stack.value[30]= "Muh ilham zainuddin";
		stack.value[31]= "Umar zainuddin";
		stack.value[32]= "Usman zainuddin";
		stack.value[33]= "Rahman zainuddin";
		stack.value[34]= "Zuhaeria";
		stack.value[35]= "Bitha azzahra tasbi";
		stack.value[36]= "Muhammad alif a";
		stack.value[37]= "Muhammad maruf a";
		stack.value[38]= "Nur aqilah azzahra I";
		stack.value[39]= "Nur afikha amanda I";
		stack.value[40]= "Niti astuti";
		stack.value[41]= "Nur aidah";
		stack.value[42]= "Gunawan";
		stack.value[43]= "Muh Ikhsan";
		stack.value[44]= "Ardiansyah";
		stack.value[45]= "Akhsan";
		stack.value[46]= "Amalia";
		stack.value[47]= "Irma";
		stack.value[48]= "Irmayanti";
		stack.value[49]= "Nur hikma hasnur";
		stack.value[51]= "Indra wahyuni";
		stack.value[52]= "Hijriah";
		stack.value[53]= "Maghfira";
		stack.value[54]= "Nurul erika davina";
		stack.value[55]= "Rahmadani";
		stack.value[56]= "Anni izzatul jannah";
		stack.value[57]= "Adelia lestari";
		stack.value[58]= "Hurul aini";
		stack.value[59]= "Muh andi";
		stack.value[60]= "Muh alif mandar";
		stack.value[61]= "Muh martono";
		stack.value[62]= "Ahmad";
		stack.value[63]= "Kurniah";
		stack.value[64]= "Mariana";
		stack.value[65]= "Mariani";
		stack.value[66]= "Nisma";
		stack.value[67]= "Masita";
		stack.value[68]= "Nurmadina";
		stack.value[69]= "Fitri";
		stack.value[70]= "Muliadi";
		stack.value[71]= "Muh sukri";
		stack.value[72]= "Junaedi";
		stack.value[73]= "Nasri";
		stack.value[74]= "Hasrul";
		stack.value[75]= "Zainuddin";
		stack.value[76]= "Sahara";
		stack.value[77]= "Nurdina";
		stack.value[78]= "Kamariah";
		stack.value[79]= "Bahariah";
		stack.value[80]= "Masnia";
		stack.value[81]= "Rusli";
		stack.value[82]= "Suardi";
		stack.value[83]= "Budi";
		stack.value[84]= "Fatmawati";
		stack.value[85]= "Satria";
		stack.value[86]= "Abd aziz";
		stack.value[87]= "Darwis";
		stack.value[88]= "Tahmi D";
		stack.value[89]= "Mihmu D";
		stack.value[90]= "Najiba D";
		stack.value[91]= "Imun D";
		stack.value[92]= "Putri";
		stack.value[93]= "Rahmayana";
		stack.value[94]= "Cici mandar iriani";
		stack.value[95]= "Nurmaulidya yusup";
		stack.value[96]= "Nurul ade novita";
		stack.value[97]= "Iren nurhalisa haq";
		stack.value[98]= "Zulkarnain";
		stack.value[99]= "Zulkifli";
		stack.setvalueAt(4 ,"Yuliana");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};



	}

}
