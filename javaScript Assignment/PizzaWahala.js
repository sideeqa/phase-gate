
const prompt = require("prompt-sync")()

const pizzaMenu = {
    small: { slices: 6, price: 2000 },
    medium: { slices: 8, price: 3000 },
    big: { slices: 10, price: 3500 },
    odogwu: { slices: 12, price: 4200 }
};

let people = parseInt(prompt("Enter number of people: "));
let pizzaType = prompt("Enter pizza type (Small, Medium, Big, Odogwu): ").toLowerCase(


if (!pizzaMenu[pizzaType]) {
    console.log("Invalid pizza type selected.");
} else {
    let slicesPerBox = pizzaMenu[pizzaType].slices;
    let pricePerBox = pizzaMenu[pizzaType].price;

    
    let boxes = Math.ceil(people / slicesPerBox);

    
    let totalSlices = boxes * slicesPerBox;

    
    let leftover = totalSlices - people;

    
    let totalPrice = boxes * pricePerBox;

    
    console.log("\n--- ORDER SUMMARY ---");
    console.log(`Number of boxes of pizza to buy = ${boxes} boxes`);
    console.log(`Number of slices left over after serving = ${leftover} slices`);
    console.log(`Total price = ₦${totalPrice}`);
}
