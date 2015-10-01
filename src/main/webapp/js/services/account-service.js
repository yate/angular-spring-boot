var services = angular.module('services', ['ngResource']);

services.factory('Account', ['$resource', function($resource) {
	return $resource('accounts');
}]);