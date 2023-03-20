Team = [
  "Dhoni",
  "virat",
  "Ashwin",
  "Raina",
  "Jadeja",
  "Smith",
  "Gayle",
  "Sachin",
  "rahul",
  "karthick",
  "smrithi",
];
console.log(Team);
Team.shift();
console.log(Team);
Team.push("Shree");
console.log(Team);
Team.sort();
console.log(Team);
// Team = new Map([
//   ["Jersy_1", "Ashwin"],
//   ["Jersy_2", "Gayle"],
//   ["Jersy_3", "Jadeja"],
//   ["Jersy_4", "Raina"],
//   ["Jersy_5", "Sachin"],
//   ["Jersy_6", "Shree"],
//   ["Jersy_7", "Smith"],
//   ["Jersy_8", "karthick"],
//   ["Jersy_9", "rahul"],
//   ["Jersy_10", "smrithi"],
//   ["Jersy_11", "virat"],
// ]);
// Jersy = "  ";
// Team.forEach(function (value, key) {
//   Jersy += key + " = " + value + "  ";
// });
// console.log(Jersy);
Name = "  ";
Team.forEach(function (value) {
  Name += value.toUpperCase() + "  ";
});
console.log(Name);

function Random_Num(Team) {
  Jersy = [];
  while(Jersy.length<Team.length){
  randomNumbers = Math.floor(Math.random()*11);
    if(!Jersy.includes(randomNumbers)){
      Jersy.push(randomNumbers);
  }
  console.log(randomNumbers);
}
  return Jersy;
}
Jersy=Random_Num(Team);
for(let i=0;i<Team.length;i++){
  console.log(Team[i]+"-"+Jersy[i])
}

