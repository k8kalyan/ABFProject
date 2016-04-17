'use strict';

/**
 * @ngdoc function
 * @name webappApp.controller:AboutCtrl
 * @description # AboutCtrl Controller of the webappApp
 */
webappApp.controller('loginCtrl', function($scope, $routeParams, $http,
		$resource,$location, $rootScope, $cookieStore) {
	
	  $scope.doLogin = function(email,password) {
		  
		  $rootScope.currentUser = email;
          $rootScope.isVisible = true;
          $cookieStore.put('loggedin', 'true');
          $location.path('/landing');
	};
});