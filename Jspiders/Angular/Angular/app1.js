var app = angular.module("myApp" , []);

/*my.filter("shashi",function(){
  return function(input, limit){
    if(isNaN(limit) || limit == ""){
      return input;
  }else{
    return input.substring(0,limit).toUpperCase();
    }
  }
});*/




app.controller("myCtr" , function($scope){

$scope.test=[
    {
        Fisrname:"abc",
        lastname:"xyz",
        Comapany:"jsspider",
        age:23,
        salary:20000,
        DoB:new Date("2015-03-25"),
        designation:"web developer"
    },
    {
        Fisrname:"vidya",
        lastname:"xyz",
        Comapany:"jsspider",
        age:23,
        salary:20000,
        DoB:new Date("2015-03-25"),

        designation:"web developer"
    },
    {
        Fisrname:"nalina",
        lastname:"xyz",
        Comapany:"jsspider",
        age:23,
        salary:20000,
        DoB:new Date("2015-03-25"),

        designation:"web developer"
    }

]
});

app.controller('MainCtrl', function($scope) {
    $scope.orderByField = 'firstName';
    $scope.reverseSort = false;
  
    $scope.data = {
      employees: [{
        firstName: 'John',
        lastName: 'Doe',
        age: 30
      },{
        firstName: 'Frank',
        lastName: 'Burns',
        age: 54
      },{
        firstName: 'Sue',
        lastName: 'Banter',
        age: 21
      }]
    };
  });

function myfuction(){
    var name=document.getElementById("name").value="Nalina";
    var email=document.getElementById("email").value="nalina@gmail.com"
    var num = document.getElementById("num").value="7689798"; 
}
var gold=document.getElementById("gold");
  var silver=document.getElementById("silver");
 gold.addEventListener("click" , function(){
document.getElementById("ticket").value="200";
 });
 silver.addEventListener("click" , function(){
    document.getElementById("ticket").value="300";
     });