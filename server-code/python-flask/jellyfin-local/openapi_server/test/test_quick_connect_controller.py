import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.quick_connect_result import QuickConnectResult  # noqa: E501
from openapi_server.models.quick_connect_state import QuickConnectState  # noqa: E501
from openapi_server.test import BaseTestCase


class TestQuickConnectController(BaseTestCase):
    """QuickConnectController integration test stubs"""

    def test_activate(self):
        """Test case for activate

        Temporarily activates quick connect for five minutes.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/QuickConnect/Activate',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_authorize(self):
        """Test case for authorize

        Authorizes a pending quick connect request.
        """
        query_string = [('code', 'code_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/QuickConnect/Authorize',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_available(self):
        """Test case for available

        Enables or disables quick connect.
        """
        query_string = [('status', openapi_server.QuickConnectState())]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/QuickConnect/Available',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_connect(self):
        """Test case for connect

        Attempts to retrieve authentication information.
        """
        query_string = [('secret', 'secret_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/QuickConnect/Connect',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deauthorize(self):
        """Test case for deauthorize

        Deauthorize all quick connect devices for the current user.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/QuickConnect/Deauthorize',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_status(self):
        """Test case for get_status

        Gets the current quick connect state.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/QuickConnect/Status',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_initiate(self):
        """Test case for initiate

        Initiate a new quick connect request.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/QuickConnect/Initiate',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
