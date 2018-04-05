myapp.controller('SuccessController',  function($scope ,  $location , myService) {
    $scope.message = "welcome to ";
  
    $scope.username = myService.getUser();
    if(!$scope.username){
      $location.path("/login");
    }
});