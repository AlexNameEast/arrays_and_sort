import sort.SelectionSort;

public class Notebook {
    private int price;
    private int ram;
    private String model;
    private int modelNumber;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", model='" + model + "(" + modelNumber + ")" + '\'' +
                '}';
    }

    public Notebook(int price, int ram, int model) {
        this.price = price;
        this.ram = ram;
        this.modelNumber = model;
        switch (model) {
            case 1:
                this.model = "Lenuvo";
                break;
            case 2:
                this.model = "Asos";
                break;
            case 3:
                this.model = "MacNote";
                break;
            case 4:
                this.model = "Eser";
                break;
            case 5:
                this.model = "Xamiou";
                break;
        }
    }

}
