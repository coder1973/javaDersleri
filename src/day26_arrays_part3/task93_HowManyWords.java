package day26_arrays_part3;

public class task93_HowManyWords {

	public static void main(String[] args) {
		String str = "Meşruti monarşi ile yönetilen bir Avrupa ülkesidir. "
		           + "Hollanda nüfus yoğunluğu fazla olan bir ülkedir. Ülke topraklarının çoğunluğu "
		           + "deniz seviyesinin altındadır. Hollanda Avrupa Birliği, NATO, OECD üyesidir. "
		           + "Hollanda aynı zamanda Schengen Bölgesi ve Benelüks topluluğunun bir parçasıdır. "
		           + "Belçika ve Lüksemburg ile birlikte Benelüks ülkelerini oluşturan 3 ülkeden biridir. "
		           + "Ayrıca Kyoto Sözleşmesi'ni imzalamıştır. Ülke Eski Yugoslavya Uluslararası Ceza Mahkemesi'ne, "
		           + "Uluslararası Adalet Divanı'na Uluslararası Ceza Mahkemesi'ne ve Europol'e ev sahipliği "
		           + "yapmaktadır.";

		
		String[] arr = str.split(" ");
		
		System.out.println(arr.length);
		
		for (String value : arr) {
			System.out.println(value);
			
		}
	}

}
