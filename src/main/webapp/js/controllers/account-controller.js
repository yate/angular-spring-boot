var controllers = angular.module('controllers', ['services']);

controllers.controller('AccountCtrl', ['$scope', 'Account', function($scope, Account) {
	$scope.accounts = Account.query();
}]);