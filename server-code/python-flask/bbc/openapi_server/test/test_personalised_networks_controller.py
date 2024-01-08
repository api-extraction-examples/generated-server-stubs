import unittest

from flask import json

from openapi_server.models.body2 import Body2  # noqa: E501
from openapi_server.models.body3 import Body3  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.personalised_networks_response import PersonalisedNetworksResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPersonalisedNetworksController(BaseTestCase):
    """PersonalisedNetworksController integration test stubs"""

    def test_my_networks_follows_delete(self):
        """Test case for my_networks_follows_delete

        Unfollow network
        """
        body = openapi_server.Body3()
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/networks/follows',
            method='DELETE',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_my_networks_follows_get(self):
        """Test case for my_networks_follows_get

        List of followed networks
        """
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/networks/follows',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_my_networks_follows_post(self):
        """Test case for my_networks_follows_post

        Follow network
        """
        body = openapi_server.Body2()
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/networks/follows',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
