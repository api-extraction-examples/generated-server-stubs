import unittest

from flask import json

from openapi_server.models.login import Login  # noqa: E501
from openapi_server.test import BaseTestCase


class Test1LoginController(BaseTestCase):
    """1LoginController integration test stubs"""

    def test_check_login(self):
        """Test case for check_login

        Check if any user is logged in
        """
        headers = { 
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/login',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_login(self):
        """Test case for login

        Login method
        """
        body = openapi_server.Login()
        headers = { 
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/login',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
