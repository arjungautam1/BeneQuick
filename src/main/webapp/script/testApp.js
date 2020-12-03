angular.module('bqTestModule', [])
    .controller('FetchController', ['$scope', '$http',
        function ($scope, $http) {

            fetchData();

            function fetchData() {
                $http({method: 'GET', url: 'api/load-data'}).then(function (response) {
                    console.log(response.data);
                }, function (reason) {
                    console.log('error ' + reason)
                });
            }

        }]);
