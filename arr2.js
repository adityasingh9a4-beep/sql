const myarr=[0,1,2,3,4,5]
const myheroes=["shaktiman","raju"]
// myarr.push(myheroes)
// console.log(myarr)
// console.log(myarr[3][1])
// gives nested array
const newrr=myarr.concat(myheroes)
console.log(newrr)
// neww array to perform concatenation while push modify exisitng arr
const allnew=[...myarr,...myheroes]
console.log(allnew)
const another_arr=[1,2,3,4,[7,8,9],10,[11,12,[23,54]]]
console.log(another_arr)
const real_another=another_arr.flat(Infinity)
console.log(real_another)
console.log(Array.isArray("Aditya"))
console.log(Array.from("Aditya"))
console.log(Array.from({name: "Aditya"}))//empty array interrsting condition
let score=100
let score2=200
let score3=300
console.log(Array.of(score,score2,score3))
