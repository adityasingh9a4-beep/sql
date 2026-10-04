// function saymyname(){
//     console.log("a");
// console.log("b");
// console.log("c");
// console.log("d");
// console.log("e");
// console.log("f");
// }
// // saymyname()  
// // function addnum(num1,num2){
// //    console.log(num1+num2);}
// function addnum(num1,num2){
//     // let result=num1+num2;
//    return num1+num2}
//    addnum(10,40)
//   const result= addnum(10,33)
// //   console.log(result)
// function loginmessage(username="adity"){
    
//     // if(username===undefined){
//     //     console.log("please enter the username");
//     //     return

//     // }
    
//     if(!username){
//         console.log("please enter the username");
//         return

//     }
//     return `${username} just logged in`
// }

// //  console.log(loginmessage("aditya"))
// console.log(loginmessage()) 
function CalculatePrice(val1,val2,...num1){
    return num1
}
console.log(CalculatePrice(200,300,400,4000))
const user={
    username:"aditya",
    price:199
}
function handleObject(anyObject){
    console.log(`Username is ${anyObject.username} and price is ${anyObject.price}`);
}
// handleObject(user)
handleObject(
    {
        username:"sam",
        price:3454
    }
)
const myarr=[200,300,400]
function returnsecond(getarr){
    return getarr[1];
}
console.log(returnsecond(myarr))