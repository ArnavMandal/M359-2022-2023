package U5_CLASS_WRITING.Lab;

public class Theme_Park {
    private String name;

    private Area area1;
    private Area area2;
    private Area area3;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Area getArea1() {
        return area1;
    }
    public void setArea1(Area area1) {
        this.area1 = area1;
    }
    public Area getArea2() {
        return area2;
    }
    public void setArea2(Area area2) {
        this.area2 = area2;
    }
    public Area getArea3() {
        return area3;
    }
    public void setArea3(Area area3) {
        this.area3 = area3;
    }

    public Theme_Park(String name, Area area1, Area area2, Area area3) {
        this.name = name;
        this.area1 = area1;
        this.area2 = area2;
        this.area3 = area3;
    }
}
