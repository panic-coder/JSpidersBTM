var app = angular.module("myApp" , []);

app.controller("myCtr" , function($scope, $http){
	$http.get("data.json").then(function(item){
		$scope.players = item.data;
	});
/*	$scope.test = [
	{
		name : "dinga",
		company : "testyantra",
		skill : "angularjs"
	},
	{
		name : "dinga",
		company : "testyantra",
		skill : "angularjs"
	},
	{
		name : "dinga",
		company : "testyantra",
		skill : "angularjs"
	}
	];*/
});