function DisplayNum(){
    for(let i=1;i<=100;i++){
        console.log(i);
    }
}
DisplayNum();
Dates=" ";
date=new Date();
dt=date.getDay();
month=date.getMonth();
year=date.getFullYear();
function DisplayDate(){
    
    Dates +=(dt+1) +'/'+(month+1)+'/'+(year+1);
    console.log(Dates);

}
DisplayDate();
function DisplayFh(c){
    Fahr=(c * 1.8) +32 ;
    console.log(Fahr);

}
DisplayFh(30);
function DisplayAvg(array){
    result=array.reduce((prevVal,currVal)=>prevVal+currVal)/array.length;
     console.log(result);
}
array=[1,2,3,4,5];
DisplayAvg(array);
function Reverse(str){
    result= str.split("").reverse().join("");
    console.log(result);
}
str="lava";
Reverse(str);