package uz.pdp;

// Location record class
public record Location(
        String regionName,
        String districtName,
        String homeNumber
) {
    public Location {
        if (regionName == null || regionName.isBlank()) {
            regionName = "Toshkent shahar";
        }
        if (districtName == null || districtName.isBlank()) {
            districtName = "Yakkasaroy tumani";
        }
        if (homeNumber == null || homeNumber.isBlank()) {
            homeNumber = "74";
        }
    }
}
