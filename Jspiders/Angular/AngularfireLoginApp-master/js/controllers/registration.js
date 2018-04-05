myApp.controller('RegistrationController', ['$scope', '$firebaseAuth' , '$location' ,  'myService' , '$firebaseArray' ,
function($scope , $firebaseAuth , $location , myService , $firebaseArray) {

  $scope.username = myService.getUser();
  if($scope.username){
    $location.path("/success");
  }

  $scope.login = function() {
    $scope.message = "Welcome " + $scope.user.email;
    var username = $scope.user.email;
    var password = $scope.user.password;
    var auth = $firebaseAuth();

    auth.$signInWithEmailAndPassword(username , password).then(function(){
      console.log("succusfully logged in");
      myService.setUser($scope.user.email);
      $location.path("/success");
    }).catch(function(err){
      console.log(err);
      $scope.errMsg = true;
      $scope.errorMessage = err.message;
    });
}; //login

var auth = $firebaseAuth();
auth.$onAuthStateChanged(function(firebaseUser){
  if(firebaseUser){
    console.log("signed in " , firebaseUser.uid);
  }else {
    console.log("signed out");
  }
}); //onAuthMethod

  $scope.register = function() {
    $scope.message = "Welcome " + $scope.user.firstname;
    var username = $scope.user.email;
    var password = $scope.user.password;
    var auth = $firebaseAuth();
    
    if(username && password){
      auth.$createUserWithEmailAndPassword(username , password).then(function(){
        console.log("succusfully created");
        $scope.message = "Hi " + $scope.user.firstname + " , Thanks for registering";
        $location.path("/login");

      }).catch(function(err){
        console.log(err);
        $scope.errMsg = true;
        $scope.errorMessage = err.message;
      });
    };  
}; //register


//addpost

}]); // controller code is ending here

// normal service for set user

myApp.service("myService" , ["$location" , "$firebaseAuth" , function($location , $firebaseAuth){

  var user = "";
  var auth = $firebaseAuth();
  return {
    getUser : function(){
      if(user == ""){
        user = localStorage.getItem("userEmail");
      }
      return user;
    },
    setUser : function(value){
      localStorage.setItem("userEmail" , value);
      user = value;
    },
    logoutUser : function(){
      auth.$signOut().then(function(){
        console.log("signout");
          user = "";
          localStorage.removeItem("userEmail");
          localStorage.clear();
          $location.path("/login");

      }).catch(function(err){
        console.log(err);
      });
    }
  };

}]); //service code is ending here