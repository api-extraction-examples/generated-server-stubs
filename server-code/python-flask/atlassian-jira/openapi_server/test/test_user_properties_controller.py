import unittest

from flask import json

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserPropertiesController(BaseTestCase):
    """UserPropertiesController integration test stubs"""

    def test_delete_user_property(self):
        """Test case for delete_user_property

        Delete user property
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('userKey', 'user_key_example'),
                        ('username', 'username_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/properties/{property_key}'.format(property_key='property_key_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_property(self):
        """Test case for get_user_property

        Get user property
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('userKey', 'user_key_example'),
                        ('username', 'username_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/properties/{property_key}'.format(property_key='property_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_property_keys(self):
        """Test case for get_user_property_keys

        Get user property keys
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('userKey', 'user_key_example'),
                        ('username', 'username_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/properties',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_user_property(self):
        """Test case for set_user_property

        Set user property
        """
        body = None
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('userKey', 'user_key_example'),
                        ('username', 'username_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/properties/{property_key}'.format(property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
