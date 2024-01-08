import unittest

from flask import json

from openapi_server.models.api_request import APIRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestActivityController(BaseTestCase):
    """ActivityController integration test stubs"""

    def test_get_api_activity(self):
        """Test case for get_api_activity

        Retrieve a list of API Requests that have been made.
        """
        query_string = [('limit', 50),
                        ('offset', 0)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/activity',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
