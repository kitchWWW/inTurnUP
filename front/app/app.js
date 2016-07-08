'use strict';



var app = angular.module("app", []).controller("DraggingMarkersController",DraggingMarkersController);
function DraggingMarkersController($scope, $http) {

    $scope.list = [1,2,3,4];

    $scope.add = function(){
      $scope.list.push(staticIshHelperFunction());
      $scope.list.push($scope.val);
    }
    var hi = {};
    hi.hello = 4;
    hi.goodbye = 'byeye';
    console.log(JSON.stringify(hi));

   var url = "http://localhost:8040/data?callback=JSON_CALLBACK";

  $http.jsonp(url).
    success(function(data, status, headers, config) {
        console.log(data);
        $scope.greeting = data.content;
    }).
    error(function(data, status, headers, config) {
        $scope.error = true;
    });

}

DraggingMarkersController.prototype.zipcode = function(hello){
  console.log(hello);
  console.log('Example of better placement of functions');
}