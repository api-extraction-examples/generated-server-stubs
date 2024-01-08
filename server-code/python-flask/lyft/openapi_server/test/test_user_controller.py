import unittest

from flask import json

from openapi_server.models.api_error import ApiError  # noqa: E501
from openapi_server.models.cancellation_cost_error import CancellationCostError  # noqa: E501
from openapi_server.models.cancellation_request import CancellationRequest  # noqa: E501
from openapi_server.models.location import Location  # noqa: E501
from openapi_server.models.profile import Profile  # noqa: E501
from openapi_server.models.rating_request import RatingRequest  # noqa: E501
from openapi_server.models.ride import Ride  # noqa: E501
from openapi_server.models.ride_detail import RideDetail  # noqa: E501
from openapi_server.models.ride_receipt import RideReceipt  # noqa: E501
from openapi_server.models.ride_request import RideRequest  # noqa: E501
from openapi_server.models.ride_request_error import RideRequestError  # noqa: E501
from openapi_server.models.rides_response import RidesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserController(BaseTestCase):
    """UserController integration test stubs"""

    def test_cancel_ride(self):
        """Test case for cancel_ride

        Cancel a ongoing requested ride
        """
        request = {"cancel_confirmation_token":"656a91d"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides/{id}/cancel'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_profile(self):
        """Test case for get_profile

        The user's general info
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profile',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ride(self):
        """Test case for get_ride

        Get the ride detail of a given ride ID
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ride_receipt(self):
        """Test case for get_ride_receipt

        Get the receipt of the rides.
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides/{id}/receipt'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_rides(self):
        """Test case for get_rides

        List rides
        """
        query_string = [('start_time', '2013-10-20T19:20:30+01:00'),
                        ('end_time', '2013-10-20T19:20:30+01:00'),
                        ('limit', 10)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_new_ride(self):
        """Test case for new_ride

        Request a Lyft
        """
        request = {"origin":"{}","cost_token":"cost_token","destination":"{}","primetime_confirmation_token":"primetime_confirmation_token"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides',
            method='POST',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_ride_destination(self):
        """Test case for set_ride_destination

        Update the destination of the ride
        """
        request = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides/{id}/destination'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_ride_rating(self):
        """Test case for set_ride_rating

        Add the passenger's rating, feedback, and tip
        """
        request = {"feedback":"Great ride!","rating":5,"tip":{"amount":100,"currency":"USD"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/rides/{id}/rating'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
