function calculatePayment(successfulDeliveries) {
    const totalPackages = 100;
    const basePay = 5000;
    let amountPerParcel;

    
    const rate = (successfulDeliveries / totalPackages) * 100;

    
    if (rate < 50) {
        amountPerParcel = 160;
    } else if (rate >= 50 && rate <= 59) {
        amountPerParcel = 200;
    } else if (rate >= 60 && rate <= 69) {
        amountPerParcel = 250;
    } else { // >= 70%
        amountPerParcel = 500;
    }

    
    return basePay + (successfulDeliveries * amountPerParcel);
}
