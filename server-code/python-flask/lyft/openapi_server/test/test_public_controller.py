import unittest

from flask import json

from openapi_server.models.api_error import ApiError  # noqa: E501
from openapi_server.models.cost_estimate_response import CostEstimateResponse  # noqa: E501
from openapi_server.models.eta_estimate_response import EtaEstimateResponse  # noqa: E501
from openapi_server.models.nearby_drivers_response import NearbyDriversResponse  # noqa: E501
from openapi_server.models.ride_types_response import RideTypesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPublicController(BaseTestCase):
    """PublicController integration test stubs"""

    def test_get_cost(self):
        """Test case for get_cost

        Cost estimates
        """
        query_string = [('ride_type', 'ride_type_example'),
                        ('start_lat', 3.4),
                        ('start_lng', 3.4),
                        ('end_lat', 3.4),
                        ('end_lng', 3.4)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/cost',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_drivers(self):
        """Test case for get_drivers

        Available drivers nearby
        """
        query_string = [('lat', 3.4),
                        ('lng', 3.4)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/drivers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_eta(self):
        """Test case for get_eta

        Pickup ETAs
        """
        query_string = [('lat', 3.4),
                        ('lng', 3.4),
                        ('destination_lat', 3.4),
                        ('destination_lng', 3.4),
                        ('ride_type', 'ride_type_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/eta',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ride_types(self):
        """Test case for get_ride_types

        Types of rides
        """
        query_string = [('lat', 3.4),
                        ('lng', 3.4),
                        ('ride_type', 'ride_type_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/ridetypes',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
