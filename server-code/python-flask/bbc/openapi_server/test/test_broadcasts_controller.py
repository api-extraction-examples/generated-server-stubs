import unittest

from flask import json

from openapi_server.models.broadcasts_response import BroadcastsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBroadcastsController(BaseTestCase):
    """BroadcastsController integration test stubs"""

    def test_broadcasts_get(self):
        """Test case for broadcasts_get

        Broadcasts
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('service_id', 'service_id_example'),
                        ('date', '_date_example'),
                        ('sort', 'sort_example')]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/broadcasts',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_broadcasts_latest_get(self):
        """Test case for broadcasts_latest_get

        Latest Broadcasts
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('service_id', 'service_id_example'),
                        ('on_air', 'on_air_example'),
                        ('next', 'next_example'),
                        ('previous', 'previous_example'),
                        ('sort', 'sort_example')]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/broadcasts/latest',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_broadcast_by_pid(self):
        """Test case for get_broadcast_by_pid

        Broadcasts by PID
        """
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/broadcasts/{pid}'.format(pid='pid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
