public class Material {

    private String itemName;
    private int totalCountNeeded;

    public Material(String itemName, int totalCountNeeded){
        this.itemName = itemName;
        this.totalCountNeeded = totalCountNeeded;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setTotalCountNeeded(int totalCountNeeded) {
        this.totalCountNeeded = totalCountNeeded;
    }

    public int getTotalCountNeeded() {
        return totalCountNeeded;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "Material{" +
                "itemName='" + itemName + '\'' +
                ", totalCountNeeded=" + totalCountNeeded +
                '}';
    }
}
