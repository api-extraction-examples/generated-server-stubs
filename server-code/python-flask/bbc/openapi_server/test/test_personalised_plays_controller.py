import unittest

from flask import json

from openapi_server.models.body4 import Body4  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPersonalisedPlaysController(BaseTestCase):
    """PersonalisedPlaysController integration test stubs"""

    def test_my_plays_post(self):
        """Test case for my_plays_post

        Write Play Event
        """
        body = openapi_server.Body4()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/plays',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
