// SINGLETON OBJECT
// OBJECT LITERALS 
const mysym=Symbol("key1")
const jsuser={
    name:"aditya",
    age:18,
    location:"Delhi",
    [mysym]:"mykey1",
    email:"adityasingh9a4@wed",
    isloggedin:false,
    lastdayslogin:["monday","tuesday"]
}
// 

jsuser.email="adsdsdssx@"
// Object.freeze(jsuser)
jsuser.email="qewqedw@"
// console.log(jsuser)
jsuser.greeting=function(){
    console.log("hello js user")
}
jsuser.greetingtwo=function(){
    console.log(`hello js user,${this.name}`)
}
console.log(jsuser.greeting())
console.log(jsuser.greetingtwo())