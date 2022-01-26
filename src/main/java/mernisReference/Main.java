package mernisReference;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean result;
        CMBKPSPublicSoap client = new CMBKPSPublicSoap();
        result = client.TCKimlikNoDogrula(Long.parseLong("1111111111"), "Tuğba", "Yavuz", 1996);
        System.out.println(result);
    }
}
