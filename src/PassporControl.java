import java.util.HashMap;

public class PassporControl {
    public static String collectionOfPassports(String key){
        HashMap<String, String> collectionOfPassports = new HashMap();
        collectionOfPassports.put("GC07D-FU8AR"," Passport: GC07D-FU8AR \n Name: Walter Martinez \n Age: 23 \n");
        collectionOfPassports.put("GV07D-FD5AR"," Passport: GV07D-FD5AR \n Name: Kathleen Hernandez \n Age: 23 \n");
        collectionOfPassports.put("SC34E-FC8AR"," Passport: SC34E-FC8AR \n Name: Jessica Dean \n Age: 23 \n");
        collectionOfPassports.put("WC57D-6UY5R"," Passport: WC57D-6UY5R \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("X7858-4H258"," Passport: X7858-4H258 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("H4771-PY711"," Passport: H4771-PY711 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("EI524-BU686"," Passport: EI524-BU686 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("VZ622-0H277"," Passport: VZ622-0H277 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("RE515-JA381"," Passport: RE515-JA381 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("YA722-OD637"," Passport: YA722-OD637 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("4HD64-GZ429"," Passport: 4HD64-GZ429 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("HS793-XM268"," Passport: HS793-XM268 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("GC07D-KN425"," Passport: GC07D-KN425 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("EP976-FU8AR"," Passport: EP976-FU8AR \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("2E893-NV552"," Passport: 2E893-NV552 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("NT692-FU8AR"," Passport: NT692-FU8AR \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("IS471-ND668"," Passport: IS471-ND668 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("OC496-UZ931"," Passport: OC496-UZ931 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("EI572-QX769"," Passport: EI572-QX769 \n Name: Alex \n Age: 23 \n");
        collectionOfPassports.put("SE187-F3672"," Passport: SE187-F3672 \n Name: Alex \n Age: 23 \n");


        return collectionOfPassports.get(key);
    }
    public static void main(String[] args) {

        HashMap<String, String> unverifiedPassports = new HashMap();
        unverifiedPassports.put("GC07D-FU8AR"," Passport: GC07D-FU8AR \n Name: Alex \n Age: 25 \n");
        System.out.println();
        System.out.println(unverifiedPassports.get("GC07D-FU8AR"));
    }
}
