import unittest

from flask import json

from openapi_server.models.authentication_info_query_result import AuthenticationInfoQueryResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestApiKeyController(BaseTestCase):
    """ApiKeyController integration test stubs"""

    def test_create_key(self):
        """Test case for create_key

        Create a new api key.
        """
        query_string = [('app', 'app_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Auth/Keys',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_keys(self):
        """Test case for get_keys

        Get all keys.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Auth/Keys',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_revoke_key(self):
        """Test case for revoke_key

        Remove an api key.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Auth/Keys/{key}'.format(key='key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
