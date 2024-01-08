import unittest

from flask import json

from openapi_server.models.api_error import ApiError  # noqa: E501
from openapi_server.models.sandbox_driver_availability import SandboxDriverAvailability  # noqa: E501
from openapi_server.models.sandbox_primetime import SandboxPrimetime  # noqa: E501
from openapi_server.models.sandbox_ride_status import SandboxRideStatus  # noqa: E501
from openapi_server.models.sandbox_ride_type import SandboxRideType  # noqa: E501
from openapi_server.models.sandbox_ride_update import SandboxRideUpdate  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSandboxController(BaseTestCase):
    """SandboxController integration test stubs"""

    def test_set_prime_time(self):
        """Test case for set_prime_time

        Preset Prime Time percentage
        """
        request = {"lat":37.7833,"lng":-122.4167,"primetime_percentage":"25%"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/sandbox/primetime',
            method='PUT',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_ride_status(self):
        """Test case for set_ride_status

        Propagate ride through ride status
        """
        request = {"status":"lyft"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/sandbox/rides/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_ride_type_availability(self):
        """Test case for set_ride_type_availability

        Driver availability for processing ride request
        """
        request = {"driver_availability":True,"lat":37.7833,"lng":-122.4167}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/sandbox/ridetypes/{ride_type}'.format(ride_type='ride_type_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_ride_types(self):
        """Test case for set_ride_types

        Preset types of rides for sandbox
        """
        request = {"lat":37.7833,"lng":-122.4167,"ride_types":["lyft","lyft_line","lyft_plus"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/sandbox/ridetypes',
            method='PUT',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
