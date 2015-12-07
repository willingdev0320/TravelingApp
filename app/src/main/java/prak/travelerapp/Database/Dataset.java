package prak.travelerapp.Database;

/**
 * Created by marcel on 24.11.15.
 *
 * Entspricht dem Aufbau eines Datensatzes der Tabelle
 */
public class Dataset {

    private long itemID;
    private String itemName;
    private int geschlecht; // 0 für "Neutral" , 1 für "Mann", 2 für "Frau"
    private int trocken; // 0 für "Nein", 1 für "Ja"
    private int strandurlaub;  // 0 für "Nein", 1 für "Ja"
    private int staedtetrip;  // 0 für "Nein", 1 für "Ja"
    private int skifahren;  // 0 für "Nein", 1 für "Ja"
    private int wandern;  // 0 für "Nein", 1 für "Ja"
    private int geschaeftsreise;  // 0 für "Nein", 1 für "Ja"
    private int partyurlaub;  // 0 für "Nein", 1 für "Ja"
    private int camping;  // 0 für "Nein", 1 für "Ja"
    private int festival;  // 0 für "Nein", 1 für "Ja"
    private int kategorie; // 0 für "Kleidung", 1 für "Hygiene", 2 für "Equipment", 3 für "Dokumente"

    public Dataset(long itemID, String itemName, int geschlecht, int trocken,
                   int strandurlaub, int staedtetrip, int skifahren, int wandern,
                   int geschaeftsreise, int partyurlaub, int camping, int festival, int kategorie) {

        this.itemID = itemID;
        this.itemName = itemName;
        this.geschlecht = geschlecht;
        this.trocken = trocken;
        this.strandurlaub = strandurlaub;
        this.staedtetrip = staedtetrip;
        this.skifahren = skifahren;
        this.wandern = wandern;
        this.geschaeftsreise = geschaeftsreise;
        this.partyurlaub = partyurlaub;
        this.camping = camping;
        this.festival = festival;
        this.kategorie = kategorie;

    }

    public long getItemID() {
        return itemID;
    }

    public void setItemID(long itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(int geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getTrocken() {
        return trocken;
    }

    public void setTrocken(int trocken) {
        this.trocken = trocken;
    }

    public int getStrandurlaub() {
        return strandurlaub;
    }

    public void setStrandurlaub(int strandurlaub) {
        this.strandurlaub = strandurlaub;
    }

    public int getStaedtetrip() {
        return staedtetrip;
    }

    public void setStaedtetrip(int staedtetrip) {
        this.staedtetrip = staedtetrip;
    }

    public int getSkifahren() {
        return skifahren;
    }

    public void setSkifahren(int skifahren) {
        this.skifahren = skifahren;
    }

    public int getWandern() {
        return wandern;
    }

    public void setWandern(int wandern) {
        this.wandern = wandern;
    }

    public int getGeschaeftsreise() {
        return geschaeftsreise;
    }

    public void setGeschaeftsreise(int geschaeftsreise) {
        this.geschaeftsreise = geschaeftsreise;
    }

    public int getPartyurlaub() {
        return partyurlaub;
    }

    public void setPartyurlaub(int partyurlaub) {
        this.partyurlaub = partyurlaub;
    }

    public int getFestival() {
        return festival;
    }

    public void setFestival(int festival) {
        this.festival = festival;
    }

    public int getCamping() {
        return camping;
    }

    public void setCamping(int camping) {
        this.camping = camping;
    }

    public int getKategorie() { return kategorie; }

    public void setKategorie(int kategorie) { this.camping = camping; }

    @Override
    public String toString() {

        String output = itemName;
        return output;
    }

}
