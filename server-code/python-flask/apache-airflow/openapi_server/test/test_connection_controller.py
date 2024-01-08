import unittest

from flask import json

from openapi_server.models.connection import Connection  # noqa: E501
from openapi_server.models.connection_collection import ConnectionCollection  # noqa: E501
from openapi_server.models.connection_test import ConnectionTest  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConnectionController(BaseTestCase):
    """ConnectionController integration test stubs"""

    def test_delete_connection(self):
        """Test case for delete_connection

        Delete a connection
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/connections/{connection_id}'.format(connection_id='connection_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_connection(self):
        """Test case for get_connection

        Get a connection
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/connections/{connection_id}'.format(connection_id='connection_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_connections(self):
        """Test case for get_connections

        List connections
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/connections',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_connection(self):
        """Test case for patch_connection

        Update a connection
        """
        connection = null
        query_string = [('update_mask', ['update_mask_example'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/connections/{connection_id}'.format(connection_id='connection_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(connection),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_connection(self):
        """Test case for post_connection

        Create a connection
        """
        connection = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/connections',
            method='POST',
            headers=headers,
            data=json.dumps(connection),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_connection(self):
        """Test case for test_connection

        Test a connection
        """
        connection = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/connections/test',
            method='POST',
            headers=headers,
            data=json.dumps(connection),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
