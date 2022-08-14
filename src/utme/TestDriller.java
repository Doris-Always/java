package utme;

public class TestDriller {


    private int priceForCopiesBought;





    public int quantityBought(int quantityOfCopies){

        return quantityOfCopies;
    }


    public int copiesBoughtAndPrice(int quantityOfCopies) {
        int unitPrice = 0;

        if (quantityOfCopies <= 4) {
            unitPrice = quantityOfCopies * 2000;

        } else if (quantityOfCopies <= 9) {
            unitPrice = quantityOfCopies * 1800;

        } else if (quantityOfCopies <= 29) {
            unitPrice = quantityOfCopies * 1600;

        } else if (quantityOfCopies <= 49) {

            unitPrice = quantityOfCopies * 1500;
        } else if (quantityOfCopies <= 99) {
            unitPrice = quantityOfCopies * 1300;
        } else if (quantityOfCopies <= 199) {
            unitPrice = quantityOfCopies * 1200;
        } else if (quantityOfCopies <= 499) {
            unitPrice = quantityOfCopies * 1100;
        } else {
            unitPrice = quantityOfCopies * 1000;
        }


        return unitPrice;
    }

}