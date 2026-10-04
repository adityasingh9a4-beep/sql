// Immediately Invoked Function Expression (IIFE)

(function chai() {
    console.log("DB connected");
})();
let name="aditya singh";

// (function aurcode() 
//     console.log("Hello World");
// })();//iffe is used in order to access the variable that are decaled inside the the local sope ouside their scope and also to avoid the global scope 
( ()=>{
    console.log(`DB connected  ${name}`);
} ) ('hitesh')